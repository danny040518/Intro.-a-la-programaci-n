huespedes = {101: 'Juan Valdes', 105: 'Paquita la del Barrio', 202: 'Mariana Pajon'}

print(huespedes)
print(huespedes.items())

print(huespedes.keys())
for key in huespedes:
    print(key)

print(huespedes.values())
for key in huespedes:
    print(huespedes[key])
print()

for habitacion in huespedes:
    print(habitacion, ':', huespedes[habitacion])
print()
for habitacion, huesped in huespedes.items():
    print(habitacion, ':', huespedes[key])
for indice, key in enumerate(huespedes):
    print(indice + 1, key, huespedes[key])
print()

print(huespedes[105])
print(huespedes.get(105))

print('====================================')

huespedes[102] = 'Fanny Lu'
huespedes[107] = 'Don Omar'
huespedes.setdefault('109', 'Luis Miguel')

for huesped in huespedes.items():
    print(habitacion, ':', huesped)
print()

registroshoy = {201: 'Vicente Fernandez', 301: 'Pepe Guardiola'}
huespedes.update(registroshoy)
for habitacion, huesped in huespedes.items():
    print(habitacion, ':', huesped)
print()

print('====================================')

huespedes[107] = 'Ricky Martin'
print(huespedes)

print('====================================')

del huespedes[102]
huespedes.pop(202)
print(huespedes)

print('====================================')

copia1 = huespedes.copy()
print('copia1: ', copia1)
copia2 = {}
copia2.update(huespedes)
print("copia2: ", copia2)

print('====================================')

lista = [2, 5, 7, 1]
diccio = dict.fromkeys(lista, "xxx")
print(diccio)

print('====================================')
inventario = {"plata": (500, 2500), 'cartera': ["Cedula", "Moneda", "Boletas"], 'mecato': 'Detodito', 'dias': 1}
print(inventario)
inventario["cartera"].sort()
print(inventario)
inventario["cartera"].remove("Moneda")#En estalinea estaba el error, se escribio monedas en vez de moneda, el cual es el que si esta dentro del diccionario
print(inventario)
print(inventario.get("plata")[0])
