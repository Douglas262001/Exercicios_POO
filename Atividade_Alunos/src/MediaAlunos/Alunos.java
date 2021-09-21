package MediaAlunos;

import javax.swing.*;

class Alunos {

    double quantidadeAlunos = 0, quantidadeNotas = 0, soma = 0, media = 0, notaTurma = 0, mediaTurmaTotal = 0;

    void CalculoNotas(){
        String[] nome = new String[(int) quantidadeAlunos];
        double[] aluno = new double[(int) quantidadeAlunos];
        double[] nota = new double[(int) quantidadeNotas];

        for (int i = 0; i < aluno.length; i++) {
            nome[i] = JOptionPane.showInputDialog(null, "Digite seu nome");
            soma = 0.0;
            for (int j = 0; j < nota.length; j++) {
                nota[j] = Double.parseDouble(JOptionPane.showInputDialog(null, "Digite sua nota"));
                soma += nota[j];
                media = soma / nota.length;
                notaTurma += nota[j];
            }
            JOptionPane.showMessageDialog(null, nome[i] + " sua nota é de " + media);
        }
    }

    void MediaTotalTurma(){
        mediaTurmaTotal = notaTurma / (quantidadeAlunos * quantidadeNotas);
        JOptionPane.showMessageDialog(null,"A média da turma é de " + mediaTurmaTotal);
    }
}
