package Project02;

public class NischalWizard extends Project02.People {
    NischalWizard(String nation, String tribe, int lifePoints, EncounterStrategy strategy) {
        super(nation, tribe, PeopleType.wizard, lifePoints, strategy);
        myDescription = "\tNischal Wizard";
    }
}





