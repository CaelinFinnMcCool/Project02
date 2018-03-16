package Project02;


public class McCoolWarrior extends Project02.People
{
    McCoolWarrior(String nation, String tribe, int lifePoints) {
        super(nation, tribe, PeopleType.warrior, lifePoints);
        myDescription = "\tMcCool Warrior";
    }

    public int encounterStrategy(People otherPerson){
        return 0;
    }
    
}

