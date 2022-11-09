package model;

public class DonDangKy {
	private int id;
	private ChangDua changDua;
	private DoiDua doiDua;
	
	
	
	public DonDangKy() {
	}

	public DonDangKy(int id, ChangDua changDua, DoiDua doiDua) {
		this.id = id;
		this.changDua = changDua;
		this.doiDua = doiDua;
	}

	public DonDangKy(ChangDua changDua, DoiDua doiDua) {
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
}
