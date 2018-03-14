package Project02;

public class AndersonWizardStrategy extends People {

// Goal of wizards is to preserve life points to give to friendly warriors to last longest in battle.
    public int encounterStrategy(Project02.People otherPerson) {
        int lifePoints = 0;
        if (this.getNation() == otherPerson.getNation()) {
            if (this.getTribe() == otherPerson.getTribe()) {
                lifePoints = -((int)(this.getLifePoints() / 8)); // Give life to warriors
            }
            else {
                lifePoints = 0;
            }
        }
        else {
            if (otherPerson.getType() == PeopleType.warrior) {
                lifePoints = -((int)this.getLifePoints()); // Run from warriors
            }
            else {
                if (this.getLifePoints() > otherPerson.getLifePoints()) {
                    lifePoints = (int)(this.getLifePoints() - otherPerson.getLifePoints()); // Attack weaker wizards
            }
                else {
                    lifePoints = -((int)this.getLifePoints()); // Run from wizards
                }
            }
        }
        return lifePoints;
    }
}

