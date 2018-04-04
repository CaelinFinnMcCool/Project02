package Project02;
import Project02.People;
import Project02.World;
import Project02.Nation;
import java.util.*;

public class AndersonDisplay implements Observer {

    public AndersonDisplay(World earth){
        this.earth = earth;
        earth.registerObserver(this);
}

    public void update(ArrayList<People> worldCreatedPeople) {
        this.worldCreatedPeople = worldCreatedPeople;
        display();
    }
    
    public void display() {
        int tribeMemberCount = 0;
        for (int i = 0; i < worldCreatedPeople.size(); i++) {
            if(worldCreatedPeople.get(i).getTribe().equals("Berzerkistan1")) {
                if(worldCreatedPeople.get(i).isPersonAlive()) {
                    tribeMemberCount++;
                }
            }
        }
        System.out.println("Remaining tribe population: " + tribeMemberCount);
        System.out.println("Remaining number of Berzerkistan1 Warriors alive: " + 0);
        System.out.println("Remaining number of Berzerkistan2 Wizards alive: " + 0);
        System.out.println("Total remaining Lifepoints of Berzerkistan1: " + 0);
    }
}
