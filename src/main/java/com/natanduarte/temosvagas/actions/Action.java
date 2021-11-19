
package com.natanduarte.temosvagas.actions;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public interface Action {

    public String run(HttpServletRequest request, HttpServletResponse response)
            throws ServletException;

}
