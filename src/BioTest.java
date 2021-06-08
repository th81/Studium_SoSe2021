import uebung_01.Animal;
import uebung_01.Plant;

/*public class BioTest{

	public static void main(String[] args) {
		Plant grass = new Plant("Grass");
		Plant berry = new Plant("Berry");
		
		Animal zebra = new Animal("Zebra");
		Animal lion = new Animal("Lion");
		Animal bear = new Animal("Bear");
		Animal fish = new Animal("Fish");
		
		grass.setDescription("green");
		berry.setDescription("red");
		
		zebra.addPlantFood(grass);
		lion.addAnimalFood(zebra);
		bear.addPlantFood(berry);
		bear.addAnimalFood(fish);
		
		printAnimalDiet(zebra);
		printAnimalDiet(lion);
		printAnimalDiet(bear);
	}
	
	private static void printAnimalDiet(Animal animal) {
		
		System.out.println(animal.getName() + " is " + getArticleFor(animal.getDiet())+" " + animal.getDiet() + ".");
	}
	
	private static String getArticleFor(String word) {
		String[] vocals = {"a", "e", "i", "o", "u"};
		for (int i = 0; i < vocals.length; i++) {
			if (word.startsWith(vocals[i])) {
				return "an";
			}
		}
		
		return "a";
	}
}*/
