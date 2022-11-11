package dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;


import model.KetQuaTayDua;
import model.TayDuaDaDangKy;

public class KetQuaTayDuaDAO extends DAO {
	private Connection con = null;
	private PreparedStatement ps = null;
	private ResultSet rs = null;
    
    public KetQuaTayDuaDAO() {
    	this.con = this.getInstance();
    }
    
    public KetQuaTayDua getKetQuaTayDuabyTayDuaDaDangKy(TayDuaDaDangKy tayDuaDaDangKy) {
    	KetQuaTayDua result = new KetQuaTayDua();
    	try {
    		String query = "SELECT * FROM tblketquataydua WHERE tblTayDuaDaDangKyid = ?";
    		ps = con.prepareStatement(query);
    		ps.setInt(1, tayDuaDaDangKy.getId());
    		rs = ps.executeQuery();
    		while(rs.next()) {
    			result.setId(rs.getInt("id"));
    			result.setSoVongHoanThanh(rs.getInt("soVongHoanThanh"));
    			result.setThoiGianHoanThanh(rs.getInt("thoiGianHoanThanh"));
    			result.setSuKien(rs.getInt("suKien"));
    			result.setTayDuaDaDangKy(tayDuaDaDangKy);
    		}
    	} catch (SQLException e) {
    		e.printStackTrace();
    	}
    	return result;
    }
    
    public void saveKetQuaTayDua(ArrayList<KetQuaTayDua> listKetQuaTayDua) {
    	try {
    		for(KetQuaTayDua kqtd: listKetQuaTayDua) {
    			String query = "SELECT * FROM tblketquataydua WHERE id = ?";
    			ps = con.prepareStatement(query);
    			ps.setInt(1, kqtd.getId());
    			rs = ps.executeQuery();
    			if (rs.next()) {
    				query = "UPDATE tblketquataydua SET soVongHoanThanh = ?, thoiGianHoanThanh = ?, suKien = ? WHERE id = ?";
    				ps = con.prepareStatement(query);
    				ps.setInt(1, kqtd.getSoVongHoanThanh());
    				ps.setInt(2, kqtd.getThoiGianHoanThanh());
    				ps.setInt(3, kqtd.getSuKien());
    				ps.setInt(4, kqtd.getId());
    				ps.executeUpdate();
    			} else {
    				query = "INSERT tblketquataydua(soVongHoanThanh,thoiGianHoanThanh,suKien, tblTayDuaDaDangKyid, tblThanhVienBanToChucid) VALUES (?,?,?,?,?)";
    				ps = con.prepareStatement(query);
    				ps.setInt(1, kqtd.getSoVongHoanThanh());
    				ps.setInt(2, kqtd.getThoiGianHoanThanh());
    				ps.setInt(3, kqtd.getSuKien());
    				ps.setInt(4, kqtd.getTayDuaDaDangKy().getId());
    				ps.setInt(5, kqtd.getThanhVienBanToChuc().getId());
    				ps.executeUpdate();
    			}
    		}
    	} catch (SQLException e) {
    		e.printStackTrace();
    	}
    }
}
