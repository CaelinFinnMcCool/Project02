package Project02;

public class FauxWarrior extends People {
    String nation;
    String tribe;
    int lifePoints;

    FauxWarrior(String nation, String tribe, int lifePoints){
        super(nation, tribe, PeopleType.warrior, lifePoints);
        this.nation = nation;
        this.tribe = tribe;
        this.lifePoints = lifePoints;
        myDescription = "\tFaux Warrior";
    }
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
