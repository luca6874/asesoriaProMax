"""Ejercicio 5: devolver una función.
Objetivo: comprender que una función puede crear y devolver otra función.
"""

def crear_multiplicador(factor):
    # TODO: define una función interna que reciba un número y lo multiplique
    # por 'factor'. Devuelve LA FUNCIÓN, sin ejecutarla aquí.
    # Pista: puedes definir 'def multiplicar(numero): ...' dentro de esta función.
    raise NotImplementedError("Completa crear_multiplicador")

if __name__ == "__main__":
    duplicar = crear_multiplicador(2)
    triplicar = crear_multiplicador(3)
    assert duplicar(7) == 14
    assert triplicar(7) == 21
    assert duplicar(2) == 4
    print("Ejercicio 5 superado")
