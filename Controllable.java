package week6;

public interface Controllable {
	default void repair() {
		System.out.println("��� �����Ѵ�.");
	}
	static void reset() {
		System.out.println("��� �ʱ�ȭ�Ѵ�.");
	}
	void turnOn();
	void turnOff();
}
