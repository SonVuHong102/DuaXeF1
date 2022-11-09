package model;

import java.time.LocalDate;

public class ChangDua {
	private int id;
	private String ten;
	private int soVongDua;
	private String diaDiem;
	private LocalDate thoiGian;
	private String mota;
	private GiaiDua giaiDua;
	
	public ChangDua() {}

	public ChangDua(int id, String ten, int soVongDua, LocalDate thoiGian, String diaDiem, String mota,
			GiaiDua giaiDua) {
		this.id = id;
		this.ten = ten;
		this.soVongDua = soVongDua;
		this.diaDiem = diaDiem;
		this.thoiGian = thoiGian;
		this.mota = mota;
		this.giaiDua = giaiDua;
	}

	public ChangDua(String ten, int soVongDua, LocalDate thoiGian, String diaDiem, String mota, GiaiDua giaiDua) {
		this.ten = ten;
		this.soVongDua = soVongDua;
		this.diaDiem = diaDiem;
		this.thoiGian = thoiGian;
		this.mota = mota;
		this.giaiDua = giaiDua;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getTen() {
		return ten;
	}

	public void setTen(String ten) {
		this.ten = ten;
	}

	public int getSoVongDua() {
		return soVongDua;
	}

	public void setSoVongDua(int soVongDua) {
		this.soVongDua = soVongDua;
	}

	public LocalDate getThoiGian() {
		return thoiGian;
	}

	public void setThoiGian(LocalDate thoiGian) {
		this.thoiGian = thoiGian;
	}

	public String getDiaDiem() {
		return diaDiem;
	}

	public void setDiaDiem(String diaDiem) {
		this.diaDiem = diaDiem;
	}

	public String getMota() {
		return mota;
	}

	public void setMota(String mota) {
		this.mota = mota;
	}

	public GiaiDua getGiaiDua() {
		return giaiDua;
	}

	public void setGiaiDua(GiaiDua giaiDua) {
		this.giaiDua = giaiDua;
	}
}
