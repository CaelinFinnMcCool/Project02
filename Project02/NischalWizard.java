package Project02;

public class NischalWizard extends Project02.People {
    NischalWizard(String nation, String tribe, int lifePoints) {
        super(nation, tribe, PeopleType.warrior, lifePoints);
        myDescription = "\tNischal Wizard";
    }

    public int encounterStrategy(People otherPerson){
        return NischalWizardStrategy.encounterStrategy(otherPerson);
    }

}





