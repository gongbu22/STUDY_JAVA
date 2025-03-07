public class SynchronizedEx {
	public static void main(String[] args) {
		SharedPrinter p = new SharedPrinter();
		String [] engText = {
				"Hello",
				"What are you doing?",
				"Come on",
				"I'd like a glass of water",
				"I'm from korea"
		};
		String [] korText = {
				"안녕",
				"뭐해?",
				"진정해",
				"물 한잔 마시고 싶어",
				"난 한국에서 왔어"
		};
		Thread th1 = new WorkerThread(p, engText);
		Thread th2 = new WorkerThread(p, korText);
		
		th1.start(); th2.start();
	}
}

class SharedPrinter {
	synchronized void print(String text) {
//		Thread.yield();
		for(int i=0; i<text.length(); i++)
			System.out.println(text.charAt(i));
		System.out.println();
	}
}

class WorkerThread extends Thread {
	private SharedPrinter p;
	private String [] text;
	
	public WorkerThread(SharedPrinter p, String[] text) {
		this.p = p; this.text = text;
	}
	
	@Override
	public void run() {
		for (int i=0; i<text.length; i++)
			p.print(text[i]);
	}
}
