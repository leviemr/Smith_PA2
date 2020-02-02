package smith_p1;
//Imports scanner to read in user choice and ints to en/decrypt. 
import java.util.Scanner;

public class Application {

	public static void main(String[] args) {
		
		//Initializes scan
		Scanner scan = new Scanner(System.in);
		int numToEncrypt = 0;
		int numToDecrypt = 0;
		
			//Initializes number to encrypt and number to decrypt
			//Asks user to select encryption or decryption, and records their choice
		System.out.println("Welcome! If you have your number ready, please press E to encrypt your number, or D to decrypt it.");
		
		char choice = scan.next().charAt(0);
		
		//Takes user choice and allows them to enter a number to encrypt or decrypt
			if (choice == 'E' || choice == 'e')
				//Scans number to be encrypted, and passes it to encryption class
				{
					System.out.println("Please enter the number you'd like to encrypt.");
					numToEncrypt = scan.nextInt();
					Encrypter.encrypt(numToEncrypt);
					}
			
		else if (choice == 'D' || choice == 'd')
			//Scans number to be decrypted, and passes it to decryption class
			{
				System.out.println("Please enter the number you'd like to decrypt.");
				numToDecrypt = scan.nextInt();
				Decrypter.decrypt(numToDecrypt);
			}

	}

}
