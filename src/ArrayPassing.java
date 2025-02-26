
public class ArrayPassing {
	static void replaceSpace(char a[]) {
		for(int i=0; i<a.length; i++)
			if(a[i] == ' ')
				a[i] = ',';
	}
	
	static void printCharArray(char a[]) {
		for(int i=0; i<a.length; i++)
			System.out.print(a[i]);
		System.out.println
		();
	}
	
	public static void main(String arg[]) {
		char c[] = {'T', 'h', 'i', 's', ' ', 'i', 's', ' ', 'a', ' ', 'd', 'o', 'g' };
		printCharArray(c);
		replaceSpace(c);
		printCharArray(c);
	}
	
}
