package model;

public class TayDuaDaDangKy523 {
	private int id;
	private DonDangKy523 donDangKy;
	private TayDua523 tayDua;
	
	public TayDuaDaDangKy523() {}
	
	public TayDuaDaDangKy523(int id) {
		this.id = id;
	}

	public TayDuaDaDangKy523(int id, DonDangKy523 donDangKy, TayDua523 tayDua) {
		this.id = id;
		this.donDangKy = donDangKy;
		this.tayDua = tayDua;
	}

	public TayDuaDaDangKy523(DonDangKy523 donDangKy, TayDua523 tayDua) {
		this.donDangKy = donDangKy;
		this.tayDua = tayDua;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public DonDangKy523 getDonDangKy() {
		return donDangKy;
	}

	public void setDonDangKy(DonDangKy523 donDangKy) {
		this.donDangKy = donDangKy;
	}

	public TayDua523 getTayDua() {
		return tayDua;
	}

	public void setTayDua(TayDua523 tayDua) {
		this.tayDua = tayDua;
	}
}
