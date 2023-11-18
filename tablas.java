import java.util.Scanner;
public class tablas {
    public static void  main(String[] args) {
        Scanner Leer = new Scanner(System.in);

        System.out.println("Tablas de multiplicar hasta el 10");

        for(int i=1; i<11; i++){
            System.out.println("Tabla del "+ i);
            for(int j=1; j<11; j++){
                
                System.out.println(i+" x "+j+" = "+(i*j));
            }
        }
    }
}
