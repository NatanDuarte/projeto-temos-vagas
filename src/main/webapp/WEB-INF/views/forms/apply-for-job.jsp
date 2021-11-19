<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<c:url value="app" var="path" />
<!DOCTYPE html>
<html>
    <head>
        <c:import url="../components/head.jsp" charEncoding="UTF-8"/>
        <title>Candidato à vaga: ${job.title}</title>
    </head>
    <body>
        <c:import url="../components/header.jsp" charEncoding="UTF-8"/>
        <main>
            <div class="container">
                <div class="row">

                    <div class="container">
                        <form action="${path}" method="POST">
                            <div class="input-field col s12 m12">
                                <input name="name" type="text" class="validate" required>
                                <label for="name">Nome completo do candidato</label>
                            </div>

                            <div class="input-field col s12 m6">
                              <i class="material-icons prefix">phone</i>
                              <input name="phone" type="tel" class="validate">
                              <label for="phone">celular/telefone</label>
                            </div>

                            <div class="input-field col s12 m6">
                                <p>
                                  <label>
                                    <input type="checkbox" name="can-send-whatsapp"/>
                                    <span>Autorizo ser contactado via Whatsapp</span>
                                  </label>
                                </p>
                            </div>

                            <div class="input-field col s12 m12">
                                <input name="email" type="email" class="validate" required>
                                <label for="email">email</label>
                            </div>

                            <div class="col s12 m12 center">
                                <span>PDF do currículo</span>
                                <input type="file" accept=".pdf" />
                            </div>

                            <input type="hidden" name="action" value="SendCurriculum">

                            <button type="submit"
                                    class="waves-effect waves-light btn-large right indigo darken-1">
                                Candidatar-se
                            </button>
                        </form>
                    </div>
                </div>
            </div>
        </main>

        <c:import url="../components/footer.jsp" charEncoding="UTF-8"/>
    </body>
</html>
