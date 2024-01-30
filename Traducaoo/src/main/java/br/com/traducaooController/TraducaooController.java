package br.com.traducaooController;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import br.com.traducaooModel.TraducaooModel;

/**
 * Servlet implementation class TraducaooController
 */
@WebServlet("/TraducaooController")
public class TraducaooController extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public TraducaooController() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
			String palavraOriginal = request.getParameter("traduzido");
			TraducaooModel traducao = new TraducaooModel() ;
			String palavraTraduzida  =  traducao.traduzirString(palavraOriginal);
			request.setAttribute("palavraTraduzida", palavraTraduzida);
			request.getRequestDispatcher("resposta.jsp").forward(request, response);
			
		
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
