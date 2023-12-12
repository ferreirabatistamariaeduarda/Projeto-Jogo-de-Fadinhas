public class Fada {
    private String nome;
    private int vida;

    public Fada(String nome, int vida) {
        this.nome = nome;
        this.vida = vida;
    }

    public String getNome() {
        return nome;
    }

    public int getVida() {
        return vida;
    }

    public void setVida(int vida) {
        this.vida = vida;
    }

    public void usarPoder(Fada alvo) {
        //poderes
    }
}