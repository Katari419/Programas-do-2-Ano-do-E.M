import java.util.Scanner;
public class Ex1Lista3 {
	public static void main (String[] args){
		Scanner sc=new Scanner(System.in);
		double [] a;
		double [] b;
		a=new double[10];
		b=new double[10];
		System.out.println("Digite 10 números reais e será exibido sua saída: ");
		for(int i=0;i<10;i=i+1){
			a[i]=sc.nextDouble();
			if(i%2==0){
				b[i]=a[i]*5.0;
			} else {
				b[i]=a[i]+5.0;
			}
		}
		for(int i=0;i<10;i=i+1){
			System.out.println("A entrada foi "+a[i]+" e a saída é "+b[i]);
		}
	}
}