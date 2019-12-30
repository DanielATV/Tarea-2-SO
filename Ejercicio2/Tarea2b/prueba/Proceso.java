package prueba;

public class Proceso extends Thread{

	int arreglo[];
	int der;
	int izq;
	public Proceso(String msg,int array[],int indice_izquierdo, int indice_derecho){
		super(msg);
		arreglo=array;
	    der=indice_derecho;
		izq=indice_izquierdo;
	} 
	public void run(){
		
		if(this.izq == this.der) {/*Verificamos el tamaño del arreglo*/
			System.out.println("valor: "+arreglo[izq]+ " posicion:  "+izq);
			
			
		}else {/*Si no es de tamaño igual a uno, dividimos en dos thred la tarea*/
			
			int largo=(this.der - this.izq);
			Thread hilo1 = new Proceso("subproceso 1",arreglo,this.izq,this.izq+largo/2);
			Thread hilo2 = new Proceso("subproceso 2",arreglo,this.izq+largo/2+1,this.der);
			hilo1.start();
			hilo2.start();
		}
			
			
			
		/*for (int i=0;i<10 ;i++ ) {
			System.out.println(this.getName());			
		}
		
		*/
		
	}
	public int[] obtener_valores(int indice_derecho, int indice_izquierdo, int[] array){
		int largo=indice_izquierdo - indice_derecho;
		int x[]=new int[largo];
		for(int i=0;i<largo;i++) {
			x[i]=array[indice_derecho+i];
		}
		return x;
	}
	

}