public class Main {
    public static void main(String[] args) {

        MonsterBall masterBall = new MonsterBall("MasterBall",1,999,999,555);
        UsableItem potion = new UsableItem("Potion",50,30,15,10,0,0);
        Misc divineRapier = new Misc("DivineRapier",1,10000000);

        GameCharacter rogueKnight = new GameCharacter("RogueKnight",500,300,150);
        rogueKnight.receiveItems(masterBall,10);
        rogueKnight.receiveItems(potion,100);
        rogueKnight.receiveItems(divineRapier,1);

        rogueKnight.catchBy(masterBall);
        rogueKnight.buy(masterBall,1);
        rogueKnight.useItem(potion);

        System.out.println(rogueKnight.toString());

    }
}
