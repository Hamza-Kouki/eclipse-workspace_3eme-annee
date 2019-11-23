package web;

import java.io.IOException;

import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse; 

import metier.CalculSommeSerie;

public class ControleServletSerie extends HttpServlet{
	
	private CalculSommeSerie calcul;
	private Serie serie ;
       
	public void init() throws ServletException{
   }
	
	  public ControleServletSerie() {
	    	//super();
	        serie = new Serie();
	        calcul = new CalculSommeSerie();
	    }     




    
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		int n = Integer.parseInt(request.getParameter("n"));
		serie.setN(n);
		serie.setSomme(calcul.CalculSomme(serie.getN()));
		RequestDispatcher rd = request.getRequestDispatcher("/WEB-INF/VueSérie.jsp");
		//request.getRequestDispatcher("VueSérie.jsp").forward(request, response);
		 request.setAttribute("resultat", serie.getSomme());
		 
		 rd.forward(request, response);
	}

}
