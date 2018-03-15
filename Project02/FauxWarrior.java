package Project02;

public class FauxWarrior extends People {
    FauxWarrior(String nation, String tribe, int lifePoints) {
        super(nation, tribe, PeopleType.warrior, lifePoints);
        myDescription = "\tFaux Warrior";
    }
}
