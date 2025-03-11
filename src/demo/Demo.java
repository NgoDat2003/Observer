package demo;

import entity.LopHoc;
import entity.SinhVien;

public class Demo {
	public static void main(String[] args) {
		// TODO Auto-generated constructor stub
		// Khởi tạo Lớp học và Sinh viên
		LopHoc lop1 = new LopHoc("Lớp 10A");
		LopHoc lop2 = new LopHoc("Lớp 10B");

		SinhVien sinhVien1 = new SinhVien("Nguyen A", "nguyena@gmail.com");
		SinhVien sinhVien2 = new SinhVien("Nguyen B", "nguyenb@gmail.com");

		// Lớp học thêm sinh viên vào danh sách
		lop1.attach(sinhVien1);
		lop2.attach(sinhVien2);

		// Lớp học thông báo đến tất cả sinh viên
		lop1.notifyObserver("Thông báo: Lịch thi kỳ này có thay đổi!");
		lop2.notifyObserver("Thông báo: Có bài kiểm tra vào tuần tới!");

		// Xóa sinh viên khỏi lớp và gửi thông báo
		lop1.detach(sinhVien1);
		lop1.notifyObserver("Thông báo: Có sự thay đổi về lịch học!");
	}
}
