package reto.pkg3;

public class Animal {

    protected double peso;
    protected double altura;
    protected Alimento alimsIngeridos[];

    public Animal(double peso, double altura) {
        this.peso = peso;
        this.altura = altura;
    }

    public void setPeso(double peso) {
        this.peso = peso;
    }

    public void setAltura(double altura) {
        this.altura = altura;
    }

    public void setAlimsIngeridos(Alimento[] alimsIngeridos) {
        this.alimsIngeridos = alimsIngeridos;
    }

    public double getPeso() {
        return peso;
    }

    public double getAltura() {
        return altura;
    }

    public Alimento[] getAlimsIngeridos() {
        return alimsIngeridos;
    }

    public double getIMC() {
        double imc = peso / (altura * altura);
        return imc;

    }

    public double getPesoAlims() {
        double pesoTotal = Alimento.PesoTotalAlimentosIngeridos(alimsIngeridos);
        return pesoTotal;
    }

}
