package Project02;

public class AndersonWizardStrategy implements EncounterStrategy {
    public AndersonWizardStrategy(){}

// Goal of wizards is to preserve life points to give to friendly warriors to last longest in battle.
    public int encounterStrategy(Project02.People me, Project02.People otherPerson) {
        int lifePoints = 0;
        if (me.getNation() == otherPerson.getNation()) {
            if (me.getTribe() == otherPerson.getTribe()) {
                lifePoints = -((int)(me.getLifePoints() / 8)); // Give life to warriors
            }
            else {
                lifePoints = 0;
            }
        }
        else {
            if (otherPerson.getType() == PeopleType.warrior) {
                lifePoints = -((int)me.getLifePoints()); // Run from warriors
            }
            else {
                if (me.getLifePoints() > otherPerson.getLifePoints()) {
                    lifePoints = (int)(me.getLifePoints() - otherPerson.getLifePoints()); // Attack weaker wizards
            }
                else {
                    lifePoints = -((int)me.getLifePoints()); // Run from wizards
                }
            }
        }
        return lifePoints;
    }
}

