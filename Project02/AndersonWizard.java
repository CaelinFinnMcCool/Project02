package Project02;

public class AndersonWizard extends Project02.People {
    AndersonWizard(String nation, String tribe, int lifePoints) {
        super(nation, tribe, PeopleType.wizard, lifePoints);
        myDescription = "\tAnderson Wizard";
    }

    public int encounterStrategy(People otherPerson){
        return 0;
    }
}
