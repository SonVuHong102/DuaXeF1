package controller;

import java.util.ArrayList;

import dao.ChangDuaDAO523;
import dao.KetQuaTayDuaDAO523;
import dao.TayDuaDaDangKyDAO523;
import model.ChangDua523;
import model.GiaiDua523;
import model.KetQuaTayDua523;
import model.TayDuaDaDangKy523;

public class CapNhatKetQuaController {
	public ArrayList<ChangDua523> getChangDuabyGiaiDua(GiaiDua523 giaiDua) {
		ChangDuaDAO523 cdd = new ChangDuaDAO523();
		return cdd.getChangDuabyGiaiDua(giaiDua);
	}
	
	public ArrayList<TayDuaDaDangKy523> getTayDuaDaDangKybyChangDua(ChangDua523 changDua) {
		TayDuaDaDangKyDAO523 tdddkd = new TayDuaDaDangKyDAO523();
		return tdddkd.getTayDuaDaDangKybyChangDua(changDua);
	}

	public KetQuaTayDua523 getKetQuaTayDuabyTayDuaDaDangKy(TayDuaDaDangKy523 tayDuaDaDangKy) {
		KetQuaTayDuaDAO523 kqtdd = new KetQuaTayDuaDAO523();
		return kqtdd.getKetQuaTayDuabyTayDuaDaDangKy(tayDuaDaDangKy);
	}
	
	public boolean saveKetQuaTayDua(ArrayList<KetQuaTayDua523> listKetQuaTayDua) {
		KetQuaTayDuaDAO523 kqtdd = new KetQuaTayDuaDAO523();
		return kqtdd.saveKetQuaTayDua(listKetQuaTayDua);
	}
}
