package dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.Collections;

import model.GiaiDua523;
import model.KetQuaTayDua523;

public class GiaiDuaDAO523 extends DAO523 {
	private Connection con = null;
	private PreparedStatement ps = null;
	private ResultSet rs = null;
    
    public GiaiDuaDAO523() {
    	this.con = getInstance();
    }
    
    public ArrayList<GiaiDua523> getGiaiDua() {
    	ArrayList<GiaiDua523> list = new ArrayList<GiaiDua523>();
    	try {
    		String query = "SELECT * FROM tblgiaidua523";
    		ps = con.prepareStatement(query);
    		rs = ps.executeQuery();
    		while(rs.next()) {
    			list.add(new GiaiDua523(rs.getInt("id"), rs.getString("ten"), rs.getInt("muaGiai")));
    		}
    		Collections.reverse(list);
    	} catch (SQLException e) {
    		e.printStackTrace();
    	}
    	return list;
    }
    
    public boolean removeAllGiaiDua() {
    	boolean kq = false;
    	try {
			String query = "DELETE FROM tblgiaidua523";
			ps = con.prepareStatement(query);
			ps.executeUpdate();
    		kq = true;
    	} catch (Exception e) {
    		kq = false;
    		e.printStackTrace();
    	}
    	return kq;
    }
    
    public Connection getConnection() {
    	return con;
    }
}
