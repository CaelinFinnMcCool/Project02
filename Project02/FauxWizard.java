package Project02;

public class FauxWizard extends People {
    String nation;
    String tribe;
    int lifePoints;

    FauxWizard(String nation, String tribe, int lifePoints)
    {
        super(nation, tribe, PeopleType.wizard, lifePoints);
        this.nation = nation;
        this.tribe = tribe;
        this.lifePoints = lifePoints;
        myDescription = "\tFaux Wizard";
    }

    public int encounterStrategy(Project02.People otherPerson) {
        int usedPoints = 0;

        if(this.nation == otherPerson.getNation()){
            if(this.tribe == otherPerson.getTribe()){
                if(otherPerson.myDescription.equals("warrior") && otherPerson.getLifePoints() > this.lifePoints){
                    usedPoints = -(lifePoints);
                }
            }
        }
        return usedPoints;
    }

}
