package model;

public class KetQuaTayDua523 {
	private int id;
	private int soVongHoanThanh;
	private int thoiGianHoanThanh;
	private int diem;
	private int suKien;
	private TayDuaDaDangKy523 tayDuaDaDangKy;
	private ThanhVienBanToChuc523 thanhVienBanToChuc;
	
	private String thoiGianHoanThanhStr = "";
	
	public KetQuaTayDua523() {}

	public KetQuaTayDua523(int id, int soVongHoanThanh, int thoiGianHoanThanh, int diem, int suKien, 
			TayDuaDaDangKy523 tayDuaDaDangKy, ThanhVienBanToChuc523 thanhVienBanToChuc) {
		this.id = id;
		this.soVongHoanThanh = soVongHoanThanh;
		this.thoiGianHoanThanh = thoiGianHoanThanh;
		this.diem = diem;
		this.suKien = suKien;
		this.tayDuaDaDangKy = tayDuaDaDangKy;
		this.thanhVienBanToChuc = thanhVienBanToChuc;
		this.thoiGianHoanThanhStr = getFormattedTime();
	}

	public KetQuaTayDua523(int soVongHoanThanh, int thoiGianHoanThanh, int diem, int suKien, String moTa,
			TayDuaDaDangKy523 tayDuaDaDangKy, ThanhVienBanToChuc523 thanhVienBanToChuc) {
		this.soVongHoanThanh = soVongHoanThanh;
		this.thoiGianHoanThanh = thoiGianHoanThanh;
		this.diem = diem;
		this.suKien = suKien;
		this.tayDuaDaDangKy = tayDuaDaDangKy;
		this.thanhVienBanToChuc = thanhVienBanToChuc;
		this.thoiGianHoanThanhStr = getFormattedTime();
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public int getSoVongHoanThanh() {
		return soVongHoanThanh;
	}

	public void setSoVongHoanThanh(int soVongHoanThanh) {
		this.soVongHoanThanh = soVongHoanThanh;
	}

	public int getThoiGianHoanThanh() {
		return thoiGianHoanThanh;
	}

	public void setThoiGianHoanThanh(int thoiGianHoanThanh) {
		this.thoiGianHoanThanh = thoiGianHoanThanh;
		this.thoiGianHoanThanhStr = getFormattedTime();
	}

	public int getDiem() {
		return diem;
	}

	public void setDiem(int diem) {
		this.diem = diem;
	}

	public int getSuKien() {
		return suKien;
	}

	public void setSuKien(int suKien) {
		this.suKien = suKien;
	}

	public TayDuaDaDangKy523 getTayDuaDaDangKy() {
		return tayDuaDaDangKy;
	}

	public void setTayDuaDaDangKy(TayDuaDaDangKy523 tayDuaDaDangKy) {
		this.tayDuaDaDangKy = tayDuaDaDangKy;
	}

	public ThanhVienBanToChuc523 getThanhVienBanToChuc() {
		return thanhVienBanToChuc;
	}

	public void setThanhVienBanToChuc(ThanhVienBanToChuc523 thanhVienBanToChuc) {
		this.thanhVienBanToChuc = thanhVienBanToChuc;
	}
	
	public String getThoiGianHoanThanhStr() {
		return this.thoiGianHoanThanhStr;
	}
	
	public String getFormattedTime() {
		int totalTime = this.thoiGianHoanThanh;
		String hours = String.format("%02d",totalTime/3600);
		totalTime %= 3600;
		String minutes = String.format("%02d",totalTime/60);
		totalTime %= 60;
		String seconds = String.format("%02d",totalTime);
		return hours + ":" + minutes + ":" + seconds;
	}
	
	public void setRawTime(String formattedTime) {
		String[] timeArray = formattedTime.split(":");
		this.thoiGianHoanThanh = Integer.parseInt(timeArray[0])*3600 + Integer.parseInt(timeArray[1])*60 + Integer.parseInt(timeArray[2]);
	}
}
