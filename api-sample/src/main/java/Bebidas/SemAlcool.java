package Bebidas;

public class SemAlcool extends Bebidas {

    public SemAlcool(String nome, int ano) {
        super(nome, ano);
    }

    @Override
    public void abrir() {
        System.out.println("Bebida sem álcool: Tampa de rosca aberta.");
    }

    @Override
    public void consumir() {
        System.out.println("Sem álcool: Refrescante, ideal para qualquer hora.");
    }
}
