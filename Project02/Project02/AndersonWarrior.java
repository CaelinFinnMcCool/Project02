package Project02;


public class AndersonWarrior extends Project02.People {
    AndersonWarrior(String nation, String tribe, int lifePoints, EncounterStrategy strategy) {
        super(nation, tribe, PeopleType.warrior, lifePoints, strategy);
        myDescription = "\tAnderson Warrior";
    }
}
