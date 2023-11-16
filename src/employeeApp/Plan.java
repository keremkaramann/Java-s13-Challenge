package employeeApp;

public enum Plan {
    HEART("Heart", 12000),
    LAPTOP("LAPTOP", 1000),
    BRAIN("Brain", 1500);

    private String name;
    private int price;

    Plan(String name, int price) {
        this.name = name;
        this.price = price;
    }

    public String getName() {
        return name;
    }

    public int getPrice() {
        return price;
    }
}
