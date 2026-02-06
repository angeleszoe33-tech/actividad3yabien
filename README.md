# 15 Ejercicios Integrados de Java  
**Segundo Semestre - Ingeniería en Software**

Colección de 15 ejercicios prácticos en Java para reforzar los fundamentos del lenguaje.  
Realizados durante el segundo semestre con enfoque en código limpio, básico y funcional.

## Temas cubiertos

- Tipos de datos primitivos y String  
- Entrada/salida con `Scanner`  
- Manejo básico de excepciones (`try-catch`, `parseInt`, `parseDouble`)  
- Estructuras de control: `if-else`, `switch`, `for`, `while`, `do-while`  
- Arreglos unidimensionales y bidimensionales (matrices)  
- Métodos estáticos y de instancia  
- Clases y objetos básicos (atributos privados, constructores, getters/setters, métodos)  
- Encapsulamiento simple  
- Menús interactivos y lógica de estado  

## Requisitos

- JDK 8 o superior  
- Entorno recomendado: IntelliJ IDEA Community, Eclipse o VS Code + Extension Pack for Java  

## Estructura del proyecto


## Lista de ejercicios

| #  | Título del ejercicio                                      | Nivel          | Conceptos clave principales                              |
|----|-----------------------------------------------------------|----------------|----------------------------------------------------------|
| 1  | Suma simple con validación de entrada                     | Fácil          | Scanner, try-catch, Integer.parseInt                     |
| 2  | Clasificación de edad con mensaje personalizado           | Fácil          | if-else anidado, validación de entrada                   |
| 3  | Tabla de multiplicar con ciclo for                        | Fácil          | for, validación de rango, reintento de entrada           |
| 4  | Arreglo de calificaciones – promedio, aprobadas/reprobadas| Fácil–Medio    | arreglos, acumulador, contadores, ciclos                 |
| 5  | Contador de vocales y consonantes en una palabra          | Medio          | String, charAt, toLowerCase, condicionales               |
| 6  | Verificar si un arreglo está ordenado ascendente          | Medio          | método estático, recorrido secuencial                    |
| 7  | Clase Rectángulo – área y perímetro                       | Medio          | clase, constructor, métodos de cálculo                   |
| 8  | Buscar elemento en arreglo (índice o -1)                  | Medio          | búsqueda lineal, método que retorna índice               |
| 9  | Sistema simple de biblioteca (clase Libro + menú)         | Medio–Alto     | estado en objeto, métodos boolean, menú do-while         |
| 10 | Calculadora con menú (switch + validación división)       | Medio          | do-while, switch, manejo de división por cero            |
| 11 | Arreglo de productos – precio final con utilidad e impuesto| Medio–Alto   | arreglo de objetos, método de cálculo compuesto          |
| 12 | Verificar si una frase es palíndromo                      | Medio–Alto     | manipulación de String, dos punteros (sin reverse)       |
| 13 | Matriz de notas – promedios por estudiante y por materia  | Medio–Alto     | matriz bidimensional, ciclos anidados                    |
| 14 | Sistema de login con 3 intentos máximos                   | Medio–Alto     | while con contador, String.equals                        |
| 15 | Gestión de inventario (clase Artículo + menú completo)    | Alto           | arreglo de objetos, menú, validación de existencia       |

## Cómo ejecutar los ejercicios

Cada archivo es independiente y tiene su propio `main`. Puedes ejecutarlos de dos formas:

### Desde terminal

```bash
# Compilar y ejecutar el ejercicio 1 (ejemplo)
javac src/Ejercicio01_SumaSegura.java
java -cp src Ejercicio01_SumaSegurazz