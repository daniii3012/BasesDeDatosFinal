/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package servlet;

import bd.BDCopia;
import bd.BDMaterial;
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
        System.out.println("holas");
        try {
            System.out.println(request.getParameter("titulo"));
            if (request.getParameter("titulo") != null) {
                System.out.println("holas2");
                String tabla = "n_titulo";
                String titulo = request.getParameter("titulo");
                ResultSet resBibliografico = material.getMaterialAudiovisualPosix(tabla, titulo);
                ResultSet resAudiovisual = material.getMaterialBibliograficoPosix(tabla, titulo);
                request.getSession().setAttribute("bibliografico", resBibliografico);
                request.getSession().setAttribute("audiovisual", resAudiovisual);
                System.out.println("holas3");
            } else if (request.getParameter("tipoBibliografico") != null) {
                System.out.println("holas4");
                String tabla = "n_tipo";
                String titulo = request.getParameter("tipoBibliografico");
                ResultSet resBibliografico = material.getMaterialBibliograficoPosix(tabla, titulo);
                request.getSession().setAttribute("bibliografico", resBibliografico);
                System.out.println("holas5");
            } else if (request.getParameter("tipoAudiovisual") != null) {
                System.out.println("holas6");
                String tabla = "n_tipo";
                String titulo = request.getParameter("tipoAudiovisual");
                ResultSet resAudiovisual = material.getMaterialAudiovisualPosix(tabla, titulo);
                request.getSession().setAttribute("audiovisual", resAudiovisual);
                System.out.println("holas7");
            } else {
                System.out.println("holas8");
                ResultSet resBibliografico = material.getMaterialBibliografico();
                ResultSet resAudiovisual = material.getMaterialAudiovisual();
                request.getSession().setAttribute("bibliografico", resBibliografico);
                request.getSession().setAttribute("audiovisual", resAudiovisual);
                System.out.println("holas9");
            }
            System.out.println("holas10");
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
