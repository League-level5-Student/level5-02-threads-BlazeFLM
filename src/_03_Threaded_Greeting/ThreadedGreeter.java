package _03_Threaded_Greeting;

// FINISHED, move on to ThreadPool

public class ThreadedGreeter implements Runnable {
	int num;

	ThreadedGreeter(int num) {
		this.num = num;
	}

	@Override
	public void run() {
		// TODO Auto-generated method stub
		System.out.println("Hello from thread number: " + num);
		if (num <= 50) {
			Thread t = new Thread(new ThreadedGreeter(num + 1));
			t.start();
			try {
				t.join();
			} catch (Exception e) {
				// TODO: handle exception
			}
		}
	}

}
