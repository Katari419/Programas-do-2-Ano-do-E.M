import java.util.Scanner;
public class Ex2Lista2{
	public static void main (String[] args){
		Scanner sc1 = new Scanner(System.in);
		int i = 2000;
		while ( i <= 20000 ){
			i= i+1;
				if (i%2==0){
					if (i%3 ==0){
					  System.out.println(i);		
					}
				}
			
		}
	}
}