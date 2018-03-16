package Project02;


public class McCoolWarrior extends People
{
    McCoolWarrior(String nation, String tribe, int lifePoints) {
        super(nation, tribe, PeopleType.warrior, lifePoints);
        myDescription = "\tMcCool Warrior";
    }

    public int encounterStrategy(People otherPerson){
        return McCoolWarriorStrategy.encounterStrategy(otherPerson);
    }
    
}

