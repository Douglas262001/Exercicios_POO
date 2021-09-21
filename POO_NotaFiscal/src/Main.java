import javax.swing.*;

public class Main {

        public static void main(String[] args) {

            NotaFiscal cliente = new NotaFiscal();

            cliente.nome = JOptionPane.showInputDialog("Digite seu nome");
            cliente.cpf = JOptionPane.showInputDialog("Digite seu CPF");
            cliente.endereço_entrega = JOptionPane.showInputDialog("Digite seu endereço");
            cliente.data_cadastro = Integer.parseInt(JOptionPane.showInputDialog("Digite a data de cadastro"));
            cliente.quantidade_total = Integer.parseInt(JOptionPane.showInputDialog("Digite a quantidade total"));
            cliente.valor = Double.parseDouble(JOptionPane.showInputDialog("Digite o valor"));
            cliente.peso = Double.parseDouble(JOptionPane.showInputDialog("Digite seu peso"));
            cliente.status_faturando = false;
            cliente.cancelar = false;
            cliente.Faturar();
            cliente.Fabricar();
            cliente.Cancelar();

        }

}
