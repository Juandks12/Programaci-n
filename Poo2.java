import java.util.Scanner;

public class Poo2 {
    static Scanner Leer = new Scanner(System.in);

    // crear un programa que muestre un menu de las siguientes operaciones
    // matematicas, calculadora, palindrome, binario.
    public static void main(String[] args) {

        int op;
        do {
            do {
                System.out.println("Menu"
                        + "\n1. Calculadora"
                        + "\n2. Palindrome"
                        + "\n3. Binario"
                        + "\n4. Salir");
                op = Leer.nextInt();
            } while (op < 1 || op > 4);
            switch (op) {
                case 1:
                    Calculadora();
                    break;
                case 2:
                    System.out.println(Palindrome());
                    break;
                case 3:
                    Binario();
                    break;
                case 4:
                    System.out.println("Adios");
                    break;
            }
        } while (op != 4);
    }

    public static void Calculadora() {
        float n1, n2, res;
        int ope;
        n1 = numero(1);
        n2 = numero(2);
        do {
            System.out.println("Operacion"
                    + "\n1. Suma"
                    + "\n2. Resta"
                    + "\n3. Multiplicacion"
                    + "\n4. Division");
            ope = Leer.nextInt();
        } while (ope < 1 || ope > 4);
        res = operacion(n1, n2, ope);
    }

    public static String Palindrome() {
        String cad = null;
        return cad;
    }

    public static void Binario() {

    }

    public static float numero(int L) {
        float num = 0;
        do {
            System.out.println("Ingrese el numero " + L);
            num = Leer.nextFloat();
        } while (num < 1);
        return num;
    }

    public static float operacion(float a, float b, int r) {
        float retorno = 0;
        switch (r) {
            case 1:
                retorno = a + b;
                break;
            case 2:
                retorno = a - b;
                break;
            case 3:
                retorno = a * b;
                break;
            case 4:
                retorno = a / b;
                break;
        }
        return res;
    }

    public static String Palindrome() {
        String cad = null;
        int L;
        do {
            System.out.println("Digite una palabra");
            cad = Leer.nextLine();
        } while (cad.isEmpty());

        for (L = 0; L < cad.length(); L++) {
            if (cad.charAt(L) != cad.charAt(cad.length() - L - 1))
                break;
            if (L == cad.length())
                cad = cad + "Es palindrome";
            else
                cad = cad + "No es palindrome";
            return cad;
        }
    }

    public static void binario() {
        int num;
        do {
            System.out.println("Ingrese un numero");
            num = Leer.nextInt();
        } while (num < 0);
        System.out.println("El numero binario es: " + Integer.toBinaryString(num));
    }
}