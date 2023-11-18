#Minijuego de piedra papel o tijera

import random

def juego():
    print("Bienvenido al juego de piedra papel o tijera")
    print("1. Piedra")
    print("2. Papel")
    print("3. Tijera")
    print("4. Salir")
    opcion = int(input("Elige una opcion: "))
    if opcion == 1:
        print("Has elegido piedra")
        opcion_maquina = random.randint(1,3)
        if opcion_maquina == 1:
            print("La maquina ha elegido piedra")
            print("Empate")
        elif opcion_maquina == 2:
            print("La maquina ha elegido papel")
            print("Has perdido")
        elif opcion_maquina == 3:
            print("La maquina ha elegido tijera")
            print("Has ganado")
    elif opcion == 2:
        print("Has elegido papel")
        opcion_maquina = random.randint(1,3)
        if opcion_maquina == 1:
            print("La maquina ha elegido piedra")
            print("Has ganado")
        elif opcion_maquina == 2:
            print("La maquina ha elegido papel")
            print("Empate")
        elif opcion_maquina == 3:
            print("La maquina ha elegido tijera")
            print("Has perdido")
    elif opcion == 3:
        print("Has elegido tijera")
        opcion_maquina = random.randint(1,3)
        if opcion_maquina == 1:
            print("La maquina ha elegido piedra")
            print("Has perdido")
        elif opcion_maquina == 2:
            print("La maquina ha elegido papel")
            print("Has ganado")
        elif opcion_maquina == 3:
            print("La maquina ha elegido tijera")
            print("Empate")
    elif opcion == 4:
        print("Gracias por jugar")
        exit()
    else:
        print("Opcion incorrecta")
        juego()
