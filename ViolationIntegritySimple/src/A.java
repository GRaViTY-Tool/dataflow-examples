import org.gravity.security.annotations.requirements.Integrity;

/**
 * 
 * Simple violation of the integrity property.
 *
 */
public class A {

	int a = 0;
	@Integrity
	int b = a;
}
