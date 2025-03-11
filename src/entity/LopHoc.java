package entity;

import java.util.ArrayList;
import java.util.List;

public class LopHoc implements Subject{
	private String tenLop;
	private List<SinhVien> ds;
	
	public LopHoc() {
		super();
		// TODO Auto-generated constructor stub
	}

	public LopHoc(String tenLop, List<SinhVien> ds) {
		super();
		this.tenLop = tenLop;
		this.ds = ds;
	}

	public LopHoc(String tenLop) {
		super();
		this.tenLop = tenLop;
		this.ds = new ArrayList<SinhVien>();
	}

	@Override
	public void attach(SinhVien ob) {
		// TODO Auto-generated method stub
		ds.add(ob);
	}

	@Override
	public void detach(SinhVien ob) {
		// TODO Auto-generated method stub
		ds.remove(ob);
	}

	@Override
	public void notifyObserver(String message) {
		// TODO Auto-generated method stub
		for (SinhVien sinhVien : ds) {
			sinhVien.update(message);
		}
	}



}
