package servets;

import java.io.IOException;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Date;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import models.Lista;
import models.Solicitud;

/**
 * Servlet implementation class Index
 */
@WebServlet("/Index")
public class Index extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public Index() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		response.getWriter().append("Served at: ").append(request.getContextPath());
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
//http://puntocomnoesunlenguaje.blogspot.com/2015/10/clase-fecha-java.html
		String nombre = request.getParameter("nombre");
		String telefono = request.getParameter("telefono");
		String direccion = request.getParameter("direccion");
		String tipo = request.getParameter("tipo");
        DateTimeFormatter dtf = DateTimeFormatter.ofPattern("dd/MM/yyyy");
		String fecha = dtf.format(LocalDate.now());
		String actualizacion = dtf.format(LocalDate.now());
		Solicitud solicitud = new Solicitud(nombre,telefono,direccion,tipo,fecha);
	    
        request.getSession().setAttribute("solicitud", solicitud);
		Lista lista = new Lista();
		List<Solicitud> solicitudes = (List<Solicitud>)request.getSession().getAttribute("todo");		

		if(solicitudes != null)
		{
			lista.setLista(solicitudes);
		}
		if(lista.agregar(solicitud)) {
			request.getSession().setAttribute("todo", lista.getLista());
			response.sendRedirect("/Actividad1/info.jsp");
		}
	
		

	
	}

}
