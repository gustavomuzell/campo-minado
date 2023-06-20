package br.com.cod3r.cm.view;

import br.com.cod3r.cm.model.Tabuleiro;

import javax.swing.*;
import java.awt.*;

public class PainelTabuleiro  extends JPanel {

    public PainelTabuleiro(Tabuleiro tabuleiro) {

        setLayout(new GridLayout(
                tabuleiro.getLinhas(), tabuleiro.getColunas()));

            tabuleiro.paraCadaCampo(c -> add(new BotaoCampo(c)));
            tabuleiro.registrarObservador(e -> {

                SwingUtilities.invokeLater(() -> {
                    if(e.isGanhou()) {
                        JOptionPane.showMessageDialog(this, "Ganhou :)");
                    } else {
                        JOptionPane.showMessageDialog(this, "Perdeu :(");
                    }

                    tabuleiro.reiniciar();
                });
            });
    }
}
