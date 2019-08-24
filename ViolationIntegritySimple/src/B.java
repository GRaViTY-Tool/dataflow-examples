import org.gravity.security.annotations.requirements.Integrity;

/**
 * 
 * Simple violation of the integrity property.
 *
 */
public class B {

	@Integrity
	int a = 5;
	
	public void m(int b) {
		a = b;
	}
}
