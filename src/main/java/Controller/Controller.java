package Controller;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class Controller
 */
@WebServlet("/Controller")
public class Controller extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public Controller() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		response.setContentType("text/html");
		PrintWriter out = response.getWriter();
		
		int idFormulario;
		int tipoFormulario;
		String cpfMask;
		Long cpf;
		String nome;
		String email;
		
		
		idFormulario = Integer.parseInt(request.getParameter("id_formulario"));
		tipoFormulario = Integer.parseInt(request.getParameter("tipo_formulario"));
		
		if (idFormulario == 1) {	//Clientes
			switch (tipoFormulario) {
				case 11:{	//Consultar todos
					
					break;
				}
				case 12:{	//Consultar cliente específico
					
					cpfMask = request.getParameter("cpf");
					cpfMask = cpfMask.replaceAll("[.-]",""); 
					cpf = Long.parseLong(cpfMask);
					
					out.println("<h2>Clientes -> Consulta de cliente </h2>");
					
					break;
				}
				case 13:{	//Cadastrar cliente
					
					cpfMask = request.getParameter("cpf");
					cpfMask = cpfMask.replaceAll("[.-]",""); 
					cpf = Long.parseLong(cpfMask);
					
					nome = request.getParameter("nome");
					
					email = request.getParameter("email");
					
					out.println("<h2>Clientes -> Cadastro de cliente </h2>");
					
					break;
				}
				case 14:{	//Alterar cliente
					
					cpfMask = request.getParameter("cpf");
					cpfMask = cpfMask.replaceAll("[.-]",""); 
					cpf = Long.parseLong(cpfMask);
					
					nome = request.getParameter("nome");
					
					email = request.getParameter("email");
					
					out.println("<h2>Clientes -> Alteração de cliente </h2>");
					
					break;
				}
				case 15:{	//Excluir cliente
					
					cpfMask = request.getParameter("cpf");
					cpfMask = cpfMask.replaceAll("[.-]",""); 
					cpf = Long.parseLong(cpfMask);
					
					out.println("<h2>Clientes -> Exclusão de cliente </h2>");
					
					break;
				}
			}
		}else if (idFormulario == 2) {
			
		}else if (idFormulario == 3) {
			
		}
	}

}
