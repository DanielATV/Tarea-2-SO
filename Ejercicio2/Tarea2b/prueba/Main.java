package prueba;

public class Main{
	public static void main(String[ ] args) {
		
		int x[]= {1,4,2,10,6,7,9};
		int value;
		Thread hilo1 = new Proceso("proceso 1",x,0,(x.length/2)-1);
		Thread hilo2 = new Proceso("proceso 2",x,x.length/2,x.length-1);
		hilo1.start();
		hilo2.start();
		value=hilo1.j




	}
}