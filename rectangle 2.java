public abstract class rectangle{
    
    private double largeur;
    private double longueur;

    public Rectangle(double larg, double longueur) {
        this.largeur = larg;
        this.longueur = longueur;
    }

    public double surface() {
        return largeur * longueur;
    }
    public double perimetre() {
        return (largeur + longueur)*2;
    public double demiperimetre() {
        return (perimetre/2)

    public double getLongueur() {
        return longueur;
    }

    public double getLargeur() {
        return largeur;
    }

    public void setLargeur(double 1) {
        largeur = 1;
    }

    public void setLongueur(double l) {
        longueur = l;
    }
}