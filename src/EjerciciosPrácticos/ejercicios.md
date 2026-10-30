Entendido. Aquí van los 60 ejercicios, ordenados de menor a mayor dificultad dentro de cada bloque. En los de Java no usé lambdas ni streams: todo con clases, `Runnable` y clases anónimas.

## Bash (20)

1. `hola.sh`: saluda con el nombre recibido en `$1`. Si no hay argumento, lo pide con `read`.
2. Recibe una ruta e indica si es archivo, directorio, enlace simbólico o no existe (`-f`, `-d`, `-L`, `-e`).
3. Con un `for`, renombra todos los `*.txt` del directorio a `*.bak`. Debe funcionar con nombres con espacios (comillas).
4. Cuenta regresiva de 10 a 0 con `while` y `sleep 1`.
5. Calculadora `num1 op num2` con `case` (`+ - x /`). Valida división entre cero y operador inválido.
6. Función `factorial` que devuelva el resultado con `echo`. Úsala con `$(factorial 5)`.
7. Suma todos los argumentos (`$@`). Valida con `[[ $x =~ ^-?[0-9]+$ ]]`, avisa de los no numéricos y usa códigos de salida (`exit 1`) si no hay ninguno válido.
8. Lee un archivo línea a línea con `while IFS= read -r linea` y numera cada línea. Explica para qué sirven `IFS=` y `-r`.
9. Top 10 palabras más frecuentes de un archivo, con `tr`, `sort`, `uniq -c`, `sort -nr` y `head`.
10. Backup de un directorio en `.tar.gz` con timestamp en el nombre (`date +%F_%H%M%S`). Verifica el éxito con `$?` y muestra el tamaño final.
11. Los 5 procesos que más memoria consumen, con `ps` y `awk`, en formato `PID  %MEM  COMANDO`.
12. Con `awk -F:` sobre `/etc/passwd`, muestra los usuarios con UID >= 1000 y shell `/bin/bash`.
13. Con `sed -i.bak`, reemplaza una palabra en un archivo y compara original y modificado con `diff`.
14. Array indexado: lee N nombres, guárdalos, imprime índice y valor, muestra la longitud (`${#arr[@]}`) y ordénalos.
15. Array asociativo (`declare -A`): cuenta cuántos archivos de cada extensión hay en un directorio.
16. Crea un temporal con `mktemp` y bórralo siempre al terminar, también con Ctrl+C (`trap ... EXIT INT`).
17. Script con `getopts`: `-n nombre`, `-v` (verbose), `-h` (ayuda). Maneja opciones inválidas.
18. Redirecciones: ejecuta un comando que falle a veces y separa stdout en `ok.log` y stderr en `err.log`. Después únelos con `2>&1` y descarta uno con `/dev/null`. Genera un archivo de configuración con un here-doc.
19. Monitor de disco: con `df`, si alguna partición supera el 80%, imprime alerta por stderr y sale con código 1. Escribe la línea de `crontab` para ejecutarlo cada hora.
20. Integrador: menú con `select` que ofrezca ejercicios anteriores (backup, top procesos, monitor de disco, salir), cada uno en su función, con validación de entrada.

## Java: variantes del `for` (20)

1. `for-each` sobre `int[]`: suma y máximo, sin índices.
2. `for-each` sobre `toCharArray()`: cuenta vocales, consonantes y dígitos de un `String`.
3. `for` descendente: imprime un array al revés (`i = length-1; i >= 0; i--`).
4. Paso distinto de 1: múltiplos de 7 hasta 100 (`i += 7`) y potencias de 2 hasta 1024 (`i *= 2`).
5. Dos variables: `for (int i = 0, j = n-1; i < j; i++, j--)` para invertir un `char[]` in situ y comprobar si es palíndromo.
6. `for` sin inicialización: declara `i` antes del bucle y úsala después para informar la posición del primer negativo de un array.
7. `for` sin actualización: el avance de `i` ocurre dentro del cuerpo. Recorre un `String[]` saltando el siguiente elemento cuando encuentras `"skip"`.
8. `for (;;)` infinito con `break`: menú con `Scanner` que repite hasta que el usuario escribe `salir`.
9. Bucles anidados con etiquetas: en una matriz, encuentra el primer par `(i,j)` cuyo producto sea N con `break externo;`. Luego usa `continue externo;` para saltar filas con algún cero.
10. `for-each` anidado sobre una matriz irregular (`int[][]` con filas de distinta longitud): suma por fila y total.
11. Provoca a propósito una `ConcurrentModificationException` quitando elementos de una `List` dentro de un `for-each`. Explica por qué ocurre.
12. Corrígelo con `for (Iterator<Integer> it = lista.iterator(); it.hasNext();)` y `it.remove()`: elimina los pares.
13. `ListIterator` hacia atrás: `for (ListIterator<String> it = lista.listIterator(lista.size()); it.hasPrevious();)`. Imprime invertido y pasa a mayúsculas con `set()`.
14. `for-each` sobre `Map`: recorre con `entrySet()`, `keySet()` y `values()`. Cuenta frecuencia de letras de una frase y muestra el mayor.
15. `for-each` sobre `values()` de un `enum DiaSemana`: imprime los laborables y la posición con `ordinal()`.
16. Contador `char`: `for (char c = 'a'; c <= 'z'; c++)` para el alfabeto, y una tabla de código ASCII de las mayúsculas.
17. Lista enlazada propia: `for (Nodo n = head; n != null; n = n.siguiente)`. Implementa imprimir, contar, buscar e insertar al final.
18. `for` con `double`: `for (double x = 0; x < 1; x += 0.1)`. Cuenta las iteraciones, explica por qué no son las esperadas y reescríbelo con contador entero.
19. `for (; sc.hasNextInt(); )` sobre un `Scanner`: suma números hasta que aparezca un token no entero y repórtalo.
20. Integrador: crea una clase `Rango` (inicio, fin, paso) que implemente `Iterable<Integer>`, con el `Iterator` como clase anónima. Debe poder usarse con `for (int n : new Rango(0, 20, 5))`.

## Java: hilos (20)

Sin `volatile`, pools ni executors: solo `Thread`, `Runnable`, `synchronized`, `wait()`/`notify()`/`notifyAll()`.

1. Con `extends Thread`, lanza 3 hilos que imprimen su nombre 5 veces. Observa que el orden no es determinista. Usa `setName`/`getName`.
2. Lo mismo con `implements Runnable` y `new Thread(runnable)`. Pasa parámetros por constructor y compara ambos enfoques.
3. `start()` vs `run()`: llama a `run()` directamente y demuestra con `Thread.currentThread().getName()` que no crea un hilo nuevo.
4. `sleep`: un hilo imprime un "tic" por segundo durante 5 segundos mientras `main` hace otra cosa. Trata bien la `InterruptedException`.
5. `join()`: 4 hilos calculan la suma parcial de un cuarto de un array grande cada uno. `main` espera a todos y combina los resultados.
6. `join(millis)` e `isAlive()`: un hilo tarda 5 s. `main` espera 2 s, consulta `isAlive()` y decide qué hacer.
7. `interrupt()`: un hilo trabaja en bucle con `sleep`. `main` lo interrumpe a los 3 s y el hilo termina limpiamente. Muestra la diferencia entre `isInterrupted()` y `Thread.interrupted()`, y qué pasa con la bandera tras capturar la excepción.
8. `setDaemon(true)`: hilo infinito. Compara cómo termina la JVM con y sin daemon.
9. `setPriority` y `yield()`: experimenta y concluye si hay garantía de orden (spoiler: no).
10. Condición de carrera: 4 hilos incrementan 100 000 veces un contador compartido sin sincronizar. Ejecuta varias veces y documenta los resultados.
11. Arregla el 10 con un método `synchronized`.
12. Arregla con bloque `synchronized` sobre un `Object lock` privado. Añade dos contadores independientes con locks distintos y razona qué ganas.
13. `synchronized static` vs de instancia: contador estático compartido entre varias instancias. Demuestra que `this` y `Clase.class` son locks distintos.
14. Cuenta bancaria: hilos hacen transferencias entre dos cuentas y el saldo total debe ser invariante. Garantiza que comprobar el saldo y retirar ocurra bajo el mismo lock (problema check-then-act).
15. Deadlock: provócalo con dos locks tomados en orden opuesto. Diagnostícalo con `jstack` y corrígelo imponiendo un orden global de adquisición.
16. `wait()`/`notify()` básico: el hilo A espera a que una condición sea verdadera y el hilo B la activa. Usa `while (!condicion) wait();` dentro de `synchronized` y explica por qué `while` y no `if` (despertares espurios).
17. Ping-pong: dos hilos imprimen "ping" y "pong" alternándose 10 veces, coordinados solo con `wait()`/`notify()`.
18. Productor-consumidor con buffer de un único slot: `poner()` y `tomar()` sincronizados con espera.
19. Productor-consumidor con buffer acotado (tu propia cola sobre `LinkedList`, capacidad N), varios productores y varios consumidores. Usa `notifyAll()` y demuestra con un caso concreto por qué `notify()` simple puede dejar hilos dormidos para siempre.
20. Integrador: implementa a mano un `Latch` (cuenta atrás). `esperar()` bloquea hasta que N hilos hayan llamado a `llegar()`. Úsalo para que 5 hilos "corredores" arranquen todos a la vez tras una señal de salida.

¿Quieres que los genere también en PDF con el formato de tus cursos?