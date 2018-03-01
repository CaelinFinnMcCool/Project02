package Project02;

public class NischalWarrior extends People{

    NischalWarrior(String nation, String tribe, int lifePoints) {
        super(nation, tribe, PeopleType.warrior, lifePoints);
        myDescription = "\tNischal Warrior";
    }

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



