package Project02;

public class FauxWarrior extends Project02.People {
    FauxWarrior(String nation, String tribe, int lifePoints) {
        super(nation, tribe, PeopleType.warrior, lifePoints);
        myDescription = "\tFaux Warrior";
    }

    public int encounterStrategy(People otherPerson){
        return 0;
    }
}
