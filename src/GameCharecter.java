public class GameCharecter {
    private String name;
    private int hp;
    private int damage;
    private int defense;
    private int money;
    private int level;
    private int exp;

    public GameCharecter(String name, int hp, int damage, int defense) {
        this.name = name;
        this.hp = hp;
        this.damage = damage;
        this.defense = defense;
        this.money = 0;
        this.level = 1;
        this.exp = 0;
    }

    public void receiveItems(Item item,int quantity){

    }

    public void sell(Item item, int quantity){
        if (quantity > 0){
            item.sell(quantity);
            this.money += item.getSell()*quantity;
        }
    }

    public void buy(Item item, int quantity){
        if (quantity > 0){
            item.buy(quantity);
            this.money -= item.getPrice()*quantity;
        }
    }

    public void useItem(UsableItem item){

    }

    public void catchBy(MonsterBall ball){

    }

    public void learnSkill(){

    }

    public void castSpell(){

    }


}
