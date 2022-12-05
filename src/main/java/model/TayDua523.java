package model;

import java.time.LocalDate;

public class TayDua523 {
	private int id;
	private String ten;
	private LocalDate ngaySinh;
	private String tieuSu;
	private String quocTich;
	private DoiDua523 doiDua;
	
	public TayDua523() {}

	public TayDua523(int id, String ten, LocalDate ngaySinh, String tieuSu, String quocTich, DoiDua523 doiDua) {
		this.id = id;
		this.ten = ten;
		this.ngaySinh = ngaySinh;
		this.tieuSu = tieuSu;
		this.quocTich = quocTich;
		this.doiDua = doiDua;
	}

	public TayDua523(String ten, LocalDate ngaySinh, String tieuSu, String quocTich, DoiDua523 doiDua) {
		this.ten = ten;
		this.ngaySinh = ngaySinh;
		this.tieuSu = tieuSu;
		this.quocTich = quocTich;
		this.doiDua = doiDua;
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

	public LocalDate getNgaySinh() {
		return ngaySinh;
	}

	public void setNgaySinh(LocalDate ngaySinh) {
		this.ngaySinh = ngaySinh;
	}

	public String getTieuSu() {
		return tieuSu;
	}

	public void setTieuSu(String tieuSu) {
		this.tieuSu = tieuSu;
	}

	public String getQuocTich() {
		return quocTich;
	}

	public void setQuocTich(String quocTich) {
		this.quocTich = quocTich;
	}

	public DoiDua523 getDoiDua() {
		return doiDua;
	}

	public void setDoiDua(DoiDua523 doiDua) {
		this.doiDua = doiDua;
	}
}
