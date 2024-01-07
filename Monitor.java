import java.lang.*;
import java.util.*;

class Monitor {

	private int value=0;
	
	public void espero() {
		synchronized (this) {
			while (value==0) {
				try  {
					this.wait();
				} catch (InterruptedException e) {
					
				}
				value--;
					
			}
		}
	}
	
	public void aviso() {
		synchronized (this) {
			value++;
			this.notify();
		}
	}


}
