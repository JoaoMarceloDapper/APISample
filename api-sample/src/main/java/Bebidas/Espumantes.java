package Bebidas;

public class Espumantes extends Bebidas {

    public Espumantes(String nome, int ano) {
        super(nome, ano);
    }

    @Override
    public void abrir() {
        System.out.println("Espumantes: Desarrolhando a garrafa...");
    }

    @Override
    public void consumir() {
        System.out.println("Espumantes: Forte e encorpado. Bebido com moderação.");
    }
}


