diccionario = {}
promedios = {}
x = 0
e = 0
while (x != 9):
    x = int(input("que desea hacer: \n1.agregar un estudiante\n2.modificar datos de un estudiante\n3.eliminar uno"
                  "\n4.ver datos de un estudiante\n5.ver todos los estudiantes\n6.ver promedio de un estudiante"
                  "\n7.ver mejor estudiante\n8.ver peor estudiante\n9.salir\n"))
    if x == 1:
        print("digite el numero que sigue despues de ", e, "\n")
        es = input()
        n = 0
        s = 0
        atributos = [0, 0, 0, "", 0]
        atributos[4] = int(input("ingrese codigo "))
        atributos[3] = input("ingrese nombre y apellido ")
        for n in range(3):
            siga = True
            while (siga):
                atributos[n] = int(input("ingrese nota "))
                if (atributos[n] > 5 or atributos[n] < 0):
                    print("elija una nota valida")
                else:
                    siga = False
                s = s + atributos[n]
        e = +1
        promedios[es] = s / 3
        diccionario[es] = atributos
    if x == 2:
        print("elija un numero menor o igual a", (e + 1), "para encontrarlo en el diccionario")
        es = input()
        n = 0
        s = 0
        atributos = [0, 0, 0, "", 0]
        atributos[4] = int(input("ingrese codigo "))
        atributos[3] = input("ingrese nombre y apellido ")
        for n in range(3):
            siga = True
            while (siga):
                atributos[n] = int(input("ingrese nota "))
                if (atributos[n] > 5 or atributos[n] < 0):
                    print("elija una nota valida")
                else:
                    siga = False
            s = s + atributos[n]
        e = +1
        promedios[es] = s / 3
        diccionario[es] = atributos
    if x == 3:
        print("elija un numero menor o igual a", (e + 1), "para eliminarlo del diccionario")
        es = input()
        del promedios[es]
        del diccionario[es]
    elif x == 4:
        print("elija un numero menor o igual a", (e + 1), "para imprimir el estudiante")
        es = input()
        print(diccionario[es])
        print("promedio: ", promedios[es])
    if x == 5:
        print(diccionario)
        print("promedios: ", promedios)
    elif x == 6:
        print("elija un numero menor o igual a", (e + 1), "para imprimir el promedio de dicho estudiante")
        es = input()
        print("el promedio de ", diccionario[es][3], " es: ", promedios[es])
    elif x == 7:
        sum = 0
        idAlto = 0
        for c in promedios:
            if promedios[c] > sum:
                idAlto = c
                sum = promedios[c]
        print("el mejor estudiante es: ", diccionario[idAlto][3], ": ", diccionario[idAlto], " con un promedio de: ",
              promedios[idAlto])
    elif x == 8:
        sum = 5
        idBajo = 0
        for c in promedios:
            if promedios[c] < sum:
                idBajo = c
                sum = promedios[c]
        print("el peor estudiante es: ", diccionario[idBajo][3], ": ", diccionario[idBajo], " con un promedio de: ",
              promedios[idBajo])
    elif x == 9:
        print("Hasta luego:)")
