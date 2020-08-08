import java.util.Scanner;
public class Ex1Lista2{
	public static void main (String[] args){
		Scanner sc1 = new Scanner(System.in);
		System.out.println("Insira o numero");
		int n=sc1.nextInt();
		float f = n;
		double d = n;
		System.out.println("Em float o numero fica "+f+" Double fica "+d);
	}
}