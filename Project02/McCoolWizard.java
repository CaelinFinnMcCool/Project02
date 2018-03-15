package Project02;


public class McCoolWizard extends Project02.People
{
    McCoolWizard(String nation, String tribe, int lifePoints) {
        super(nation, tribe, PeopleType.warrior, lifePoints);
        myDescription = "\tMcCool Wizard";
    }
}

