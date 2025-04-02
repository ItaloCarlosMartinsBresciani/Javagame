public interface Criatura {
    String getNome();
    String getDescricao();
    double getVida();
    /*Habilidades setSkills();*/
    void updateVida(double iAnUpdate);
    double getAtaque();
    double getDefesa();
    double atacar(String skill_name);
    public double receber_ataque(double dano);
    boolean estaVivo();
    void reset();
}