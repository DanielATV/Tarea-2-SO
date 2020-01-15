import java.util.Scanner;
import java.io.File;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import java.util.Dictionary;
import java.util.Enumeration;
import java.util.Hashtable;

class MyThread extends Thread {
	//atributos
	private Thread t;
	private String threadName;
	private String funEval;

	//constructor
	MyThread( String name, String funcion) {
		threadName = name;
		funEval = funcion;
		System.out.println("Hola soy " +  threadName );
	 }
    
    public void run(){
		System.out.println("Debo evaluar " +  funEval );
    }
  }

class Main{ 
	// int groupCount = matcher.groupCount();
	public static void main(String args[]) {
		// Defincion de variables
		int numFun;
		// Patrones
		Pattern parentesisPat = Pattern.compile("\\(([^)]+)\\)");
		// Manejo del archivo
		try {
			File fileObj = new File("funciones.txt");
			Scanner scanerObj = new Scanner(fileObj);
			numFun = Integer.valueOf(scanerObj.nextLine());
			while(scanerObj.hasNextLine()){
				String data = scanerObj.nextLine();
				String[] partes = data.split("=");
				// Se guarda la funcion y su definicion en un diccioario
				Dictionary funDic = new Hashtable();
				funDic.put(partes[0], partes[1]);
				// Busca si hay parentesis
				//Matcher m = parentesisPat.matcher(partes[1]);
				//if (m.find()) {
					//System.out.println(m.group(1));
				//}
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
		// Input de usario, estatico de momento
		//Scanner readerObj = new Scanner(System.in);
   		//System.out.println("Ingrese la funcion");
		//String userName = readerObj.nextLine();
		
		String funNom = "f(x)";
		String paramFun = "1";


	
	} 
} 
