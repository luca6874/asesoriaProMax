# Práctica: funciones de orden superior en Python

## Objetivo
Aprender a **pasar funciones como argumentos**, **devolver funciones** y utilizar `map()`, `filter()` y `reduce()` para procesar colecciones.

Una función de orden superior recibe una función como argumento **o** devuelve una función. No todas las funciones que usan `def` o `lambda` son de orden superior.

## Reglas
- Completa los apartados `TODO` y sustituye `raise NotImplementedError(...)` por tu implementación.
- No cambies los `assert` de las pruebas.
- En los ejercicios 2, 3, 4, 6 y 7 evita `for` y `while`; practica las funciones indicadas.
- No modifiques las listas o diccionarios de entrada.
- Si algo falla, lee el mensaje de error e intenta explicar qué ocurrió.

## Cómo ejecutar
Abre una terminal en esta carpeta y ejecuta, por ejemplo:

```bash
python ejercicio_01.py
```

En Windows también puedes usar `py ejercicio_01.py`.

Si no aparece ningún error y se imprime «Ejercicio N superado», pasaste las pruebas incluidas. Son pruebas básicas, no una garantía de que la solución sea la única correcta.

## Orden sugerido

| Archivo | Concepto |
|---|---|
| `ejercicio_01.py` | Función recibida como argumento |
| `ejercicio_02.py` | `map()` y `lambda` |
| `ejercicio_03.py` | `filter()` y `lambda` |
| `ejercicio_04.py` | `reduce()` y acumulador |
| `ejercicio_05.py` | Función que devuelve otra función |
| `ejercicio_06.py` | Combinar `filter()` y `map()` |
| `ejercicio_07.py` | Integración de `filter()`, `map()` y `reduce()` |

## Preguntas para explicar oralmente
1. ¿Qué convierte a una función en una función de orden superior?
2. ¿Cuál es la diferencia entre `doble` y `doble(5)` cuando los pasas como argumento?
3. ¿Para qué sirve `lambda`? ¿Toda lambda es una función pura?
4. ¿Qué diferencia hay entre `map()` y `filter()`?
5. ¿Qué significan el acumulador y el valor inicial en `reduce()`?
6. ¿Por qué `crear_multiplicador(2)` puede devolver una función que recuerde el 2?
7. ¿Usar `map()` garantiza que un programa no tenga efectos secundarios?

## Reto adicional
Escribe una segunda versión del ejercicio 6 usando funciones con `def` en lugar de lambdas. Compara la legibilidad de ambas soluciones.
