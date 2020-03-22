package Balaji.logging.servlet;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;

@WebServlet("/test")
public class TestLog4jServlet extends HttpServlet {

	static final Logger LOGGER = Logger.getLogger("CONSOLE_JSON_APPENDER"); 
	//Logger logger = LogManager.getLogger("CONSOLE_JSON_APPENDER");
	
			
	protected void doGet(HttpServletRequest request,
			HttpServletResponse response) throws ServletException, IOException {
		
		LOGGER.info("This is a logging statement from Balaji-logging-service");
		//logger.debug("Debug message");
		
		String html = "<html><h2>Balaji-Logging-Service - Hello World!</h2></html>";
		response.getWriter().println(html);
	}

}