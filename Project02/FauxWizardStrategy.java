package Project02;

public class FauxWizardStrategy implements EncounterStrategy{
    public FauxWizardStrategy

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
