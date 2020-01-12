# Tarea-2-SO
## Integrantes: Jorge Díaz 201673559-3 y Daniel Toro 201673595-k

## Problema 1
Consideraciones:
-El nombre del archivo es fijo(funcionex.txt).
-Las funciones dependen solo de una variable(x).
-No hay dos funciones con el mismo nombre.
-Las funciones siempre guardan relacion estre ellas.

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

