import java.util.Scanner;
import java.io.File;

class Main{ 
	
	public static void main(String args[]) {
		// Defincion de variables
		int numFun;
		// Manejo del archivo
		try {
			File fileObj = new File("funciones.txt");
			Scanner scanerObj = new Scanner(fileObj);
			while(scanerObj.hasNextLine()){
				String data = scanerObj.nextLine();
				System.out.println(data);
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
		Scanner readerObj = new Scanner(System.in);
   		System.out.println("Ingrese la funcion");
    	String userName = readerObj.nextLine();  
	
	} 
} 
