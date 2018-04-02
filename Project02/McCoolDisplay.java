package Project02;

public class McCoolDisplay implements Observer, TribeDisplay {
    private int totalLifeRemaining;
    private int tribePopulation;
    private int warriorsLeft;
    private int wizardsLeft;
    
    public McCoolDisplay(TribeData tribeData){
        this.tribeData = tribeData;
        tribeData.registerObserver(this);
        
    }
    public void update(int totalLifeRemaining, int tribePopulation, int warriorsLeft, int wizardsLeft) {
        this.totalLifeRemaining = totalLifeRemaining;
        this.tribePopulation = tribePopulation;
        this.warriorsLeft = warriorsLeft;
        this.wizardsLeft = wizardsLeft;
        display();
    }
    
    public void display() {
        System.out.println(“The McCool tribe has “ + tribePopulation + “ with “ + totalLifeRemaining + “ life points remaining.”);
        System.out.println(“There are “ + warriorsLeft + “ McCool Warriors left.”);
        System.out.println(“There are “ + wizardsLeft + “ McCool Wizards left.”);
    }
}

