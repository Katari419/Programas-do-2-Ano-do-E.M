import java.util.Scanner;
public class Ex9Lista2 {
	public static void main (String[] args){
		Scanner sc=new Scanner(System.in);
		System.out.println("Insira um n�mero real para o casting (de prefer�ncia quebrado): ");
		double a=sc.nextDouble();
		int b=(int)a;
		System.out.println("Fazendo o casting expl�cito, ele fica assim: "+b);
		a=b;
		System.out.println("Fazendo o casting impl�cito de volta, ele fica assim: "+a);
	}
}