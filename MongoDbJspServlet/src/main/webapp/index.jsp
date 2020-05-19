<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
    <title>MongoDb Servlet Example</title>
    <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">

    <!-- jQuery Files -->
    <script type="text/javascript" src="https://ajax.googleapis.com/ajax/libs/jquery/3.3.1/jquery.min.js"></script>
    <script type="text/javascript" src="resource/js/form_login.js"></script>

    <!-- CSS File -->
    <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/css/bootstrap.min.css">
</head>
<body>
    <div id="mongoDbServlet" class="container">
        <h1 align="center" class="text-primary">MongoDb Jsp and Servlet Example</h1>
        <hr />

        <!------ MONGODB JSP & SERVLET EXAMPLE ------>
        <div id="login_form">
            <form id="user_login_form" name="loginForm" method="post" action="loginServlet">
                <!----- LOGIN FORM ------>
                <div class="input-group">
                    <input type="text" class="form-control" id="login_nit" placeholder="NIT" name="login_nit" maxlength="6">
                </div>
                <div>&nbsp;</div>
                <div class="input-group">
                    <input type="text" class="form-control" id="login_nombre" placeholder="NOMBRE" name="login_nombre">
                </div>
                <div>&nbsp;</div>
                <div class="input-group">
                    <input type="text" class="form-control" id="login_direccion" placeholder="DIRECCION" name="login_direccion" maxlength="6">
                </div>
                <div>&nbsp;</div>
                <div class="input-group">
                    <input type="text" class="form-control" id="login_contacto" placeholder="CONTACTO" name="login_contacto" maxlength="6">
                </div>

                <!----- SUBMIT BUTTON ------>
                <div>&nbsp;</div>
                <button id="submit_btn" type="submit" class="btn btn-primary">Registrar</button>
            </form>
        </div>
        
        <h4 id="errMsg" class="text-danger" align="center">${error_message}</h4>
    </div>
</body>
</html>