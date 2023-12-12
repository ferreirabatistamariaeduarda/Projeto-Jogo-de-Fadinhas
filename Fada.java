class Fada {
    private String nome;
    private int vida;
    private Poder poder;
    private Poder poderEspecial;
    private boolean poderEspecialDisponivel;

    public Fada(String nome, int vida, Poder poder, Poder poderEspecial) {
        this.nome = nome;
        this.vida = vida;
        this.poder = poder;
        this.poderEspecial = poderEspecial;
        this.poderEspecialDisponivel = true; // O poder especial está disponível no início
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

    public void usarPoderEspecial() {
    }
}