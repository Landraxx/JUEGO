<%-- 
    Document   : RegistroJuegom
    Created on : 30-05-2023, 16:34:05
    Author     : Alumno
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <h1>Hello World!</h1>
        
        <form action="ControllerRegistroJuegom" method="POST">
            
            <table border="1">
                
                <tbody>
                    <tr>
                        <td>NOMBRE:</td>
                        <td><input type="text" name="nombre" id="nombre" /></td>
                    </tr>
                    <tr>
                        <td>CATEGORIA:</td>
                        <td><input type="text" name="categoria" id="categoria" /></td>
                    </tr>
                    <tr>
                        <td>FECHA:</td>
                        <td><input type="date" name="fecha" id="fecha" /></td>
                    </tr>
                    <tr>
                        <td colspan="2"> <button type="submit">INGRESAR</button></td>
                    </tr>
                </tbody>
            </table>

            
            
            
        </form>
    </body>
    
    
</html>
