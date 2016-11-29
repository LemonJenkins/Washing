
public enum TypeWash {
    CAR(1, "CAR"), MOTORCYCLE(2, "MOTORCYCLE"), PESUN(2, "PESUN"), TRUCK(3, "TRUCK");

    private int id;
    private String nameTypeWash;

    private TypeWash(int id, String nameTypeWash) {
        this.id = id;
        this.nameTypeWash = nameTypeWash;

    }

    public String getNtwById() {
        return nameTypeWash;
    }

    public int getId() {
        return id;
    }
}
