import org.gravity.security.annotations.requirements.Integrity;

/**
 * 
 * Simple violation of the integrity property.
 *
 * TODO: False positive?
 */
public class A {

	int a = 0;
	@Integrity
	int b = a;
}
