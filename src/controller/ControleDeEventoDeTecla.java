package controller;

import model.OuvinteEventoDeTecla;

import java.awt.event.KeyEvent;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class ControleDeEventoDeTecla {
    private Set<OuvinteEventoDeTecla> ouvintes = new HashSet<>();

    public ControleDeEventoDeTecla(){}

    public void lancarEvento(KeyEvent e ){
        Iterator<OuvinteEventoDeTecla> it = ouvintes.iterator();
        switch (e.getKeyCode()){
            case KeyEvent.VK_UP:
                while(it.hasNext())
                    it.next().sobe();
                break;
            case KeyEvent.VK_DOWN:
                while (it.hasNext()) it.next().desce();
                break;
            case KeyEvent.VK_LEFT:
                while (it.hasNext()) it.next().esquerda();
                break;
            case KeyEvent.VK_RIGHT:
                while (it.hasNext()) it.next().direita();
                break;
        }
    }
}
