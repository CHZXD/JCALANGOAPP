import javax.swing.JOptionPane;
public class abelinha  extends personagem{

    @Override
    public void mover() {
        energia -=3;
       
        JOptionPane.showMessageDialog(null, "Abelha voou  3 vezes sua energia agora é:"+energia);
       
      
       
      
    }

    @Override
    public void dormir() {
        super.dormir();
       
        
    }

    @Override
    public void fazerSom() {
      JOptionPane.showMessageDialog(null, "Fzzz"); 
        
    }

    @Override
    public int getEnergiaGanhaAoComer() {
      
        return 1;
    }

    @Override
    public String getNome() {
      
        return "abelinha";
    }

    @Override
    public String tabelaFinal() {
     return  "--- Tabela Final da " + getNome() + " ---\n" +
               "Energia Final: " + this.getEnergia();
      

    }}
    

   

   
    

    

    
    

