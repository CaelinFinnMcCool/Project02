package Project02;

public class NischalWarrior extends Project02.People{
    NischalWarrior(String nation, String tribe, int lifePoints) {
        super(nation, tribe, PeopleType.warrior, lifePoints);
        myDescription = "\tNischal Warrior";
    }

    public int encounterStrategy(People otherPerson){
        return 0;
    }


}



