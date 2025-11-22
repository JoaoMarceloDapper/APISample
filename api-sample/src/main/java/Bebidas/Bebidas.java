package Bebidas;

public abstract class Bebidas {
    private String nome;
    private int ano;
    private static int contador = 0;

    public Bebidas(String nome, int ano) {
        this.nome = nome;
        this.ano = ano;
        contador++;
    }

    public String getNome() {
        return nome;
    }

    public int getAno() {
        return ano;
    }

    public static int getContador() {
        return contador;
    }

    public String getTipo() {
        return this.getClass().getSimpleName();
    }

    public abstract void abrir();
    public abstract void consumir();
}
