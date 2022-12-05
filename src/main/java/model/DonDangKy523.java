package model;

public class DonDangKy523 {
	private int id;
	private int soLuongTayDua;
	private ChangDua523 changDua;
	private DoiDua523 doiDua;

	public DonDangKy523() {
	}
	
	public DonDangKy523(int id, int soTayDua, ChangDua523 changDua, DoiDua523 doiDua) {
		this.id = id;
		this.soLuongTayDua = soTayDua;
		this.changDua = changDua;
		this.doiDua = doiDua;
	}
	public DonDangKy523(int soTayDua, ChangDua523 changDua, DoiDua523 doiDua) {
		this.soLuongTayDua = soTayDua;
		this.changDua = changDua;
		this.doiDua = doiDua;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public ChangDua523 getChangDua() {
		return changDua;
	}

	public void setChangDua(ChangDua523 changDua) {
		this.changDua = changDua;
	}

	public DoiDua523 getDoiDua() {
		return doiDua;
	}

	public void setDoiDua(DoiDua523 doiDua) {
		this.doiDua = doiDua;
	}

	public int getSoLuongTayDua() {
		return soLuongTayDua;
	}

	public void setSoLuongTayDua(int soLuongTayDua) {
		this.soLuongTayDua = soLuongTayDua;
	}
}
