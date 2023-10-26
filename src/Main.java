public class Main {
import javax.swing.*;

    public class Main {
        public static void main(String[] args) {
            // Classe Objeto         Construtor
            Turista mochileiro = new Turista();
            // Definir formato do objeto
            mochileiro.setNome("Lindsay Lohan");
            mochileiro.setCpf("123");
            Turista mochileira = new Turista("Maria");
            // Definir comportamento
            String retorno = mochileira.viajar();
            System.out.println(retorno);

            // criar um novo objeto

            Turista outroTurista = new Turista();
            String nome = JOptionPane.showInputDialog("entre com seu nome");
            outroTurista.setNome(nome);
            JOptionPane.showInputDialog(null, "O nome digitado foi " + outroTurista.getNome());

            // criar a captura do cpf deste objeto
            String cpf = JOptionPane.showInputDialog("digite seu cpf:");
            If(Validacao.cpf(cpf));{
                outroTurista.setCpf(cpf);

            }
        else {
                System.out.println("erro CPF não validado!!!");
            }
            outroTurista.setCpf( Validacao.cpf(cpf));
            JOptionPane.showInputDialog(null, outroTurista.getCpf()+
                    "Validacao");



        }

        private static void If(String cpf) {
        }
    }
