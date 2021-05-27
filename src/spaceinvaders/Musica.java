
package spaceinvaders;
import java.applet.AudioClip;

public class Musica {
    public Musica(){
        
    }
    public void play(){
        AudioClip sonido;
        sonido = java.applet.Applet.newAudioClip(getClass().getResource("/sonidos/song.wav"));
        sonido.play();
        System.out.println("hola");
    }
}
