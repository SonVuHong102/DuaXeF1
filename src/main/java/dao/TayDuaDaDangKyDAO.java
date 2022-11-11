package dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

import model.ChangDua;
import model.DoiDua;
import model.DonDangKy;
import model.QuocTich;
import model.TayDua;
import model.TayDuaDaDangKy;

public class TayDuaDaDangKyDAO extends DAO {
	private Connection con = null;
	private PreparedStatement ps = null;
	private ResultSet rs = null;
    
    public TayDuaDaDangKyDAO() {
    	this.con = this.getInstance();
    }
    
    public ArrayList<TayDuaDaDangKy> getTayDuaDaDangKybyChangDua(ChangDua changDua) {
    	ArrayList<TayDuaDaDangKy> list = new ArrayList<TayDuaDaDangKy>();
    	try {
    		String query = "SELECT * FROM tbldondangky WHERE tblChangDuaid = ?";
    		ps = con.prepareStatement(query);
    		ps.setInt(1, changDua.getId());
    		rs = ps.executeQuery();
    		ArrayList<DonDangKy> listDonDangKy = new ArrayList<DonDangKy>();
    		while(rs.next()) {
    			DonDangKy donDangKy = new DonDangKy();
    			donDangKy.setId(rs.getInt("id"));
    			donDangKy.setChangDua(changDua);
    			listDonDangKy.add(donDangKy);
    		}
    		if(listDonDangKy == null || listDonDangKy.size() == 0) {
    			return list;
    		}
    		for(DonDangKy ddk: listDonDangKy) {
    			String query1 = "SELECT * FROM tbltayduadadangky WHERE tblDonDangKyid = ?";
    			PreparedStatement ps1 = con.prepareStatement(query1);
    			ps1.setInt(1, ddk.getId());
    			ResultSet rs1 = ps1.executeQuery();
    			while(rs1.next()) {
    				TayDuaDaDangKy tayDuaDaDangKy = new TayDuaDaDangKy();
    				tayDuaDaDangKy.setId(rs1.getInt("id"));
    				tayDuaDaDangKy.setDonDangKy(ddk);
    				String query2 = "SELECT * FROM tbltaydua WHERE id = ?";
    				PreparedStatement ps2 = con.prepareStatement(query2);
    				ps2.setInt(1, rs1.getInt("tblTayDuaid"));
    				ResultSet rs2 = ps2.executeQuery();
    				while(rs2.next()) {
    					TayDua tayDua = new TayDua();
    					tayDua.setId(rs2.getInt("id"));
    					tayDua.setTen(rs2.getString("ten"));
    					tayDua.setNgaySinh(rs2.getDate("ngaySinh").toLocalDate());
    					tayDua.setTieuSu(rs2.getString("tieuSu"));
    					String query3 = "SELECT * FROM tblquoctich WHERE id = ?";
    					PreparedStatement ps3 = con.prepareStatement(query3);
        				ps3.setInt(1, rs2.getInt("tblQuocTichid"));
        				ResultSet rs3 = ps3.executeQuery();
        				while(rs3.next()) {
        					QuocTich quocTich = new QuocTich();
        					quocTich.setId(rs3.getInt("id"));
        					quocTich.setTen(rs3.getString("ten"));
        					tayDua.setQuocTich(quocTich);
        				}
        				tayDuaDaDangKy.setTayDua(tayDua);
        				String query4 = "SELECT * FROM tbldoidua WHERE id = ?";
    					PreparedStatement ps4 = con.prepareStatement(query4);
        				ps4.setInt(1, rs2.getInt("tblDoiDuaid"));
        				ResultSet rs4 = ps4.executeQuery();
        				while(rs4.next()) {
        					DoiDua doiDua = new DoiDua();
        					doiDua.setId(rs4.getInt("id"));
        					doiDua.setTen(rs4.getString("ten"));
        					doiDua.setHang(rs4.getString("hang"));
        					doiDua.setMoTa(rs4.getString("moTa"));
        					tayDua.setDoiDua(doiDua);
        				}
    				}
    				list.add(tayDuaDaDangKy);
    			}
    		}
    	} catch (SQLException e) {
    		e.printStackTrace();
    	}
    	return list;
    }
}
