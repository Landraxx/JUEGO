/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/JSP_Servlet/Servlet.java to edit this template
 */
package Controller;

import DAO.DAOJuegom;
import Model.CrudJuegom;
import java.io.IOException;
import java.io.PrintWriter;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *
 * @author Alumno
 */
public class ControllerRegistroJuegom extends HttpServlet {

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
            throws ServletException, IOException, SQLException {
        response.setContentType("text/html;charset=UTF-8");
        String mensaje = "";
        String insertaJuegom;

        try {
            DAOJuegom juegom = validacionUsuario(request);
            CrudJuegom cp = new CrudJuegom();
            insertaJuegom = cp.Create(juegom);
            mensaje += insertaJuegom;
            if (Integer.parseInt(insertaJuegom) != 0) {
                mensaje = "juego grabado con exito";

            }
        } catch (NumberFormatException ex) {
            mensaje = ex.getMessage();

        }
        request.setAttribute("mensaje", mensaje);
        request.getRequestDispatcher("index.jsp").forward(request, response);
    }

    protected DAOJuegom validacionUsuario(HttpServletRequest request) {
        DAOJuegom juegom = new DAOJuegom();
        String nombre = request.getParameter("nombre");
        String categoria = request.getParameter("categoria");
        String fecha = request.getParameter("fecha");

        if (juegom.ValidaSubida(nombre, categoria, fecha)) {
            return juegom;
            
        } else {
            
            return new DAOJuegom();
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
        try {
            processRequest(request, response);
        } catch (SQLException ex) {
            Logger.getLogger(ControllerRegistroJuegom.class.getName()).log(Level.SEVERE, null, ex);
        }
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
        try {
            processRequest(request, response);
        } catch (SQLException ex) {
            Logger.getLogger(ControllerRegistroJuegom.class.getName()).log(Level.SEVERE, null, ex);
        }
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
