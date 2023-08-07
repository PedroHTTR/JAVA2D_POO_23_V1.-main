package br.ifpr.jogo.modelos;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.Image;
import javax.swing.ImageIcon;
import javax.swing.JPanel;

public class Fase extends JPanel{
    private Image fundo;
    private Personagem personagem;
    
    public Fase(){
        ImageIcon carregando = new ImageIcon("recursos\\imagemfundo.jpg");
        fundo = carregando.getImage();
        personagem = new Personagem();
        personagem.carregar();
    }

    public void paint(Graphics g){
        Graphics2D graficos = (Graphics2D) g;
        graficos.drawImage(fundo, 0, 0, null);
        graficos.drawImage(personagem.getImagem(), personagem.getPosicaoEmX(), personagem.getPosicaoEmY(), this);
        g.dispose();
    }
}

