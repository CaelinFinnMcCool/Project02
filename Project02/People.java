package Project02;

public class People
{
    private String personName;
    private String myNation;
    private String myTribe;
    private PeopleType me;
    protected String myDescription;
    private int myLifePoints;
    private boolean dead;
    private EncounterStrategy strategy;


    public People(String nation, String tribe, PeopleType person, int lifePoints, EncounterStrategy playerStrategy)
    {
        myNation = nation;
        myTribe = tribe;
        me = person;
        myDescription = me.getDescription();
        myLifePoints = lifePoints;
        dead = false;
        strategy = playerStrategy;
    }

    public void setDead()
    {
        dead = true;
    }

    public boolean getDead()
    {
        return dead;
    }

    public PeopleType getType()
    {
        return me;
    }

    public String getTribe()
    {
        return myTribe;
    }

    public String getNation()
    {
        return myNation;
    }

    public Boolean isPersonAlive()
    {
        return (myLifePoints > 0);
    }

    public int getLifePoints()
    {
        return myLifePoints;
    }

    public void modifyLifePoints(int points)
    {
        myLifePoints += points;
    }


    public int encounterStrategy(People otherPerson)
    {
	return this.strategy.encounterStrategy(this, otherPerson);
    }

    public String toString()
    {
        String result = new String( myNation + "\t" +  myTribe + "\t" + me + "\t" + myDescription + "\t" + myLifePoints);
        return result;
    }
}

