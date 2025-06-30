package br.com.jcalango.view;
import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPasswordField;
import javax.swing.JTextField;
import javax.swing.JButton;
//herança
public class JCadastroJogador extends JFrame{
    //construtor inicializa os compomemyes do formulário
    public JCadastroJogador(){
        setTitle("faça parte do Jcalango");
        //garante de aplicaçõa de a aplicação não seja finalizada
        setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        //tamanho
        setSize(400,450);
        //posição
        setLocationRelativeTo(null);
        setLayout(new FlowLayout(FlowLayout.CENTER,10,10));
        JLabel lblNome = new JLabel("Nome");
        JTextField txtNome= new JTextField(30);
        add(lblNome);
        add(txtNome);

        JLabel lblEmail= new JLabel("Email");
        JTextField txtEmail= new JTextField(30);
        add(lblEmail);
        add(txtEmail);

        JLabel lblSenha = new JLabel("Senha");
        JTextField txtSenha= new JPasswordField(30);
        add(lblSenha);
        add(txtSenha);
JButton btnCadastrar = new JButton("Cadastrar");
        btnCadastrar.addActionListener(new ActionListener() {

            @Override
            public void actionPerformed(ActionEvent e) {
                dispose();
    
                JOptionPane.showMessageDialog(null, "Jogador cadastrado com sucesso!");
            }
            
        });
        setVisible(true);
        add(btnCadastrar);






        
    }

    
    

}
