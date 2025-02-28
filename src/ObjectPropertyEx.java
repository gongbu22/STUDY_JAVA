class Point5 {
	private int x, y;
	public Point5(int x, int y) {
		this.x = x;
		this.y = y;
	}
}

public class ObjectPropertyEx {
	public static void main(String [] args) {
		Point5 p = new Point5(2, 3);
		System.out.println(p.getClass().getName());
		System.out.println(p.hashCode());
		System.out.println(p.toString());
	}
}
