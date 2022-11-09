package model;

public class KetQuaTayDua {
	private int id;
	private int soVongHoanThanh;
	private int thoiGianHoanThanh;
	private int diem;
	private int suKien;
	private String moTa;
	private TayDuaDaDangKy tayDuaDaDangKy;
	private ThanhVienBanToChuc thanhVienBanToChuc;
	
	public KetQuaTayDua() {}

	public KetQuaTayDua(int id, int soVongHoanThanh, int thoiGianHoanThanh, int diem, int suKien, String moTa,
			TayDuaDaDangKy tayDuaDaDangKy, ThanhVienBanToChuc thanhVienBanToChuc) {
		this.id = id;
		this.soVongHoanThanh = soVongHoanThanh;
		this.thoiGianHoanThanh = thoiGianHoanThanh;
		this.diem = diem;
		this.suKien = suKien;
		this.moTa = moTa;
		this.tayDuaDaDangKy = tayDuaDaDangKy;
		this.thanhVienBanToChuc = thanhVienBanToChuc;
	}

	public KetQuaTayDua(int soVongHoanThanh, int thoiGianHoanThanh, int diem, int suKien, String moTa,
			TayDuaDaDangKy tayDuaDaDangKy, ThanhVienBanToChuc thanhVienBanToChuc) {
		this.soVongHoanThanh = soVongHoanThanh;
		this.thoiGianHoanThanh = thoiGianHoanThanh;
		this.diem = diem;
		this.suKien = suKien;
		this.moTa = moTa;
		this.tayDuaDaDangKy = tayDuaDaDangKy;
		this.thanhVienBanToChuc = thanhVienBanToChuc;
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

	public String getMoTa() {
		return moTa;
	}

	public void setMoTa(String moTa) {
		this.moTa = moTa;
	}

	public TayDuaDaDangKy getTayDuaDaDangKy() {
		return tayDuaDaDangKy;
	}

	public void setTayDuaDaDangKy(TayDuaDaDangKy tayDuaDaDangKy) {
		this.tayDuaDaDangKy = tayDuaDaDangKy;
	}

	public ThanhVienBanToChuc getThanhVienBanToChuc() {
		return thanhVienBanToChuc;
	}

	public void setThanhVienBanToChuc(ThanhVienBanToChuc thanhVienBanToChuc) {
		this.thanhVienBanToChuc = thanhVienBanToChuc;
	}
}
