"""Ejercicio 1: pasar una función como argumento.
Objetivo: comprender que una función puede recibir otra función.
No modifiques las pruebas finales.
"""

def doble(numero):
    return numero * 2

def triple(numero):
    return numero * 3

def aplicar_operacion(numero, operacion):
    # TODO: ejecuta la función 'operacion' con 'numero' y devuelve su resultado.
    # Pista: una función recibida como parámetro se llama igual que cualquier otra.
    raise NotImplementedError("Completa aplicar_operacion")

if __name__ == "__main__":
    assert aplicar_operacion(5, doble) == 10
    assert aplicar_operacion(5, triple) == 15
    print("Ejercicio 1 superado")
