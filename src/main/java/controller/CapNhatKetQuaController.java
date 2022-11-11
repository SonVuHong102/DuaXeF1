package controller;

import java.util.ArrayList;

import dao.ChangDuaDAO;
import dao.KetQuaTayDuaDAO;
import dao.TayDuaDaDangKyDAO;
import model.ChangDua;
import model.GiaiDua;
import model.KetQuaTayDua;
import model.TayDuaDaDangKy;

public class CapNhatKetQuaController {
	public ArrayList<ChangDua> getChangDuabyGiaiDua(GiaiDua giaiDua) {
		ChangDuaDAO cdd = new ChangDuaDAO();
		return cdd.getChangDuabyGiaiDua(giaiDua);
	}
	
	public ArrayList<TayDuaDaDangKy> getTayDuaDaDangKybyChangDua(ChangDua changDua) {
		TayDuaDaDangKyDAO tdddkd = new TayDuaDaDangKyDAO();
		return tdddkd.getTayDuaDaDangKybyChangDua(changDua);
	}

	public KetQuaTayDua getKetQuaTayDuabyTayDuaDaDangKy(TayDuaDaDangKy tayDuaDaDangKy) {
		KetQuaTayDuaDAO kqtdd = new KetQuaTayDuaDAO();
		return kqtdd.getKetQuaTayDuabyTayDuaDaDangKy(tayDuaDaDangKy);
	}
	
	public void saveKetQuaTayDua(ArrayList<KetQuaTayDua> listKetQuaTayDua) {
		KetQuaTayDuaDAO kqtdd = new KetQuaTayDuaDAO();
		kqtdd.saveKetQuaTayDua(listKetQuaTayDua);
	}
}
