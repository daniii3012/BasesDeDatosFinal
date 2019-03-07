/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package servlet;

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
        
        Material materialBibliografico;
        MaterialAudiovisual materialAudiovisual;
        Estudiante estudiante;

        BDMaterial materialBd = new BDMaterial();
        BDReserva reservaBd = new BDReserva();
        BDEstudiante estudianteBd = new BDEstudiante();
        //DBContactos conDb = new DBContactos();
        try {
            int idMaterialBibliografico = Integer.parseInt(request.getParameter("reservarBibliografico"));
            int idMaterialAudiovisual = Integer.parseInt(request.getParameter("reservarAudiovisual"));
            int idEstudiante = Integer.parseInt(request.getParameter("codigoEstudiante"));
            
            materialBibliografico = new MaterialBibliografico();
            materialAudiovisual = new MaterialAudiovisual();
            estudiante = new Estudiante();
            
            ResultSet resBibliografico = materialBd.getMaterialBibliograficoById(idMaterialBibliografico);
            ResultSet resAudiovisual = materialBd.getMaterialAudiovisualById(idMaterialAudiovisual);
            ResultSet resEstudiante = estudianteBd.getEstudianteById(idEstudiante);
            
            if(resBibliografico.next()){
                
                materialBibliografico.setIdMaterial(resBibliografico.getInt("k_isbnissn"));
                /*
                materialBibliografico.setTituloMaterial(resBibliografico.getString("n_titulo"));
                materialBibliografico.setFechaPublicacionMaterial(resBibliografico.getDate("f_publicacion"));
                materialBibliografico.setTipoMaterial(resBibliografico.getString("n_tipo"));
                materialBibliografico.setTemaMaterial(resBibliografico.getString("n_tema"));
                */
                estudiante.setIdEstudiante(resEstudiante.getInt("k_estudiante"));
                reservaBd.agregarReserva(estudiante);
            }
            
            if(resAudiovisual.next()){
                /*
                materialAudiovisual.setIdMaterial(resAudiovisual.getInt("k_isbnissn"));
                materialAudiovisual.setTituloMaterial(resAudiovisual.getString("n_titulo"));
                materialAudiovisual.setFechaPublicacionMaterial(resAudiovisual.getDate("f_publicacion"));
                materialAudiovisual.setTipoMaterial(resAudiovisual.getString("n_tipo"));
                materialAudiovisual.setTemaMaterial(resAudiovisual.getString("n_tema"));
                materialAudiovisual.setFormatoMaterial(resAudiovisual.getString("n_formato"));
                */
                estudiante.setIdEstudiante(resEstudiante.getInt("k_estudiante"));
                reservaBd.agregarReserva(estudiante);
            }

            response.sendRedirect("index.html");
        } catch (Exception e) {

            out.println("<html>");
            out.println("<head>");
            out.println("<title>Servlet Inicio</title>");
            out.println("</head>");
            out.println("<body>");
            out.println("<h1>Error at " + e.toString() + "</h1>");
            out.println("<p>Error: " + reservaBd.getMensaje() + "</p>");
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
