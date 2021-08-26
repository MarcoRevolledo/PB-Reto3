package reto.pkg3;

class Gorila extends Animal {

    public Gorila(double peso, double altura) {
        super(peso, altura);
    }

    @Override
    public double getIMC() {
        double pesoTotalAlimentos = Alimento.PesoTotalAlimentosIngeridos(alimsIngeridos);
        double imc = (peso + (pesoTotalAlimentos / 1000)) / (altura * altura);

        return imc;

    }

}
