t = (23, 'a', (2.5, 3.7, 'x'), ["perrito", "gatito"], 'Pepe')  # esta tupla tiene dentro otra tupla y una lista
print(t)  # imprime toda la tupla
print(len(t))  # imprime la cantidad de objetos en la tupla

print('=====================================')
print(t[0])  # imprime la primera posicion de la tupla
print(t[3])  # imprime la 4ta posicion de la tupla
print(t[1:3])  # imprime los objetos desde la posicion 2 y 4
print(t[3][1])  # imprime el segundo objeto de lista que es el objeto en la posicion 4

print('====================================')
print(t[3])  # imprime la posicion 4, la cual es una lista
t[3].append('lorito')  # agrega a lista de la posicion 4, la palabra lorito
print(t)  # imprime los elementos dentro de la tupla t

print('====================================')
for elemento in t:
    print(elemento)  # imprime cada elemento de la tupla uno por uno, de arriba a abajo

print('====================================')
for index in range(0, len(t)):
    print(
        t[index])  # imprime cada elemento desde la posicion 1 hasta la final, tomando de refencia el tamaño de la tupla

print('====================================')
if 'a' in t:  # lee si "a" esta en la lista y si es asi, imprime que esta en la lista
    print("El elemento 'a' esta en la tupla")

print('====================================')
lista = list(t)  # crea una lista que toma los valores de la tupla
lista[1] = 'A'  # el valor de la posicion 2 de la lista lo cambia por "A"
print(lista)  # imprime la lista

tupla = tuple(lista)  # une la tupla con la lista
print(tupla)

print('====================================')
l = [(1, 1), (2, 4), (3, 9), (4, 16), (5, 25)]  # creaun diccionario
for x, y in l:
    print(x, ':', y)  # va imprimiendo 1 a 1 cada valor del diccionario
