package dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

import model.ChangDua523;
import model.GiaiDua523;

public class ChangDuaDAO523 extends DAO523 {
	private Connection con = null;
	private PreparedStatement ps = null;
	private ResultSet rs = null;
    
    public ChangDuaDAO523() {
    	this.con = this.getInstance();
    }
    
    public ArrayList<ChangDua523> getChangDuabyGiaiDua(GiaiDua523 giaiDua) {
    	ArrayList<ChangDua523> list = new ArrayList<ChangDua523>();
    	try {
    		String query = "SELECT * FROM tblchangdua523 WHERE tblGiaiDua523id = ?";
    		ps = con.prepareStatement(query);
    		ps.setInt(1, giaiDua.getId());
    		rs = ps.executeQuery();
    		while(rs.next()) {
    			list.add(new ChangDua523(rs.getInt("id"), rs.getString("ten"), rs.getInt("soVongDua"), rs.getDate("thoiGian").toLocalDate(), rs.getString("diaDiem"), rs.getString("moTa"), giaiDua));
    		}
    	} catch (SQLException e) {
    		e.printStackTrace();
    	}
    	return list;
    }
}
