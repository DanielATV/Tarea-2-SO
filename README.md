# Tarea-2-SO
## Integrantes: Jorge Díaz 201673559-3 y Daniel Toro 201673595-k

## Problema 1
Uso:
Compilar con make y ejecutar con make run

Lo que esta implementado hasta el momento incluye:
-Lectura del archivo de entreda.
-Crear un diccionaro siendo la llave el nombre de la funcion y el valor la expresion que debe evaluar.
-Dependiendo del número que lee del archivo, sea crea y se inicializa un arreglo de threads.

Cosas que faltan:
-Lectura dinamica del input del usuario.
-Sincronización de los hilos.
-Parsear las operaciones utilizando expresiones regulares.
-Reemplazar el valor de x en las operaciones y calcular el resultado.

Consideraciones:
-El nombre del archivo es fijo(funciones.txt).
-No hay espacios al momento de definir las funciones.
-Las funciones dependen solo de una variable(x).
-No hay dos funciones con el mismo nombre.
-Los nombres de las funciones son de solo 1 caracter.

## Problema 2 🚀
_Para entregar el arreglo de enteros para probar la tarea, debe pasarlo en un archivo de texto donde el primer numero de dicho archivo sea la cantidad de numeros que componen el arreglo, y en la siguiente linea deben ir los numeros que componen dicho arreglo._ 
_Ejemplo:_
```
		test.txt
		3
		1 2 3
```

_Para ejecutar nuestro código, debe puede ejecutar el comando make run < archivo.txt . 
Nuestro trabajo printeará el arreglo entrante y el arreglo final ya ordenado de mayor a menor._

### Obs. hebras en problema 2:
_Podemos notar, que en la tarea de ordenar arreglos, gracias a las hebras, podemos simultaneamente ordenar cada mitad del arreglo para luego hacer un merge final._ 

_Dado que nosotros utilizamos una especie de burble sort (revisamos cual es el menor numero en cada pasada y lo enviamos al final del arreglo), el poder hacer simultaneamente esto (cada mitad), nos ahorra que en cada pasada debamos revisar la otra mitad._ 

_En otras palabras, en cada revision para ver cual es en el número menor realizamos n/2 comparaciones, si no tuvieramos las hebras, deberiamos hacer n comparaciones por cada numero, es decir, con las hebras, hacemos (n^2)/2 y si no las tuvieramos hariamos (n^2)._

Nota: Se aseguran los resultados para valores no superiores a 10⁹.

Buen año <3

