"""Ejercicio 3: seleccionar elementos con filter().
Objetivo: filtrar edades que cumplan una condición.
"""

def mayores_de_edad(edades):
    # TODO: usa filter() con lambda para conservar edades >= 18.
    # Devuelve una lista nueva. No uses ciclos.
    raise NotImplementedError("Completa mayores_de_edad")

if __name__ == "__main__":
    assert mayores_de_edad([15, 18, 21, 12, 30]) == [18, 21, 30]
    assert mayores_de_edad([12, 16]) == []
    print("Ejercicio 3 superado")
