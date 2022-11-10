package dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

import model.GiaiDua;

public class GiaiDuaDAO extends DAO {
	private Connection con = null;
	private PreparedStatement ps = null;
	private ResultSet rs = null;
    
    public GiaiDuaDAO() {
    	this.con = getInstance();
    }
    
    public ArrayList<GiaiDua> getGiaiDua() {
    	ArrayList<GiaiDua> list = new ArrayList<GiaiDua>();
    	try {
    		String query = "SELECT * FROM tblgiaidua";
    		ps = con.prepareStatement(query);
    		
    		rs = ps.executeQuery();
    		while(rs.next()) {
    			list.add(new GiaiDua(rs.getInt("id"), rs.getString("ten"), rs.getInt("muaGiai")));
    		}
    	} catch (SQLException e) {
    		e.printStackTrace();
    	}
    	return list;
    }
}
