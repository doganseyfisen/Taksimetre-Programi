import java.util.Scanner;

public class Driver {
	public static void main(String[] args) {
		
		int km;
		int minUcret = 20;
		int acilisUcreti = 10;
		double kmUcreti, ucret;
		Scanner inp = new Scanner(System.in);
		System.out.println("Hoşgeldiniz.");
		System.out.println("Taksimetre açılış ücreti 10 TL'dir, iyi yolculuklar.");
		System.out.print("Mesafeyi km cinsinden giriniz: ");
		km = inp.nextInt();
		kmUcreti = km*2.20;
		if(kmUcreti < 20) {
		ucret = minUcret;
		System.out.println("Taksimetre ücreti: " + ucret +" TL");
		} else {
		ucret = minUcret + kmUcreti;
		System.out.println("Taksimetre ücreti: " + ucret +" TL");
		}
	}
}
