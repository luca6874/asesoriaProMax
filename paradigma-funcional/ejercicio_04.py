"""Ejercicio 4: acumular valores con reduce().
Objetivo: combinar una lista en un solo resultado.
"""
from functools import reduce

def producto_total(numeros):
    # TODO: usa reduce() para multiplicar todos los números.
    # Usa 1 como valor inicial para que la lista vacía dé 1.
    # Pista: reduce(lambda acumulado, n: ..., numeros, 1)
    raise NotImplementedError("Completa producto_total")

if __name__ == "__main__":
    assert producto_total([2, 3, 4]) == 24
    assert producto_total([5]) == 5
    assert producto_total([]) == 1
    print("Ejercicio 4 superado")
