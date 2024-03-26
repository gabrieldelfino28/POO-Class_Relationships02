package model;

import javax.sound.midi.SysexMessage;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class Playlist {
    private String dono;
    List<Música> músicas;

    public Playlist() {
        músicas = new ArrayList<>();
    }

    public String getDono() {
        return dono;
    }

    public void setDono(String dono) {
        this.dono = dono;
    }

    public List<Música> getMúsicas() {
        return músicas;
    }

    public void addMúsica(Música musica) {
        músicas.add(musica);
    }

    public void playMúsica(Música musica) {
        for(Música m : músicas) {
            if(m.getNome().equals(musica.getNome())){
                System.out.println("Agora tocando: " + m);
            }
        }
    }

    public void aleatorio() {
        System.out.println("\nModo Aleatório");
        int tam = músicas.size();
        Random rnd = new Random();
        int pos = 0;
        for(int i = 0; i < tam; i++){
            pos = rnd.nextInt(0,tam);
            System.out.println("Agora Tocando: " + músicas.get(pos));
        }
    }
}
