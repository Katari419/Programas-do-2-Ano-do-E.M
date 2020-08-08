import java.util.Scanner;
public class Ex6Lista2 {
	public static void main (String[] args){
		Scanner sc=new Scanner(System.in);
		System.out.println("Digite um número: ");
		int a=sc.nextInt();
		a++;
		System.out.println("Seu sucessor é "+a);
		a--;
		a--;
		System.out.println("Seu antecessor é "+a);
	}
}