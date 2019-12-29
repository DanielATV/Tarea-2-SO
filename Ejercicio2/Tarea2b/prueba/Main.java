package prueba;

public class Main{
	public static void main(String[ ] args) {

		Thread hilo = new Proceso("proceso 1");
		Thread hilo2 = new Proceso("proceso 2");

		hilo.start();
		hilo2.start();



	}
}