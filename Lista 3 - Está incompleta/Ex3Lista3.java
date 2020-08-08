import java.util.Scanner;
public class Ex3Lista3 {
	public static void main (String[] args){
		Scanner sc=new Scanner(System.in);
		String [] a;
		a=new String[10];
		System.out.println("Digite 10 nomes: ");
		for (int i=0;i<10;i++){
			a[i]=sc.nextLine();
		}
		for (int i=0;i<10;i++){
		System.out.print(a[i]+" ");
		}
	}
}