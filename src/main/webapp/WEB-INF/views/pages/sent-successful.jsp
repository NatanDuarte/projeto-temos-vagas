<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<c:url value="app/" var="path" />

<!DOCTYPE html>
<html>
    <head>
        <c:import url="../components/head.jsp" charEncoding="UTF-8"/>
        <META http-equiv="refresh" content="5;URL=http://localhost:8080/temosVagas/app?action=ListJobs">
        <title>Vagas disponíveis</title>
    </head>
    <body class="cyan lighten-5">
        <c:import url="../components/header.jsp" charEncoding="UTF-8"/>

        <main>
            <div class="container">
                <div class="row">

                    <div class="col s12 m12 center">
                        <section>
                            <h4>Processo realizado com sucesso!</h4>
                            <p>Aguarde, a empresa retornará o contato</p>
                            <span>(Vc será redirecionado 5 segundos)</span>
                        </section>

                        <a href="app?action=ListJobs" class="btn-flat">voltar</a>
                    </div>

                </div>
            </div>
        </main>

    </body>
</html>
