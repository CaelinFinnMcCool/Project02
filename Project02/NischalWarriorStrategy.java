package Project02;

public class NischalWarriorStrategy implements EncounterStrategy{
    public NischalWarriorStrategy(){}

    public int encounterStrategy(Project02.People me, People otherPerson)
    {
        int lifePoints = 0;
        if(me.getNation() == otherPerson.getNation()) {
			return 0;

		}
		else {
			if (me.getTribe() != otherPerson.getTribe()) {
				if (me.getLifePoints() > otherPerson.getLifePoints()) {

					lifePoints = (me.getLifePoints() - otherPerson.getLifePoints()) / 2; //light attack
				} else {
					lifePoints = (otherPerson.getLifePoints() - me.getLifePoints()) / 2;
				}
			} else {
				lifePoints = otherPerson.getLifePoints()/2; //big-attack
			}
		}
        return lifePoints;
    }

}



