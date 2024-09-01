public class Init {
	public static void main(String[] args) {
		System.out.println("Makan nasi bro");
		try {
			Thread.sleep(1000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}

class Makan extends Minum implements Runnable {

	@Override
	public void run() {
		// TODO Auto-generated method stub
		try {
			Thread.sleep(1000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	@Override
	public void air() {
		// TODO Auto-generated method stub
		throw new UnsupportedOperationException("Unimplemented method 'air'");
	}

	@Override
	public void haha() {
		// TODO Auto-generated method stub
		throw new UnsupportedOperationException("Unimplemented method 'haha'");
	}

}

abstract class Minum {
	public abstract void air();

	public abstract void haha();
}
