package dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;


import model.KetQuaTayDua523;
import model.TayDuaDaDangKy523;

public class KetQuaTayDuaDAO523 extends DAO523 {
	private Connection con = null;
	private PreparedStatement ps = null;
	private ResultSet rs = null;
    
    public KetQuaTayDuaDAO523() {
    	this.con = this.getInstance();
    }
    
    public KetQuaTayDua523 getKetQuaTayDuabyTayDuaDaDangKy(TayDuaDaDangKy523 tayDuaDaDangKy) {
    	KetQuaTayDua523 result = new KetQuaTayDua523();
    	try {
    		String query = "SELECT * FROM tblketquataydua523 WHERE tblTayDuaDaDangKy523id = ?";
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
    
    public void saveKetQuaTayDua(ArrayList<KetQuaTayDua523> listKetQuaTayDua) {
    	try {
    		for(KetQuaTayDua523 kqtd: listKetQuaTayDua) {
    			String query = "SELECT * FROM tblketquataydua523 WHERE id = ?";
    			ps = con.prepareStatement(query);
    			ps.setInt(1, kqtd.getId());
    			rs = ps.executeQuery();
    			if (rs.next()) {
    				query = "UPDATE tblketquataydua523 SET soVongHoanThanh = ?, thoiGianHoanThanh = ?, suKien = ? WHERE id = ?";
    				ps = con.prepareStatement(query);
    				ps.setInt(1, kqtd.getSoVongHoanThanh());
    				ps.setInt(2, kqtd.getThoiGianHoanThanh());
    				ps.setInt(3, kqtd.getSuKien());
    				ps.setInt(4, kqtd.getId());
    				ps.executeUpdate();
    			} else {
    				query = "INSERT tblketquataydua523(soVongHoanThanh,thoiGianHoanThanh,suKien, tblTayDuaDaDangKy523id, tblThanhVienBanToChuc523id) VALUES (?,?,?,?,?)";
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
