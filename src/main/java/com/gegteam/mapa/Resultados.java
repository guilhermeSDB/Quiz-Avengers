/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/JSP_Servlet/Servlet.java to edit this template
 */
package com.gegteam.mapa;

import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *
 * @author Guilherme Barros
 */
public class Resultados extends HttpServlet {

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
        
          char q1,q2,q3,q4,q5,q6,q7,q8;
        q1 = request.getParameter("q1").charAt(0);
        q2 = request.getParameter("q2").charAt(0);
        q3 = request.getParameter("q3").charAt(0);
        q4 = request.getParameter("q4").charAt(0);
        q5 = request.getParameter("q5").charAt(0);
        q6 = request.getParameter("q6").charAt(0);
        q7 = request.getParameter("q7").charAt(0);
        q8 = request.getParameter("q8").charAt(0);        
        
        int soma = this.calcTotal(q1,q2,q3,q4,q5,q6,q7,q8);        
        
        response.setContentType("text/html;charset=UTF-8");
        try (PrintWriter out = response.getWriter()) {
            /* TODO output your page here. You may use following sample code. */            
            out.println("<!DOCTYPE html>");
            out.println("<html>");
            out.println("<head>");
            out.println(" <!-- Import My CSS -->\n" +
            "    <link rel=\"stylesheet\" href=\"style.css\" />\n" +
            "    <link rel=\"stylesheet\" href=\"responsivo.css\">\n" +
            "    <link rel=\"stylesheet\" href=\"resultado.css\">");
            out.println("<title>Resultado</title>");            
            out.println("</head>");
            out.println("<body>");
            out.println("<section>");
            out.println("<div class=\"question_result\">\n" +
"            <img class=\"imgResult\" src=\"https://images4.alphacoders.com/909/909185.jpg\"\n" +
"                alt=\"Resultado\">\n" +
"            <h1 class=\"textResult\">Voce é " + this.resultado(soma)+"</h1>\n" +
"        </div>\n" +
"        <a href=\"/mapa/\">\n" +
"            <button type=\"submit\" class=\"questions_finish\">\n" +
"                Voltar\n" +
"            </button>\n" +
"        </a>");                       
            out.println("</section>");
            out.println("</body>");
            out.println("</html>");
        }
    }
    
    private String resultado(int soma){
        if(soma >= 8 && soma <= 10)
            return "Homem-Aranha";
        else if(soma >= 11 && soma <= 13)
            return "Doutor Estranho";
        else if(soma <= 14 && soma <= 16)
            return "Feiticeira Escarlate";
        else if(soma >= 17 && soma <= 19)
            return "Thor";
        else if(soma >= 20 && soma <= 22)
            return "Hulk";
        else if(soma >= 23 && soma <= 25)
            return "Viuva Negra";
        else if(soma >= 26 && soma <= 28)
            return "Homem de Ferro";
        else if(soma >= 29 && soma <= 32)
            return "Capitão America";
        else 
            return "Sem Resultado";
    }
    
    private int calcTotal(char q1, char q2, char q3, char q4, char q5, char q6, char q7, char q8){
        return this.CalcQ1(q1)+ this.CalcQ2(q2)+ this.CalcQ3(q3)+ this.CalcQ4(q4)
                + this.CalcQ5(q5)+ this.CalcQ6(q6)+ this.CalcQ7(q7)+ this.CalcQ8(q8);    
    }
    
    private int CalcQ1(char r){
        switch(r){
            case 'a' : return 4;
            case 'b' : return 2;
            case 'c' : return 3;
            case 'd' : return 1;
            default: return 0;
        }
    }
    
    private int CalcQ2(char r){
        switch(r){
            case 'a' : return 4;
            case 'b' : return 2;
            case 'c' : return 3;
            case 'd' : return 1;
            default: return 0;
        }
    }
    
    private int CalcQ3(char r){
        switch(r){
            case 'a' : return 3;
            case 'b' : return 4;
            case 'c' : return 1;
            case 'd' : return 2;
            default: return 0;
        }
    }
    
    private int CalcQ4(char r){
        switch(r){
            case 'a' : return 1;
            case 'b' : return 4;
            case 'c' : return 2;
            case 'd' : return 3;
            default: return 0;
        }
    }
    
    private int CalcQ5(char r){
        switch(r){
            case 'a' : return 1;
            case 'b' : return 2;
            case 'c' : return 3;
            case 'd' : return 4;
            default: return 0;
        }
    }
    
    private int CalcQ6(char r){
        switch(r){
            case 'a' : return 2;
            case 'b' : return 1;
            case 'c' : return 4;
            case 'd' : return 3;
            default: return 0;
        }
    }
    
    private int CalcQ7(char r){
        switch(r){
            case 'a' : return 3;
            case 'b' : return 1;
            case 'c' : return 2;
            case 'd' : return 4;
            default: return 0;
        }
    }
    
    private int CalcQ8(char r){
        switch(r){
            case 'a' : return 2;
            case 'b' : return 1;
            case 'c' : return 3;
            case 'd' : return 4;
            default: return 0;
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
