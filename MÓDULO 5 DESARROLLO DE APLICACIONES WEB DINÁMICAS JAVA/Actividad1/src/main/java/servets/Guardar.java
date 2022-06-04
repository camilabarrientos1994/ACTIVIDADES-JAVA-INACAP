package servets;

import java.io.IOException;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import models.Lista;
import models.Solicitud;

/**
 * Servlet implementation class Guardar
 */
@WebServlet("/Guardar")
public class Guardar extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public Guardar() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		response.getWriter().append("Served at: ").append(request.getContextPath());
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

		String comentario = request.getParameter("comentario");
		
		Solicitud s = (Solicitud) request.getSession().getAttribute("hola");
		s.setComentario(comentario);
        DateTimeFormatter dtf = DateTimeFormatter.ofPattern("dd/MM/yyyy");
		String actualizacion = dtf.format(LocalDate.now());
		s.setActualizacion(actualizacion);
		
		Lista lista = new Lista();
		List<Solicitud> solicitudes = (List<Solicitud>)request.getSession().getAttribute("todo");	
		if(solicitudes != null)
		{
			
			lista.setLista(solicitudes);
		}
        request.getSession().setAttribute("hola", s);

		response.sendRedirect("/Actividad1/actualizacion.jsp");
	}

}
