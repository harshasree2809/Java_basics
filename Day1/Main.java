class Moon {
    
    String currentPhase;       
    double distanceFromEarth;  
    int orbitDays;         
    public Moon(String phase, double distance, int days) {
        this.currentPhase = phase;
        this.distanceFromEarth = distance;
        this.orbitDays = days;
    }

    public void matter() {
        System.out.println("Current Phase: " + currentPhase);
        System.out.println("Distance from Earth: " + distanceFromEarth + " km");
        System.out.println("Orbit Cycle: " + orbitDays + " days");
        System.out.println("The moon symbolizes cycles (time, life, feminine energy), intuition, the unconscious, guidance in darkness, and change, reflecting phases from new (infancy) to full (maturity) and waning (decline) in cultures worldwide. It's Earth's natural satellite, controlling tides, but also holds deep spiritual meaning, representing goddesses, divine feminine power (Maiden, Mother, Crone), and in Islam (with a star), representing faith, and in technology, signifying \"Do Not Disturb\" mode.");
    }
}

class Main {
    public static void main(String[] args) {
      
        Moon mn = new Moon("Full Moon", 384400.0, 27); 
        
        mn.matter();
    }
}
