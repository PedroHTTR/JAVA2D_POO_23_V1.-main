package br.ifpr.jogo.modelos;

import java.awt.Image;
import java.awt.event.KeyEvent;
import java.util.ArrayList;
import javax.swing.ImageIcon;

public class Personagem{
    private int posicaoEmX;
    private int posicaoEmY;
    private int deslocamentoEmX;
    private int deslocamentoEmY;
    private Image imagemPersonagem;
    private int larguraImagem;
    private int alturaImagem;
    private ArrayList<Tiro> tiros;

    private static final int POSICAO_INICIAL_X = 100;
    private static final int POSICAO_INICIAL_Y = 100;
    private static final int VELOCIDADE_DESLOCAMENTO =3;


    public Personagem(){
        this.posicaoEmX = POSICAO_INICIAL_X;
        this.posicaoEmY = POSICAO_INICIAL_Y;
        this.tiros = new ArrayList<Tiro>();
    }

    public void carregar(){
        ImageIcon carregando = new ImageIcon("JAVA2D_POO_23.-main\\recursos\\nave.png");
        this.imagemPersonagem = carregando.getImage();
        this.alturaImagem = this.imagemPersonagem.getHeight(null);
        this.larguraImagem = this.imagemPersonagem.getWidth(null);
    }
    
    public void atualizar() {
    this.posicaoEmX = this.posicaoEmX + this.deslocamentoEmX;
    this.posicaoEmY = this.posicaoEmY + this.deslocamentoEmY;
    }

    public void mover(KeyEvent tecla) {
    int codigo = tecla.getKeyCode();
    switch (codigo) {
        case KeyEvent.VK_UP:
            this.deslocamentoEmY = -VELOCIDADE_DESLOCAMENTO;
            break;
        case KeyEvent.VK_DOWN:
            this.deslocamentoEmY = VELOCIDADE_DESLOCAMENTO;
            break;
        case KeyEvent.VK_LEFT:
            this.deslocamentoEmX = -VELOCIDADE_DESLOCAMENTO;
            break;
        case KeyEvent.VK_RIGHT:
            this.deslocamentoEmX = VELOCIDADE_DESLOCAMENTO;
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
    }    }

    public void atirar(){
        int frenteNave = this.posicaoEmX + this.larguraImagem;
        int meioNave = this.posicaoEmY + (this.larguraImagem/2);
        Tiro tiro = new Tiro(frenteNave, meioNave);
        this.tiros.add(tiro);
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
        return this.imagemPersonagem;
    }

    public void setImagem(Image imagem) {
        this.imagemPersonagem = imagem;
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

    public ArrayList<Tiro> getTiros() {
        return this.tiros;
    }

    public void setTiros(ArrayList<Tiro> tiros) {
        this.tiros = tiros;
    }
    
    public Image getImagemPersonagem() {
        return this.imagemPersonagem;
    }

    public void setImagemPersonagem(Image imagemPersonagem) {
        this.imagemPersonagem = imagemPersonagem;
    }
  
}