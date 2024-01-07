
public class Mensaje extends Thread{
  private int threadId;
  Monitor miMonitor;
  
  Mensaje (int threadId, Monitor miMonitor) {
	  this.threadId = threadId;
	  this.miMonitor = miMonitor;
  }
  
  public void run () {
	  miMonitor.espero();
	  System.out.println ("Estoy en el thread "+threadId);
	  //miMonitor.aviso();
	  System.out.println ("He terminado el thread "+threadId);
  }
  
}
