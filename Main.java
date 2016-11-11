import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Main {

	
	public static void main(String[] args)
	
	{
		Scanner input = new Scanner(System.in);
		System.out.println("Enter the FULL NAME !!! of the person, not the username, but the FULL NAME: ");
		String name = input.nextLine();
		
		System.out.println("Enter the email of the person: ");
		String email = input.nextLine();
		
		System.out.println("Enter the facility key of the person: ");
		String facilityKey = input.nextLine();
		
		System.out.println("Enter the egn of the person: ");
		String egn = input.nextLine();
		
		System.out.println("Enter the bulstat of the person: ");
		String bulstat = input.nextLine();
		
		Pattern a =Pattern.compile("^[^-_.,0-9@a-z][A-Za-z\\s]{1,50}$");
		Matcher m =a.matcher(name);
		
		Pattern b = Pattern.compile(
				"^[_A-Za-z0-9-\\+]+(\\.[_A-Za-z0-9-]+)*@"

				+ "[A-Za-z0-9-]+(\\.[A-Za-z0-9]+)*(\\.[A-Za-z]{2,})$");
		Matcher n = b.matcher(email);
		
		Pattern c = Pattern.compile("^[0-9]{2}-[0-9]{3}$");
		Matcher p = c.matcher(facilityKey);
		
		Pattern d = Pattern.compile("^[0-9]{10}$");
		Matcher q = d.matcher(egn);
		
		Pattern e = Pattern.compile("^[0-9]{7}$");
		Matcher k = e.matcher(bulstat);
		
		
		if(m.matches())		{
			System.out.println("Valid name!");
		}
		else {
				System.out.println("Invalid name!");
			}
		
               
		
		if(n.matches())
		{
			System.out.println("Valid email!");
		}
		
		else {
			System.out.println("Invalid email!");
		}
		
		if(p.matches())
		{
			System.out.println("Valid facility key!");
		}
		
		else {
			System.out.println("Invalid facility key!");
		}
		
		if(q.matches())
		{
			System.out.println("Valid egn!");
		}
		else {
			System.out.println("Invalid egn!");
		}
		
		
		if(k.matches())
		{
			System.out.println("Valid bulstat!");
			
		}
		
		else {
			System.out.println("Invalid bulstat!");
		}
		
		
		
		
	}
}

