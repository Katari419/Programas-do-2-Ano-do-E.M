public class Ex4Lista2 {
	public static void main (String[] args){
		for(int a=1;a<1000;a=a+1){
			if((a>=500)&&(a<600)){
				continue;
			}
			System.out.println(a);
		}
	}
}