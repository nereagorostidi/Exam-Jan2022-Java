
public class Runner {
	public static void main (String[] args) {
		Mensaje t;
		Monitor m = new Monitor();
		System.out.println ("Empezamos....");
		for (int i=1; i <=5 ; i++ ) {
			t = new Mensaje (i, m);
			t.start();
		}
	}
}
