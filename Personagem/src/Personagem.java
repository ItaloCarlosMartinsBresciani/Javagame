public abstract class Personagem implements Criatura{
    private String nome;
    private int nivel;
    protected double vida;
    protected double ataque;
    protected double velocidade;
    protected double defesa;
    protected Habilidades skills;
    public Personagem(String nome, int nivel){
        this.nivel = nivel;
        this.nome = nome;
    }

    public double getVida() {
        return vida;
    }

    @Override
    public void updateVida(double iAnUpdate) {
        vida = vida + iAnUpdate;
    }

    @Override
    public double getAtaque() {
        return ataque;
    }

    @Override
    public double getDefesa() {
        return defesa;
    }

    @Override
    public double atacar(String skill_name) {
        if (skill_name.equals(skills.getHabilidade1_name())) {
            if (skills.getHabilidade2_cooldown() != 0) {
                skills.setHabilidade2_cooldown(skills.getHabilidade2_cooldown() - 1);
            }
            return ataque * skills.getHabilidade1_dano();
        } else {
            if (skills.getHabilidade2_cooldown() == 0) {
                skills.setHabilidade2_cooldown(skills.getHabilidade2_maxcooldown());
                return ataque * skills.getHabilidade2_dano();
            }else {
                return -1;
            }
        }
    }

    @Override
    public void receber_ataque(double dano) {
        double dano_recebido = -1*(dano - defesa);
        updateVida(dano_recebido);
    }/*retornar o dano real do ataque*/

    @Override
    public boolean estaVivo() {
        if (getVida() <= 0)
            return false;
        else
            return true;
    }
    public int getNivel() {
        return nivel;
    }

    public void setNivel(int nivel) {
        this.nivel = nivel;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getNome() {
        return nome;
    }
}
