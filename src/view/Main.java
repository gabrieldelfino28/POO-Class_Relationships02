package view;

import model.Música;
import model.Playlist;

public class Main {

    public static void main(String[] args) {
        Música m1 = new Música();
        Música m2 = new Música();
        Música m3 = new Música();
        Música m4 = new Música();
        Música m5 = new Música();
        Playlist p = new Playlist();

        m1.setNome("In The End");
        m1.setAutor("Linkin Park");
        m1.setGravadora("Warner");

        m2.setNome("Shadow Of The Day");
        m2.setAutor("Linkin Park");
        m2.setGravadora("Warner");

        m3.setNome("Lying From You");
        m3.setAutor("Linkin Park");
        m3.setGravadora("Warner");

        m4.setNome("Perfect");
        m4.setAutor("Simple Plan");
        m4.setGravadora("Warner");

        m5.setNome("Helena");
        m5.setAutor("My Chemical Romance");
        m5.setGravadora("Warner");

        p.setDono("Gabriel");
        System.out.println(p.getDono());
        p.addMúsica(m1);
        p.addMúsica(m2);
        p.addMúsica(m3);
        p.addMúsica(m4);
        p.addMúsica(m5);

        p.playMúsica(m3);
        p.aleatorio();
        p.aleatorio();
        Música m6 = new Música();

        m6.setNome("Under The Bridge");
        m6.setAutor("Red Hot Chili Peppers");
        m6.setGravadora("Warner");
        p.addMúsica(m6);
        p.aleatorio();
    }
}
