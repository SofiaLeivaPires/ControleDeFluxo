public class Aluno extends Pessoa {
    private int matricula;
    private String curso;

    public void cancelarMatric(){
        System.out.println("Matrícula Cancelada");
    }

    public int getMatricula() {
        return matricula;
    }

    public void setMatricula(int matricula) {
        this.matricula = matricula;
    }

    public String getCurso() {
        return curso;
    }

    public void setCurso(String curso) {
        this.curso = curso;
    }
}
