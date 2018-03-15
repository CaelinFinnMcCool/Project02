package Project02;

public class FauxWarriorStrategy implements EncounterStrategy {

    public int encounterStrategy(People otherPerson){
        int usedPoints = 0;

        if(this.nation == otherPerson.getNation()){
            if(this.tribe == otherPerson.getTribe()){
                if(otherPerson.myDescription.equals("warrior") && otherPerson.getLifePoints() >= this.lifePoints){
                    usedPoints = -(lifePoints - 2);
                }
            }
        }
        else{
            if(otherPerson.getLifePoints() > this.lifePoints && this.lifePoints > 10)
                usedPoints = 0;
            else if(lifePoints < 10)
                usedPoints = this.lifePoints / 2;
            else {
                usedPoints = otherPerson.getLifePoints();
            }
        }

        return usedPoints;
    }
}
