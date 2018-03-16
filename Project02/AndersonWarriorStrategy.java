package Project02;

public class AndersonWarriorStrategy implements EncounterStrategy {
    public AndersonWarriorStrategy(){}

// Goal of warriors is to hit enemy hard while risking lots of life points in the process.
    public int encounterStrategy(People otherPerson) {
        int lifePoints = 0;
        if(this.getNation() == otherPerson.getNation()) {
            if(this.getTribe() == otherPerson.getTribe()) {
                if(this.getLifePoints() >= 20 && otherPerson.getLifePoints() <= 20) {
                    lifePoints = -((int)(this.getLifePoints() * 0.75)); // Give lots of life
                }
            }
            else {
                lifePoints = 0;
            }
        }
        else {
            if(otherPerson.getType() == PeopleType.warrior) {
                if (this.getLifePoints() >= (otherPerson.getLifePoints() + 10)) {
                    lifePoints = (int) (10 - this.getLifePoints()); // Attack without risking all lifePoints
                }
                else {
                    lifePoints = this.getLifePoints(); // Heavy Attack
                }
            }
            else {
                if (this.getLifePoints() > otherPerson.getLifePoints()) {
                    lifePoints = ((int)(this.getLifePoints() - 1)); // Heavy Attack2 against wizards
                }
                else {
                    lifePoints = this.getLifePoints(); // Heavy Attack
                }
            }
        }
        return lifePoints;
    }
}
