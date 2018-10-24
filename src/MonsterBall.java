public class MonsterBall extends Item {
    private int value;

    public MonsterBall(String name, int quatity, double price, double sell, int value) {
        super(name, quatity, price, sell);
        this.value = value;
    }

    public MonsterBall(String name, int quatity, double price, double sell) {
        super(name,quatity,price,sell);
        this.value = 999;
    }


    @Override
    public String toString() {
        return "MonsterBall{name='" + super.getName()
                + "', quatity=" + super.getQuatity()
                + ", price=" + super.getPrice()
                + ", sellFor=" + super.getSell()
                + ", ballValue=" + this.value
                + "}";
    }
}
