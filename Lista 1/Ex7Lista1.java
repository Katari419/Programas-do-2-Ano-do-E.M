import java.util.Scanner;
public class Ex7Lista1{
	public static void main (String[] args){
		Scanner sc1 = new Scanner(System.in);
		
		System.out.println("Insira a cor do semaforo");
		System.out.println("Vermelho(1)");
		System.out.println("Amarelo(2)");
		System.out.println("Verde(3)");
		int cor = sc1.nextInt();
		if (cor == 1){
			System.out.println("PARE!!");
		}
		if (cor == 2){
			System.out.println("Está prestes a fechar");
		}
		if (cor == 3){
			System.out.println("Pode passar");
		}
		if (cor < 1 || cor > 3 ){
			System.out.println("=====Erro de digitacao=====");
		}
		
	}
}