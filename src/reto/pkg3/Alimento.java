
package reto.pkg3;


public class Alimento {
    
    private double gramos;

    public Alimento(double gramos) {
        this.gramos = gramos;
    }
 

    public void setGramos(double gramos) {
        this.gramos = gramos;
    }
    
    public double getGramos() {
        return gramos;
    }
    
    public static double PesoTotalAlimentosIngeridos(Alimento alimsIngeridos[]) {
       double total=0;
    
        for (Alimento alimsIngerido : alimsIngeridos) {
            total+=alimsIngerido.gramos;
        }
       
       return total;
    }
    
}
