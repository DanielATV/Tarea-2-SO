package tarea2b;

public class Main{
	public static void main(String[ ] args) {
		
		int x[]= {1,4,2,12,51,1,10,123,-123,5,-123,11};
		System.out.println("Inicial: ");
		for(int i=0;i<x.length;i++) {
			System.out.print(x[i]+" ");
		}
		System.out.println(" ");
		if (x.length>3) {
			Hebra hilo1 = new Hebra("proceso 1",x,0,x.length/4-1);
			Hebra hilo2 = new Hebra("proceso 2",x,x.length/4,x.length/2-1);
			Hebra hilo3 = new Hebra("proceso 3",x,x.length/2,((3*x.length)/4)-1);
			Hebra hilo4 = new Hebra("proceso 4",x,(3*x.length)/4,x.length);
			hilo1.start();
			hilo2.start();
			hilo3.start();
			hilo4.start();
			try {
				hilo1.join();	
				hilo2.join();
				hilo3.join();
				hilo4.join();
			} catch (InterruptedException e) {}
			
			System.out.println("Final: ");
			for(int i=0;i<x.length;i++) {
				System.out.print(x[i]+" ");
			}
			
		}else {
			if(x.length>1) {
				Hebra hilo1 = new Hebra("proceso 1",x,0,x.length/2-1);
				Hebra hilo2 = new Hebra("proceso 2",x,x.length/2,x.length);
				hilo1.start();
				hilo2.start();
				try {
					hilo1.join();	
					hilo2.join();
				} catch (InterruptedException e) {}
				
				System.out.println("Final: ");
				for(int i=0;i<x.length;i++) {
					System.out.print(x[i]+" ");
				}
			}
		}
	}
}