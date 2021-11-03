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
		String nome,email;
		
		Long cursoId;
		String valor, site;
		
		String data;
		
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
			
		}else if (idFormulario == 2) {	//Cursos
			
			switch (tipoFormulario) {
				case 21:{	//Consultar todos
					
					break;
				}
				case 22:{	//Consultar curso específico
					
					cursoId = Long.parseLong(request.getParameter("curso"));
					
					out.println("<h2>Cursos -> Consulta de curso </h2>");
					
					break;
				}
				case 23:{	//Cadastrar curso
					
					cursoId = Long.parseLong(request.getParameter("curso"));
					
					nome = request.getParameter("nome");
					
					valor = request.getParameter("valor");
					
					site = request.getParameter("site");
					
					out.println("<h2>Cursos -> Cadastro de curso </h2>");
					
					break;
				}
				case 24:{	//Alterar curso
					
					cursoId = Long.parseLong(request.getParameter("curso"));
					
					nome = request.getParameter("nome");
					
					valor = request.getParameter("valor");
					
					site = request.getParameter("site");
					
					out.println("<h2>Cursos -> Alteração de curso </h2>");
					
					break;
				}
				case 25:{	//Excluir curso
					
					cursoId = Long.parseLong(request.getParameter("curso"));
					
					out.println("<h2>Cursos -> Exclusão de curso </h2>");
					
					break;
				}
			}
			
		}else if (idFormulario == 3) {	//Pagamentos
			
			switch (tipoFormulario) {
				case 31:{	//Consultar todos
					
					break;
				}
				case 32:{	//Consultar pagamento específico
					
					cursoId = Long.parseLong(request.getParameter("curso"));
					
					cpfMask = request.getParameter("cpf");
					cpfMask = cpfMask.replaceAll("[.-]",""); 
					cpf = Long.parseLong(cpfMask);
					
					out.println("<h2>Pagamentos -> Consulta de pagamento </h2>");
					
					break;
				}
				case 33:{	//Cadastrar pagamento
					
					cpfMask = request.getParameter("cpf");
					cpfMask = cpfMask.replaceAll("[.-]",""); 
					cpf = Long.parseLong(cpfMask);

					data = request.getParameter("data");

					
					cursoId = Long.parseLong(request.getParameter("curso"));
					
	
					
					out.println("<h2>Pagamentos -> Cadastro de pagamento </h2>");
					
					break;
				}
				case 34:{	//Alterar pagamento

					cpfMask = request.getParameter("cpf");
					cpfMask = cpfMask.replaceAll("[.-]",""); 
					cpf = Long.parseLong(cpfMask);

					cursoId = Long.parseLong(request.getParameter("curso"));
					data = request.getParameter("data");

					out.println("<h2>Pagamentos -> Alteração de pagamento </h2>" + data);

					break;
				}
				case 35:{	//Excluir pagamento

					cpfMask = request.getParameter("cpf");
					cpfMask = cpfMask.replaceAll("[.-]",""); 
					cpf = Long.parseLong(cpfMask);

					cursoId = Long.parseLong(request.getParameter("curso"));

					out.println("<h2>Pagamentos -> Exclusão de pagamento </h2>");

					break;
				}
			}
		}
	}

}
