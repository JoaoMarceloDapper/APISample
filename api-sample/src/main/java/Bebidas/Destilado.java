package Bebidas;

public class Destilado extends Bebidas {

    public Destilado(String nome, int ano) {
        super(nome, ano);
    }

    @Override
    public void abrir() {
        System.out.println("Destilado: Desarrolhando a garrafa...");
    }

    @Override
    public void consumir() {
        System.out.println("Destilado: Forte e encorpado. Bebido com moderação.");
    }
}


