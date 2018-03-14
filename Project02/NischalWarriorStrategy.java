package Project02;

public class NischalWarriorStrategy extends People{

    public int encounterStrategy(People otherPerson)
    {
        int lifePoints = 0;
        if(this.getNation() == otherPerson.getNation()) {
			return 0;

		}
		else {
			if (this.getTribe() != otherPerson.getTribe()) {
				if (this.getLifePoints() > otherPerson.getLifePoints()) {

					lifePoints = (this.getLifePoints() - otherPerson.getLifePoints()) / 2; //light attack
				} else {
					lifePoints = (otherPerson.getLifePoints() - this.getLifePoints()) / 2;
				}
			} else {
				lifePoints = otherPerson.getLifePoints()/2; //big-attack
			}
		}
        return lifePoints;
    }

}



