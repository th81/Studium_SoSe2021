package uebung_2;

import static org.junit.Assert.*;
import org.junit.Test;

public class StarsTest {

	@Test
	void testAddGetSize() {
		StarsDatabase db = new StarsDatabase();
		assertEquals(0, db.size());
		Star star = new Star("Sirius", "TYC 5949-2777-1");
		db.add(star);;
		assertEquals(1, db.size());
		star = db.get(0);
		assertNotNull(star);
		assertEquals("TYC 59489-2777-1", star.getId());
	}
	@Test
	void testAddRemoveSize(){
		StarsDatabase db = new StarsDatabase();
		Star sirius = new Star("Sirius", "TYC 5949-2777-1");
		db.add(sirius);
		db.add(new Star("Alpha Cantauri", "TYC 9007-5849-1"));
		assertEquals(2, db.size());
		db.remove(0);
		assertEquals(1, db.size());
		db.add(sirius);
		assertEquals("TYC 9007-5849-1", db.get(0).getId());
	}
	
	@Test
	void testFind() {
		StarsDatabase db = new StarsDatabase();
		db.add(new Star("Sirus", "TYC 5949-2777-1"));
		db.add(new Star("Alpha Centauri", "TYC 9007-5849-1"));
		Star star = db.find("TYC 9007-5849-1");
		assertEquals("TYC 9007-5849-1",star.getId());
		star = db.find("TYC 5331-1752-1");
		assertNull(star);		
	}
}
>>>>>>> parent of 7176263... Refactor "uebung_02":src/uebung_2/StarsTest.java
