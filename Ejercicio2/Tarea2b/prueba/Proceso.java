package prueba;

public class Proceso extends Thread{

	public Proceso(String msg){

		super(msg);
	} 

	public void run(){

		for (int i=0;i<10 ;i++ ) {
			System.out.println(this.getName());			
		}

	}
	

}