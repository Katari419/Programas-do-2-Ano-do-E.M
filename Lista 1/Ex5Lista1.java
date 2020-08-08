import java.util.Scanner;
public class Ex5Lista1{
	public static void main (String[] args){
		Scanner sc1 = new Scanner(System.in);
		
		double raio=0;
		double area=0;
		double PI=3.14;
		
		System.out.print("Digite o raio:  ");
		raio = sc1.nextDouble();
		area = PI*(raio*raio);
		System.out.print("A area do circulo e:  " +area);
	}
}
