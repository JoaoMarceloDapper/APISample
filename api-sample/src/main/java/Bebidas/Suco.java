package Bebidas;

public class Suco extends Bebidas {

    public Suco(String nome, int ano) {
        super(nome, ano);
    }

    @Override
    public void abrir() {
        System.out.println("Suco: Caixa ou garrafa aberta com facilidade.");
    }

    @Override
    public void consumir() {
        System.out.println("Suco: Natural e saboroso, ideal para o dia a dia.");
    }
}

