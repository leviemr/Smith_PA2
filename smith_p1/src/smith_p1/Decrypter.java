package smith_p1;
//Imports scanner
import java.util.Scanner;

public class Decrypter {
	public static void decrypt(int numToDecrypt)
		{
				//Initializes scanner
				Scanner scan = new Scanner(System.in);
		
				//This takes 4 digit number and breaks it down into singular digits (while declaring the ints those digits will hold)
				int a = (numToDecrypt / 1000);
				int b = ((numToDecrypt % 1000) / 100);
				int c = ((numToDecrypt % 100) / 10);
				int d = (numToDecrypt % 10);
					
				//This decrypts each single digit
				a = ((a + 3) % 10);
				b = ((b + 3) % 10);
				c = ((c + 3) % 10);
				d = ((d + 3) % 10);
				
				//This replaces digits with each other
				c = (c * 1000);
				d = (d * 100);
				a = (a * 10);
				
				//This adds decrypted number together, coming with final number
				int decryptedNum = c + d + a + b;
				
				//Prints decrypted number
				System.out.printf("%04d\n", decryptedNum);
				
				//Asks if user would like to decrypt a number
				System.out.println("Encrypt number, Y N?");
				
				char choice = scan.next().charAt(0);

					if (choice == 'Y' || choice == 'y')
							//Scans number to be encrypted, leads to encryption class
					{
						int numToEncrypt = 0;
						System.out.println("Please enter the number you'd like to encrypt.");
						numToEncrypt = scan.nextInt();
						Decrypter.decrypt(numToEncrypt);
					}
					else 
						//exits program otherwise
					{
						System.out.println("Thank you for using our services! Have a nice day!");
							
						System.exit(0);
					}
	}

}
