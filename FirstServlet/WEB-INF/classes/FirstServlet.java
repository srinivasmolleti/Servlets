import javax.servlet.*;
import java.io.*;

public class FirstServlet extends GenericServlet {
	public void service(ServletRequest req, ServletResponse res) { 
		try{
			PrintWriter pw = res.getWriter();
			pw.println("Welcome to Servlets...");
		} catch( Exception e) {
			System.err.println(e);
		}

	}
}