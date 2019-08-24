import org.gravity.security.annotations.requirements.Integrity;

/**
 * 
 * A violation of the integrity property with the inconsistent part being at the beginning of a flow.
 *
 */
public class A {

	@Integrity
	int a;
	@Integrity
	int b = a;
	
	public void m(int c) {
		a = c;
	}
}