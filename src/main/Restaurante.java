package main;

import dominio.Hamburger;
import dominio.Pizza;

import javax.swing.JOptionPane;

public class Restaurante {
    public static void main(String[] args) {
        int opcao = Integer.parseInt(JOptionPane.showInputDialog(null, "Informe o que você deseja: \n 1.Hamburger \n 2.Pizza \n 3.Sair", "Informe o Pedido", JOptionPane.QUESTION_MESSAGE));

        switch (opcao){
            case 1:

                String nomeH = JOptionPane.showInputDialog(null, "Nome do Hamburger: ", "Nome do Hamburger", JOptionPane.QUESTION_MESSAGE);
                Double valorH = Double.parseDouble(JOptionPane.showInputDialog(null, "Valor do Hamburger", "Valor do Hamburger", JOptionPane.QUESTION_MESSAGE));
                boolean isArtesanal = Boolean.parseBoolean(JOptionPane.showInputDialog(null, "É Artesanal? (true ou false)", "É Artesanal?", JOptionPane.QUESTION_MESSAGE));

                Hamburger h1 = new Hamburger(nomeH, valorH, isArtesanal);

                JOptionPane.showMessageDialog(null, "O seu pedido ficou no valor de: " + h1.valor, "Confirmar pedido", JOptionPane.INFORMATION_MESSAGE);
                break;
            case 2:

                String nomeP = JOptionPane.showInputDialog(null, "Nome da Pizza: ", "Nome da Pizza", JOptionPane.QUESTION_MESSAGE);
                Double valorP = Double.parseDouble(JOptionPane.showInputDialog(null, "Valor da Pizza: ", "Valor da Pizza", JOptionPane.QUESTION_MESSAGE));
                boolean hasBorda = Boolean.parseBoolean(JOptionPane.showInputDialog(null, "Tem borda? (true ou false)", "Tem borda?", JOptionPane.QUESTION_MESSAGE));

                Pizza p1 = new Pizza(nomeP, valorP, hasBorda);

                JOptionPane.showMessageDialog(null, "O seu pedido ficou no valor de: " + p1.valor, "Confirmar pedido", JOptionPane.INFORMATION_MESSAGE);

                break;
            case 3:
                break;
            default:
                System.out.println("Valor inválido");
                break;
        }
    }
}
