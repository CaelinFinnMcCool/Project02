package Project02;


public class McCoolWizardStrategy implements EncounterStrategy
{
    public McCoolWizardStrategy(){}

    public int encounterStrategy(Project02.People me, Project02.People otherPerson) {
        int lifePoints = 0;
        if (me.getNation() != otherPerson.getNation()) {
            if (otherPerson.getType() == PeopleType.wizard) {
                lifePoints = ((me.getLifePoints()));
            }
            else {
                lifePoints = -(me.getLifePoints());
            }
        }
        else
        {
            if (otherPerson.getLifePoints() < me.getLifePoints()) {
                lifePoints = (int) (me.getLifePoints());
            }
            else {
                lifePoints = 0;
            }
        }
        return lifePoints;
    }
    
}

