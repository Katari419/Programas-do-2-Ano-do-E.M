import java.util.Scanner;
public class Ex3Lista1{
   public static void main(String[] args){
     Scanner sc1 = new Scanner(System.in);
	 int an=0;
	 String nome;
	 int idf=0;
	 System.out.print(" digite o ano do seu nascimento");
     an = sc1.nextInt();
     System.out.print(" seu nome ");
     nome = sc1.next();
	 System.out.print(" digite um ano futuro");
	 int af = sc1.nextInt();
	 idf = af-an;  
	 System.out.print(" a sua idade futura será:" +idf);
   } 
}   