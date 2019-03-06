/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package servlet;

import bd.BDMaterial;
import java.io.IOException;
import java.io.PrintWriter;
import java.sql.ResultSet;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import logica.Material;
import logica.MaterialAudiovisual;
import logica.MaterialBibliografico;

/**
 *
 * @author Daniel
 */
public class AgregarReserva {

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
        
        Material materialBibliografico;
        Material materialAudiovisual;

        BDMaterial materialBd = new BDMaterial();
        //DBContactos conDb = new DBContactos();
        try {
            int idMaterialBibliografico = Integer.parseInt(request.getParameter("reservarBibliografico"));
            int idMaterialAudiovisual = Integer.parseInt(request.getParameter("reservarAudiovisual"));
            
            materialBibliografico = new MaterialBibliografico();
            materialAudiovisual = new MaterialAudiovisual();
            
            ResultSet resBibliografico = materialBd.getMaterialBibliograficoById(idMaterialBibliografico);
            ResultSet resAudiovisual = materialBd.getMaterialAudiovisualById(idMaterialAudiovisual);
            
            if(resBibliografico.next()){
                materialBibliografico.setIdMaterial(resBibliografico.getInt("k_id"));
                materialBibliografico.setTituloMaterial(tituloMaterial);
            }
            
            if(res.next()){
                personaje.setId(res.getInt("k_id"));
                personaje.setNombre(res.getString("n_nombre"));
                personaje.setHabilidad(res.getString("n_habilidad"));
                personaje.setEspecie(res.getString("n_color"));
            }
            out.write(opc);
            if(opc.equals("delete")){
                personajeBd.borrarPersonaje(personaje);
                response.sendRedirect("Inicio");
            }

            response.sendRedirect("index.html");
        } catch (Exception e) {

            out.println("<html>");
            out.println("<head>");
            out.println("<title>Servlet Inicio</title>");
            out.println("</head>");
            out.println("<body>");
            out.println("<h1>Error at " + e.toString() + "</h1>");
            out.println("<p>seguimiento: " + personajeBd.getMensaje() + "</p>");
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
