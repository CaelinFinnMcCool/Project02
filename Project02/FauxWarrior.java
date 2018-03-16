package Project02;

public class FauxWarrior extends Project02.People {
    FauxWarrior(String nation, String tribe, int lifePoints, EncounterStrategy strategy) {
        super(nation, tribe, PeopleType.warrior, lifePoints, strategy);
        myDescription = "\tFaux Warrior";
    }
}
