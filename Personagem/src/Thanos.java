public class Thanos extends Personagem  {
    public Thanos(int nivel, String nome){
        super(nome, nivel);
        this.vida = 240*getNivel()*0.5;
        this.ataque = 10*getNivel()*0.5;
        this.defesa = 10*getNivel()*0.5;
        this.velocidade = 90*getNivel()*0.5;
        this.skills = new Habilidades(0.5, 1.2, "Soco",
                "Estala o dedo", 0, 3);
    }

    @Override
    public String getDescricao() {
        return "Homi que estala dedo";
    }

    @Override
    public void reset() {
        this.vida = 240*getNivel()*0.5;
        this.ataque = 10*getNivel()*0.5;
        this.defesa = 10*getNivel()*0.5;
        this.velocidade = 90*getNivel()*0.5;
    }
}
