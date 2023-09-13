package GameProject;

import java.util.Scanner;
import java.util.Random;

public class Main {
	
	static void password(int length)
	{
		String upper = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
		String lower = "abcdefghijklmnopqrstuvwxyz";
		String number = "1234567890";
		String specialChar = "/<>=!@#$%^&*";
		String combination = upper+lower+number+specialChar;
		char charPass[] = combination.toCharArray();
		char result[] = new char[length];
		Random random = new Random();
		
		for(int i=0;i<length;i++)
		{
			result[i] = charPass[random.nextInt(combination.length())];
		}
		System.out.println("Generated password is : " + new String (result));
	}
	
	
	public static void main(String[] args) {
		
		System.out.println("Randome password generator.......");
		System.out.print("\n");
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Enter password length : ");
        int passLength = sc.nextInt();
        password(passLength);
	}

}
