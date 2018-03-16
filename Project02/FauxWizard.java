package Project02;

public class FauxWizard extends Project02.People {
    FauxWizard(String nation, String tribe, int lifePoints, EncounterStrategy strategy) {
        super(nation, tribe, PeopleType.warrior, lifePoints, strategy);
        myDescription = "\tFaux Wizard";
    }
}
