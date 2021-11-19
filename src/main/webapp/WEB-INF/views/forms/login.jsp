<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<c:url value="app" var="path" />
<!DOCTYPE html>
<html>
        <c:import url="../components/head.jsp" charEncoding="UTF-8"/>
    <head>
        <title>Login/Registro</title>
    </head>
    <body class="gray lighten-4">
        <c:import url="../components/header.jsp" charEncoding="UTF-8"/>

        <main>
            <div class="container">
                <div class="row">

                    <div class="col s12 m12">
                        <div class="card transparent">
                            <div class="container">
                                <div class="card-content blue-grey-text">
                                    <span class="card-title center">Entrar</span>

                                    <form action="${path}" method="POST">
                                        <div class="row">
                                            <div class="input-field col s12">
                                                <input name="login" type="text" class="validate" required>
                                                <label for="login">user</label>
                                            </div>
                                        </div>
                                        <div class="row">
                                            <div class="input-field col s12">
                                                <input name="password" type="password" class="validate" data-length="16" required>
                                                <label for="password">Password</label>
                                            </div>
                                        </div>

                                        <input type="hidden" name="action" value="ValidateLogin">

                                        <button type="submit" class="waves-effect waves-light btn-large center indigo darken-1">
                                            login
                                        </button>
                                    </form>
                                </div>
                            </div>
                        </div>
                    </div>

                </div>
            </div>

            <div class="container">
                <div class="row">

                    <div class="col s12 m12">
                        <div class="card transparent">
                            <div class="container">
                                <div class="card-content blue-grey-text">
                                    <span class="card-title center">Cadastro</span>

                                    <form action="${path}" method="post">
                                        <div class="row">
                                            <div class="input-field col s12">
                                                <input name="new-login" type="text" class="validate" required>
                                                <label for="login">usuário</label>
                                            </div>
                                        </div>
                                        <div class="row">
                                            <div class="input-field col s12">
                                                <input name="cnpj" id="cnpj" type="text" class="validate" required>
                                                <label for="cnpj">CNPJ</label>
                                            </div>
                                        </div>

                                        <div class="row">
                                            <div class="input-field col s12">
                                                <input name="new-password" type="password" class="validate" required>
                                                <label for="new-password">Password</label>
                                            </div>
                                        </div>

                                        <input type="hidden" name="action" value="ValidateCadaster">

                                        <button type="submit" class="waves-effect waves-light btn-large center indigo darken-1">
                                            cadastrar
                                        </button>
                                    </form>
                                </div>
                            </div>
                        </div>
                    </div>

                </div>
            </div>
        </main>

        <c:import url="../components/footer.jsp" charEncoding="UTF-8"/>
        
        <script>
            document.getElementById('cnpj').addEventListener('input', function (e) {
              var x = e.target.value.replace(/\D/g, '').match(/(\d{0,2})(\d{0,3})(\d{0,3})(\d{0,4})(\d{0,2})/);
              e.target.value = !x[2] ? x[1] : x[1] + '.' + x[2] + '.' + x[3] + '/' + x[4] + (x[5] ? '-' + x[5] : '');
            });
        </script>
    </body>
</html>
