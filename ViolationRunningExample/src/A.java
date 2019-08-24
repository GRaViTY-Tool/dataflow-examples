import org.gravity.security.annotations.requirements.Integrity;
import org.gravity.security.annotations.requirements.Sanitizing;
import org.gravity.security.annotations.requirements.Tainted;

public class A {
	
	@Tainted
	private static String getText() {
		return "Text";
	}
	
	@Integrity
	private static String getName() {
		return "Name";
	}
	
	@Integrity
	private static void eval(String input) {
		
	}
	
	@Sanitizing
	private static String sanitize(String input) {
		return input;
	}
	
	public static void main(String[] args) {
		// Violation
		//eval(getName() + getText());
		
		// No violation
		eval(sanitize(getName() + getText()));
	}
	
}
