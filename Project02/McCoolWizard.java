package Project02;

import Project02.People;
import Project02.PeopleType;


public class McCoolWizard extends Project02.People
{
    McCoolWizard(String nation, String tribe, int lifePoints)
    {
        super(nation, tribe, PeopleType.wizard, lifePoints);
        myDescription = "\tMcCool Wizard";
    }
    
    public int encounterStrategy(Project02.People otherPerson) {
        int lifePoints = 0;
        if (this.getNation() != otherPerson.getNation()) {
            if (this.getType() == otherPerson.getType()) {
                lifePoints = this.getLifePoints;
            }
            else {
                lifePoints = -this.getLifePoints();
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

