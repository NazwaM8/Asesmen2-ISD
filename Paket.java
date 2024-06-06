public class Paket implements Comparable<Paket> {
    int id;
    String type;
    String name;
    int date;
    String address;

    public Paket(int id, String type, String name, int date, String address) {
        this.id = id;
        this.type = type;
        this.name = name;
        this.date = date;
        this.address = address;
    }

    public int duration() {
        switch (type) {
            case "biasa":
                return 3;
            case "express":
                return 2;
            case "kilat":
                return 1;
            case "same day":
                return 0;
            default:
                return 0;
        }
    }

    public int getId() {
        return this.id;
    }

    public String getType() {
        return this.type;
    }

    public String getName() {
        return this.name;
    }
    
    public int getDate() {
        return this.date;
    }
    
    public String getAddress() {
        return this.address;
    }

    @Override
    public String toString() {
        return "ID Paket: " + id + " Nama Pelanggan: " + name + " Alamat Pelanggan: " + address;
    }
    
    @Override
    public int compareTo(Paket other) {
        int result = this.duration() + this.date;
        int otherResult = other.duration() + other.date;

        if (result < otherResult) {
            return -1;            
        } else if (result > otherResult) {
            return 1;
        } else {
            return 0;
        }
    }
}