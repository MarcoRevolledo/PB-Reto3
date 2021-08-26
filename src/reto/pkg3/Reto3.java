
package reto.pkg3;


public class Reto3 {

       public static void main(String[] args) {
    
        Alimento banana = new Alimento(120);
        Alimento raices = new Alimento(60);
        Alimento platano = new Alimento(78.5);
        Gorila gorila = new Gorila(150.5, 1.67);

        Alimento alimsingeridos[] = new Alimento[3];
        alimsingeridos[0] = banana;
        alimsingeridos[1] = raices;
        alimsingeridos[2] = platano;
        gorila.setAlimsIngeridos(alimsingeridos);

        System.out.println(gorila.getPeso());
        System.out.println(gorila.getPesoAlims());        
        System.out.println(Math.round(gorila.getIMC()));
        
       }
    
}
