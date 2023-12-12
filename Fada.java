// Classe base para personagem
class Fada{
    private String nome;
    private int vida;
    private Poder poder;

    // Construtor para inicializar os atributos do personagem
    public Fada(String nome, int vida, Poder poder) {
        this.nome = nome;
        this.vida = vida;
        this.poder = poder;
    }

    // Método para obter o nome do personagem
    public String getNome() {
        return nome;
    }

    // Método para obter a vida atual do personagem
    public int getVida() {
        return vida;
    }

    // Método para ajustar a vida do personagem
    public void setVida(int vida) {
        this.vida = vida;
    }

    // Método para obter o poder do personagem
    public Poder getPoder() {
        return poder;
    }

    // Método para realizar um ataque ao alvo usando o poder
    public void atacar(Fada alvo) {
        int dano = poder.calcularDano();
        alvo.receberDano(dano);
        System.out.println(nome + " atacou " + alvo.getNome() + " causando " + dano + " de dano.");
    }

    // Método para processar o dano recebido e ajustar a vida
    private void receberDano(int dano) {
        vida -= dano;
        if (vida < 0) {
            vida = 0;
        }
        System.out.println(nome + " recebeu " + dano + " de dano. Vida restante: " + vida);
    }
}