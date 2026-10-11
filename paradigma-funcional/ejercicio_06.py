"""Ejercicio 6: combinar filter() y map().
Objetivo: seleccionar calificaciones aprobatorias y sumarles 5 puntos,
sin superar 100. No cambies la lista original.
"""

def ajustar_aprobados(calificaciones):
    # TODO, en este orden:
    # 1. Conserva solo calificaciones >= 60 usando filter().
    # 2. Súmales 5 puntos usando map(), con máximo de 100.
    # 3. Devuelve una lista.
    # Pista: min(100, calificacion + 5)
    raise NotImplementedError("Completa ajustar_aprobados")

if __name__ == "__main__":
    entrada = [45, 60, 80, 98, 100]
    assert ajustar_aprobados(entrada) == [65, 85, 100, 100]
    assert entrada == [45, 60, 80, 98, 100]
    assert ajustar_aprobados([]) == []
    print("Ejercicio 6 superado")
