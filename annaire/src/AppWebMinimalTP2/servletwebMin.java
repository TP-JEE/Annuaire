package AppWebMinimalTP2;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class servletwebMin
 */
@WebServlet(name="servletwebMin", urlPatterns=("/serv/*"))
public class servletwebMin extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public servletwebMin() {
        super();
        // TODO Auto-generated constructor stub
    }
    
    
   
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		String s = request.getParameter("opt");
		if (s.equals("associer")) {
			PrintWriter out = response.getWriter();
			out.println("<html><body>");
			out.println("<form>");
			out.println("Choisir la Personne:<br>");
			out.println("<input type=\"radio\" name=\"personne1\">Personne1<br/>");
			out.println("<input type=\"radio\" name=\"personne2\">Personne2<br/>");
			out.println("Choisir l'adresse:<br>");
			out.println("<input type=\"radio\" name=\"adrs1\">Adress1<br/>");
			out.println("<input type=\"radio\" name=\"adrs2\">Adress2<br/>");
			out.println("<input type=\"submit\" value=\"OK\">");
			out.println("</form>");
			out.println("</body></html>");
			
			
		}
		else
		response.getWriter().append("Served at: ").append(request.getContextPath());
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
