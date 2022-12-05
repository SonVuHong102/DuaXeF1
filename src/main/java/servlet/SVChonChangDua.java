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
import model.KetQuaTayDua523;
import model.TayDuaDaDangKy523;

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
		ArrayList<ChangDua523> listChangDua = (ArrayList<ChangDua523>) request.getSession().getAttribute("listChangDua");
		String tblChangDuaidStr = request.getParameter("tblChangDuaid");
		if(tblChangDuaidStr == null) {
			String url = "/GDCapNhatKetQua.jsp";
			request.getSession().getServletContext().getRequestDispatcher(url).forward(request, response);
			return;
		}
		int tblChangDuaid = Integer.parseInt(tblChangDuaidStr);
		ChangDua523 changDuaDaChon = new ChangDua523();
		for(ChangDua523 changDua: listChangDua) {
			if(changDua.getId() == tblChangDuaid) {
				changDuaDaChon = changDua;
				break;
			}
		}
		request.setAttribute("changDuaDaChon", changDuaDaChon);
		CapNhatKetQuaController cnkqc = new CapNhatKetQuaController();
		ArrayList<TayDuaDaDangKy523> listTayDuaDaDangKy = cnkqc.getTayDuaDaDangKybyChangDua(changDuaDaChon);
		ArrayList<KetQuaTayDua523> listKetQuaTayDua = new ArrayList<KetQuaTayDua523>();
		for(TayDuaDaDangKy523 tayDuaDaDangKy: listTayDuaDaDangKy) {
			KetQuaTayDua523 ketQuaTayDua = cnkqc.getKetQuaTayDuabyTayDuaDaDangKy(tayDuaDaDangKy);
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
