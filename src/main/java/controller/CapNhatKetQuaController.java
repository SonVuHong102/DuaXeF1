package controller;

import java.util.ArrayList;

import dao.ChangDuaDAO;
import model.ChangDua;
import model.GiaiDua;

public class CapNhatKetQuaController {
	public ArrayList<ChangDua> getChangDuabyGiaiDua(GiaiDua giaiDua) {
		ChangDuaDAO cdd = new ChangDuaDAO();
		return cdd.getChangDuabyGiaiDua(giaiDua);
	}
}
