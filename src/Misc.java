public class Misc extends Item {
    public Misc(String name, int quatity, double price, double sell) {
        super(name, quatity, price, sell);
    }

    public Misc(String name, int quatity, double sell){
        super(name, quatity,0,sell);
    }

    @Override
    public String toString() {
        return "Misc{name='" + super.getName()
                + "', quatity=" + super.getQuatity()
                + ", sellFor=" + super.getSell()
                + "}";
    }
}
