package Project02;

public class NischalWizardStrategy implements EncounterStrategy {
       public NischalWizardStrategy(){}

	public int encounterStrategy(Project02.People me, Project02.People otherPerson) {
		int lifePoints = 0;
		if (me.getNation() == otherPerson.getNation()) {
			if (me.getTribe() != otherPerson.getTribe()) {
				if (me.getLifePoints() < otherPerson.getLifePoints()) {

					lifePoints = (me.getLifePoints() - otherPerson.getLifePoints()) / 2; //heals
				} else {
					lifePoints = (otherPerson.getLifePoints() - me.getLifePoints()) / 2;//heals
				}

			} else {
				return 0;

			}


		} else {
			if (me.getTribe() != otherPerson.getTribe()) {
				lifePoints = otherPerson.getLifePoints(); //big attack
			} else {
				if (me.getLifePoints() > otherPerson.getLifePoints()) {

					lifePoints = (me.getLifePoints() - otherPerson.getLifePoints()) / 2; //light attack
				} else {
					lifePoints = (otherPerson.getLifePoints() - me.getLifePoints()) / 2; //light-attack
				}
			}
		}
		return lifePoints;
	}
}





