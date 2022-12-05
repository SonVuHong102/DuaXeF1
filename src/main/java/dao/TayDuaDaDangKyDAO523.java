package dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

import model.ChangDua523;
import model.DoiDua523;
import model.DonDangKy523;
import model.TayDua523;
import model.TayDuaDaDangKy523;

public class TayDuaDaDangKyDAO523 extends DAO523 {
	private Connection con = null;
	private PreparedStatement ps = null;
	private ResultSet rs = null;
    
    public TayDuaDaDangKyDAO523() {
    	this.con = this.getInstance();
    }
    
    public ArrayList<TayDuaDaDangKy523> getTayDuaDaDangKybyChangDua(ChangDua523 changDua) {
    	ArrayList<TayDuaDaDangKy523> list = new ArrayList<TayDuaDaDangKy523>();
    	try {
    		String query = "SELECT * FROM tbldondangky523 WHERE tblChangDua523id = ?";
    		ps = con.prepareStatement(query);
    		ps.setInt(1, changDua.getId());
    		rs = ps.executeQuery();
    		ArrayList<DonDangKy523> listDonDangKy = new ArrayList<DonDangKy523>();
    		while(rs.next()) {
    			DonDangKy523 donDangKy = new DonDangKy523();
    			donDangKy.setId(rs.getInt("id"));
    			donDangKy.setChangDua(changDua);
    			listDonDangKy.add(donDangKy);
    		}
    		if(listDonDangKy == null || listDonDangKy.size() == 0) {
    			return list;
    		}
    		for(DonDangKy523 ddk: listDonDangKy) {
    			String query1 = "SELECT * FROM tbltayduadadangky523 WHERE tblDonDangKy523id = ?";
    			PreparedStatement ps1 = con.prepareStatement(query1);
    			ps1.setInt(1, ddk.getId());
    			ResultSet rs1 = ps1.executeQuery();
    			while(rs1.next()) {
    				TayDuaDaDangKy523 tayDuaDaDangKy = new TayDuaDaDangKy523();
    				tayDuaDaDangKy.setId(rs1.getInt("id"));
    				tayDuaDaDangKy.setDonDangKy(ddk);
    				String query2 = "SELECT * FROM tbltaydua523 WHERE id = ?";
    				PreparedStatement ps2 = con.prepareStatement(query2);
    				ps2.setInt(1, rs1.getInt("tblTayDua523id"));
    				ResultSet rs2 = ps2.executeQuery();
    				while(rs2.next()) {
    					TayDua523 tayDua = new TayDua523();
    					tayDua.setId(rs2.getInt("id"));
    					tayDua.setTen(rs2.getString("ten"));
    					tayDua.setNgaySinh(rs2.getDate("ngaySinh").toLocalDate());
    					tayDua.setTieuSu(rs2.getString("tieuSu"));
    					tayDua.setQuocTich(rs2.getString("quocTich"));
        				tayDuaDaDangKy.setTayDua(tayDua);
        				String query3 = "SELECT * FROM tbldoidua523 WHERE id = ?";
    					PreparedStatement ps3 = con.prepareStatement(query3);
        				ps3.setInt(1, rs2.getInt("tblDoiDua523id"));
        				ResultSet rs3 = ps3.executeQuery();
        				while(rs3.next()) {
        					DoiDua523 doiDua = new DoiDua523();
        					doiDua.setId(rs3.getInt("id"));
        					doiDua.setTen(rs3.getString("ten"));
        					doiDua.setHang(rs3.getString("hang"));
        					doiDua.setMoTa(rs3.getString("moTa"));
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
