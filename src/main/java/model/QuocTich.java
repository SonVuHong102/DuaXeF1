package model;

public class QuocTich {
	private int id;
	private String ten;
	
	public QuocTich() {}

	public QuocTich(int id, String ten) {
		this.id = id;
		this.ten = ten;
	}

	public QuocTich(String ten) {
		this.ten = ten;
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
}
