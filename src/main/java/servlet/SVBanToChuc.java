package servlet;

import java.io.IOException;
import java.time.LocalDate;
import java.util.ArrayList;

import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import controller.BanToChucController;

import model.GiaiDua;
import model.ThanhVienBanToChuc;

/**
 * Servlet implementation class SVBanToChuc
 */
@WebServlet("/SVBanToChuc")
public class SVBanToChuc extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public SVBanToChuc() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		BanToChucController btcc = new BanToChucController();
		ArrayList<GiaiDua> listGiaiDua = btcc.getGiaiDua();
		request.setAttribute("listGiaiDua", listGiaiDua);
		HttpSession session = request.getSession();
		ThanhVienBanToChuc thanhVienBanToChuc = new ThanhVienBanToChuc(1, "username1", "password1", "username1", LocalDate.of(2000, 1, 1), "Ha Noi", "username1@gmail.com", "0123456789", 1);
		session.setAttribute("thanhVienBanToChuc", thanhVienBanToChuc);
		ServletContext sc = request.getSession().getServletContext();
		String url = "/GDBanToChuc.jsp";
		sc.getRequestDispatcher(url).forward(request, response);
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
