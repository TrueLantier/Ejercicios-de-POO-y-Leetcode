¡Hola! Aquí tienes **30 ejercicios de nivel medio en Java**, evitando los temas que mencionas.  
**Nota:** No se pide crear clases o métodos genéricos propios, ni usar programación funcional (nada de lambdas ni streams), ni hilos, ni persistencia en archivos o bases de datos. Todo debe resolverse en memoria con POO básica, arrays y colecciones estándar de tipo concreto (por ejemplo `ArrayList<String>`).

---

### 1 – Palíndromo
Pide una frase al usuario y determina si es palíndroma, ignorando espacios, mayúsculas, tildes y signos de puntuación.

### 2 – Contador de palabras
Lee un texto y cuenta cuántas veces aparece cada palabra. Usa un `HashMap<String, Integer>` y muestra el resultado ordenado alfabéticamente.

### 3 – Ordenar array y medir comparaciones
Implementa el algoritmo de burbuja y el de inserción para ordenar un array de enteros. Cuenta y muestra cuántas comparaciones realiza cada uno.

### 4 – Matriz transpuesta
Crea una matriz de tamaño variable (por ejemplo 3x4) y genera su transpuesta. Muestra ambas matrices formateadas.

### 5 – Validar Sudoku
Dada una matriz 9x9 con números del 0 al 9 (0 = vacío), valida si las filas, columnas y subcuadrículas 3x3 no tienen números repetidos.

### 6 – Cifrado César
Implementa un programa que codifique y decodifique mensajes usando el cifrado César, permitiendo elegir el desplazamiento.

### 7 – Números romanos
Convierte un número decimal (1-3999) a romano y viceversa. Debe validar entradas incorrectas.

### 8 – Anagramas
Comprueba si dos palabras o frases son anagramas, ignorando mayúsculas y espacios.

### 9 – Subcadena más larga sin repetidos
Encuentra la subcadena más larga de una cadena que no contenga caracteres repetidos. Usa bucles tradicionales.

### 10 – Fibonacci con memoización
Calcula el n-ésimo número de Fibonacci usando un array o `HashMap` para almacenar resultados ya calculados y evitar recursión ineficiente.

### 11 – Clase CuentaBancaria
Crea una clase `CuentaBancaria` con saldo, titular y un historial de movimientos. Permite depositar y retirar validando saldo suficiente, y guarda cada movimiento en un `ArrayList<String>`.

### 12 – Estudiante y Curso
Crea las clases `Estudiante` y `Curso`. Un curso tiene varios estudiantes. Permite agregar estudiantes, asignar notas y calcular promedio, aprobados y reprobados.

### 13 – Herencia Vehículo
Define una clase base `Vehiculo` con atributos comunes y subclases `Coche` y `Moto`. Cada una calcula un impuesto diferente. Crea una lista de vehículos y muestra su información.

### 14 – Figuras geométricas
Crea una jerarquía de clases `FiguraGeometrica` con subclases `Circulo`, `Rectangulo` y `Triangulo`. Implementa el cálculo de área y perímetro usando polimorfismo.

### 15 – Biblioteca
Modela una biblioteca con libros. Permite prestar y devolver libros, controlando disponibilidad y aplicando una multa por devolución tardía.

### 16 – Juego del ahorcado
Implementa el clásico juego del ahorcado en consola: palabra oculta, letras intentadas, dibujo simple y límite de intentos.

### 17 – Tres en raya
Crea un juego de tres en raya para dos jugadores en consola. Valida movimientos y detecta ganador o empate.

### 18 – Agenda de contactos
Crea una agenda en memoria con `ArrayList<Contacto>`. Permite agregar, eliminar, buscar por nombre y listar todos los contactos, validando teléfonos.

### 19 – Pila y cola personalizadas
Implementa una pila y una cola usando arrays internos. Incluye métodos `push`, `pop`, `peek`, `enqueue`, `dequeue` y manejo de capacidad.

### 20 – Ordenar lista de Persona
Crea una clase `Persona` con nombre y edad. Haz que implemente `Comparable<Persona>` y ordena una lista con `Collections.sort()`. Luego crea un comparador por nombre.

### 21 – Simulador de cajero automático
Simula un cajero: validación de PIN, consulta de saldo, retiro, depósito y transferencia entre cuentas. Todo en memoria.

### 22 – Sistema de votación
Crea un sistema con candidatos, permite votar, evita votos duplicados y muestra el ganador con porcentaje de votos.

### 23 – Calculadora de matrices
Implementa suma, resta y multiplicación de matrices de enteros, validando dimensiones compatibles.

### 24 – Juego de la vida de Conway
Implementa una versión de una iteración del Juego de la Vida sobre una matriz cuadrada, mostrando el estado antes y después.

### 25 – Convertidor de unidades
Crea un menú para convertir entre unidades de longitud, masa y temperatura. Usa métodos separados para cada tipo de conversión.

---

### 26 – Integrador: Sistema de gestión de empleados
Crea un sistema con clases `Empleado`, `Departamento` y `Empresa`. Permite altas/bajas, búsqueda por nombre o departamento, cálculo de nómina con horas extra y bonificaciones, y reporte por departamento.

### 27 – Integrador: Juego de cartas
Modela una baraja española o francesa con las clases `Carta`, `Baraja` y `Jugador`. Permite barajar, repartir cartas y comparar manos según reglas simples.

### 28 – Integrador: Reservas de cine
Sistema de reservas con `Sala`, `Asiento`, `Pelicula` y `Reserva`. Permite mostrar ocupación, reservar y cancelar asientos, y validar disponibilidad.

### 29 – Integrador: Torneo de fútbol
Crea un simulador de torneo con `Equipo`, `Partido` y `Torneo`. Genera enfrentamientos, registra resultados, actualiza clasificación y muestra el campeón.

### 30 – Integrador: Gestión de inventario
Sistema con `Producto`, `Categoria` y `Proveedor`. Controla stock, compras y ventas, alerta de stock mínimo y genera reportes de inventario valorizado.

---

¿Quieres que te ayude a resolver alguno o que te dé pistas?