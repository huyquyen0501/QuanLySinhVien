package core;

import java.util.ArrayList;

import entity.SinhVien;

public class ListSinhVien {
	private ArrayList<SinhVien> listSinhVien = new ArrayList<SinhVien>();

	public void add(SinhVien sinhvien) {
		listSinhVien.add(sinhvien);
	}

	public void show() {
		int i;
		for (SinhVien sinhVien : listSinhVien) {
			System.out.println(sinhVien);
		}
	}

}
