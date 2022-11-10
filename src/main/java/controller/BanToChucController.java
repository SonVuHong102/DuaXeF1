package controller;

import java.util.ArrayList;

import dao.GiaiDuaDAO;
import model.GiaiDua;

public class BanToChucController {
	public ArrayList<GiaiDua> getGiaiDua() {
		GiaiDuaDAO gdd = new GiaiDuaDAO();
		return gdd.getGiaiDua();
	}
}
