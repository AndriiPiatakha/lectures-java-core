package patterns.creationalpatterns.abstractfactory.squadbuilder;

public abstract class SquadronFactory {
	public abstract Mage createMage();

	public abstract Archer createArcher();

	public abstract Warrior createWarrior();
}
