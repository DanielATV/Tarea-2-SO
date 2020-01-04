import java.util.Scanner;

public class Main{
	public static void main(String[ ] args) {
		Scanner in=new Scanner (System.in);
		int cant_num=in.nextInt();		
		int x[]=new int[cant_num];/* Cantidad de numeros presentes en el arreglo */		
		for (int u=0;u<x.length;u++) {/*Guardamos los numeros en el arreglo x */				    
		    x[u]=in.nextInt();
		}
		System.out.println("Arreglo Recibido: ");/*Se termino de guardar los numeros */		
		for(int w=0;w<x.length;w++) {
			System.out.print(x[w]+" ");/*Printemos el arreglo inicial */		
		}
		System.out.println(" ");
		System.out.println(" ");		
		if(x.length>1) {/*Si el arreglo no es vacio */
			Hebra hilo1 = new Hebra("proceso 1",x,0,x.length/2);/*Hebra1 */
			Hebra hilo2 = new Hebra("proceso 2",x,x.length/2,x.length);/*Hebra2 */
			/*Comenzamos las Hebras */
			hilo1.start();
			hilo2.start();
			try {/*Esperamos a que las hebras terminen */
				hilo1.join();	
				hilo2.join();
			} catch (InterruptedException e) {}							
		}
		int nuevo[]= new int[x.length];
		orden_final(x,nuevo);
		/*Printeamos el resultado */
		System.out.println("Final: ");
			for(int i=0;i<nuevo.length;i++) {
				System.out.print(nuevo[i]+" ");
			}		
		System.out.println(" ");
	}
	/*
		Nombre Funcion:sortnomal
		Input: arreglo de enteros con los numeros y otro arreglo de enteros vacio
		Output: arreglo de enteros
		Comentario:	hace un merge de las dos "mitades" del arreglo recibido y lo deja en el arreglo nuevo
	*/
	public static int[] orden_final(int[] array,int[] nuevo){		
		int i=0;
		int j=array.length/2;
		int k=0;
		while(k<array.length){
			if(i<array.length/2 && j<array.length){/* verificamos que estamos en los limites */
				if (array[i]>array[j]) {/* Vemos cual es mayor*/
					nuevo[k]=array[i];
					i++;
					k++;
				}else{
					nuevo[k]=array[j];
					j++;
					k++;
				}
			}else if (i==array.length/2) {/*Si uno de los dos ya toco limite, solo copiamos los restantes*/
				while(j<array.length){
					nuevo[k]=array[j];
					j++;
					k++;
				}					
			}else{
				while(i<array.length/2){/* Lo mismo pero con el limite j*/
					nuevo[k]=array[i];
					i++;
					k++;
				}
			}
		}
		return nuevo;				
	}
}



