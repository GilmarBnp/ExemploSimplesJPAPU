/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/JSP_Servlet/Servlet.java to edit this template
 */
package servlets;

import controller.ProdutoFacadeLocal;
import java.io.IOException;
import java.io.PrintWriter;
import javax.ejb.EJB;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *
 * @author emerson
 */
@WebServlet(name = "ServletListaProduto",
        urlPatterns = {"/ServletListaProduto"})
public class ServletListaProduto extends HttpServlet {

    @EJB
    ProdutoFacadeLocal facade;


    protected void doGet(HttpServletRequest request,
            HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");
        try ( PrintWriter out = response.getWriter()) {
            out.println("<html><body>");
            facade.findAll().forEach(p -> {
                out.println(
            
            " " + p.getNome());
});
out.println("");
        }
    }
}
