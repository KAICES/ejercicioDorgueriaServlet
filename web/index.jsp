<%-- 
    Document   : index
    Created on : 12/03/2018, 11:25:09 PM
    Author     : cesar.ramirez
                 lizeth castro   
--%>

<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Catalogo Drogueria</title>
    </head>
    <style>
        #web{
            width: 100%;
        }
        #formulario{
            width: 80%;

        }
    </style>
    <body id="web">
    <CENTER>

        <div id="formulario">  

            <form action="ServletDrogueria" method="POST">
                <fieldset>  
                    <legend> <h3>Drogueria</h3></legend>
                    Nombre:<br>
                    <input type ="text" name="nombre"></input><br>
                    <br>
                    Edad:<br>
                    <input type ="text" name="edad"></input><br>
                    <br>
                    Genero: <br><br>                    
			<input type="radio" name="genero" value="1"> Hombre
  			<input type="radio" name="genero" value="2"> Mujer <br>
                    <br>
                    <br>
                    <input type="submit" value="Ver" />
                </fieldset>
            </form>

        </div>
    </CENTER>
</body>
</html>

