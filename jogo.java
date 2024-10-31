package jogo;

import java.util.Random;

import javax.swing.JOptionPane;

public class jogo {
    public static void main(String[] args) {
        int aleatorio, jogador, contador=0;
        String saida;

        Random random = new Random();
        aleatorio = random.nextInt(101);

        do {
            jogador = Integer.parseInt(JOptionPane.showInputDialog("Digite um número de 0 a 100: "));

            if (aleatorio < jogador) {
                saida = String.format("O número que você digitou é maior");
                JOptionPane.showMessageDialog(null, saida);
                System.out.println(saida);
            } else if (aleatorio > jogador) {
                saida = String.format("O número que você digitou é menor");
                JOptionPane.showMessageDialog(null, saida);
                System.out.println(saida);
            } else {
                saida = String.format("Você acertou, a quantidade de tentativas foi %d", contador);
                JOptionPane.showMessageDialog(null, saida);
                System.out.println(saida);
            }

            contador++;

        } while (aleatorio != jogador);
    }
}
