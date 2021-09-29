package Projeto;

public class Analista extends Funcionario{
    private String linguagemDeProg;
    private String ideFavorita;

    public Analista(){

    }

    public String getLinguagemDeProg() {
        return linguagemDeProg;
    }

    public void setLinguagemDeProg(String linguagemDeProg) {
        this.linguagemDeProg = linguagemDeProg;
    }

    public String getIdeFavorita() {
        return ideFavorita;
    }

    public void setIdeFavorita(String ideFavorita) {
        this.ideFavorita = ideFavorita;
    }
}
