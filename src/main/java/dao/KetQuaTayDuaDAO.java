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
    
    public ArrayList<KetQuaTayDua> getKetQuaTayDuabyTayDuaDaDangKy(TayDuaDaDangKy tayDuaDaDangKy) {
    	ArrayList<KetQuaTayDua> list = new ArrayList<KetQuaTayDua>();
    	try {
    		String query = "SELECT * FROM tblketquataydua WHERE tblTayDuaDaDangKyid = ?";
    		ps = con.prepareStatement(query);
    		ps.setInt(1, tayDuaDaDangKy.getId());
    		rs = ps.executeQuery();
    		while(rs.next()) {
    			KetQuaTayDua ketQuaTayDua = new KetQuaTayDua();
    			ketQuaTayDua.setId(rs.getInt("id"));
    			ketQuaTayDua.setSoVongHoanThanh(rs.getInt("soVongHoanThanh"));
    			ketQuaTayDua.setThoiGianHoanThanh(rs.getInt("thoiGianHoanThanh"));
    			ketQuaTayDua.setSuKien(rs.getInt("suKien"));
    			ketQuaTayDua.setMoTa(rs.getString("moTa"));
    			ketQuaTayDua.setTayDuaDaDangKy(tayDuaDaDangKy);
    			list.add(ketQuaTayDua);
    		}
    	} catch (SQLException e) {
    		e.printStackTrace();
    	}
    	return list;
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
