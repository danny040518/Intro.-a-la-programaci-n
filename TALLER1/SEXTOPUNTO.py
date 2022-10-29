import math

print("Hallar el área de un círculo, un triángulo y un cuadrado")
r = float(input("Escribe el radio"))
b = float(input("Escribe el base"))
a = float(input("Escribe el altura"))
l = float(input("Escribe el lado"))
arci = math.pi * math.pow(r, 2)
artri = (b * a) / 2
arcu = math.pow(l, 2)
print(f" El area del circulo es {arci} ")
print(f" El area del trinagulo es {artri} ")
print(f" El area del cuadrado es {arcu} ")
