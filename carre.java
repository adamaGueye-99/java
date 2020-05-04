public abstract class carre{
    
    private double cote;
   

    public carre( double cote) {
        this.cote = cote;
        
    }

    public double surface() {
        return cote * cote;
    }
    public double perimetre() {
        return (cote*4);
   
    public double getCote() {
        return cote;
    }
