
package com.natanduarte.temosvagas.controller;

import com.natanduarte.temosvagas.actions.Action;
import java.io.IOException;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet(name = "Controller", urlPatterns = {"/app"})
public class Controller extends HttpServlet {

    @Override
    public void service(HttpServletRequest request, HttpServletResponse response)
            throws IOException, ServletException {

        String action = request.getParameter("action");
        String actionParameter = null;

        // indirectly calls the action class from the
        // interface by using the Reflection API
        try {
            String className = "com.natanduarte.temosvagas.actions."+action;

            Class generic = Class.forName(className);
            Action reflectedAction = (Action) generic.newInstance();
            actionParameter = reflectedAction.run(request, response);
        } catch (ClassNotFoundException | InstantiationException |
                IllegalAccessException e) {

            throw new ServletException(e);
        }

        String[] parameters = actionParameter.split(":");
        String actionType = parameters[0];
        String actionName = parameters[1];
        boolean isRedirect = actionType.equalsIgnoreCase("redirect");

        if (isRedirect) {
            doRedirect(actionName, response);
            return;
        }

        doForward(actionName, request, response);
    }


    private void doRedirect(String actionName, HttpServletResponse response)
            throws IOException, ServletException {

        String redirectParameters = "app?action="+actionName;
        response.sendRedirect(redirectParameters);
    }

    private void doForward(String fileName,
            HttpServletRequest request, HttpServletResponse response)
            throws IOException, ServletException {

        String viewPath = "WEB-INF/views/"+fileName;
        RequestDispatcher view = request.getRequestDispatcher(viewPath);
        view.forward(request, response);
    }
}
