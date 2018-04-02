package Project02;

public class AndersonDisplay implements Observer, TribeDisplay {
    private int totalLifeRemaining;
    private int tribePopulation;
    private int warriorsLeft;
    private int wizardsLeft;

    public AndersonDisplay()

    public void update(int totalLifeRemaining, int tribePopulation, int warriorsLeft, int wizardsLeft) {
        this.totalLifeRemaining = totalLifeRemaining;
        this.tribePopulation = tribePopulation;
        this.warriorsLeft = warriorsLeft;
        this.wizardsLeft = wizardsLeft;
        display();
    }
    
    public void display() {
        System.out.println("Remaining number of Berzerkistan1 Warriors alive: " + warriorsLeft);
        System.out.println("Remaining number of Berzerkistan2 Wizards alive: " + wizardsLeft);
        System.out.println("Remaining tribe population: " + tribePopulation);
        System.out.println("Total remaining Lifepoints of Berzerkistan1: " + totalLifeRemaining);
    }
}
