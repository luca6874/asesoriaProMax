"""Ejercicio 2: transformar datos con map().
Objetivo: aplicar una función a todos los elementos de una lista.
"""

def elevar_cuadrado(numeros):
    # TODO: utiliza map() y lambda para obtener el cuadrado de cada número.
    # Devuelve una lista nueva, sin modificar 'numeros'.
    # Pista: list(map(lambda n: ..., numeros))
    raise NotImplementedError("Completa elevar_cuadrado")

if __name__ == "__main__":
    entrada = [1, 2, 3, 4]
    assert elevar_cuadrado(entrada) == [1, 4, 9, 16]
    assert entrada == [1, 2, 3, 4]
    assert elevar_cuadrado([]) == []
    print("Ejercicio 2 superado")
