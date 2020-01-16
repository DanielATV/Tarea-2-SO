import java.util.Scanner;
import java.io.File;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import java.util.HashMap; 

class MyThread extends Thread {
	//atributos
	private Thread t;
	private String threadName;
	private String funEval;

	//constructor
	MyThread( String name, String funcion) {
		threadName = name;
		funEval = funcion;
	 }
    
    public void run(){
		System.out.println("Hola soy " +  threadName );
		System.out.println("Debo evaluar " +  funEval );
    }
  }

class Main{ 
	// int groupCount = matcher.groupCount();
	public static void main(String args[]) {
		// Defincion de variables
		int numFun;
		int i = 0;
		HashMap<String, String> funDic = new HashMap<String, String>();

		// Patrones para reconocer en strings
		Pattern parentesisPat = Pattern.compile("\\(([^)]+)\\)");
		//Pattern funPat = Pattern.compile("\w\\(x\\)");

		try {
			// Manejo del archivo

			File fileObj = new File("funciones.txt");
			Scanner scanerObj = new Scanner(fileObj);
			numFun = Integer.valueOf(scanerObj.nextLine());
			while(scanerObj.hasNextLine()){
				String data = scanerObj.nextLine();
				String[] partes = data.split("=");
				// Se guarda la funcion y su definicion en un diccioario
				funDic.put(partes[0], partes[1]);

			}
			//creacion de hebras para cada funcion
			Thread arrayThread[] = new Thread[numFun];

			for (String llave : funDic.keySet()) {
				arrayThread[i] = new MyThread(llave,funDic.get(llave));
				i++;
			}

			// Input de usario, estatico de momento

			//Scanner readerObj = new Scanner(System.in);
			//System.out.println("Ingrese la funcion");
			//String userName = readerObj.nextLine();
			
			String funNom = "f(x)";
			String paramFun = "1";

			arrayThread[0].start();
			arrayThread[1].start();
			arrayThread[2].start();


		} catch (Exception e) {
			e.printStackTrace();
		}

	
	} 
} 
