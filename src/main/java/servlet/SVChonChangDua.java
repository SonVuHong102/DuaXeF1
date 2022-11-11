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
import model.ChangDua;
import model.KetQuaTayDua;
import model.TayDuaDaDangKy;

/**
 * Servlet implementation class SVChonChangDua
 */
@WebServlet("/SVChonChangDua")
public class SVChonChangDua extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public SVChonChangDua() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		ArrayList<ChangDua> listChangDua = (ArrayList<ChangDua>) request.getSession().getAttribute("listChangDua");
		int tblChangDuaid = Integer.parseInt(request.getParameter("tblChangDuaid"));
		ChangDua changDuaDaChon = new ChangDua();
		for(ChangDua changDua: listChangDua) {
			if(changDua.getId() == tblChangDuaid) {
				changDuaDaChon = changDua;
				break;
			}
		}
		request.setAttribute("changDuaDaChon", changDuaDaChon);
		CapNhatKetQuaController cnkqc = new CapNhatKetQuaController();
		ArrayList<TayDuaDaDangKy> listTayDuaDaDangKy = cnkqc.getTayDuaDaDangKybyChangDua(changDuaDaChon);
		ArrayList<KetQuaTayDua> listKetQuaTayDua = new ArrayList<KetQuaTayDua>();
		for(TayDuaDaDangKy tayDuaDaDangKy: listTayDuaDaDangKy) {
			KetQuaTayDua ketQuaTayDua = cnkqc.getKetQuaTayDuabyTayDuaDaDangKy(tayDuaDaDangKy);
			ketQuaTayDua.setTayDuaDaDangKy(tayDuaDaDangKy);
			listKetQuaTayDua.add(ketQuaTayDua);
		}
		request.setAttribute("listKetQuaTayDua", listKetQuaTayDua);
		String url = "/GDCapNhatKetQua.jsp";
		request.getSession().getServletContext().getRequestDispatcher(url).forward(request, response);
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
