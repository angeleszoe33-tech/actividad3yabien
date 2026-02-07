# Actividad: Clase Producto en Java

**Ingeniería en Software – 2° Semestre**  
**Nombre:** Zoe Angeles 
**Fecha:** Febrero 2026  

### ¿Qué hace este programa?

Este ejercicio crea una clase sencilla llamada `Producto` para representar un artículo que se vende. La clase guarda información básica como código, tipo/nombre, costo e impuesto, y permite calcular su precio de venta final (incluyendo utilidad e impuesto).

En el programa principal se piden datos de **dos productos**, se muestran sus características y se compara cuál de los dos tendría el precio de venta más alto (según un porcentaje de utilidad que el usuario decide).

Todo está hecho de forma muy básica, con código directo y sin complicaciones, justo como se pide en la actividad.

### Detalles de la clase `Producto`

**Atributos** (todos privados, como debe ser):

- `codigo` → String (el código del producto, por ejemplo "A001")  
- `tipo` → String (nombre o descripción, ej. "Mouse gamer")  
- `costo` → double (precio de compra base)  
- `impuesto` → double (porcentaje de impuesto, ej. 16.0 para 16%)

**Métodos que tiene la clase**:

- **Getters** (para leer cada dato): `getCodigo()`, `getTipo()`, `getCosto()`, `getImpuesto()`  
- **Setters** (para poner o cambiar cada dato): `setCodigo()`, `setTipo()`, `setCosto()`, `setImpuesto()`  
- `muestraProducto()` → imprime bonito todos los datos del producto en pantalla  
- `calcularPrecio(double utilidad)` → calcula y regresa el precio final:  
  costo + utilidad (%) + impuesto (%) sobre el resultado anterior  
- `compararProductos(Producto p1, Producto p2, double utilidad)` → método estático que compara los dos productos y regresa un mensaje diciendo cuál tiene mayor precio (o si son iguales)

### Cómo funciona el main (paso a paso)

1. Crea el primer producto y pide sus 4 datos (código, tipo, costo, impuesto) usando los setters.  
2. Usa `try-catch` básico para que no se caiga si el usuario escribe algo raro en los números.  
3. Hace lo mismo con el segundo producto.  
4. Muestra los datos de ambos con `muestraProducto()`.  
5. Pide un porcentaje de utilidad (ej. 25 para 25%).  
6. Llama al método `compararProductos` y muestra el resultado.

Ejemplo rápido:  
Costo = 100, utilidad = 20%, impuesto = 16%  
→ 100 + 20 = 120  
→ 120 + (120 × 0.16) = 120 + 19.2 = **139.2**


### Notas finales

- El código es **intencionalmente simple** y directo, sin validaciones extras ni cosas avanzadas.  
- Se usó `Scanner` para leer todo desde la consola.  
- Los `try-catch` son básicos, solo para evitar que el programa termine mal si se equivoca en un número.


