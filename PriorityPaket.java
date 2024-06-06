import java.util.ArrayList;
import java.util.List;
import java.util.PriorityQueue;

public class PriorityPaket {
    private PriorityQueue<Paket> paketQueue;

    public PriorityPaket() {
        this.paketQueue = new PriorityQueue<>();
    }

    public void terimaPaket(int id, String name, int date, String type, String address) {
        this.paketQueue.add(new Paket(id, type, name, date, address));
    }

    public Paket getNextPaket() {
        return this.paketQueue.poll();
    }

    public void listJadwal() {
        List<Paket> paketPaket = new ArrayList<>();

        while (!this.paketQueue.isEmpty()) {
            paketPaket.add(this.paketQueue.poll());
        }

        for (Paket paket : paketPaket) {
            System.out.println(paket);
        }
    }
}