package Project02;


public class McCoolWizard extends Project02.People
{
    McCoolWizard(String nation, String tribe, int lifePoints, EncounterStrategy strategy) {
        super(nation, tribe, PeopleType.wizard, lifePoints, strategy);
        myDescription = "\tMcCool Wizard";
    }

}

