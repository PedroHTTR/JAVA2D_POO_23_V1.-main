package br.ifpr.jogo.modelos;

import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.Image;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.util.ArrayList;

import javax.swing.ImageIcon;
import javax.swing.JPanel;
import javax.swing.Timer;

public class Fase extends JPanel implements ActionListener, KeyListener{
    private Image fundo;
    private Personagem personagem;
    private Timer timer;
    private static final int DELAY = 3;
    private static final int LARGURA_DA_JANELA = 800;
    private ArrayList<Inimigo> inimigos;
    private static final int QTD_INIMIGOS = 40;

    public Fase(){
        setFocusable(true);
        setDoubleBuffered(true);
        ImageIcon carregando = new ImageIcon("JAVA2D_POO_23.-main\\recursos\\fundo.jpg");
        fundo = carregando.getImage();
        personagem = new Personagem();
        personagem.carregar();
        this.inicializarInimigos(); 
        addKeyListener(this); 
        timer = new Timer(DELAY, this); 
        timer.start();     
    }

    public void inicializarInimigos(){
        inimigos = new ArrayList<Inimigo>();
        for (int i = 0; i < QTD_INIMIGOS; i++){
            int x = (int) (Math.random() * 8000 + 1024);
            int y = (int) (Math.random() * 650 + 30);
            Inimigo inimigo = new Inimigo(x, y);
            inimigos.add(inimigo);
        }
    }


    public void paint(Graphics g){
        Graphics2D graficos = (Graphics2D) g;
        graficos.drawImage(fundo, 0, 0, null);
        graficos.drawImage(personagem.getImagem(), personagem.getPosicaoEmX(), personagem.getPosicaoEmY(), this);
        ArrayList<Tiro> tiros = personagem.getTiros();
        
        for (Tiro tiro : tiros){
            tiro.carregar();
            graficos.drawImage(tiro.getImagem(), tiro.getPosicaoEmX(), tiro.getPosicaoEmY(), this);
        }

        for (Inimigo inimigo : inimigos){
            inimigo.carregar();
            graficos.drawImage(inimigo.getImagem(), inimigo.getPosicaoEmX(), inimigo.getPosicaoEmY(), this);
        }


        g.dispose();
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        personagem.atualizar();
        
        ArrayList<Tiro> tiros = personagem.getTiros();
        for (int i=0;i<tiros.size();i++){
            Tiro tiro = tiros.get(i);
            if (tiro.getPosicaoEmX() > LARGURA_DA_JANELA)
            tiros.remove(i);
        else
            tiros.get(i).atualizar();
        } 
        
        for (int i = 0; i < this.inimigos.size(); i++){
            Inimigo inimigo = this.inimigos.get(i);
            if (inimigo.getPosicaoEmX() < 0)
                inimigos.remove(inimigo);
            else
                inimigo.atualizar();
        }

        repaint();
    }

    @Override
    public void keyPressed(KeyEvent e) {
        if (e.getKeyCode() == KeyEvent.VK_SPACE)
            personagem.atirar();
        else
            personagem.mover(e);
    }

    @Override
    public void keyReleased(KeyEvent e) {
        personagem.parar(e);
    }

    @Override
    public void keyTyped(KeyEvent e) {
        // throw new UnsupportedOperationException("Unimplemented method 'keyTyped'");
    }

    public Image getFundo() {
        return this.fundo;
    }

    public void setFundo(Image fundo) {
        this.fundo = fundo;
    }

    public Personagem getPersonagem() {
        return this.personagem;
    }

    public void setPersonagem(Personagem personagem) {
        this.personagem = personagem;
    }

    public Timer getTimer() {
        return this.timer;
    }

    public void setTimer(Timer timer) {
        this.timer = timer;
    }

    public ArrayList<Inimigo> getInimigos() {
        return this.inimigos;
    }

    public void setInimigos(ArrayList<Inimigo> inimigos) {
        this.inimigos = inimigos;
    }

}


