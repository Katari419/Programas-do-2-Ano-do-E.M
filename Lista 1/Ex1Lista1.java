import java.util.Scanner;
public class Ex1Lista1{
		public static void main (String[] args){
			Scanner scl=new Scanner(System.in);
			int i = 0;
			while (i<10){
				i = i+1;
				System.out.print("Insira um numero inteiro");
				int Num=scl.nextInt();
				int a= Num % 2;
				if (a == 0){
					System.out.print("o numero inserido" +Num+ " é par");
				}
			}
		}
}