package test;

import static org.junit.jupiter.api.Assertions.*;

import java.time.LocalDate;
import java.util.ArrayList;

import org.junit.jupiter.api.Test;

import dao.ChangDuaDAO523;
import model.ChangDua523;
import model.GiaiDua523;

class ChangDuaDAO523Test {
	ChangDuaDAO523 changDuaDAO = new ChangDuaDAO523();
	
	@Test
	void getChangDuaByGiaiDuaTest_KhongCoDuLieu2() {
		// Giai dua khong ton tai
		ArrayList<ChangDua523> listChangDuaMock = new ArrayList<ChangDua523>();
		ArrayList<ChangDua523> listChangDua = changDuaDAO.getChangDuabyGiaiDua(new GiaiDua523(25, "giai dua 25", 2027));
		assertEquals(listChangDuaMock.size(), listChangDua.size());
	}
	
	@Test
	void getChangDuaByGiaiDuaTest_KhongCoDuLieu1() {
		// Giai dua ton tai, khong co chang dua
		ArrayList<ChangDua523> listChangDuaMock = new ArrayList<ChangDua523>();
		ArrayList<ChangDua523> listChangDua = changDuaDAO.getChangDuabyGiaiDua(new GiaiDua523(8, "giai dua 8", 2020));
		assertEquals(listChangDuaMock.size(), listChangDua.size());
	}
	
	@Test
	void getChangDuaByGiaiDuaTest_CoDuLieu1() {
		// Giai dua ton tai, co chang dua
		ArrayList<ChangDua523> listChangDuaMock = new ArrayList<ChangDua523>();
		listChangDuaMock.add(new ChangDua523(1, "chang 1", 30, LocalDate.of(2022, 1, 1), "Ha Noi", null, new GiaiDua523(10, "giai dua 10", 2022)));
		listChangDuaMock.add(new ChangDua523(2, "chang 2", 20, LocalDate.of(2022, 2, 1), "Ha Noi", null, new GiaiDua523(10, "giai dua 10", 2022)));
		listChangDuaMock.add(new ChangDua523(3, "chang 3", 25, LocalDate.of(2022, 3, 1), "Ha Noi", null, new GiaiDua523(10, "giai dua 10", 2022)));
		listChangDuaMock.add(new ChangDua523(4, "chang 4", 25, LocalDate.of(2022, 4, 1), "Ha Noi", null, new GiaiDua523(10, "giai dua 10", 2022)));
		listChangDuaMock.add(new ChangDua523(5, "chang 5", 25, LocalDate.of(2022, 5, 1), "Ha Noi", null, new GiaiDua523(10, "giai dua 10", 2022)));
		listChangDuaMock.add(new ChangDua523(6, "chang 6", 25, LocalDate.of(2022, 6, 1), "Ha Noi", null, new GiaiDua523(10, "giai dua 10", 2022)));
		listChangDuaMock.add(new ChangDua523(7, "chang 7", 40, LocalDate.of(2022, 7, 1), "Ha Noi", null, new GiaiDua523(10, "giai dua 10", 2022)));
		listChangDuaMock.add(new ChangDua523(8, "chang 8", 35, LocalDate.of(2022, 8, 1), "Ha Noi", null, new GiaiDua523(10, "giai dua 10", 2022)));
		listChangDuaMock.add(new ChangDua523(9, "chang 9", 35, LocalDate.of(2022, 9, 1), "Ha Noi", null, new GiaiDua523(10, "giai dua 10", 2022)));
		listChangDuaMock.add(new ChangDua523(10, "chang 10", 35, LocalDate.of(2022, 10, 1), "Ha Noi", null, new GiaiDua523(10, "giai dua 10", 2022)));
		
		ArrayList<ChangDua523> listChangDua = changDuaDAO.getChangDuabyGiaiDua(new GiaiDua523(10, "giai dua 10", 2022));
		for(int i=0;i<listChangDua.size();i++) {
			assertEquals(listChangDuaMock.get(i).getId(), listChangDua.get(i).getId());
			assertEquals(listChangDuaMock.get(i).getTen(), listChangDua.get(i).getTen());
			assertEquals(listChangDuaMock.get(i).getSoVongDua(), listChangDua.get(i).getSoVongDua());
			assertEquals(listChangDuaMock.get(i).getThoiGian(), listChangDua.get(i).getThoiGian());
			assertEquals(listChangDuaMock.get(i).getDiaDiem(), listChangDua.get(i).getDiaDiem());
			assertEquals(listChangDuaMock.get(i).getMota(), listChangDua.get(i).getMota());
			assertEquals(listChangDuaMock.get(i).getGiaiDua().getId(), listChangDua.get(i).getGiaiDua().getId());
			assertEquals(listChangDuaMock.get(i).getGiaiDua().getTen(), listChangDua.get(i).getGiaiDua().getTen());
			assertEquals(listChangDuaMock.get(i).getGiaiDua().getMuaGiai(), listChangDua.get(i).getGiaiDua().getMuaGiai());
		}
	}
}
