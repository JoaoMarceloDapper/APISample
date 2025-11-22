package Bebidas;


public class Vinho extends Bebidas {

    public Vinho(String nome, int ano) {
        super(nome, ano);
    }

    @Override
    public void abrir() {
        System.out.println("Vinho: Abrindo com o saca-rolhas...");
    }

    @Override
    public void consumir() {
        System.out.println("Vinho: Apreciado lentamente, com notas frutadas.");
    }
}
