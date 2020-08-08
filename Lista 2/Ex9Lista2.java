import java.util.Scanner;
public class Ex9Lista2 {
	public static void main (String[] args){
		Scanner sc=new Scanner(System.in);
		System.out.println("Insira um número real para o casting (de preferência quebrado): ");
		double a=sc.nextDouble();
		int b=(int)a;
		System.out.println("Fazendo o casting explícito, ele fica assim: "+b);
		a=b;
		System.out.println("Fazendo o casting implícito de volta, ele fica assim: "+a);
	}
}