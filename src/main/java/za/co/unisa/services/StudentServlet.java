package za.co.unisa.services;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import za.co.unisa.dao.StudentDao;
import za.co.unisa.models.Student;

/**
 * Servlet implementation class studentServlet
 */
@WebServlet("/StudentServlet")
public class StudentServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
   
	StudentDao studentDao = new StudentDao();
	
    public StudentServlet() {
        super();
  
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		String firstName = request.getParameter("firstName");
		String lastName = request.getParameter("lastName");
		String telephoneNumber = request.getParameter("telephoneNumber");
		String email = request.getParameter("email");
		String dateOfBirth = request.getParameter("dateOfBirth");
		String maritalStatus = request.getParameter("maritalStatus");
		String course = request.getParameter("course");
		
		Student student = new Student();
		student.setFirstName(firstName);
		student.setLastName(lastName);
		student.setTelephoneNumber(telephoneNumber);
		student.setEmail(email);
		student.setDateOfBirth(dateOfBirth);
		student.setMaritalStatus(maritalStatus);
		student.setCourse(course);
		
		try {
			PrintWriter out = response.getWriter();
			studentDao.insertStudent(student);
			 
			out.println("Record successfully inserted");
			
		}catch(Exception e) {
			System.out.println(e);
		}
	}

}
