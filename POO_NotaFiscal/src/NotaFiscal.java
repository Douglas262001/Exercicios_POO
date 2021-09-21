import javax.swing.*;

public class NotaFiscal {

        String nome;
        String cpf;
        String endereço_entrega;
        int data_cadastro;
        int quantidade_total;
        double valor;
        double peso;
        boolean status_faturando;
        boolean cancelar;


        void Faturar(){
            this.status_faturando = true;
            JOptionPane.showMessageDialog(null,"Voce esta faturando");
        }

        void Cancelar(){
            this.cancelar = true;
            JOptionPane.showMessageDialog(null,"Nota foi cancelada");
        }

        void Fabricar(){
            JOptionPane.showMessageDialog(null,"Nota Cadastrada");
            JOptionPane.showMessageDialog(null,"Nome: " + nome + "\n" +
                    "CPF: " + cpf + "\n" +
                    "Endereço: " + endereço_entrega + "\n" +
                    "Data: " + data_cadastro + "\n" +
                    "Quantidade total: " + quantidade_total + "\n" +
                    "Valor: " + valor + "\n" +
                    "Peso: " + peso + "\n" +
                    "Status Faturando: " + status_faturando);
        }
}
