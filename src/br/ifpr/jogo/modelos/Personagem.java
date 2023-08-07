package br.ifpr.jogo.modelos;
import java.awt.Image;

import javax.swing.ImageIcon;

import javafx.scene.input.KeyEvent;

public class Personagem{
    private int posicaoEmX;
    private int posicaoEmY;
    private int deslocamentoEmX;
    private int deslocamentoEmY;
    private Image imagem;
    private int larguraImagem;
    private int alturaImagem;
    private static final int DESLOCAMENTO = 3;
    private static final int POSIINIX = 100;
    private static final int POSIINIY = 100;



    public Personagem(){
        this.posicaoEmX = 100;
        this.posicaoEmY = 100;
        this.posicaoEmX = POSIINIX;
        this.posicaoEmY = POSIINIY;
    }

    public void carregar(){
        ImageIcon carregando = new ImageIcon("recursos\\nave.png");
        this.imagem = carregando.getImage();
        this.alturaImagem = this.imagem.getHeight(null);
        this.larguraImagem = this.imagem.getWidth(null);
    }
    
    public void atualizar() {
    this.posicaoEmX = this.posicaoEmX + this.deslocamentoEmX;
    this.posicaoEmY = this.posicaoEmY + this.deslocamentoEmY;
    }

    public void mover(KeyEvent tecla) {
    int codigo = tecla.getKeyCode();
    switch (codigo) {
        case KeyEvent.VK_UP:
            this.deslocamentoEmY = -DESLOCAMENTO;
            break;
        case KeyEvent.VK_DOWN:
            this.deslocamentoEmY = DESLOCAMENTO;
            break;
        case KeyEvent.VK_LEFT:
            this.deslocamentoEmX = -DESLOCAMENTO;
            break;
        case KeyEvent.VK_RIGHT:
            this.deslocamentoEmX = DESLOCAMENTO;
            break;
        default:
            break;
        }
    }

    public void parar(KeyEvent tecla) {
    int codigo = tecla.getKeyCode();
    switch (codigo) {
        case KeyEvent.VK_UP:
             deslocamentoEmY = 0;
             break;
        case KeyEvent.VK_DOWN:
            deslocamentoEmY = 0;
            break;
        case KeyEvent.VK_LEFT:
            deslocamentoEmX = 0;
            break;
        case KeyEvent.VK_RIGHT:
            deslocamentoEmX = 0;
            break;
        default:
            break;
    }
}

    public int getPosicaoEmX() {
        return this.posicaoEmX;
    }

    public void setPosicaoEmX(int posicaoEmX) {
        this.posicaoEmX = posicaoEmX;
    }

    public int getPosicaoEmY() {
        return this.posicaoEmY;
    }

    public void setPosicaoEmY(int posicaoEmY) {
        this.posicaoEmY = posicaoEmY;
    }

    public int getDeslocamentoEmX() {
        return this.deslocamentoEmX;
    }

    public void setDeslocamentoEmX(int deslocamentoEmX) {
        this.deslocamentoEmX = deslocamentoEmX;
    }

    public int getDeslocamentoEmY() {
        return this.deslocamentoEmY;
    }

    public void setDeslocamentoEmY(int deslocamentoEmY) {
        this.deslocamentoEmY = deslocamentoEmY;
    }

    public Image getImagem() {
        return this.imagem;
    }

    public void setImagem(Image imagem) {
        this.imagem = imagem;
    }

    public int getLarguraImagem() {
        return this.larguraImagem;
    }

    public void setLarguraImagem(int larguraImagem) {
        this.larguraImagem = larguraImagem;
    }

    public int getAlturaImagem() {
        return this.alturaImagem;
    }

    public void setAlturaImagem(int alturaImagem) {
        this.alturaImagem = alturaImagem;
    }
}