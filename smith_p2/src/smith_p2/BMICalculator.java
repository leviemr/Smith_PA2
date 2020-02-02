package smith_p2;

import java.util.Scanner;

//BMI Calculator public class
public class BMICalculator {
	 static Scanner scan = new Scanner(System.in);
	 static int Unit;
	 static int Weight;
	 static int Height;
	 static int BMI;
	 static int CAT;
	 
	
	////////////////////////////////////////////////////////////////////////////////////////////////////
	//read userData *REVISIT: Makes use of both readUnitType and readMeasurementData methods*
	public static void readUserData ()
	{
		System.out.println("Welcome to the BMI Calculator!");
		
		System.out.println("Imperial Units: Enter 1!");
		System.out.println("Metric Units: Enter 2!");
		readUnitType();
		
		System.out.println("Please enter your measurements!");
		readMeasurementData();
	}
	
	private static void readUnitType()
	{	//Reads unit choice
		 Unit = scan.nextInt();
		
		//If/else statement that records unit type
		if (Unit == 1)
		{
			System.out.println("You have selected Imperial Units! Your height will be recorded in inches, and your weight will "
					+ "be recorded in pounds! Is this correct?");
			System.out.println("Y   N");
			char choice = scan.next().charAt(0);
			if (choice == 'n' || choice == 'N');
			{
				Unit = 2;
				System.out.println("You have swapped to Metric Units! Your height will be recorded in meters, and your weight will be "
						+ "recorded in kilograms!");
			}
		}
		else if (Unit == 2)
		{
			System.out.println("You have selected Metric Units! Your height will be recorded in meters, and your weight will "
					+ "be recorded in kilograms! Is this correct?");
			System.out.println("Y   N");
			char choice = scan.next().charAt(0);
			if (choice == 'n' || choice == 'N');
			{
				Unit = 1;
				System.out.println("You have swapped to Imperial Units! Your height will be recorded in inches, and your weight will be "
						+ "recorded in pounds!");
			}
		}
		
	}
	
	//If Unit is Imperial, read Imperial data, if Unit is Metric, reads Metric data
	private static void readMeasurementData()
	{
		if (Unit == 1)
		{
			readImperialData();
		}
		
		else if (Unit == 2)
		{
			readMetricData();
		}
	}
	////////////////////////////////////////////////////////////////////////////////////////////////////
	
	
	private static void readMetricData()
	{
		System.out.println("Please enter your weight!");
		Weight = scan.nextInt();
		System.out.println("Please enter your height!");
		Height = scan.nextInt();
	}
	
	private static void readImperialData()
	{
		System.out.println("Please enter your weight!");
		Weight = scan.nextInt();
		if (Weight < 0)
		{
			System.exit(0);
		}
		Weight = (Weight * 703);
		System.out.println("Please enter your height!");
		Height = scan.nextInt();
		if (Height < 0)
		{
			System.exit(0);
		}
	}
	
	//Calculates the user's BMI
	public static void calculateBmi()
	{
	
		BMI = (Weight / (Height * Height));
		calculateBmiCategory();
		
	}
	
	//Determines user's BMI category
	private static void calculateBmiCategory()
	{
		if (BMI < 18.5)
		{
			CAT = 1;
		}
		else if (BMI >= 18.5 && BMI <= 24.9)
		{
			CAT = 2;
		}
		else if (BMI >= 25 && BMI <= 29.9)
		{
			CAT = 3;
		}
		else if (BMI >= 30)
		{
			CAT = 4;
		}
	}
	
	//Prints BMI value and category
	public static void displayBmi()
	{
		System.out.printf("This is your BMI: %d\n", BMI);
		if (CAT == 1)
		{
			System.out.printf("You are underweight!");
		}
		else if (CAT == 2)
		{
			System.out.printf("You are in the normal weight range!");
		}
		else if (CAT == 3)
		{
			System.out.printf("You are overweight!");
		}
		else if (CAT == 4)
		{
			System.out.printf("You are obese!");
		}
	}
	
	public static int getWeight()
	{
		return Weight;
		
	}
	
	private void setWeight()
	{
		this.Weight = Weight;
	}
	
	public static int getHeight()

	{
		return Height;
	}
	
	private void setHeight()
	{
		this.Height = Height;
	}
	
	public int getBmi()
	{
		return BMI;
	} 
	
	public int getCategory()
	{
		return CAT;
	}
	
}
