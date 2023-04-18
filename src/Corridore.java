import java.util.Random;

public class Corridore extends Thread {
    private String nome;
    private int metri_percorsi;

    public Corridore(String nome) {
        this.nome = nome;
        this.metri_percorsi = 0;
    }

    public void run() {
        Random rand = new Random();
        while (metri_percorsi < 1000) {
            int avanzamento = rand.nextInt(100) + 1;
            metri_percorsi += avanzamento;
            try {
                Thread.sleep(100); // 1 decimo di secondo = 100 millisecondi
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
        System.out.println(nome + " arrivato al traguardo");
    }
}