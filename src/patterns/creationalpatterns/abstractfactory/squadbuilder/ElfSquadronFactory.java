package patterns.creationalpatterns.abstractfactory.squadbuilder;

import java.util.List;

import com.piatakha.lectures.creationalpatterns.abstractfactory.squadbuilder.elfsquade.ElfMage;

import patterns.creationalpatterns.abstractfactory.squadbuilder.elfsquade.ElfArcher;
import patterns.creationalpatterns.abstractfactory.squadbuilder.elfsquade.ElfWarrior;

public class ElfSquadronFactory extends SquadronFactory {
	public Mage createMage() {
		return new ElfMage();
	}

	public Archer createArcher() {
		return new ElfArcher();
	}

	public Warrior createWarrior() {
		return new ElfWarrior();
	}
	

}
