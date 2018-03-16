package Project02;


public class McCoolWizardStrategy implements EncounterStrategy
{
    public McCoolWizardStrategy(){}

    public int encounterStrategy(Project02.People otherPerson) {
        int lifePoints = 0;
        if (this.getNation() != otherPerson.getNation()) {
            if (otherPerson.getType() == PeopleType.wizard) {
                lifePoints = ((this.getLifePoints()));
            }
            else {
                lifePoints = -(this.getLifePoints());
            }
        }
        else
        {
            if (otherPerson.getLifePoints() < this.getLifePoints()) {
                lifePoints = (int) (this.getLifePoints());
            }
            else {
                lifePoints = 0;
            }
        }
        return lifePoints;
    }
    
}

