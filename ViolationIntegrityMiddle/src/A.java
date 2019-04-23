/**
 * 
 * A violation of the integrity property with the inconsistent part being in the middle of a flow.
 *
 */
public class A {
	
	// Integrity
	int a;
	
	public void m(int b) {
		a = b;
	}
	
	// Integrity
	public void n(int c) {
		m(c);
	}
}
