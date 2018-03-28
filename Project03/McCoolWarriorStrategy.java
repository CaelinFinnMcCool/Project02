package Project02;

public class McCoolWarriorStrategy implements EncounterStrategy
{
    public McCoolWarriorStrategy(){}

    public int encounterStrategy(People me, People otherPerson)
    {
        int lifePoints = 0;
        if(me.getNation() == otherPerson.getNation()) {
            return 0;
        }
        else {
            if (otherPerson.getType() == PeopleType.warrior && me.getLifePoints() - otherPerson.getLifePoints() > 0) {
                lifePoints = otherPerson.getLifePoints();
            }
            else if (otherPerson.getType() == PeopleType.warrior && me.getLifePoints() - otherPerson.getLifePoints() <= 0) {
                lifePoints = me.getLifePoints();
            }
            else if (otherPerson.getType() == PeopleType.wizard && me.getLifePoints() - otherPerson.getLifePoints() > 0) {
                lifePoints = (me.getLifePoints() / 2);
            }
            else {
                lifePoints = (otherPerson.getLifePoints() / 2);
            }
                
        }
        return lifePoints;
    }
    
}

