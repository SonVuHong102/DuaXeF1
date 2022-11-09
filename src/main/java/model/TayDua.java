package model;

import java.time.LocalDate;

public class TayDua {
	private int id;
	private String ten;
	private LocalDate ngaySinh;
	private String tieuSu;
	private QuocTich quocTich;
	private DoiDua doiDua;
	
	public TayDua() {}

	public TayDua(int id, String ten, LocalDate ngaySinh, String tieuSu, QuocTich quocTich, DoiDua doiDua) {
		this.id = id;
		this.ten = ten;
		this.ngaySinh = ngaySinh;
		this.tieuSu = tieuSu;
		this.quocTich = quocTich;
		this.doiDua = doiDua;
	}

	public TayDua(String ten, LocalDate ngaySinh, String tieuSu, QuocTich quocTich, DoiDua doiDua) {
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

	public QuocTich getQuocTich() {
		return quocTich;
	}

	public void setQuocTich(QuocTich quocTich) {
		this.quocTich = quocTich;
	}

	public DoiDua getDoiDua() {
		return doiDua;
	}

	public void setDoiDua(DoiDua doiDua) {
		this.doiDua = doiDua;
	}
}
