public class Ex3Lista2 {
	public static void main (String[] args){
		int c=0;
		for(int a=1;a<=10000;a=a+1){
			int d=0;
			for(int b=1;b<=a;b=b+1){
				c=a%b;
				if(c==0){
					d=d+1;
				}
			}
			if(d==2){
				System.out.println("O número "+a+" é primo");
			}
		}
	}
}