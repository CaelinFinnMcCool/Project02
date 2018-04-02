package Project02;

public class NischalDisplay implements Observer, TribeDisplay{
    
    private int NischaltotalLifeRemaining;
    private int NischaltribePopulation;

    private int NischalwarriorsLeft;
    private int NischalwizardsLeft;
    
    private TribeData tribeData;
    
    
    public NischalDisplay(TribeData tribeData){
        this.tribeData = tribeData;
        tribeData.registerObserver(this);
        
    }
    
    public void update(int NischalWarriorlifePointsremaining , int NischaltribePopulation, int NischalwarriorsLeft, int NischalwizardsLeft)
    // totalLifeRemaining, tribePopulation, warriorsLeft, wizardsLeft
    {
        
        this.NischaltotalLifeRemaining = NischaltotalLifeRemaining;
        this.NischaltribePopulation = NischaltribePopulation;
        this.NischalwarriorsLeft = NischalwarriorsLeft;
        this.NischalwizardsLeft = NischalwizardsLeft;
        
        display();
        
    }
    
    public void display(){
        System.out.println("The total no. of Nischal Warrior left: "+NischalwarriorsLeft);
        System.out.println("The total no. of Nischal Wizard left: "+NischalwizardsLeft);
        System.out.println("The total tribe population: "+NischaltribePopulation);
        System.out.println("The total lifepoints left: "+NischaltotalLifeRemaining);



        
        
        
        
        
    }
    
    

}
