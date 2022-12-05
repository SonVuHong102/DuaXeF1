package servlet;

import java.io.IOException;
import java.util.ArrayList;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import controller.CapNhatKetQuaController;
import model.KetQuaTayDua;
import model.ThanhVienBanToChuc;

/**
 * Servlet implementation class SVLuuKetQua
 */
@WebServlet("/SVLuuKetQua")
public class SVLuuKetQua extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public SVLuuKetQua() {
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
		ThanhVienBanToChuc thanhVienBanToChuc = (ThanhVienBanToChuc) request.getSession().getAttribute("thanhVienBanToChuc");
		ArrayList<KetQuaTayDua> listKetQuaTayDua = (ArrayList<KetQuaTayDua>) request.getSession().getAttribute("listKetQuaTayDua");
		if(listKetQuaTayDua == null || listKetQuaTayDua.size() == 0) {
			String url = "/GDCapNhatKetQua.jsp";
			request.getSession().getServletContext().getRequestDispatcher(url).forward(request, response);
			return;
		}
		for(KetQuaTayDua kqtd: listKetQuaTayDua) {
			int tblTayDuaDaDangKyid = kqtd.getTayDuaDaDangKy().getId();
			String suKien = request.getParameter("suKien_tayDuaDaDangKy" + tblTayDuaDaDangKyid);
			kqtd.setSuKien(Integer.parseInt(suKien));
			if(suKien.compareTo("0") == 0) {
				String formattedTime = request.getParameter("thoiGian_tayDuaDaDangKy" + tblTayDuaDaDangKyid);
				log(formattedTime);
				kqtd.setRawTime(formattedTime);
				String soVongHoanThanh = request.getParameter("soVong_tayDuaDaDangKy" + tblTayDuaDaDangKyid);
				log(soVongHoanThanh);
				kqtd.setSoVongHoanThanh(Integer.parseInt(soVongHoanThanh));
			} else {
				kqtd.setThoiGianHoanThanh(0);
				kqtd.setSoVongHoanThanh(0);
			}
			kqtd.setThanhVienBanToChuc(thanhVienBanToChuc);
		}
		CapNhatKetQuaController capNhatKetQuaController = new CapNhatKetQuaController();
		capNhatKetQuaController.saveKetQuaTayDua(listKetQuaTayDua);
		request.getSession().removeAttribute("listKetQuaTayDua");
		String url = "/GDCapNhatKetQua.jsp";
		request.getSession().getServletContext().getRequestDispatcher(url).forward(request, response);
	}

}
