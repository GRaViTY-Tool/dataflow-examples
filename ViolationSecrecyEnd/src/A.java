/**
 * 
 * A violation of the secrecy property with the inconsistent part being at the end of a flow.
 *
 */
public class A {

	// Secrecy
	int a = 0;
	
	// Secrecy
	int b = a;
	
	int c = b;
}
