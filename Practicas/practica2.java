import java.util.Scanner;

public class practica2 {
    public static void main(String args[]) {
        Scanner in = new Scanner(System.in);
        int num1 = 0, num2 = 0, result = 0 ;
        try{
            System.out.println("Escriba el primer numero");
            num1 = in.nextInt();
            System.out.println("Escriba el primer numero");
            num2 = in.nextInt();
            result = num1 + num2;
            System.out.println("El resultado de la suma entre el numero uno y el numero dos es: " + result);
        }finally{
            in.close();
        }   
    }
}
