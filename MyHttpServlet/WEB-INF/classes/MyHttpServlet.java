import javax.servlet.http.*;
import java.io.*;
import javax.servlet.annotation.*;

@WebServlet("/httptest")
public class MyHttpServlet extends HttpServlet {

	public void doGet(HttpServletRequest hreq, HttpServletResponse hres) {
		try {
			PrintWriter pw = hres.getWriter();
			pw.println("<html><body bgcolor=cyan text=red><h1>");
			pw.println("Welcome to http Servlets...");
			pw.println("</h1></body></html>");

		} catch(Exception e) {
			System.err.println(e);
		}


	}

}