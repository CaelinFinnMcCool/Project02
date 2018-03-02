package Project02;
import java.util.Collection;
import java.util.Collections;
import java.io.StringBufferInputStream;
import java.util.ArrayList;
import Project02.People;
import Project02.PeopleType;
//import Project02.SchaperWarrior;
//import Project02.SchaperWizard;
import Project02.McCoolWarrior;
import Project02.McCoolWizard;
import Project02.FauxWarrior;
import Project02.FauxWizard;
import Project02.AndersonWarrior;
import Project02.AndersonWizard;
import Project02.NischalWarrior;
import Project02.NischalWizard;

public class Tribe
{
    private String nationName;
    private String tribeName;
    private int tribeLifePoints;
    private ArrayList<People> members = new ArrayList<>();
    private ArrayList<People> livingMembers = new ArrayList<>();

    public Tribe(String nation, String tribe, int lifePoints)
    {
            nationName = nation;
            tribeName = tribe;
            tribeLifePoints = lifePoints;
            if(tribe == "Uzbekistan1")
                for(int i = 0; i < 5; i++)
                    if(i % 2 == 0)
                        members.add(new McCoolWarrior(nationName, tribeName, tribeLifePoints / 5));
                    else
                        members.add(new McCoolWizard(nationName, tribeName, tribeLifePoints / 5));
            if(tribe == "Uzbekistan2")
                for(int i = 0; i < 5; i++)
                    if(i % 2 == 0)
                        members.add(new FauxWarrior(nationName, tribeName, tribeLifePoints / 5));
                    else
                        members.add(new FauxWizard(nationName, tribeName, tribeLifePoints / 5));
            if(tribe == "Berzerkistan1")
                for(int i = 0; i < 8; i++)
                    if(i % 8 == 0)
                        members.add(new AndersonWarrior(nationName, tribeName, tribeLifePoints / 8));
                    else
                        members.add(new AndersonWizard(nationName, tribeName, tribeLifePoints / 8));
            if(tribe == "Berzerkistan2")
                for(int i = 0; i < 5; i++)
                    if(i % 2 == 0)
                        members.add(new NischalWarrior(nationName, tribeName, tribeLifePoints / 5));
                    else
                        members.add(new NischalWizard(nationName, tribeName, tribeLifePoints / 5));
            for(int i = 0; i < members.size(); i++)
                livingMembers.addAll(members);
    }

    public ArrayList<People> getLivingTribeMembers()
    {
        livingMembers.clear();
        tribeLifePoints = 0;
        for(int person = 0; person < members.size(); person++)
        {
            if(members.get(person).isPersonAlive())
            {
                livingMembers.add(members.get(person));
                tribeLifePoints += members.get(person).getLifePoints();
                //System.out.println(members.get(person));
            }
            else
            {
                if(!(members.get(person).getDead()))
                {
                    members.get(person).setDead();
                    System.out.println("\t\t" + members.get(person) + " is dead!");
                }
            }
        }
        //System.out.println(livingMembers);
        return livingMembers;
    }
    /*
    public void printMembers()
    {
        for(int i = 0; i < 2; i++)
        {
            System.out.println(people.get(i));
        }
    }
*/


    public int getTribeSize()
    {
        return livingMembers.size();
    }

    public Boolean isTribeAlive()
    {
        return (tribeLifePoints > 0);
    }


    public int getTribeLifePoints()
    {
        return tribeLifePoints;
    }

    public String getTribeName()
    {
        return tribeName;
    }

    public String toString()
    {
        String result = "\0";

        result = tribeName;
        for(int i = 0; i < members.size(); i++)
        {
            result = result + '\n' + members.get(i).toString();
        }
        result = result + '\n';
        return result;
    }

}
