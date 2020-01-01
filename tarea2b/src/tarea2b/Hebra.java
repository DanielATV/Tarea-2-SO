package tarea2b;

public class Hebra extends Thread{

	int arreglo[];
	int izq;
	int der;
	public Hebra(String msg,int array[],int izquierdo, int derecho){
		super(msg);
		this.arreglo=array;
		this.izq=izquierdo;
		this.der=derecho;
	} 
	public void run(){
		/*int test[]=insertionsort(this.arreglo,this.izq,this.der);*/
		sortnormal(arreglo);
	}
	
	public int[] sortnormal(int[] array) {
		int i;
		int aux;
		int aux_1;
		for(int j=array.length;j>0;j--) {
			aux=0;
			for(i=0; i<j;i++) {
				if(array[i]>array[aux]) {
					aux=i;
				}
			}
			aux_1=array[aux];
			array[aux]=array[j-1];
			array[j-1]=aux_1;
		}
		return array;
	}
	
	public int[] insertionsort(int[] array,int l_left, int l_right) {
		if(l_right-l_left>=3) {
			int l;
			int extremo=(l_right)-1;
			int aux,i,j;
			aux=array[extremo];
			array[extremo]=array[l_left];
			array[l_left]=aux;
			i=l_left;
			j=extremo-1;
			while(i!=j) {
				while(array[i]<array[extremo] && i!=j ) {
					i++;
				}
				while(array[j]>array[extremo] && i!=j) {  
					j--;	
				}
				if(i!=j) {
					aux=array[i];
					array[i]=array[j];
					array[j]=aux;					
				}
			}
			if(array[i]>array[extremo]) {
				aux=array[i];
				array[i]=array[extremo];
				array[extremo]=aux;
			}
			System.out.println("i = "+ i +" left "+ l_left +" j : " + j + " der  " + l_right );
			for(l=0;l<array.length;l++) {
				System.out.print(array[l]+" ");
			}
			System.out.println(" ");

			if(l_left<i) {
				array=insertionsort(array,l_left,i-1);
			}
			if(l_right>i){
				array=insertionsort(array,i+1,l_right);
			}
			
		}else {
			if(l_right-l_left==2) {				
				if(array[l_left]>array[l_right]) {
					int aux=array[l_right];
					array[l_right]=array[l_left];
					array[l_left]=aux;
				}
			}
		}
		
		return array;
	}

}