import java.util.Scanner;

public class Main
{
	public static void main(String[] args)
	{
		// No need to touch anything in here
		Scanner sc = new Scanner(System.in);
		String str = null;

		System.out.println("Enter a sentence:");
		str = sc.nextLine();

		algorithm1(str);
		algorithm2(str);

		sc.close();
	}

	// This method should implement Algorithm 1 and print all neccessary data
	public static void algorithm1(String input)
	{
		
		for (int i = 0; i < input.length() - 1; i++)
		{
			String ABC = input.substring(i, i+1);

			if (input.substring(i, i + 1).isUpperCase())
			{
				input.substring(i, i + 1).toLowerCase();
			}
			if (ABC.equals("a") || ABC.equals("e") || ABC.equals(i) || ABC.equals("o") || ABC.equals("u") || !ABC.equals(" a") || !ABC.equals(" e") || !ABC.equals(" i") || !ABC.equals(" o") || !ABC.equals(" u"))                                          
			{
				input = input.substring(0, i - input.length()) + (input.length() - 1);
			}
		}
		System.out.println(input);
	}

	// This method should implement Algorithm 2 and print all neccessary data
	public static void algorithm2(String input)
	{
		// TODO: Put solution to Algorithm 1 here
		System.out.println("Implement me!");
	}
}
