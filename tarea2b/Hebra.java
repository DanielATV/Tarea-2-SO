

public class Hebra extends Thread{

	int arreglo[];/*El arreglo */
	int izq;/*Limite izquierdo del area de trabajo */
	int der;/*Limite derecho del area de trabajo */
	public Hebra(String msg,int array[],int izquierdo, int derecho){/*Creador */
		super(msg);
		this.arreglo=array;
		this.izq=izquierdo;
		this.der=derecho;
	} 
	public void run(){
		/*int test[]=insertionsort(this.arreglo,this.izq,this.der);*/ /*Intente hacer un insertionsort pero Hevia y liouba no me lo permitieron */
		sortnormal(arreglo);/*ordenamos */
	}
	/*
		Nombre Funcion:sortnomal
		Input: arreglo de enteros
		Output: arreglo de enteros
		Comentario:	Ordena el arreglo de enteros dentro de los limites que tiene esta hebra
	*/
	public int[] sortnormal(int[] array) {
		int i;
		int aux;
		int aux_1;
		for(int j=this.der;j>this.izq;j--) {/*Iteramos por cada posicion en el arreglo */
			aux=0;
			for(i=this.izq; i<j;i++) {
				if(array[i]<array[aux]) {/*Buscamos al menor */
					aux=i;
				}
			}
			/*Lo colocamos al final del arreglo */
			aux_1=array[aux];
			array[aux]=array[j-1];
			array[j-1]=aux_1;
		}
		return array;
	}
}
