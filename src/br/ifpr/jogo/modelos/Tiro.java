package br.ifpr.jogo.modelos;
import java.awt.Image;
import javax.swing.ImageIcon;


public class Tiro {
    private int posicaoEmX;
    private int posicaoEmY;  
    private Image imagem;
    private int larguraImagem;
    private int alturaImagem;
    private static int VELOCIDADE= 1;


    public Tiro(int posicaoPersonagemEmX, int posicaoPersonagemEmY){
    this.posicaoEmX = posicaoPersonagemEmX;
    this.posicaoEmY = posicaoPersonagemEmY;
    }

    public void carregar(){
        ImageIcon carregando = new ImageIcon("JAVA2D_POO_23.-main\recursos\tiro.png");
        this.imagem = carregando.getImage();
        this.larguraImagem = this.imagem.getWidth(null);
        this.alturaImagem = this.imagem.getHeight(null);
    }

    public void atualizar() {
        this.posicaoEmX = this.posicaoEmX + VELOCIDADE;
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