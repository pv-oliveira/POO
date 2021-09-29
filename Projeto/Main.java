package Projeto;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args){
        Universidade f1 = new Funcionario();
        f1.setNome("Paulo");
        Funcionario a1 = new Analista();
        a1.setNome("David");
        Funcionario p1 = new Professor();
        p1.setNome("Alex");
        Alunos al1 = new Alunos();
        al1.setNome("Victor");
        Alunos al2 = new Alunos();
        al2.setNome("Levy");
        Alunos al3 = new Alunos();
        al3.setNome("Arthur");

        List<Universidade> turma1 = new ArrayList<>();
        turma1.add(al1);
        turma1.add(p1);


        List<Universidade> turma2 = new ArrayList<>();
        turma1.add(al3);
        turma1.add(p1);


        for(Universidade universidade : turma1 ){
            System.out.println(universidade.getNome());
        }
        for(Universidade universidade : turma2 ){
            System.out.println(universidade.getNome());
        }


//        System.out.println(f1.getNome());
//        System.out.println(a1.getNome());
    }
}
