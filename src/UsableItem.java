public class UsableItem extends Item {
    public UsableItem(String name, int quatity, double price, double sell) {
        super(name, quatity, price, sell);
    }

    @Override
    public String toString() {
        return "Usable Item{name='" + super.getName()
                + "', quatity=" + super.getQuatity()
                + ", price=" + super.getPrice()
                + ", sellFor=" + super.getSell()
                + "}";
    }
}
