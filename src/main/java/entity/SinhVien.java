package entity;

import java.util.Date;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
@Getter
@Setter
@NoArgsConstructor
public class SinhVien {
	public SinhVien(String tenSinhVien, String ngayThangNamSinh, String gioiTinh, String soDienThoai, String email,
			String maLop) {
		super();
		id=temp++;
		this.tenSinhVien = tenSinhVien;
		this.ngayThangNamSinh = ngayThangNamSinh;
		this.gioiTinh = gioiTinh;
		this.soDienThoai = soDienThoai;
		this.email = email;
		this.maLop = maLop;
	}


	static int temp=1;
	private int id ;
	private String tenSinhVien;
	private String ngayThangNamSinh;
	private String gioiTinh;
	private String soDienThoai;
	private String email;
	private String maLop;
	


	@Override
	public String toString() {
		return "SinhVien [maSinhVien=" + id + ", tenSinhVien=" + tenSinhVien + ", ngayThangNamSinh="
				+ ngayThangNamSinh + ", gioiTinh=" + gioiTinh + ", soDienThoai=" + soDienThoai + ", email=" + email
				+ ", maLop=" + maLop + "]";
	}
	
	
}
