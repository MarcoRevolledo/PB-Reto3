
package reto.pkg3;

public class Conejo extends Animal{
    
    private double longDientePrinc;

    public Conejo(double peso, double altura) {
        super(peso, altura);
    }

    public void setLongDientePrinc(double longDientePrinc) {
        this.longDientePrinc = longDientePrinc;
    }

    public double getLongDientePrinc() {
        return longDientePrinc;
    }
    
    
    
}
