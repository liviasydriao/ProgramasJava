import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Scanner;

public class Interfacegrafica {
    public static void main(String[] args) {
        JFrame frame = new JFrame("A pop-up");
        JPanel painel = new JPanel();
        JPanel encapsula1 = new JPanel();
        JPanel encapsula2 = new JPanel();
        JPanel encapsula3 = new JPanel();

        JLabel label1 = new JLabel("Nome: ");
        JTextField campo1 = new JTextField(20);

        encapsula1.setLayout(new BorderLayout());
        encapsula1.add(label1, BorderLayout.WEST);
        encapsula1.add(campo1, BorderLayout.EAST);

        JLabel label2 = new JLabel("Idade: ");
        JTextField campo2 = new JTextField(20);
        encapsula2.setLayout(new BorderLayout());
        encapsula2.add(label2, BorderLayout.WEST);
        encapsula2.add(campo2, BorderLayout.EAST);

        JButton botao = new JButton("Clique Aqui!");
        JLabel resultado = new JLabel();
        encapsula3.setLayout(new BorderLayout());
        encapsula3.add(botao, BorderLayout.WEST);
        encapsula3.add(resultado, BorderLayout.EAST);

        painel.setLayout(new FlowLayout());
        painel.add(encapsula1);

        painel.add(encapsula2);
        painel.add(encapsula3);
        frame.getContentPane().add(painel);

        botao.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent actionEvent) {
                if (Integer.parseInt(campo2.getText()) >= 18){
                    resultado.setText(campo2.getText() + ", você é maior de idade");
                } else{
                    resultado.setText(campo2.getText() + ", você é menor de idade");

                }
            }
        });

        frame.setSize(300, 300);
        frame.setVisible(true);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
}




