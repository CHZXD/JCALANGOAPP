import javax.swing.JOptionPane;
public class calango extends personagem{

    @Override 
    public void mover() {
        energia -=9;
        JOptionPane.showMessageDialog(null, "Calango  voou  3 vezes agora sua energia agora é:"+energia);
        
        
        
    }

    @Override
    public void dormir() {
        super.dormir();
      
        
    }

    @Override
    public void fazerSom() {
        JOptionPane.showMessageDialog(null, "Tzz");
       
        
    }

    @Override
    public int getEnergiaGanhaAoComer() {
        
        return 07;
    }

    @Override
    public String getNome() {
        
    return "calango";
    }

    @Override
    public String tabelaFinal() {
        
        return "--- Tabela Final da " + getNome() + " ---\n" +
               "Energia Final: " + this.getEnergia();
    }}

   
  

   

  

    
