package Project02;

public class NischalWarrior extends Project02.People{
    NischalWarrior(String nation, String tribe, int lifePoints, EncounterStrategy strategy) {
        super(nation, tribe, PeopleType.warrior, lifePoints, strategy);
        myDescription = "\tNischal Warrior";
    }

}



