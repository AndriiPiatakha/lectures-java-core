package patterns.creationalpatterns.abstractfactory.squadbuilder;

public class Client {

	private SquadronFactory factory;
	
	private Mage mage;
	private Archer archer;
	private Warrior warrior;

	public Client(SquadronFactory factory) {
		this.factory = factory;
	}

	public static void main(String[] args) {
		SquadronFactory factory = new ElfSquadronFactory();
		Client client = new Client(factory);
		
		client.createSquadron(factory);
		client.createSquadron();

	}

	private void createSquadron(SquadronFactory factory) {
		this.mage = factory.createMage();
		this.archer = factory.createArcher();
		this.warrior = factory.createWarrior();
	}
	
	private void createSquadron() {
		this.mage = this.factory.createMage();
		this.archer = this.factory.createArcher();
		this.warrior = this.factory.createWarrior();
	}
	
	public void setFactory(SquadronFactory factory) {
		this.factory = factory;
	}

}
