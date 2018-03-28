package Project02;

public class AndersonWarriorStrategy implements EncounterStrategy {
    public AndersonWarriorStrategy(){}

// Goal of warriors is to hit enemy hard while risking lots of life points in the process.
    public int encounterStrategy(Project02.People me, People otherPerson) {
        int lifePoints = 0;
        if(me.getNation() == otherPerson.getNation()) {
            if(me.getTribe() == otherPerson.getTribe()) {
                if(me.getLifePoints() >= 20 && otherPerson.getLifePoints() <= 20) {
                    lifePoints = -((int)(me.getLifePoints() * 0.75)); // Give lots of life
                }
            }
            else {
                lifePoints = 0;
            }
        }
        else {
            if(otherPerson.getType() == PeopleType.warrior) {
                if (me.getLifePoints() >= (otherPerson.getLifePoints() + 10)) {
                    lifePoints = (int) (-10 + me.getLifePoints()); // Attack without risking all lifePoints
                }
                else {
                    lifePoints = me.getLifePoints(); // Heavy Attack
                }
            }
            else {
                if (me.getLifePoints() > otherPerson.getLifePoints()) {
                    lifePoints = ((int)(me.getLifePoints() - 1)); // Heavy Attack2 against wizards
                }
                else {
                    lifePoints = me.getLifePoints(); // Heavy Attack
                }
            }
        }
        return lifePoints;
    }
}
