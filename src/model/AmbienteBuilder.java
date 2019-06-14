package model;

import java.awt.*;

public abstract class AmbienteBuilder {
    private Graphics g;

    public AmbienteBuilder(Graphics g){
        this.g = g;
    }
    public abstract void desenharBola();
    public abstract void desenharPadEsquerdo();
    public abstract void desenharPadDireito();
    public abstract void desenharCampo();

    public Graphics getGraphics(){
        return g;
    }
}
