interface PhoneInterface2 {
	final int TIMEOUT = 10000;
	void sendCall();
	void receiveCall();
	default void printLogo() {
		System.out.println("**phone**");
	}
}
class Calc2 {
	public int calculate(int x, int y) {return x + y;}
}

class SmartPhone extends Calc2 implements PhoneInterface2 {
	@Override
	public void sendCall() { System.out.println("따르릉따르릉~~"); }
	@Override
	public void receiveCall() {System.out.println("전화 왔어요.");}
	public void schedule() {System.out.println("일정 관리합니다.");}
}

public class InterfaceEx2 {
	public static void main(String[] args) {
		SmartPhone phone = new SmartPhone();
		phone.printLogo();
		phone.sendCall();
		System.out.println("3과 5를 더하면 " + phone.calculate(3, 5));
		phone.schedule();
	}
}
