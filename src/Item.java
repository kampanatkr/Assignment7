public class Item {
    private String name;
    private int quatity;
    private double sell;
    private double price;

    public Item(String name, int quatity, double price, double sell) {
        this.name = name;
        this.quatity = quatity;
        this.price = price;
        this.sell = sell;
    }

    public void sell(int quatity){
        this.quatity -= quatity;
    }

    public void buy(int quatity){
        this.quatity += quatity;
    }

    @Override
    public String toString() {
        return "Item{name='" + this.name
                + "', quatity=" + this.quatity
                + ", price=" + this.price
                + ", sellFor=" + this.sell
                + "}";
    }

    public String getName() {
        return name;
    }

    public int getQuatity() {
        return quatity;
    }

    public double getSell() {
        return sell;
    }

    public double getPrice() {
        return price;
    }
}
