import java.util.Scanner;
import java.io.File;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import java.util.Dictionary;
import java.util.Enumeration;
import java.util.Hashtable;


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
				Matcher m = parentesisPat.matcher(data);
				if (m.find()) {
					System.out.println(m.group(0));
				}
			}
		} catch (Exception e) {
			e.printStackTrace();
		}

		Scanner readerObj = new Scanner(System.in);
   		System.out.println("Ingrese la funcion");
    	String userName = readerObj.nextLine();  
	
	} 
} 
