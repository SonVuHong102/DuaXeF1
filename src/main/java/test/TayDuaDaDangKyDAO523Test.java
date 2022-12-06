package test;

import static org.junit.jupiter.api.Assertions.*;

import java.time.LocalDate;
import java.util.ArrayList;

import org.junit.jupiter.api.Test;

import dao.TayDuaDaDangKyDAO523;
import model.ChangDua523;
import model.GiaiDua523;
import model.TayDuaDaDangKy523;

class TayDuaDaDangKyDAO523Test {
	TayDuaDaDangKyDAO523 tayDuaDaDangKyDAO523 = new TayDuaDaDangKyDAO523();

	@Test
	void getTayDuaDaDangKybyChangDua_KhongCoDuLieu1() {
		// Chang dua khong ton tai
		ArrayList<TayDuaDaDangKy523> listTayDuaDaDangKy = tayDuaDaDangKyDAO523.getTayDuaDaDangKybyChangDua(new ChangDua523(100, "chang dua 100", 30, LocalDate.of(2050, 4, 4), "", "", new GiaiDua523(100, "giai dua 100", 2050)));
		assertEquals(0, listTayDuaDaDangKy.size());
	}
	
	@Test
	void getTayDuaDaDangKybyChangDua_KhongCoDuLieu2() {
		// Chang dua ton tai. don dang ky rong
		ArrayList<TayDuaDaDangKy523> listTayDuaDaDangKy = tayDuaDaDangKyDAO523.getTayDuaDaDangKybyChangDua(new ChangDua523(11, "chang dua 1", 30, LocalDate.of(2021, 1, 1), "Ha Noi", "", new GiaiDua523(9, "giai dua 9", 2021)));
		assertEquals(0, listTayDuaDaDangKy.size());
	}

	@Test
	void getTayDuaDaDangKybyChangDua_KhongCoDuLieu3() {
		// Chang dua ton tai. don dang ky khong rong, khong co tay dua duoc dang ky
		ArrayList<TayDuaDaDangKy523> listTayDuaDaDangKy = tayDuaDaDangKyDAO523.getTayDuaDaDangKybyChangDua(new ChangDua523(10, "chang dua 10", 35, LocalDate.of(2021, 10, 1), "Ha Noi", "", new GiaiDua523(10, "giai dua 10", 2022)));
		assertEquals(0, listTayDuaDaDangKy.size());
	}
	
	@Test
	void getTayDuaDaDangKybyChangDua_KhongCoDuLieu4() {
		// Chang dua ton tai. don dang ky khong rong, co tay dua da dang ky, khong co ket qua tay dua tuong ung
		ArrayList<TayDuaDaDangKy523> listTayDuaDaDangKy = tayDuaDaDangKyDAO523.getTayDuaDaDangKybyChangDua(new ChangDua523(2, "chang dua 2", 20, LocalDate.of(2021, 2, 1), "Ha Noi", "", new GiaiDua523(10, "giai dua 10", 2022)));
		assertEquals(10, listTayDuaDaDangKy.size());
	}
}
