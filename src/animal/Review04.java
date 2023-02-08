package animal;

public class Review04 {

    public static void main(String[] args) {

        Human human = new Human("田中　太郎",25,"電車");
        Human human2 = new Human("鈴木　次郎",30,"野球");
        Human human3 = new Human("佐藤　花子",20,"映画");

        human.say();
        human.think();
        human2.say();
        human2.think();
        human3.say();
        human3.think();
    }

}
