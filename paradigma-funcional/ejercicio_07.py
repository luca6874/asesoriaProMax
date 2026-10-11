"""Ejercicio 7: desafío integrador.
Objetivo: combinar filter(), map() y reduce() con una lista de productos.
Cada producto es un diccionario con nombre, precio y stock.
"""
from functools import reduce

def total_inventario_disponible(productos):
    # TODO:
    # 1. Filtra productos con stock > 0.
    # 2. Transforma cada producto en precio * stock.
    # 3. Suma los subtotales con reduce() y valor inicial 0.
    # Devuelve el valor total del inventario disponible.
    # No modifiques los diccionarios originales ni uses ciclos.
    raise NotImplementedError("Completa total_inventario_disponible")

if __name__ == "__main__":
    productos = [
        {"nombre": "Mouse", "precio": 200, "stock": 3},
        {"nombre": "Teclado", "precio": 500, "stock": 0},
        {"nombre": "Monitor", "precio": 2500, "stock": 2},
    ]
    assert total_inventario_disponible(productos) == 5600
    assert total_inventario_disponible([]) == 0
    assert productos[0]["stock"] == 3
    print("Ejercicio 7 superado")
