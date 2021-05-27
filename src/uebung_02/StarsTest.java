package uebung_2;

public class StarsTest {
	
	@Test
	void testAddGetSize() {
		StarsDatabase db = new StarsDatabase();
		assertEquals(0, db.size());
		Star star = new Star("Sirius", "TYC 5959-2777-1");
		db.add(star);
		assertEquals(1, db.size());
		assertNotNull(star);
		AssertEquals("TYC 5949-277-1", star.getId());
	}
	
	@Test
	void testAddremoveSize() {
		StarsDatabase db = new StarsDatabase();
		Star sirius = new Star("Sirius", "TYC 5949-2777-1");
		db.add(sirius);
		db.add(new Star("Alpha Centauri", "TYC 9007-5849-1"));
		assertEquals(2, db.size());
		db.add(sirius);
		assertEquals("TYC 9007-5849-1", db.get(0).getId());
	}
	
	@Test
	void testFind() {
		StarsDatabase db = new StarsDatabase();
		db.add(new Star);
	}

}
