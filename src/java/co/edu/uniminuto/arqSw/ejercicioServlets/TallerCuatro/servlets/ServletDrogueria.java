/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package co.edu.uniminuto.arqSw.ejercicioServlets.TallerCuatro.servlets;

import co.edu.uniminuto.arqSw.ejercicioServlets.TallerCuatro.vos.FormularioPersonaVo;
import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *
 * @author: cesar ramirez
            lizeth castro  
 * 
 * 
 * 
 */
public class ServletDrogueria extends HttpServlet {

    
    private FormularioPersonaVo miForm;
    
    /**
     * Processes requests for both HTTP <code>GET</code> and <code>POST</code>
     * methods.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");
        PrintWriter out = response.getWriter();
        
        int generov = miForm.getGenero();
        int edadv= miForm.getEdad();
        String sexo = "";
        
        
        String catalogo[][] = new String[6][2];

        switch (generov) {

            case 1:
                    
                sexo = "Masculino"; 
                
                if ( edadv > 18) {                    
                                 
                    catalogo[0][0]="Gel";
                    catalogo[1][0]="Peinilla";
                    catalogo[2][0]="Perfume";
                    catalogo[3][0]="Medias";
                    catalogo[4][0]="Maquina de afeitar";
                    catalogo[5][0]="Crema Merey";
                    catalogo[0][1]="$ 5000";
                    catalogo[1][1]="$ 3000 ";
                    catalogo[2][1]="$ 10000";
                    catalogo[3][1]="$ 5000";
                    catalogo[4][1]="$ 3500";
                    catalogo[5][1]="$ 4000";

                }else{

                        catalogo[0][0]="Carro";
                        catalogo[1][0]="Piquis bola";
                        catalogo[2][0]="Trompo";
                        catalogo[3][0]="Yoyo";
                        catalogo[4][0]="Pito";
                        catalogo[5][0]="Fulminantes";
                        catalogo[0][1]="$ 5000";
                        catalogo[1][1]="$ 500 ";
                        catalogo[2][1]="$ 2000";
                        catalogo[3][1]="$ 2000";
                        catalogo[4][1]="$ 1000";
                        catalogo[5][1]="$ 4000";   

                }
               
                break;
			
            case 2:

                if ( edadv > 18) {
                    
                    catalogo[0][0]="Labial";
                    catalogo[1][0]="Esmalte";
                    catalogo[2][0]="Cortauñas";
                    catalogo[3][0]="Medias Veladas";
                    catalogo[4][0]="Brillo";
                    catalogo[5][0]="Base";
                    catalogo[0][1]="$ 5000";
                    catalogo[1][1]="$ 3000 ";
                    catalogo[2][1]="$ 7000";
                    catalogo[3][1]="$ 5000";
                    catalogo[4][1]="$ 1000";
                    catalogo[5][1]="$ 2000";
                    

                    
                }else{
                    
                    catalogo[0][0]="Guantes";
                    catalogo[1][0]="Moña";
                    catalogo[2][0]="Muñeca";
                    catalogo[3][0]="Manilla";
                    catalogo[4][0]="Shakiras";
                    catalogo[5][0]="Anillo";
                    catalogo[0][1]="$ 5000";
                    catalogo[1][1]="$ 1000 ";
                    catalogo[2][1]="$ 10000";
                    catalogo[3][1]="$ 2000";
                    catalogo[4][1]="$ 100";
                    catalogo[5][1]="$ 5000"; 
                
                    
               }
                break;
   
                    
            default:

               sexo = "femenino" ;

               break;    

        }
        
        
        
        
        
        
        
        
        try {
            /* TODO output your page here. You may use following sample code. */
            out.println("<!DOCTYPE html>");
            out.println("<html>");
            out.println("<head>");
            out.println("<meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\">");            
            out.println("<title>Catalogo Drogueria</title>");            
            out.println("</head>");
            out.println("<style>");
            out.println("#web{");
            out.println("width: 100%;");
            out.println("}");
            out.println("#formulario{");
            out.println("width: 80%;");
            out.println("}");
            out.println("</style>");
            out.println("<body id=\"web\">");
            out.println("<CENTER>");
            out.println("<div id=\"formulario\">");
            out.println("<form action=\"ServletDrogueria\" method=\"POST\">");
            out.println("<fieldset>");
            out.println("<legend> <h3>Drogueria</h3></legend>");
            out.println("Nombre:<br>");
            out.println("<input type ='text' name='nombre'></input><br>");
            out.println("<br>");
            out.println("Edad:<br>");
            out.println("<input type ='text' name='edad'></input><br>");
            out.println("<br>");
            out.println("Genero: <br><br>");
            out.println("<input type='radio' name='genero' value='1'> Hombre");
            out.println("<input type='radio' name='genero' value='2'> Mujer <br>");
            out.println("<br>");
            out.println("<br>");
            out.println("<input type=\"submit\" value=\"Ver\" />");
            out.println("</fieldset>");
            out.println("</form>");
            out.println("</div>");
            out.println("</CENTER>");
            out.println("");
            out.println("");            
            out.println("<h1><center>El sr(a)"+ miForm.getNombre()+" con una edad de " + miForm.getEdad()+" años, se le puede mostrar el siguiente catalogo</center></h1>");
            out.println("<table border='1' style='margin: 0 auto;'>");
            out.println("<TD>Nombre elemento</TD> <TD>Valor elemento ($)");            
            out.println("</TR>");                   
            for(int k=0;k<catalogo.length;k++) {

                       out.println("<TR>");
                       out.println("<TD>" + catalogo[k][0] + "</TD> <TD>"+ catalogo[k][1] + "</TD>");
                       out.println("</TR>");
            }
            
            out.println("</body>");
            out.println("</html>");
            
        } finally {
            out.close();
        }
    }

    // <editor-fold defaultstate="collapsed" desc="HttpServlet methods. Click on the + sign on the left to edit the code.">
    /**
     * Handles the HTTP <code>GET</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);
    }

    /**
     * Handles the HTTP <code>POST</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        
            String nombre = request.getParameter("nombre");
            int edad = Integer.parseInt(request.getParameter("edad"));
            int genero = Integer.parseInt(request.getParameter("genero"));

        
        miForm = new FormularioPersonaVo (nombre, edad, genero);
        
        processRequest(request, response);
    }

    /**
     * Returns a short description of the servlet.
     *
     * @return a String containing servlet description
     */
    @Override
    public String getServletInfo() {
        return "Short description";
    }// </editor-fold>

}
