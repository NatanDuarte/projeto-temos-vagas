
package com.natanduarte.temosvagas.actions;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class SendCurriculum implements Action {

    @Override
    public String run(HttpServletRequest request, HttpServletResponse response)
            throws ServletException {

        String name = request.getParameter("name");
        String phone = request.getParameter("phone");
        boolean canSendWhatsapp = Boolean.parseBoolean(
                request.getParameter("can-send-whatsapp"));
        String email = request.getParameter("email");

        // TODO: upload pdf from frontend

        // TODO: wrap information into object

        // TODO: send information to company email

         return "forward:pages/sent-successful.jsp";
    }
}
