RIOS = {'Rin': 'Alemania', 'Misisipi': 'Estados Unidos', 'Amazonas': 'Colombia', 'Orinoco': 'Venezuela',
        'Eufrates': 'Siria'}
print('PRIMER PUNTO')
for i, j in RIOS.items():
    print(f'El rio {i} pasa por {j}')
for i, j in RIOS.items():
    print('Rio: ', i)
for i, j in RIOS.items():
    print('Pais: ', j)
print('--------------------')
print('SEGUNDO PUNTO')
GLOSARIO = {'VARIABLE': 'Es donde se almacenan y se recuperan los datos de un programa',
            'BUCLES O CICLOS': 'Se utilizan en los programas de código para establecer sentencias o trozos de código que se repiten o se iteran',
            'CONTADOR': 'Es un registro del procesador de un computador que indica la posición donde está el procesador en su secuencia de instrucciones',
            'SINTAXIS': 'Conjunto de reglas que deben seguirse al escribir el código fuente de los programas para considerarse como correctos para ese lenguaje de programación',
            'PALABRAS RESERVADAS': 'Son identificadores reservados predefinidos que tienen un significado especial y no se pueden utilizar como identificadores en sus programas', }
for i, j in GLOSARIO.items():
    print(f'{i} : {j}')
