import math

print("Halla el indice de masa corporal")
t = float(input("Ingrese su peso"))
j = float(input("Ingrese su estatura en metros"))
imc = t / math.pow(j, 2)
print(f" Teniendo en cuenta que su peso es {t} y su estatura es {j} su indice de masa corporal o imc es {imc} ")
