package Controller;

import java.io.IOException;
import java.io.PrintWriter;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

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
		
		Integer cursoId;
		Double valor;
		String site;
		
		SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
		Date data;
		
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
					
					cursoId = Integer.parseInt(request.getParameter("curso"));
					
					out.println("<h2>Cursos -> Consulta de curso </h2>");
					
					break;
				}
				case 23:{	//Cadastrar curso
					
					cursoId = Integer.parseInt(request.getParameter("curso"));
					
					nome = request.getParameter("nome");
					
					valor = Double.parseDouble(request.getParameter("valor"));
					
					site = request.getParameter("site");
					
					out.println("<h2>Cursos -> Cadastro de curso </h2>");
					
					break;
				}
				case 24:{	//Alterar curso
					
					cursoId = Integer.parseInt(request.getParameter("curso"));
					
					nome = request.getParameter("nome");
					
					valor = Double.parseDouble(request.getParameter("valor"));
					
					site = request.getParameter("site");
					
					out.println("<h2>Cursos -> Alteração de curso </h2>");
					
					break;
				}
				case 25:{	//Excluir curso
					
					cursoId = Integer.parseInt(request.getParameter("curso"));
					
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
				
				cursoId = Integer.parseInt(request.getParameter("curso"));
				
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
				
				try {
					data = sdf.parse(request.getParameter("data"));
				} catch (ParseException e) {
					
				}
				
				cursoId = Integer.parseInt(request.getParameter("curso"));
				

				
				out.println("<h2>Pagamentos -> Cadastro de pagamento </h2>");
				
				break;
			}
			case 34:{	//Alterar pagamento

				cpfMask = request.getParameter("cpf");
				cpfMask = cpfMask.replaceAll("[.-]",""); 
				cpf = Long.parseLong(cpfMask);

				cursoId = Integer.parseInt(request.getParameter("curso"));

				try {
					data = sdf.parse(request.getParameter("data"));
				} catch (ParseException e) {
					
				}
				
				
				out.println("<h2>Pagamentos -> Alteração de pagamento </h2>");
				
				break;
			}
			case 35:{	//Excluir pagamento
				
				cpfMask = request.getParameter("cpf");
				cpfMask = cpfMask.replaceAll("[.-]",""); 
				cpf = Long.parseLong(cpfMask);
				
				cursoId = Integer.parseInt(request.getParameter("curso"));
				
				out.println("<h2>Pagamentos -> Exclusão de pagamento </h2>");
				
				break;
			}
		}
		}
	}

}
