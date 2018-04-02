package Project02;


public class McCoolWarrior extends Project02.People
{
    McCoolWarrior(String nation, String tribe, int lifePoints, EncounterStrategy strategy) {
        super(nation, tribe, PeopleType.warrior, lifePoints, strategy);
        myDescription = "\tMcCool Warrior";
    }
}

