import java.util.Scanner;
public class Ex2Lista3 {
	public static void main (String[] args){
		Scanner sc=new Scanner(System.in);
		int [] a;
		int b=0;
		a=new int[5];
		System.out.println("Digite 5 números e seram somados os impares: ");
		for(int i=0;i<5;i++){
			a[i]=sc.nextInt();
			if(i%2==0){
				b=b+a[i];
			}
		}
		System.out.println("A soma é igual a "+b);
	}
}