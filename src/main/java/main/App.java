package main;

import java.util.Date;
import java.util.Scanner;

import core.ListSinhVien;
import entity.SinhVien;

public class App {
	public static void main(String[] args) {
		menu();
		int c = 0;
		while (true) {
			System.out.println("Nhap vao yeu cau: ");
			c = nhap.nextInt();
			switch (c) {
			case 1:
				Input();
				break;
			case 2:
				showall();
				break;
			case 3:
				System.out.println("good bye");
				System.exit(3);
			default:
				break;
			}
		}

	}

	public static ListSinhVien listSinhVien = new ListSinhVien();
	public static Scanner nhap = new Scanner(System.in);


	public static void menu() {
		System.out.println("1. Nhap: ");
		System.out.println("2. Display: ");
		System.out.println("3. Out.");
	}

	public static void Input() {
		int maSV;
		String tenSV;
		String ngayThangNamSinh;
		String gioiTinh;
		String soDienThoai;
		String email;
		String maLop;
		nhap.nextLine();
		System.out.println("Nhap ten sinh vien: ");
		tenSV = nhap.nextLine();
		while (tenSV == null) {
			System.out.println("Nhap lai ten sinh vien: ");
			tenSV = nhap.nextLine();
		}
		System.out.println("Nhap ngay thang nam sinh(yyyy-MM-DD): ");
		ngayThangNamSinh = nhap.nextLine();
		while (ngayThangNamSinh == null || ngayThangNamSinh.length() != 10) {
			System.out.println("Nhap lai: ");
			ngayThangNamSinh = nhap.nextLine();
		}
		System.out.println("Gioi tinh (nam/Nam/nu/Nu): ");
		gioiTinh = nhap.nextLine();
		while (gioiTinh.equals("nam") == false && gioiTinh.equals("Nam") == false && gioiTinh.equals("nu") == false
				&& gioiTinh.equals("Nu") == false) {
			System.out.println("Nhap lai theo dung chuan: ");
			gioiTinh = nhap.nextLine();
		}
		System.out.println("Nhap vao so dien thoai: ");
		soDienThoai = nhap.nextLine();
		while (soDienThoai == null) {
			System.out.println("Nhap lai so dien thoai: ");
			soDienThoai = nhap.nextLine();
		}
		System.out.println("Nhap email: ");
		email = nhap.nextLine();
		System.out.println("Nhap ma lop: ");
		maLop = nhap.nextLine();

		SinhVien sv = new SinhVien( tenSV, ngayThangNamSinh, gioiTinh, soDienThoai, email, maLop);
		listSinhVien.add(sv);
	}

	public static void showall() {
		listSinhVien.show();
	}
}
