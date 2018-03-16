package Project02;

public class FauxWizard extends Project02.People {
    FauxWizard(String nation, String tribe, int lifePoints) {
        super(nation, tribe, PeopleType.warrior, lifePoints);
        myDescription = "\tFaux Wizard";
    }

    public int encounterStrategy(People otherPerson){
        return 0;
    }

}
