package entity;

public interface Subject {
	void attach(SinhVien ob);
	void detach(SinhVien ob);
	void notifyObserver(String message);
}
