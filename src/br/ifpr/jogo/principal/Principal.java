package br.ifpr.jogo.principal;
import javax.swing.JFrame;
import br.ifpr.jogo.modelos.Fase;

public class Principal extends JFrame{
     public Principal(){
        Fase fase = new Fase();
        super.add(fase);
        super.setTitle("Red Matter"); 
        super.setSize(800,600); 
        super.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        super.setLocationRelativeTo(null); 
        super.setResizable(true); 
        super.setVisible(true);          
    }
  
    public static void main(String[] args){
        new Principal();
    }

}
