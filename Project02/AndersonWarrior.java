package Project02;


public class AndersonWarrior extends Project02.People {
    AndersonWarrior(String nation, String tribe, int lifePoints) {
        super(nation, tribe, PeopleType.warrior, lifePoints);
        myDescription = "\tAnderson Warrior";
    }

    public int encounterStrategy(People otherPerson){
        return 0;
    }
}
