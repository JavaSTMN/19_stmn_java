package exercice2;

public class Launcher {
	
	public static void showChildren(Seed p, int layer) throws Exception  {
		for (int i = 0; i < layer; ++i)
			System.out.print("--");
		
		System.out.println(p.toString());
		for (int i = 0; i < p.getNbElements(); ++i) 
			Launcher.showChildren(p.getElement(i), layer+1);
		
	}

	public static void main(String[] args) throws Exception {

		Seed uncommon = new Seed("Uncommon");
		uncommon.addElement(new Seed("Counterspell"));

		Seed rare = new Seed("Rare");
		rare.addElements(new Seed[] { new Seed("Preparation"), new Seed("Book of Specters") });

		Seed legendary = new Seed("Legendary");
		legendary.addElement(new Seed("Raid the Sky Temple"));

		Seed library = new Seed("Library");
		library.addElements(new Seed[] { uncommon, rare, legendary });
		
		
		Launcher.showChildren(library, 0);
		
		
		System.out.println(uncommon.serialize());
	}

}
