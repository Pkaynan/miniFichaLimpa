package web;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import model.Politico;
import percistense.PoliticoDAO;


@WebServlet("/perfilpolitico")
public class PoliticoPerfil extends HttpServlet {
	private static final long serialVersionUID = 1L;
 
	protected void doGet(HttpServletRequest request, HttpServletResponse response)
	        throws ServletException, IOException {
	        
	        String idStr = request.getParameter("id");
	        if (idStr != null) {
	            try {
	                Long id = Long.parseLong(idStr);
	                PoliticoDAO dao = new PoliticoDAO();
	                Politico politico = dao.findById(id); 
	                request.setAttribute("politico", politico);
	                RequestDispatcher rd = request.getRequestDispatcher("perfil-politico.jsp");
	                rd.forward(request, response);
	            } catch (NumberFormatException e) {
	                response.sendError(HttpServletResponse.SC_BAD_REQUEST);
	            }
	        } else {
	            response.sendError(HttpServletResponse.SC_BAD_REQUEST);
	        }
	    }

	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
	}

}
