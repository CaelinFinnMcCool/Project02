/*
 package Project02;

import java.util.*;

public class TribeData implements Subject {
    private ArrayList observers;
    private int totalLifeRemaining;
    private int tribePopulation;
    private int warriorsLeft;
    private int wizardsLeft;
    
    public TribeData() {
        observers = new ArrayList();
    }
    
    public void registerObserver(Observer o) {
        observers.add(o);
    }
    
    public void removeObserver(Observer o) {
        int i = observers.indexOf(o);
        if (i >= 0) {
            observers.remove(i);
        }
    }
    
    public void notifyObservers() {
        for (int i = 0; i < observers.size(); i++) {
            Observer observer = (Observer)observers.get(i);
            observer.update(totalLifeRemaining, tribePopulation, warriorsLeft, wizardsLeft);
        }
    }
    
    public void measurementsChanged() {
        notifyObservers();
    }

    public void setMeasurements(int totalLifeRemaining, int tribePopulation, int warriorsLeft, int wizardsLeft) {
        this.totalLifeRemaining = totalLifeRemaining;
        this.tribePopulation = tribePopulation;
        this.warriorsLeft = warriorsLeft;
        this.wizardsLeft = wizardsLeft;
        measurementsChanged();
    }
}
 */
