import org.gravity.security.annotations.requirements.Secrecy;

/**
 * 
 * A violation of the secrecy property with the inconsistent part being in the middle of a flow.
 *
 */
public class A {
	
	@Secrecy
	int a = 0;
	
	int b = a;
	
	@Secrecy
	int c = b;
}
