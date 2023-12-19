//Classe Stella para herdar Fada

class Stella extends Personagem {
    public Stella() {
        super("Stella", 100, new Poder("Pérolas Solares", 30, 80), new Poder("Poder Estelar", 40, 85));
    }
}