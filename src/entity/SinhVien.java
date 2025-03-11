package entity;

import java.util.List;

public class SinhVien implements Observer {
	private String ten;
	private String email;
	
	public SinhVien(String ten, String email) {
		super();
		this.ten = ten;
		this.email = email;
	}

	public SinhVien() {
		super();
		// TODO Auto-generated constructor stub
	}

	@Override
	public void update(String message) {
		// TODO Auto-generated method stub
		System.out.println("Sinh Vien "+ ten + " da duoc thong bao : "+ message );
		
	}
	




}
