package uebung_02;


/**
 * Represents an collectuin of Stars.
 */

public class StarsDatabase {
	
	private Star[] stars = new Star[0];
	
	/**
	 * Add a new star to the database.
	 * @param star The star to be added
	 */
	public void add (Star star) {
		star.setDatabase(this);
		Star[] tmp = new Star [stars.length + 1];
		for (int i= 0; i < stars.length; i++) {
			tmp[i] = stars [i];
		}
		tmp[stars.length] = star;
		stars = tmp;
	}
	
	/**
	 * Remove an existing star from the database
	 * Fails if the index is out of range.
	 * @param index The index of the star to be removed
	 */
	public void remove(int index) {
		Star[] tmp = new Star[stars.length - 1];
		int j = 0;
		for (int i = 0; i < stars.length; i++) {
			if (i != index) {
				tmp[j] = stars[i];
				j++;
			}
		}
		stars = tmp;
	}
	/**
	 * Retrieves a star from the database. Fails if the index is out of range.
	 * @param index The index of the star to be retrieved
	 * @return the star at the given index
	 */
	
	public Star get(int index) {
		return stars[index];
	}
	
	/**
	 * Returns the size of the database.
	 * @return The number of entries in the database
	 */
	public int size() {
		return stars.length;
	}
	
	/**
	 * Retuns the star with the given id if it is in the database, 
	 * null otherwise. 
	 * @param id The id of the star to be retrieved
	 * @return The star with the given id, or null no such star is in the database.
	 */
	public Star find(String id) {
		for (Star star : stars) {
			if (star.getId().equals(id)) {
				return star;
			}
		}
		return null;
	}
	
}
