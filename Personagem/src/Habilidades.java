public class Habilidades {
    private double habilidade1_dano;
    private double habilidade2_dano;
    private String habilidade1_name;
    private String habilidade2_name;
    private int habilidade2_cooldown;
    private int habilidade2_maxcooldown;
    public Habilidades(double habilidade1_dano, double habilidade2_dano, String habilidade1_name,
                       String habilidade2_name, int habilidade2_cooldown, int habilidade2_maxcooldown){
        this.habilidade1_dano = habilidade1_dano;
        this.habilidade1_name = habilidade1_name;
        this.habilidade2_dano = habilidade2_dano;
        this.habilidade2_name = habilidade2_name;
        this.habilidade2_cooldown = habilidade2_cooldown;
        this.habilidade2_maxcooldown = habilidade2_maxcooldown;
    }

    public int getHabilidade2_maxcooldown() {
        return habilidade2_maxcooldown;
    }

    public void setHabilidade2_maxcooldown(int habilidade2_maxcooldown) {
        this.habilidade2_maxcooldown = habilidade2_maxcooldown;
    }

    public int getHabilidade2_cooldown() {
        return habilidade2_cooldown;
    }

    public void setHabilidade2_cooldown(int habilidade2_cooldown) {
        this.habilidade2_cooldown = habilidade2_cooldown;
    }


    public double getHabilidade1_dano() {
        return habilidade1_dano;
    }

    public double getHabilidade2_dano() {
        return habilidade2_dano;
    }

    public String getHabilidade1_name() {
        return habilidade1_name;
    }

    public String getHabilidade2_name() {
        return habilidade2_name;
    }

    public void setHabilidade1_dano(double habilidade1_dano) {
        this.habilidade1_dano = habilidade1_dano;
    }

    public void setHabilidade1_name(String habilidade1_name) {
        this.habilidade1_name = habilidade1_name;
    }

    public void setHabilidade2_dano(double habilidade2_dano) {
        this.habilidade2_dano = habilidade2_dano;
    }

    public void setHabilidade2_name(String habilidade2_name) {
        this.habilidade2_name = habilidade2_name;
    }
}
