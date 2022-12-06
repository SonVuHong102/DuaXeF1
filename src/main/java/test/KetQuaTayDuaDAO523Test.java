package test;

import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.ArgumentMatchers.booleanThat;

import java.util.ArrayList;

import org.junit.jupiter.api.Test;

import dao.KetQuaTayDuaDAO523;
import model.DonDangKy523;
import model.KetQuaTayDua523;
import model.TayDua523;
import model.TayDuaDaDangKy523;
import model.ThanhVienBanToChuc523;

class KetQuaTayDuaDAO523Test {
	KetQuaTayDuaDAO523 ketQuaTayDuaDAO523 = new KetQuaTayDuaDAO523();
	
	@Test
	void getKetQuaTayDuabyTayDuaDaDangKy_KhongCoDuLieu() {
		// Khong ton tai ket qua tay dua tuong ung voi tay dua da dang ky
		ArrayList<TayDuaDaDangKy523> listTayDuaDaDangKy523 = new ArrayList<TayDuaDaDangKy523>();
		listTayDuaDaDangKy523.add(new TayDuaDaDangKy523(11, new DonDangKy523(6), new TayDua523(2)));
		listTayDuaDaDangKy523.add(new TayDuaDaDangKy523(12, new DonDangKy523(6), new TayDua523(3)));
		listTayDuaDaDangKy523.add(new TayDuaDaDangKy523(13, new DonDangKy523(7), new TayDua523(7)));
		listTayDuaDaDangKy523.add(new TayDuaDaDangKy523(14, new DonDangKy523(7), new TayDua523(8)));
		listTayDuaDaDangKy523.add(new TayDuaDaDangKy523(15, new DonDangKy523(8), new TayDua523(12)));
		listTayDuaDaDangKy523.add(new TayDuaDaDangKy523(16, new DonDangKy523(8), new TayDua523(13)));
		listTayDuaDaDangKy523.add(new TayDuaDaDangKy523(17, new DonDangKy523(9), new TayDua523(17)));
		listTayDuaDaDangKy523.add(new TayDuaDaDangKy523(18, new DonDangKy523(9), new TayDua523(18)));
		listTayDuaDaDangKy523.add(new TayDuaDaDangKy523(19, new DonDangKy523(10), new TayDua523(22)));
		listTayDuaDaDangKy523.add(new TayDuaDaDangKy523(20, new DonDangKy523(10), new TayDua523(23)));
		for(TayDuaDaDangKy523 tayDuaDaDangKy523: listTayDuaDaDangKy523) {
			KetQuaTayDua523 ketQuaTayDua523 = ketQuaTayDuaDAO523.getKetQuaTayDuabyTayDuaDaDangKy(tayDuaDaDangKy523);
			assertEquals(0,ketQuaTayDua523.getSoVongHoanThanh());
			assertEquals(0,ketQuaTayDua523.getThoiGianHoanThanh());
			assertEquals(0, ketQuaTayDua523.getSuKien());
		}
	}
	
	@Test
	void getKetQuaTayDuabyTayDuaDaDangKy_CoDuLieu() {
		// Ton tai ket qua tay dua tuong ung voi tay dua da dang ky
		ArrayList<TayDuaDaDangKy523> listTayDuaDaDangKy523 = new ArrayList<TayDuaDaDangKy523>();
		listTayDuaDaDangKy523.add(new TayDuaDaDangKy523(1, new DonDangKy523(1), new TayDua523(1)));
		listTayDuaDaDangKy523.add(new TayDuaDaDangKy523(2, new DonDangKy523(1), new TayDua523(2)));
		listTayDuaDaDangKy523.add(new TayDuaDaDangKy523(3, new DonDangKy523(2), new TayDua523(6)));
		listTayDuaDaDangKy523.add(new TayDuaDaDangKy523(4, new DonDangKy523(2), new TayDua523(7)));
		listTayDuaDaDangKy523.add(new TayDuaDaDangKy523(5, new DonDangKy523(3), new TayDua523(11)));
		listTayDuaDaDangKy523.add(new TayDuaDaDangKy523(6, new DonDangKy523(3), new TayDua523(12)));
		listTayDuaDaDangKy523.add(new TayDuaDaDangKy523(7, new DonDangKy523(4), new TayDua523(16)));
		listTayDuaDaDangKy523.add(new TayDuaDaDangKy523(8, new DonDangKy523(4), new TayDua523(17)));
		listTayDuaDaDangKy523.add(new TayDuaDaDangKy523(9, new DonDangKy523(5), new TayDua523(21)));
		listTayDuaDaDangKy523.add(new TayDuaDaDangKy523(10, new DonDangKy523(5), new TayDua523(22)));
		for(TayDuaDaDangKy523 tayDuaDaDangKy523: listTayDuaDaDangKy523) {
			assertNotNull(ketQuaTayDuaDAO523.getKetQuaTayDuabyTayDuaDaDangKy(tayDuaDaDangKy523));
		}
	}
	
	@Test
	void saveKetQuaTayDuabyTayDuaDaDangKy_CoDuLieu() {
		// Ton tai ket qua tay dua tuong ung voi tay dua da dang ky
		ArrayList<KetQuaTayDua523> listKetQuaTayDua523 = new ArrayList<KetQuaTayDua523>();
		listKetQuaTayDua523.add(new KetQuaTayDua523(101, 0, 0, 0, 1, new TayDuaDaDangKy523(1), new ThanhVienBanToChuc523(1)));
		listKetQuaTayDua523.add(new KetQuaTayDua523(102, 30, 3905, 0, 0, new TayDuaDaDangKy523(2), new ThanhVienBanToChuc523(1)));
		listKetQuaTayDua523.add(new KetQuaTayDua523(103, 0, 0, 0, 2, new TayDuaDaDangKy523(3), new ThanhVienBanToChuc523(1)));
		listKetQuaTayDua523.add(new KetQuaTayDua523(104, 30, 3661, 0, 0, new TayDuaDaDangKy523(4), new ThanhVienBanToChuc523(1)));
		listKetQuaTayDua523.add(new KetQuaTayDua523(105, 30, 3722, 0, 0, new TayDuaDaDangKy523(5), new ThanhVienBanToChuc523(1)));
		listKetQuaTayDua523.add(new KetQuaTayDua523(106, 0, 0, 0, 1, new TayDuaDaDangKy523(6), new ThanhVienBanToChuc523(1)));
		listKetQuaTayDua523.add(new KetQuaTayDua523(107, 30, 3783, 0, 0, new TayDuaDaDangKy523(7), new ThanhVienBanToChuc523(1)));
		listKetQuaTayDua523.add(new KetQuaTayDua523(108, 30, 3844, 0, 0, new TayDuaDaDangKy523(8), new ThanhVienBanToChuc523(1)));
		listKetQuaTayDua523.add(new KetQuaTayDua523(109, 30, 4027, 0, 0, new TayDuaDaDangKy523(9), new ThanhVienBanToChuc523(1)));
		listKetQuaTayDua523.add(new KetQuaTayDua523(110, 0, 0, 0, 1, new TayDuaDaDangKy523(10), new ThanhVienBanToChuc523(1)));
		try {
			boolean kq = ketQuaTayDuaDAO523.saveKetQuaTayDua(listKetQuaTayDua523);
			assertTrue(kq);
			ArrayList<KetQuaTayDua523> newListKetQuaTayDua523 = new ArrayList<KetQuaTayDua523>();
			newListKetQuaTayDua523.add(ketQuaTayDuaDAO523.getKetQuaTayDuabyTayDuaDaDangKy(new TayDuaDaDangKy523(1)));
			newListKetQuaTayDua523.add(ketQuaTayDuaDAO523.getKetQuaTayDuabyTayDuaDaDangKy(new TayDuaDaDangKy523(2)));
			newListKetQuaTayDua523.add(ketQuaTayDuaDAO523.getKetQuaTayDuabyTayDuaDaDangKy(new TayDuaDaDangKy523(3)));
			newListKetQuaTayDua523.add(ketQuaTayDuaDAO523.getKetQuaTayDuabyTayDuaDaDangKy(new TayDuaDaDangKy523(4)));
			newListKetQuaTayDua523.add(ketQuaTayDuaDAO523.getKetQuaTayDuabyTayDuaDaDangKy(new TayDuaDaDangKy523(5)));
			newListKetQuaTayDua523.add(ketQuaTayDuaDAO523.getKetQuaTayDuabyTayDuaDaDangKy(new TayDuaDaDangKy523(6)));
			newListKetQuaTayDua523.add(ketQuaTayDuaDAO523.getKetQuaTayDuabyTayDuaDaDangKy(new TayDuaDaDangKy523(7)));
			newListKetQuaTayDua523.add(ketQuaTayDuaDAO523.getKetQuaTayDuabyTayDuaDaDangKy(new TayDuaDaDangKy523(8)));
			newListKetQuaTayDua523.add(ketQuaTayDuaDAO523.getKetQuaTayDuabyTayDuaDaDangKy(new TayDuaDaDangKy523(9)));
			newListKetQuaTayDua523.add(ketQuaTayDuaDAO523.getKetQuaTayDuabyTayDuaDaDangKy(new TayDuaDaDangKy523(10)));
			assertEquals(10, newListKetQuaTayDua523.size());
			for(KetQuaTayDua523 ketQuaTayDua523: newListKetQuaTayDua523) {
				switch (ketQuaTayDua523.getTayDuaDaDangKy().getId()) {
				case 1:
					assertEquals(0, ketQuaTayDua523.getSoVongHoanThanh());
					assertEquals(0, ketQuaTayDua523.getThoiGianHoanThanh());
					assertEquals(1, ketQuaTayDua523.getSuKien());
					assertEquals(0, ketQuaTayDua523.getDiem());
					break;
				case 2:
					assertEquals(30, ketQuaTayDua523.getSoVongHoanThanh());
					assertEquals(3905, ketQuaTayDua523.getThoiGianHoanThanh());
					assertEquals(0, ketQuaTayDua523.getSuKien());
					assertEquals(0, ketQuaTayDua523.getDiem());
					break;
				case 3:
					assertEquals(0, ketQuaTayDua523.getSoVongHoanThanh());
					assertEquals(0, ketQuaTayDua523.getThoiGianHoanThanh());
					assertEquals(2, ketQuaTayDua523.getSuKien());
					assertEquals(0, ketQuaTayDua523.getDiem());
					break;
				case 4:
					assertEquals(30, ketQuaTayDua523.getSoVongHoanThanh());
					assertEquals(3661, ketQuaTayDua523.getThoiGianHoanThanh());
					assertEquals(0, ketQuaTayDua523.getSuKien());
					assertEquals(0, ketQuaTayDua523.getDiem());
					break;
				case 5:
					assertEquals(30, ketQuaTayDua523.getSoVongHoanThanh());
					assertEquals(3722, ketQuaTayDua523.getThoiGianHoanThanh());
					assertEquals(0, ketQuaTayDua523.getSuKien());
					assertEquals(0, ketQuaTayDua523.getDiem());
					break;
				case 6:
					assertEquals(0, ketQuaTayDua523.getSoVongHoanThanh());
					assertEquals(0, ketQuaTayDua523.getThoiGianHoanThanh());
					assertEquals(1, ketQuaTayDua523.getSuKien());
					assertEquals(0, ketQuaTayDua523.getDiem());
					break;
				case 7:
					assertEquals(30, ketQuaTayDua523.getSoVongHoanThanh());
					assertEquals(3783, ketQuaTayDua523.getThoiGianHoanThanh());
					assertEquals(0, ketQuaTayDua523.getSuKien());
					assertEquals(0, ketQuaTayDua523.getDiem());
					break;
				case 8:
					assertEquals(30, ketQuaTayDua523.getSoVongHoanThanh());
					assertEquals(3844, ketQuaTayDua523.getThoiGianHoanThanh());
					assertEquals(0, ketQuaTayDua523.getSuKien());
					assertEquals(0, ketQuaTayDua523.getDiem());
					break;
				case 9:
					assertEquals(30, ketQuaTayDua523.getSoVongHoanThanh());
					assertEquals(4027, ketQuaTayDua523.getThoiGianHoanThanh());
					assertEquals(0, ketQuaTayDua523.getSuKien());
					assertEquals(0, ketQuaTayDua523.getDiem());
					break;
				case 10:
					assertEquals(0, ketQuaTayDua523.getSoVongHoanThanh());
					assertEquals(0, ketQuaTayDua523.getThoiGianHoanThanh());
					assertEquals(1, ketQuaTayDua523.getSuKien());
					assertEquals(0, ketQuaTayDua523.getDiem());
					break;
				default:
					break;
				}
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
