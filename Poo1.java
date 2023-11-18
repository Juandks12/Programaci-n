import java.util.Scanner();
public class Poo1 {
    public static void  main(String[] args) {
        /*
        analizar si un numero positivo es primo o no es primo
        */
        Scanner Leer = new Scanner(System.in);
        int num, ce, L;
        do{
            System.out.println("digite un numero positivo"); 
            num = Leer.nextInt();
        }while(num<1);
	ce = 0;
	L = 1;	
        do{
            if(num%L == 0)
		ce = ce+1;
            L = L+1;
        }while(L <= num);
	if(ce==2)
            System.out.println(num + " es primo");
	else
            System.out.println(num + " no es primo");  

    }

}
