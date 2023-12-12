class Poder {
    private String nome;
    private int dano;
    private int precisao;

    public Poder(String nome, int dano, int precisao) {
        this.nome = nome;
        this.dano = dano;
        this.precisao = precisao;
    }

    public int calcularDano() {
        double chanceAcerto = Math.random();
        if (chanceAcerto <= (precisao / 100.0)) {
            return dano;
        } else {
            System.out.println("Ataque de " + nome + " falhou!");
            return 0;
        }
    }

    @Override
    public String toString() {
        return nome;
    }
}