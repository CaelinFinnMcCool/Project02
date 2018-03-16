package Project02;

public class FauxWizard extends People {
    FauxWizard(String nation, String tribe, int lifePoints) {
        super(nation, tribe, PeopleType.warrior, lifePoints);
        myDescription = "\tFaux Wizard";
    }

    public int encounterStrategy(People otherPerson){
        return FauxWizardStrategy.encounterStrategy(otherPerson);
    }

}
