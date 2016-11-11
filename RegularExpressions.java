import java.util.regex.Matcher;
import java.util.regex.Pattern;




public class RegularExpressions {

	
	private CharSequence input;
	private String regex;


	public RegularExpressions() {
		Pattern p = Pattern.compile(regex);
	}
	
	public boolean validateThings(final String input, Pattern p) {

		Matcher matcher = p.matcher(input);

		return matcher.matches();

		}

		
	
	
	
	
	
	
	
	


	
}
