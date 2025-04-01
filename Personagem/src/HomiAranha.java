public class HomiAranha extends Personagem {
    public HomiAranha(int nivel, String nome) {
        super(nome, nivel);
        this.vida = 120 * getNivel() * 0.5;
        this.ataque = 26 * getNivel() * 0.5;
        this.defesa = 5 * getNivel() * 0.5;
        this.velocidade = 100 * getNivel() * 0.5;
        this.skills = new Habilidades(0.7, 0.9, "Soco",
                "Lança Teia", 0, 2);
    }



    @Override
    public String getDescricao() {
        return "Homi que solta teia";
    }

    @Override
    public void reset() {
        this.vida = 120 * getNivel() * 0.5;
        this.ataque = 26 * getNivel() * 0.5;
        this.defesa = 5 * getNivel() * 0.5;
        this.velocidade = 100 * getNivel() * 0.5;
    }
}
