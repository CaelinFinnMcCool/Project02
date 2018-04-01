public class FauxDisplay implements Observer, TribeDisplay {
    private int totalLifeRemaining;
    private int tribePopulation;
    private int warriorsLeft;
    private int wizardsLeft;

    public FauxDisplay()

    public void update(int totalLifeRemaining, int tribePopulation, int warriorsLeft, int wizardsLeft) {
        this.totalLifeRemaining = totalLifeRemaining;
        this.tribePopulation = tribePopulation;
        this.warriorsLeft = warriorsLeft;
        this.wizardsLeft = wizardsLeft;
        display();
    }
    
    public void display() {
        System.out.println(“The Fauxtribe has “ + tribePopulation + “ with “ + 			totalLifeRemaining + “ life points remaining”);
	System.out.println(“There are “ + warriorsLeft + “ FauxWarriors left”);
	System.out.println(“There are “ + wizardsLeft + “ FauxWizards left”);
    }
}