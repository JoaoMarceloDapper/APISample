package Bebidas;

public class Cerveja extends Bebidas {

    public Cerveja(String nome, int ano) {
        super(nome, ano);
    }

    @Override
    public void abrir() {
        System.out.println("Cerveja: Desarrolhando a garrafa...");
    }

    @Override
    public void consumir() {
        System.out.println("Cerveja: Forte e encorpado. Bebido com moderação.");
    }
}
