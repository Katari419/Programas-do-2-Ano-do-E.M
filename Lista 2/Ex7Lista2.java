import java.util.Scanner;
public class Ex7Lista2 {
	public static void main (String[] args){
		Scanner sc=new Scanner(System.in);
		int b=0;
		int a=2;
		while(a!=0){
			System.out.println("Digite um n�mero ou 0 para parar: ");
			a=sc.nextInt();
			if(a!=0){
				if(a!=1){
					a++;
					System.out.println("Seu sucessor � "+a);
					a--;
					a--;
					System.out.println("Seu antecessor � "+a);
				} else {
					System.out.println("Seu sucessor � 2");
					System.out.println("Seu antecessor � 0");
				}
			}
			b++;
		}
		System.out.println("Esse programa foi executado "+b+" vezes");
	}
}