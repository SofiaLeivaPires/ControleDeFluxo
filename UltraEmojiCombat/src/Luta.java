import java.sql.SQLOutput;
import java.util.Random;

public class Luta {
//    Atributos
    private Lutador desafiado;
    private Lutador desafiante;
    private int rounds;
    private boolean aprovada;
//    Métodos
    public void marcarLuta(Lutador l1, Lutador l2){
        if (l1.getCategoria() .equals(l2.getCategoria())
        && l1 != l2 ){
            this.aprovada= true;
            this.desafiado = l1;
            this.desafiante = l2;
        } else {
            this.aprovada= false;
            this.desafiado = null;
            this.desafiante = null;
        }
    }
    public void lutar(){
        if (this.aprovada){
            System.out.println("### DESAFIADO ###");
            this.desafiado.apresentar();
            System.out.println("### DESAFIANTE ###");
            this.desafiante.apresentar();

            Random aleatorio = new Random();
            int vencedor = aleatorio.nextInt(3); // 0 1 2
            System.out.println("=======RESULTADO=======");
            switch (vencedor){
                case 0:
                    System.out.println("Empatou!");
                    this.desafiado.empatarLuta();
                    this.desafiante.empatarLuta();
                    break;
                case 1:
                    System.out.println("Vitória do " + this.desafiado.getNome());
                    this.desafiado.ganharLuta();
                    this.desafiante.perderLuta();
                    break;
                case 2:
                    System.out.println("Vitória do " + this.desafiante.getNome());
                    this.desafiante.ganharLuta();
                    this.desafiado.perderLuta();
                    break;
            }
            System.out.println("=========================");
        } else {
            System.out.println("A luta não pode acontecer");
        }
    }
//    Métodos Especiais
    public Lutador getDesafiado() {
        return desafiado;
    }

    public void setDesafiado(Lutador desafiado) {
        this.desafiado = desafiado;
    }

    public Lutador getDesafiante() {
        return desafiante;
    }

    public void setDesafiante(Lutador desafiante) {
        this.desafiante = desafiante;
    }

    public int getRounds() {
        return rounds;
    }

    public void setRounds(int rounds) {
        this.rounds = rounds;
    }

    public boolean isAprovada() {
        return aprovada;
    }

    public void setAprovada(boolean aprovada) {
        this.aprovada = aprovada;
    }

//    Regras:
//    Só pode ser marcada entre lutadores de mesma categorias
//    Desafiado e desafiante devem ser diferentes lutadores
//    Só pode acontecer se estiver aprovada
//    Só pode ter como resultado a vitória de um dos lutadores ou o empate
}
