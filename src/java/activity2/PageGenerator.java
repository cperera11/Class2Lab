package activity2;

import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *
 * @author CPerera
 */
@WebServlet(name = "PageGenerator", urlPatterns = {"/pager"})
public class PageGenerator extends HttpServlet {

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
        try (PrintWriter out = response.getWriter()) {
            /* TODO output your page here. You may use following sample code. */
            out.println("<!DOCTYPE html>");
            out.println("<html>");
            out.println("<head>");
            out.println("<title>Servlet PageGenerator</title>");
            out.println("</head>");
            
            out.println("<body>");
            out.println("<style>");
            
            out.println("table {border-collapse: collapse; width: 50%; text-align: center;}");
            out.println("table, td, th {border: 1px solid black; height: 40px;}");
            
            out.println("</style>");
            out.println("<h1 style=color:brown; text-align: center;>Student's Information</h1>");

            out.println("<table id=\"table\" onclick=\"myFunction()\">");
            
            out.println(" <tr>");
            out.println("<th>Firstname</th>");
            out.println("<th>Lastname</th>");
            out.println("<th>Age</th>");
            out.println("</tr>");
            
            out.println("<tr>");
            out.println("<td>Sam</td>");
            out.println("<td>Williams</td>");
            out.println("<td>21</td>");
            out.println("</tr>");
            
            out.println("<tr>");
            out.println("<td>Emma</td>");
            out.println("<td>Johnson</td>");
            out.println("<td>27</td>");
            out.println("</tr>");
            
            out.println("<tr>");
            out.println("<td>Jenna</td>");
            out.println("<td>Smith</td>");
            out.println("<td>18</td>");
            out.println("</tr>");
            
            out.println("<table>");

            out.println("<script>");
            out.println("function myFunction() {");
            out.println("document.getElementById(\"table\").style.backgroundColor = \"#E3EDB5\";}");
            out.println("</script>");
            
            
            out.println("</body>");
            out.println("</html>");
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
