package Project02;

import Project02.People;
import Project02.PeopleType;


public class McCoolWarrior extends People
{
    McCoolWarrior(String nation, String tribe, int lifePoints)
    {
        super(nation, tribe, PeopleType.warrior, lifePoints);
        myDescription = "\tMcCool Warrior";
    }
    
    public int encounterStrategy(People otherPerson)
    {
        int lifePoints = 0;
        if(this.getNation() == otherPerson.getNation()) {
            return 0;
        }
        else {
            if (this.getType() == otherPerson.getType() && this.getLifePoints() - otherPerson.getLifePoints() > 0) {
                lifePoints = otherPerson.getLifePoints();
            }
            else if (this.getType() == otherPerson.getType() && this.getLifePoints() - otherPerson.getLifePoints() <= 0) {
                lifePoints = this.getLifePoints();
            }
            else if (this.getType() != otherPerson.getType() && this.getLifePoints() - otherPerson.getLifePoints() > 0) {
                lifePoints = (this.getLifePoints() / 2);
            }
            else {
                lifePoints = (otherPerson.getLifePoints() / 2);
            }
                
        }
        return lifePoints;
    }
    
}

