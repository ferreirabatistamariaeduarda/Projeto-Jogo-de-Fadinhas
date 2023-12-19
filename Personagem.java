class Personagem {
    private String nome;
    private int vida;
    private Poder poder;
    private Poder poderEspecial;
    private boolean poderEspecialDisponivel;

    public Personagem(String nome, int vida, Poder poder, Poder poderEspecial) {
        this.nome = nome;
        this.vida = vida;
        this.poder = poder;
        this.poderEspecial = poderEspecial;
        this.poderEspecialDisponivel = true; 
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

    public Poder getPoderEspecial() {
        return poderEspecial;
    }

    public boolean isPoderEspecialDisponivel() {
        return poderEspecialDisponivel;
    }

    public void usarPoderEspecial() {
        if (poderEspecialDisponivel) {
            System.out.println(nome + " está usando o poder especial: " + poderEspecial);
            poderEspecialDisponivel = false;
        } else {
            System.out.println("Poder especial de " + nome + " está recarregando. Aguarde o próximo turno.");
        }
    }

    public void atacar(Personagem alvo) {
        int dano = poder.calcularDano();
        alvo.receberDano(dano);
        System.out.println(nome + " atacou " + alvo.getNome() + " causando " + dano + " de dano.");
        poderEspecialDisponivel = true;
    }

    private void receberDano(int dano) {
        vida -= dano;
        if (vida < 0) {
            vida = 0;
        }
        System.out.println(nome + " recebeu " + dano + " de dano. Vida restante: " + vida);
    }
}