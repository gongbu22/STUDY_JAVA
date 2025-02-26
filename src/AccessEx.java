
class Sample {
	public int a;
	private int b;
	int c; // 디폴트 접근 지정
}

public class AccessEx {
	public static void main(String[] args) {
		Sample sample = new Sample();
		sample.a = 10;
		// sample.b = 10; private은 같은 클래스 내에서만 접근 가능
		sample.c = 10;
	}
}
