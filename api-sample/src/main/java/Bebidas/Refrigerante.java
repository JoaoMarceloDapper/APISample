package Bebidas;
public class Refrigerante extends Bebidas {

    public Refrigerante(String nome, int ano) {
        super(nome, ano);
    }

    @Override
    public void abrir() {
        System.out.println("Refrigerante: *Tssss* - gás saindo ao abrir.");
    }

    @Override
    public void consumir() {
        System.out.println("Refrigerante: Doce, gaseificado e gelado.");
    }
}
