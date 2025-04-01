import java.util.Scanner;
import java.util.ArrayList;
import java.util.Arrays;
public class Main {
    public static void main(String[] args) {
        ArrayList<Personagem> personagens = new ArrayList<>();
        Main m = new Main();
        personagens.add(new HomiAranha(1, "Miranha"));
        personagens.add(new Thanos(1, "Thanos"));
        while (1 == 1) {
            int option = 0;
            int[] batalha = m.Menu(option, personagens);
            m.battle(batalha, personagens);
        }
    }

    public int[] Menu(int option, ArrayList<Personagem> personagens) {
        int[] option_champ = {0, 0};
        while (option != 1 && option != 2) {
            System.out.println("Welcome to marvel rivals rpg");
            System.out.println("Select:");
            System.out.println("1 - Play");
            System.out.println("2 - Exit");
            Scanner sc = new Scanner(System.in);
            option = sc.nextInt();
            if (option == 1) {
                System.out.println("Choose your champion:");
                int i = 1;
                for (Personagem p : personagens) {
                    System.out.println(i++ + ": " + p.getNome() + ", Nível: " + p.getNivel());
                }
                option_champ[0] = sc.nextInt() - 1;
                System.out.println("Choose your opponent");
                i = 1;
                for (Personagem p : personagens) {
                    System.out.println(i++ + ": " + p.getNome() + ", Nível: " + p.getNivel());
                }
                option_champ[1] = sc.nextInt() - 1;
                return option_champ;
            } else
                return option_champ;
        }
        return option_champ;
    }

    public void battle(int[] champs, ArrayList<Personagem> personagens){
        Personagem p1 = personagens.get(champs[0]);
        Personagem p2 = personagens.get(champs[1]);
        Scanner sc = new Scanner(System.in);
        while (p1.estaVivo() && p2.estaVivo()){
            if (p1.velocidade >= p2.velocidade){
                System.out.println("Selecione a habilidade para atacar:");
                System.out.println("1-"+ p1.skills.getHabilidade1_name());
                System.out.println("2-"+ p1.skills.getHabilidade2_name());
                int skill_name = sc.nextInt();
                if (skill_name == 1){
                    funcao_ataque(p1, p2, skill_name);
                } else if (skill_name == 2 && p1.skills.getHabilidade2_cooldown() == 0) {
                    funcao_ataque(p1, p2, skill_name);
                }else{
                    System.out.println("Sua habilidade 2 está em cooldown!");
                    continue;
                }
                if (p2.skills.getHabilidade2_cooldown() == 0){
                    funcao_ataque(p2, p1, 2);
                }else{
                    funcao_ataque(p2, p1, 1);
                }
            }else{
                if (p2.skills.getHabilidade2_cooldown() == 0){
                    funcao_ataque(p2, p1, 2);
                }else{
                    funcao_ataque(p2, p1, 1);
                }
                System.out.println("Selecione a habilidade para atacar:");
                System.out.println("1-"+ p1.skills.getHabilidade1_name());
                System.out.println("2-"+ p1.skills.getHabilidade2_name());
                int skill_name = sc.nextInt();
                if (skill_name == 1){
                    funcao_ataque(p1, p2, skill_name);
                } else if (skill_name == 2 && p1.skills.getHabilidade2_cooldown() == 0) {
                    funcao_ataque(p1, p2, skill_name);
                }else{
                    System.out.println("Sua habilidade 2 está em cooldown!");
                    continue; /*ver esse continue pq ele está fazendo o p2 fazer oooo ataque dnv*/
                }
            }
        }
    }
    public void funcao_ataque(Personagem atacante, Personagem recebedor, int skill_name){
        if (skill_name == 1){
            double dano = atacante.atacar(atacante.skills.getHabilidade1_name());
            recebedor.receber_ataque(dano);
            System.out.println(atacante.getNome() +" deu" + dano + "de dano!");
            System.out.println(recebedor.getNome() + "esta com " + recebedor.getVida() + " de vida");
        }else {
            double dano = atacante.atacar(atacante.skills.getHabilidade2_name());
            recebedor.receber_ataque(dano);
            System.out.println(atacante.getNome() +" deu" + dano + "de dano!");
            System.out.println(recebedor.getNome() + "esta com " + recebedor.getVida() + " de vida");
        }
    }
}