package model;

public class DoiDua523 {
	private int id;
	private String ten;
	private String hang;
	private String moTa;
	
	public DoiDua523() {}

	public DoiDua523(int id, String ten, String hang, String moTa) {
		this.id = id;
		this.ten = ten;
		this.hang = hang;
		this.moTa = moTa;
	}

	public DoiDua523(String ten, String hang, String moTa) {
		this.ten = ten;
		this.hang = hang;
		this.moTa = moTa;
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

	public String getHang() {
		return hang;
	}

	public void setHang(String hang) {
		this.hang = hang;
	}

	public String getMoTa() {
		return moTa;
	}

	public void setMoTa(String moTa) {
		this.moTa = moTa;
	}
}
