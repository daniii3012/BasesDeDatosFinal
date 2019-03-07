/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package servlet;

import bd.BDCopia;
import bd.BDEstudiante;
import bd.BDMaterial;
import bd.BDReserva;
import java.io.IOException;
import java.io.PrintWriter;
import java.sql.ResultSet;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import logica.Estudiante;
import logica.Material;
import logica.MaterialAudiovisual;
import logica.MaterialBibliografico;

/**
 *
 * @author Daniel
 */
public class AgregarReserva extends HttpServlet {

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

        //DBContactos conDb = new DBContactos();
        BDCopia copia = new BDCopia();
        BDReserva reserva = new BDReserva();

        try {
            String idMaterial = request.getParameter("idMaterial");
            String idEstudiante = request.getParameter("idEstudiante");

            System.out.println(idMaterial);
            System.out.println(idEstudiante);
            System.out.println("Bandera");
            ResultSet resCopia = copia.getCopia(idMaterial);
            System.out.println("Bandera2");
            reserva.agregarReserva(Integer.parseInt(idEstudiante));
            System.out.println("Bandera3");
            ResultSet resReserva = reserva.getReserva(Integer.parseInt(idEstudiante));
            System.out.println("Bandera4");
            reserva.agregarReservaCopia(resReserva.getInt("k_reserva"), resCopia.getInt("k_copia"));
            System.out.println("Bandera5");
            /*
            while (resCopia.next()) {
                
                reserva.agregarReservaCopia(resReserva.getInt("k_reserva"), resCopia.getInt("k_copia"));
            }
            */
            response.sendRedirect("index.html");
        } catch (Exception e) {

            out.println("<html>");
            out.println("<head>");
            out.println("<title>Servlet Inicio</title>");
            out.println("</head>");
            out.println("<body>");
            out.println("<h1>Error at " + e.toString() + "</h1>");
            out.println("<p>Error: " +  copia.getMensaje() + "</p>");
            out.println("<p>Error: " +  reserva.getMensaje() + "</p>");
            out.println("<p>Error: " +  e.getMessage() + "</p>");
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
