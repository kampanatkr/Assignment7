import java.util.ArrayList;

public class GameCharacter {
    private String name;
    private int hp;
    private int damage;
    private int defense;
    private int money;
    private int level;
    private int exp;
    private ArrayList<Item> itemsList = new ArrayList();

    public GameCharacter(String name, int hp, int damage, int defense) {
        this.name = name;
        this.hp = hp;
        this.damage = damage;
        this.defense = defense;
        this.money = 0;
        this.level = 1;
        this.exp = 0;

    }

    public void receiveItems(Item item, int quantity) {
        if (item.getQuantity() < quantity){
            System.out.println(item.getName()+" can not receive");
        }else{
            if (itemsList.contains(item)) {
                item.setQuantity(quantity);
            } else {
                itemsList.add(item);
            }
            System.out.println("receive " + item.getName());
        }
    }

    public void sell(Item item, int quantity) {
        if (item.getQuantity() < quantity){
            System.out.println("There is not enough to buy");
        }else {
            if (quantity > 0) {
                item.sell(quantity);
                this.money += item.getSell() * quantity;
                System.out.println("Sell " + item.getName() + item.getQuantity() + " piece");
            }
        }
    }

    public void buy(Item item, int quantity) {
        if (item.getQuantity() < quantity){
            System.out.println("There is not enough to buy");
        }else {
            if (money > 0 && quantity > 0) {
                item.buy(quantity);
                this.money -= item.getPrice() * quantity;
                System.out.println("Buy " + item.getName() + item.getQuantity() + " piece");
            }
        }
    }

    public void useItem(UsableItem item) {
        if (item.getQuantity() < 0){
            System.out.println("can not use "+item.getName());
        }else {
            this.damage += item.getPlusDamage();
            this.hp += item.getPlusHp();
            this.defense += item.getPlusDefense();
            item.setQuantity(-1);
            System.out.println("use "+item.getName());
        }
    }

    public void catchBy(MonsterBall ball) {
        if (ball.getQuantity() > 1){
            ball.setQuantity(-1);
            this.exp += 100;
            System.out.println("Catch successful");
        }else{
            ball.setQuantity(0);
            System.out.println("Catch failed");
        }
    }

    public void learnSkill() {

    }

    public void castSpell() {

    }

    @Override
    public String toString() {
        return "Name:" + this.name +
                " HP:" + this.hp +
                " Damage:" + this.damage +
                " Defense: " + this.defense +
                " Money: " + this.money +
                " LV:" + this.level +
                " EXP: " + this.exp;
    }
}
