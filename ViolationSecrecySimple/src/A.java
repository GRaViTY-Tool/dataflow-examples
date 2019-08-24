import org.gravity.security.annotations.requirements.Secrecy;

/**
 * 
 * Simple violation of the secrecy property.
 *
 */
public class A {

	@Secrecy
	int a = 0;
	
	int b = a;
}
