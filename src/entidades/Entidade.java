package entidades;

import java.awt.image.BufferedImage;

public class Entidade {

    public int coordX, coordY;
    public int velocidade;
    //private String nome;
    //private int nivel;
    //private int vida;
    //private int forca;
    //private int defesa;
    //private int magia;
        
    public BufferedImage spriteCima, spriteBaixo, spriteEsq, spriteDir;
    public String direcao;

    public int contadorSprites = 0;
    public int numeroSprite = 1;
    

    
    
    
}
