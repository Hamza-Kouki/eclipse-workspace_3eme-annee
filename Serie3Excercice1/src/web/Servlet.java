package web;

import java.io.IOException;

import java.io.IOException;
import java.io.PrintWriter;
import static java.lang.System.out;
import java.util.ArrayList;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import métier.Etudiant;


public class Servlet extends HttpServlet {
	private static String studentName;
	   private static Model databaseOp;
	    private static ArrayList<Etudiant> students;
	    
	    public Servlet(){
	        studentName ="";
	        
	        students = new ArrayList<Etudiant>();
	        
	        databaseOp = new Model();
	        
	    }
	    
	    
	    protected void doPost(HttpServletRequest request, HttpServletResponse response)
	            throws ServletException, IOException {
	        response.setContentType("text/html;charset=UTF-8");
	        try{
	            
	         PrintWriter out = response.getWriter();
	        studentName  = request.getParameter("Sname");
	        databaseOp.setStudentName(studentName);

	        students = databaseOp.getStudents();
	        
	        request.setAttribute("Students", students);
	        request.getRequestDispatcher("EtudiantVue.jsp").forward(request, response);

	        
	        
	        }catch(Exception e){
	            
	            request.setAttribute("exception", e);
	            request.getRequestDispatcher("error.jsp").forward(request, response);

	        }
	        
	    }


	    @Override
	    public String getServletInfo() {
	        return "This servlet extracts the student name from the JSP then parse that "
	                + "to model which search the student name and returns "
	                + "the results that is then fowarded to the JSP in an Arraylist form to be further ajusted";
	    }
}
