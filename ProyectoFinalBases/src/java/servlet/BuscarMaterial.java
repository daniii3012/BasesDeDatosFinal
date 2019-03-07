/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package servlet;

import bd.BDCopia;
import bd.BDMaterial;
import bd.BDReserva;
import java.io.IOException;
import java.io.PrintWriter;
import java.sql.ResultSet;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *
 * @author Daniel
 */
public class BuscarMaterial extends HttpServlet {

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

        BDMaterial material = new BDMaterial();
        BDReserva reserva = new BDReserva();

        
        try {            
            String idEstudiante = request.getParameter("codigoEstudiante");
            request.getSession().setAttribute("codigoEst", idEstudiante);
            Double idReserva = ((Math.random()*9)+1)*Math.pow(10, 5)+((Math.random()*9)+1)*Math.pow(10, 4)
                    + ((Math.random()*9)+1)*Math.pow(10, 3) + ((Math.random()*9)+1)*Math.pow(10, 2)
                    + ((Math.random()*9)+1)*Math.pow(10, 1)+ ((Math.random()*9)+1)*Math.pow(10, 0);
            double cod_estudiante = Double.valueOf(idEstudiante);
            System.out.println(idReserva);
            System.out.println(idEstudiante);
            System.out.println("Bandera");
            System.out.println("Bandera2");
            reserva.agregarReserva(idReserva, cod_estudiante);
            System.out.println("Bandera3");
            System.out.println("Bandera4");             
            
            if (!request.getParameter("titulo").isEmpty()) {
                
                String tabla = "n_titulo";
                String titulo = request.getParameter("titulo");
                
                ResultSet resBibliografico = material.getMaterialBibliograficoPosix(tabla, titulo);
                ResultSet resAudiovisual = material.getMaterialAudiovisualPosix(tabla, titulo);
                
                request.getSession().setAttribute("bibliografico", resBibliografico);
                request.getSession().setAttribute("audiovisual", resAudiovisual);
                
            } else if (request.getParameter("tipoBibliograficoSelect") != null) {
                
                String tabla = "n_tipo";
                String titulo = request.getParameter("tipoBibliograficoSelect");
                
                ResultSet resBibliografico = material.getMaterialBibliograficoPosix(tabla, titulo);
                
                request.getSession().setAttribute("bibliografico", resBibliografico);
                
            } else if (request.getParameter("tipoAudiovisualSelect") != null) {
                
                String tabla = "n_tipo";
                String titulo = request.getParameter("tipoAudiovisualSelect");
                
                ResultSet resAudiovisual = material.getMaterialAudiovisualPosix(tabla, titulo);
                
                request.getSession().setAttribute("audiovisual", resAudiovisual);
                
            } else {
                
                ResultSet resBibliografico = material.getMaterialBibliografico();
                ResultSet resAudiovisual = material.getMaterialAudiovisual();
                
                request.getSession().setAttribute("bibliografico", resBibliografico);
                request.getSession().setAttribute("audiovisual", resAudiovisual);
                
            }
            
            response.sendRedirect("material_busqueda.jsp");
            
        } catch (Exception e) {
            out.println("<html>");
            out.println("<head>");
            out.println("<title>Servlet Inicio</title>");
            out.println("</head>");
            out.println("<body>");
            out.println("<h1>Error at " + e.toString() + "</h1>");
            out.println("<p>Error: " + material.getMensaje() + "</p>");
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
