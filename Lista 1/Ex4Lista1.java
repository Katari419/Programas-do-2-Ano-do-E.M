import java.util.Scanner;
public class Ex4Lista1{
   public static void main(String[] args){
     Scanner sc1 = new Scanner(System.in);
	 String Name;
	 double Peso=0;
	 double Altura=0;
	 double IMC=0; 
	 System.out.print("digite seu nome:  ");
     Name = sc1.next();
     System.out.print("digite sua altura:  ");
     Altura = sc1.nextDouble();
	 System.out.print("digite seu peso:  ");
	 Peso = sc1.nextDouble();
	 IMC= Peso /(Math.pow(Altura,2));
	 System.out.println(" ----------------------- ");
		
		System.out.println("IMC de: "+IMC);
		if ( IMC < 18.5) {
			System.out.println(Name+"	voce esta abaixo do peso");
		}
		if(IMC >= 18.5 && IMC <=  24.9){
			System.out.println(Name+"	voce esta no peso normal");	
		}
		if( IMC >= 25 && IMC <= 29.9){
			System.out.println(Name+"	voce esta sobre peso");
		}
		if ( IMC >= 30 &&  IMC <= 34.4){
			System.out.print(Name+"	voce tem obesidade grau I");
		}
		if ( IMC >= 35 &&  IMC <= 39.9){
			System.out.print(Name+"	voce tem obesidade grau II");   
		}
		if ( IMC >= 40){
			System.out.print(Name+"	voce tem obesidade grau III");
		}
   }
}