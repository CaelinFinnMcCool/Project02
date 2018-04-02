package Project02;

public class AndersonWizard extends Project02.People {
    AndersonWizard(String nation, String tribe, int lifePoints, EncounterStrategy strategy) {
        super(nation, tribe, PeopleType.wizard, lifePoints, strategy);
        myDescription = "\tAnderson Wizard";
    }
}
