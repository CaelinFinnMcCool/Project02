package Project02;

import Project02.People;
import Project02.PeopleType;

// Goal of wizards is to preserve life points to give to friendly warriors to last longest in battle.

public class AndersonWizard extends Project02.People {
    AndersonWizard(String nation, String tribe, int lifePoints) {
        super(nation, tribe, PeopleType.wizard, lifePoints);
        myDescription = "\tAnderson Wizard";
    }

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
            if (otherPerson() = PeopleType.warrior()) {
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
