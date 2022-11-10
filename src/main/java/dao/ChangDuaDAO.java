package dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

import model.ChangDua;
import model.GiaiDua;

public class ChangDuaDAO extends DAO {
	private Connection con = null;
	private PreparedStatement ps = null;
	private ResultSet rs = null;
    
    public ChangDuaDAO() {
    	this.con = this.getInstance();
    }
    
    public ArrayList<ChangDua> getChangDuabyGiaiDua(GiaiDua giaiDua) {
    	ArrayList<ChangDua> list = new ArrayList<ChangDua>();
    	try {
    		String query = "SELECT * FROM tblchangdua WHERE tblGiaiDuaid = ?";
    		ps = con.prepareStatement(query);
    		ps.setInt(1, giaiDua.getId());
    		rs = ps.executeQuery();
    		while(rs.next()) {
    			list.add(new ChangDua(rs.getInt("id"), rs.getString("ten"), rs.getInt("soVongDua"), rs.getDate("thoiGian").toLocalDate(), rs.getString("diaDiem"), rs.getString("moTa"), giaiDua));
    		}
    	} catch (SQLException e) {
    		e.printStackTrace();
    	}
    	return list;
    }
}
