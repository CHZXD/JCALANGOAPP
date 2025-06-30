import javax.swing.JOptionPane;

public abstract class personagem {
    public personagem(){
        super();
}
    
    protected Integer energia = 10;
    public abstract String getNome();
    public int getEnergia() {
        return energia;}
    public abstract int getEnergiaGanhaAoComer();
    public void comer() {
        String input = JOptionPane.showInputDialog("Deseja que o " + getNome() + " coma?");
        if (input != null && input.equalsIgnoreCase("sim")) {
            int energiaGanha = getEnergiaGanhaAoComer();
            energia += energiaGanha;
            JOptionPane.showMessageDialog(null, "O " + getNome() + " comeu e ganhou " + energiaGanha + " de energia! Energia atual: " + energia);
        } else {
            JOptionPane.showMessageDialog(null, "O " + getNome() + " não comeu. Energia atual: " + energia);
        }
    }

    public abstract void mover();
    public abstract void fazerSom();

    public void dormir() {
        energia += 10;
        JOptionPane.showMessageDialog(null, "Dormiu... Agora você tem mais um pouco de energia: " + energia);
    }

    
    public abstract String tabelaFinal();
}