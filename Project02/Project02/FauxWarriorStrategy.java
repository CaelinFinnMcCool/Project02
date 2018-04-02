package Project02;

public class FauxWarriorStrategy implements EncounterStrategy {
    public FauxWarriorStrategy(){}

    public int encounterStrategy(Project02.People me, People otherPerson){
        int usedPoints = 0;

        if(me.getNation() == otherPerson.getNation()){
            if(me.getTribe() == otherPerson.getTribe()){
                if(otherPerson.myDescription.equals("warrior") && otherPerson.getLifePoints() >= me.getLifePoints()){
                    usedPoints = -((me.getLifePoints()) - 2);
                }
            }
        }
        else{
            if(otherPerson.getLifePoints() > me.getLifePoints() && me.getLifePoints() > 10)
                usedPoints = 0;
            else if(me.getLifePoints() < 10)
                usedPoints = (me.getLifePoints() / 2);
            else {
                usedPoints = otherPerson.getLifePoints();
            }
        }

        return usedPoints;
    }
}
