package MediaAlunos;

import javax.swing.*;

public class main {

    public static void main(String[] args) {

        Alunos alunos = new Alunos();

        alunos.quantidadeAlunos = Double.parseDouble(JOptionPane.showInputDialog(null, "Digite o numero de alunos: "));
        alunos.quantidadeNotas = Double.parseDouble(JOptionPane.showInputDialog(null, "Digite o numero de notas: "));

        alunos.CalculoNotas();

        alunos.MediaTotalTurma();
    }
}
