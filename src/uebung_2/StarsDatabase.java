package uebung_2;

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
}
