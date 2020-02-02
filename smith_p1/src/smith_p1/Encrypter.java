package smith_p1;
//Imports scanner
import java.util.Scanner;

public class Encrypter {
	public static void encrypt(int numToEncrypt)
	{
		//Initializes scanner in method
		Scanner scan = new Scanner(System.in);
		
		//This takes 4 digit number and breaks it down into singular digits (while declaring the ints those digits will hold)
		int a = (numToEncrypt / 1000);
		int b = ((numToEncrypt % 1000) / 100);
		int c = ((numToEncrypt % 100) / 10);
		int d = (numToEncrypt % 10);
		
		//This encrypts each single digit
		a = ((a + 7) % 10);
		b = ((b + 7) % 10);
		c = ((c + 7) % 10);
		d = ((d + 7) % 10);
		
		//This replaces digits with each other
		c = (c * 1000);
		d = (d * 100);
		a = (a * 10);
		
		//This adds encrypted number together, coming with final number
		int encryptedNum = c + d + a + b;
		
		//Prints encrypted number
		System.out.printf("%04d\n", encryptedNum);
		
		//Asks if user would like to decrypt a number
		System.out.println("Decrypt number, Y N?");
		
		char choice = scan.next().charAt(0);

				if (choice == 'Y' || choice == 'y')
					//Scans number to be decrypted, leads to decryption class
				{
					int numToDecrypt = 0;
					System.out.println("Please enter the number you'd like to decrypt.");
					numToDecrypt = scan.nextInt();
					Decrypter.decrypt(numToDecrypt);
				}
				else 
					//exits program otherwise
				{
					System.out.println("Thank you for using our services! Have a nice day!");
					
					System.exit(0);
				}
		
		
		
		
	}

}
