package test;

import static org.junit.jupiter.api.Assertions.*;

import java.util.ArrayList;

import org.junit.jupiter.api.Test;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.Spy;

import dao.GiaiDuaDAO523;
import model.GiaiDua523;

class GiaiDuaDAO523Test {
	GiaiDuaDAO523 giaiDua523DAO = new GiaiDuaDAO523();

	@Test
	void getDanhSachGiaiDuaTest_CoDuLieu() {
		ArrayList<GiaiDua523> listGiaiDuaMock = new ArrayList<GiaiDua523>();
		listGiaiDuaMock.add(new GiaiDua523(10, "mua giai 10", 2022));
		listGiaiDuaMock.add(new GiaiDua523(9, "mua giai 9", 2021));
		listGiaiDuaMock.add(new GiaiDua523(8, "mua giai 8", 2020));
		listGiaiDuaMock.add(new GiaiDua523(7, "mua giai 7", 2019));
		listGiaiDuaMock.add(new GiaiDua523(6, "mua giai 6", 2018));
		listGiaiDuaMock.add(new GiaiDua523(5, "mua giai 5", 2017));
		listGiaiDuaMock.add(new GiaiDua523(4, "mua giai 4", 2016));
		listGiaiDuaMock.add(new GiaiDua523(3, "mua giai 3", 2015));
		listGiaiDuaMock.add(new GiaiDua523(2, "mua giai 2", 2014));
		listGiaiDuaMock.add(new GiaiDua523(1, "mua giai 1", 2013));
		ArrayList<GiaiDua523> listGiaiDua = giaiDua523DAO.getGiaiDua();
		for(int i=0;i<listGiaiDua.size();i++) {
			assertEquals(listGiaiDua.get(i).getId(), listGiaiDuaMock.get(i).getId());
			assertEquals(listGiaiDua.get(i).getTen(), listGiaiDuaMock.get(i).getTen());
			assertEquals(listGiaiDua.get(i).getMuaGiai(), listGiaiDuaMock.get(i).getMuaGiai());
		}
	}

	@Test
	void getDanhSachGiaiDuaTest_KhongCoDuLieu() {
		
	}
}
