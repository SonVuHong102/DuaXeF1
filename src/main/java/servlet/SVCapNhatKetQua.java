package servlet;

import java.io.IOException;
import java.util.ArrayList;

import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import controller.CapNhatKetQuaController;
import model.ChangDua523;
import model.GiaiDua523;
import model.ThanhVienBanToChuc523;

/**
 * Servlet implementation class SVCapNhatKetQua
 */
@WebServlet("/SVCapNhatKetQua")
public class SVCapNhatKetQua extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public SVCapNhatKetQua() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		int tblGiaiDuaid = Integer.parseInt(request.getParameter("tblGiaiDuaid"));
		GiaiDua523 giaiDua = new GiaiDua523();
		giaiDua.setId(tblGiaiDuaid);
		CapNhatKetQuaController capNhatKetQuaController = new CapNhatKetQuaController();
		ArrayList<ChangDua523> listChangDua = capNhatKetQuaController.getChangDuabyGiaiDua(giaiDua);
		request.setAttribute("listChangDua", listChangDua);
		ServletContext sc = request.getSession().getServletContext();
		sc.getRequestDispatcher("/GDCapNhatKetQua.jsp").forward(request, response);
	}

}
