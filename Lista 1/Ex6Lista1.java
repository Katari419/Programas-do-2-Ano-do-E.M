import java.util.Scanner;
public class Ex6Lista1 {
    public static void main(String[] args){
        Scanner ent = new Scanner(System.in);
			double n = 0;
			double soma = 0;
			int contador = 0;
			do{
				
				System.out.println("Insira o numero ou digite 0 para encerrar");
				n = ent.nextDouble(); 
				if (n > 0){
					soma = n + soma;
					contador++;
				}
			
			}while (n > 0);
		
			System.out.println ("os numeros digitados foram:  "+contador);
			System.out.println ("A soma é: "+soma);
		}
}