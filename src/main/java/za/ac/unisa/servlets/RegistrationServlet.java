package za.ac.unisa.servlets;

import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class RegistrationServlet extends HttpServlet{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	protected void doPost(HttpServletRequest req,HttpServletResponse res) {
		String firstName = req.getParameter("firstName");
		String lastName = req.getParameter("lastName");
		String telephoneNumber = req.getParameter("telephoneNumber");
		String emailAddress = req.getParameter("emailAddress");
		String dateOfBirth = req.getParameter("dateOfBirth");
		String maritalStatus = req.getParameter("maritalStatus");
		
		System.out.println(firstName +": "+ lastName + ": "+telephoneNumber+": "+
		emailAddress+": "+dateOfBirth+": "+maritalStatus);
	}
protected void doGet(HttpServletRequest req,HttpServletResponse res) {
		
	}
}
