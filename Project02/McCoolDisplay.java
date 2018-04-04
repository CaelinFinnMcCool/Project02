package Project02;
import java.util.*;

public class McCoolDisplay implements Observer, TribeDisplay {
    private ArrayList<People> worldCreatedPeople;
    private World earth;
    
    public McCoolDisplay(World earth){
        this.earth = earth;
        earth.registerObserver(this);
    }
    public void update(ArrayList<People> worldCreatedPeople) {
        this.worldCreatedPeople = worldCreatedPeople;
        display();
    }
    
    public void display() {
        int tribeRemainingLifepoints = 0;
        int tribeMemberCount = 0;
        for (int i = 0; i < worldCreatedPeople.size(); i++) {
            if(worldCreatedPeople.get(i).getTribe().equals("Uzbekistan1")) {
                if(worldCreatedPeople.get(i).isPersonAlive()) {
                    //tribeRemainingLifepoints += worldCreatedPeople.get(i).getLifePoints();
                    tribeMemberCount++;
                }
            }
        }
        System.out.println("Remaining Uzbekistan1 tribe population: " + tribeMemberCount);
        //System.out.println("Total remaining Lifepoints of Berzerkistan1: " + 0);
    }
}

