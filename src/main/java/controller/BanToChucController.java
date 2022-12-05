package controller;

import java.util.ArrayList;

import dao.GiaiDuaDAO523;
import model.GiaiDua523;

public class BanToChucController {
	public ArrayList<GiaiDua523> getGiaiDua() {
		GiaiDuaDAO523 gdd = new GiaiDuaDAO523();
		return gdd.getGiaiDua();
	}
}
