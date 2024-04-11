import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.*;


public class Menu extends JFrame {

    private JButton botaoAp = new JButton("Aposta 0 - 100");
    private JButton botaoAp2 = new JButton("Aposta A - Z");
    private JButton botaoAp3 = new JButton("APosta Impar ou Par");
    private JButton botaoEn = new JButton("Desistir");
    private JPanel painel = new JPanel();

    public Menu() {
        setTitle("CASA DE APOSTAS ARAMUNI");
        setSize(400, 420);
        setLocationRelativeTo(null);
        setDefaultCloseOperation(JFrame.DO_NOTHING_ON_CLOSE);
        getContentPane().setBackground(new Color(255, 255, 255));
        configBotoes();
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setVisible(true);
    }

    private void configBotoes() {
        painel.add(botaoAp);
        painel.add(botaoAp2);
        painel.add(botaoAp3);
        painel.add(botaoEn);

        getContentPane().add(painel);
        botaoAp.setToolTipText("Aposta 0 - 100");
        botaoAp2.setToolTipText("Aposta A - Z");
        botaoAp3.setToolTipText("Aposta Impar ou Par");
        botaoEn.setToolTipText("Desistir");

        botaoAp.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                botaoAp(e);
            }
        });
        botaoAp2.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                botaoAp2(e);
            }
        });
        botaoAp3.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                botaoAp3(e);
            }
        });
        botaoEn.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                botaoEn(e);
            }
        });

    }

    public static void main(String[] args) {
        new Menu();

    }

    private void botaoAp(ActionEvent e) {
        ImageIcon icon = new ImageIcon("FOTO.PNG");
       Object numeroApostado = JOptionPane.showInputDialog(null,"Digite o seu número de 0 a 100",
               "Aposta 1",JOptionPane.INFORMATION_MESSAGE,
               icon, null,"");

       JOptionPane.showMessageDialog(null,"Número Apostado: " + numeroApostado);
       int numero = Integer.parseInt(numeroApostado.toString());
        if(numero < 0 || numero >100 ) {
            JOptionPane.showMessageDialog(null,"Valor Inválido");
        } else {
            double numeroAleatorio = Math.random() * 101;
            int oi = (int)numeroAleatorio;
            JOptionPane.showMessageDialog(null,"Número sorteado: " + oi);
            if( numeroAleatorio == oi){
                JOptionPane.showMessageDialog(null,"O apostador ganhou 1000R$");
            } if( numeroAleatorio != oi){
                JOptionPane.showMessageDialog(null,"Perdeu seu Trouxa!");
            }
        }

    }
    private void botaoAp2(ActionEvent e) {
    }
    private void botaoAp3(ActionEvent e) {
    }
    private void botaoEn(ActionEvent e) {
    }


}