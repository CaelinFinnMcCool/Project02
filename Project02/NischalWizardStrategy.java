package Project02;

public class NischalWizardStrategy implements EncounterStrategy {

	public int encounterStrategy(Project02.People otherPerson) {
		int lifePoints = 0;
		if (this.getNation() == otherPerson.getNation()) {
			if (this.getTribe() != otherPerson.getTribe()) {
				if (this.getLifePoints() < otherPerson.getLifePoints()) {

					lifePoints = (this.getLifePoints() - otherPerson.getLifePoints()) / 2; //heals
				} else {
					lifePoints = (otherPerson.getLifePoints() - this.getLifePoints()) / 2;//heals
				}

			} else {
				return 0;

			}


		} else {
			if (this.getTribe() != otherPerson.getTribe()) {
				lifePoints = otherPerson.getLifePoints(); //big attack
			} else {
				if (this.getLifePoints() > otherPerson.getLifePoints()) {

					lifePoints = (this.getLifePoints() - otherPerson.getLifePoints()) / 2; //light attack
				} else {
					lifePoints = (otherPerson.getLifePoints() - this.getLifePoints()) / 2; //light-attack
				}
			}
		}
		return lifePoints;
	}
}





