package model;

public class GiaiDua523 {
	private int id;
	private String ten;
	private int muaGiai;
	
	public GiaiDua523() {}
	
	public GiaiDua523(int id, String ten, int muaGiai) {
		this.id = id;
		this.ten = ten;
		this.muaGiai = muaGiai;
	}
	public GiaiDua523(String ten, int muaGiai) {
		this.ten = ten;
		this.muaGiai = muaGiai;
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

	public int getMuaGiai() {
		return muaGiai;
	}

	public void setMuaGiai(int muaGiai) {
		this.muaGiai = muaGiai;
	}
}
