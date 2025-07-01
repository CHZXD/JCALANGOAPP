package br.com.jcalango.view;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class JINTRO extends JFrame {
    public JINTRO() {
        setTitle("Jalango INTRO");
        setSize(400, 200);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLocationRelativeTo(null);
        setLayout(new FlowLayout());

        JButton startJButton = new JButton("Iniciar");
        add(startJButton);

        startJButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String narracao = "Você não lembra como chegou até aqui...\n"
                        + "Só lembra do frio, da névoa... e daquele sussurro que te chamou pelo nome.\n"
                        + "Esta casa... não está vazia. Ela sente. Ela espera.\n"
                        + "E cada quarto que você abre, ela se lembra mais de você.";

                
                JPanel painel = new JPanel(new BorderLayout());
                painel.setBackground(Color.BLACK);
                painel.setPreferredSize(new Dimension(400, 200));

                
                JTextArea areaTexto = new JTextArea(narracao);
                areaTexto.setWrapStyleWord(true);
                areaTexto.setLineWrap(true);
                areaTexto.setEditable(false);
                areaTexto.setForeground(Color.WHITE);
                areaTexto.setBackground(Color.BLACK);
                areaTexto.setFont(new Font("Serif", Font.PLAIN, 14));
                painel.add(areaTexto, BorderLayout.CENTER);




                JButton btnCadastrar = new JButton("Cadastrar Jogador");
                painel.add(btnCadastrar, BorderLayout.SOUTH);

                
                JDialog d = new JDialog(JINTRO.this, "Introdução", true);
                d.getContentPane().add(painel);
                d.pack();
                d.setLocationRelativeTo(JINTRO.this);

                
                btnCadastrar.addActionListener(new ActionListener() {
                    @Override
                    public void actionPerformed(ActionEvent e) {
                        d.dispose();
                        new JCadastroJogador();
                    }
                });

                d.setVisible(true);
            }
        });

        setVisible(true);
    }
}
