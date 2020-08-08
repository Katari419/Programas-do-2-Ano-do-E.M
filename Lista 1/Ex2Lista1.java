import java.util.Scanner;
public class Ex2Lista1{
   public static void main(String[] args){
     Scanner scl = new Scanner(System.in);
     int numero1 = 0;
     int numero2 = 0;
     float media = 0;
     System.out.print("Insira um numero inteiro");
     numero1 = scl.nextInt();
     System.out.print("Insira outro para fazer a media");
     numero2 = scl.nextInt();
     media =(numero1+numero2)/2;
     System.out.println("a media dos numeros inteiros é: "+media);

    }	
}  

