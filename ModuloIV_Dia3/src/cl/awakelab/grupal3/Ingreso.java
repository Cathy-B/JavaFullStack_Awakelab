package cl.awakelab.grupal3;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import javax.swing.JOptionPane;

/**
 * Servlet implementation class Ingreso
 */
@WebServlet("/Ingreso")
public class Ingreso extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public Ingreso() {
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
		// TODO Auto-generated method stub
		//doGet(request, response);
		String usuario = "admin";
		String contrasena= "1234";
		
		String vausuario = request.getParameter("rut");
		String vacontrasena = request.getParameter("contraseña");
		
		if(usuario.equals(vausuario) && contrasena.equals(vacontrasena)) {
			
			HttpSession session = request.getSession();
			session.setAttribute("usuario", "Usuario");
			request.getRequestDispatcher("ServletContacto").forward(request, response); 
			 
		}else {
			 request.getRequestDispatcher("ServletLogin").forward(request, response); 
			 JOptionPane.showMessageDialog(null, "Los datos ingresados son incorrectos!");

		}
	}

}
