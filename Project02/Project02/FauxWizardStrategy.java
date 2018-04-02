package Project02;

public class FauxWizardStrategy implements EncounterStrategy{
    public FauxWizardStrategy(){}

    public int encounterStrategy(Project02.People me, Project02.People otherPerson) {
        int usedPoints = 0;

        if(me.getNation() == otherPerson.getNation()){
            if(me.getTribe() == otherPerson.getTribe()){
                if(otherPerson.myDescription.equals("warrior") && otherPerson.getLifePoints() > me.getLifePoints()){
                    usedPoints = -(me.getLifePoints());
                }
            }
        }
        return usedPoints;
    }

}
