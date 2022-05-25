package servlets;

import java.io.IOException;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import modelo.Auto;
import modelo.RegistroVehiculo;

/**
 * Servlet implementation class Actualizar
 */
@WebServlet("/Actualizar")
public class Actualizar extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public Actualizar() {
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

		String patente = request.getParameter("patente");
		String marca = request.getParameter("marcas");
//		int anio = Integer.parseInt(request.getParameter("año"));
	    String fecha = request.getParameter("año");
	    int anio = Integer.parseInt(fecha);
	    boolean estado = request.getParameter("estado")!= null? true:false;

	    String tipo = request.getParameter("tipo");
	    
	    Auto auto = new Auto(patente,marca,anio,estado,tipo);
	    RegistroVehiculo registro = new RegistroVehiculo();
	    List<Auto> lista = (List<Auto>)request.getSession().getAttribute("llave");
	   
	    if(lista != null) {
	       registro.setLista(lista);
	    }
	    registro.modificar(auto);
	    request.getSession().setAttribute("llave", registro.getLista());
	    response.sendRedirect("/TerceraClase/datos.jsp");
	    
	
	}

}
