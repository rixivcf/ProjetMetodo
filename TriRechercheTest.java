package Test;
import java.lang.*;
import org.junit.Test;
import Tri.TriRecherche;
import Tri.TriRecherche;

import junit.framework.TestCase;

public class TriRechercheTest extends TestCase {

	public void testInitTab() {
		fail("Not yet implemented");
	}

	public void testAfficheTab() {
		fail("Not yet implemented");
	}
	@Test
	public void testEchangerValeurs() {
		int tab[] = {2,6,5,9,8,4,7};
		int i = 6;
		int j=5;
		TriRecherche t =  new EchangerValeurs(tab,i,j);
		int tab2[]= {2,5,6,9,8,4,7};
		
		assertEquals(t,tab2);
	}

	public void testTriBullesCroissant() {
		
	}

	public void testTriBullesDecroissant() {
		fail("Not yet implemented");
	}

	public void testRechercher() {
		fail("Not yet implemented");
	}

	public void testMain() {
		fail("Not yet implemented");
	}

}
