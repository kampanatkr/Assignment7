import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {

        ArrayList itemsList = new ArrayList();
        itemsList.add(new Item("Sword",1,100,50));
        itemsList.add(new MonsterBall("MasterBall",999,999,999,555));
        itemsList.add(new UsableItem("Potion",50,30,15));
        itemsList.add(new Misc("DivineRapier",1,10000000));
        System.out.println(itemsList.toString());
    }
}
