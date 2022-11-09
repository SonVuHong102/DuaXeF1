package model;

import java.time.LocalDateTime;

public class ThanhVienBanToChuc {
	private int id;
	private String tenDangNhap;
	private String matKhau;
	private String ten;
	private LocalDateTime ngaySinh;
	private String diaChi;
	private String email;
	private String sdt;
	private int vaiTro;
	
	public ThanhVienBanToChuc() {}

	public ThanhVienBanToChuc(int id, String tenDangNhap, String matKhau, String ten, LocalDateTime ngaySinh,
			String diaChi, String email, String sdt, int vaiTro) {
		this.id = id;
		this.tenDangNhap = tenDangNhap;
		this.matKhau = matKhau;
		this.ten = ten;
		this.ngaySinh = ngaySinh;
		this.diaChi = diaChi;
		this.email = email;
		this.sdt = sdt;
		this.vaiTro = vaiTro;
	}

	public ThanhVienBanToChuc(String tenDangNhap, String matKhau, String ten, LocalDateTime ngaySinh, String diaChi,
			String email, String sdt, int vaiTro) {
		this.tenDangNhap = tenDangNhap;
		this.matKhau = matKhau;
		this.ten = ten;
		this.ngaySinh = ngaySinh;
		this.diaChi = diaChi;
		this.email = email;
		this.sdt = sdt;
		this.vaiTro = vaiTro;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getTenDangNhap() {
		return tenDangNhap;
	}

	public void setTenDangNhap(String tenDangNhap) {
		this.tenDangNhap = tenDangNhap;
	}

	public String getMatKhau() {
		return matKhau;
	}

	public void setMatKhau(String matKhau) {
		this.matKhau = matKhau;
	}

	public String getTen() {
		return ten;
	}

	public void setTen(String ten) {
		this.ten = ten;
	}

	public LocalDateTime getNgaySinh() {
		return ngaySinh;
	}

	public void setNgaySinh(LocalDateTime ngaySinh) {
		this.ngaySinh = ngaySinh;
	}

	public String getDiaChi() {
		return diaChi;
	}

	public void setDiaChi(String diaChi) {
		this.diaChi = diaChi;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getSdt() {
		return sdt;
	}

	public void setSdt(String sdt) {
		this.sdt = sdt;
	}

	public int getVaiTro() {
		return vaiTro;
	}

	public void setVaiTro(int vaiTro) {
		this.vaiTro = vaiTro;
	}
}
