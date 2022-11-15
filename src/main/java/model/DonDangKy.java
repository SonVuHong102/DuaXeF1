package model;

public class DonDangKy {
	private int id;
	private int soLuongTayDua;
	private ChangDua changDua;
	private DoiDua doiDua;

	public DonDangKy() {
	}
	
	public DonDangKy(int id, int soTayDua, ChangDua changDua, DoiDua doiDua) {
		this.id = id;
		this.soLuongTayDua = soTayDua;
		this.changDua = changDua;
		this.doiDua = doiDua;
	}
	public DonDangKy(int soTayDua, ChangDua changDua, DoiDua doiDua) {
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

	public ChangDua getChangDua() {
		return changDua;
	}

	public void setChangDua(ChangDua changDua) {
		this.changDua = changDua;
	}

	public DoiDua getDoiDua() {
		return doiDua;
	}

	public void setDoiDua(DoiDua doiDua) {
		this.doiDua = doiDua;
	}

	public int getSoLuongTayDua() {
		return soLuongTayDua;
	}

	public void setSoLuongTayDua(int soLuongTayDua) {
		this.soLuongTayDua = soLuongTayDua;
	}
}
