import java.util.Arrays;

public class main
{
	public static void main(String [] args)
	{
		String Symptoms[] = {"Fever", "Cough", "Shortness of breath", "Fatigue"};
		System.out.println("potential symptoms for COVID-19 : ");
		for(String symptoms : Symptoms)
		{
			System.out.println("\t-" +Symptoms);
		}
	}
}