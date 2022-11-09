package model;

public class TayDuaDaDangKy {
	private int id;
	private DonDangKy donDangKy;
	private TayDua tayDua;
	
	public TayDuaDaDangKy() {}

	public TayDuaDaDangKy(int id, DonDangKy donDangKy, TayDua tayDua) {
		this.id = id;
		this.donDangKy = donDangKy;
		this.tayDua = tayDua;
	}

	public TayDuaDaDangKy(DonDangKy donDangKy, TayDua tayDua) {
		this.donDangKy = donDangKy;
		this.tayDua = tayDua;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public DonDangKy getDonDangKy() {
		return donDangKy;
	}

	public void setDonDangKy(DonDangKy donDangKy) {
		this.donDangKy = donDangKy;
	}

	public TayDua getTayDua() {
		return tayDua;
	}

	public void setTayDua(TayDua tayDua) {
		this.tayDua = tayDua;
	}
}
