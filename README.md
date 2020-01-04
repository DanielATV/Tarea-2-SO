# Tarea-2-SO
## Integrantes: Jorge Díaz 201673559-3 y Daniel Toro 2016735

## Problema 2:
Para entregar el arreglo de enteros para probar la tarea, debe pasarlo en un archivo de texto donde el primer numero de dicho archivo sea la cantidad de numeros que componen el arreglo, y en la siguiente linea deben ir los numeros que componen dicho arreglo. 
***Ejemplo:
		test.txt
		3
		1 2 3***
Para ejecutar nuestro código, debe puede ejecutar el comando make run < archivo.txt . 
Nuestro trabajo printeará el arreglo entrante y el arreglo final ya ordenado de mayor a menor.

### Obs. hebras en problema 2:
Podemos notar, que en la tarea de ordenar arreglos, gracias a las hebras, podemos simultaneamente ordenar cada mitad del arreglo para luego hacer un merge final. Dado que nosotros utilizamos una especie de burble sort (revisamos cual es el menor numero en cada pasada y lo enviamos al final del arreglo), el poder hacer simultaneamente esto (cada mitad), nos ahorra que en cada pasada debamos revisar la otra mitad. En otras palabras, en cada revision para ver cual es en el número menor realizamos n/2 comparaciones, si no tuvieramos las hebras, deberiamos hacer n comparaciones por cada numero, es decir, con las hebras, hacemos (n^2)/2 y si no las tuvieramos hariamos (n^2).
Buen año <3

