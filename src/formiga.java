import javax.swing.JOptionPane;

public class formiga extends personagem {



@Override
public void mover() {
  energia -=6; // Isso assume que 'energia' é acessível aqui (protected ou public em Animal)
  JOptionPane.showMessageDialog(null, "Formiga avançou 3 vezes agora sua energia agora é:"+energia);

}

@Override
public void dormir() {
  super.dormir(); // Isso chama o método dormir() da classe Animal
}

@Override
public void fazerSom() {
  JOptionPane.showMessageDialog(null, "Bzzz");
  // Falta deduzir energia aqui, se for o caso
}

@Override
public int getEnergiaGanhaAoComer() {

  return 02;
}

@Override
public String getNome() {

  return "formiga";
}

@Override
public String tabelaFinal() {
  
  return "--- Tabela Final da " + getNome() + " ---\n" +
               "Energia Final: " + this.getEnergia();
}}





  
  
    
