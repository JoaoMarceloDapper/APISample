package Bebidas;

public class Agua extends Bebidas {

    public Agua(String nome, int ano) {
        super(nome, ano);
    }

    @Override
    public void abrir() {
        System.out.println("Água: Tampa girada sem esforço.");
    }

    @Override
    public void consumir() {
        System.out.println("Água: Essencial, pura e hidratante.");
    }
}
