public class DemoPoem {
    public static void main(String[] args) {
        Couplet couplet = new Couplet("A Simple Couplet");
        Limerick limerick = new Limerick("A Funny Limerick");
        Haiku haiku = new Haiku("A Serene Haiku");

        System.out.println("Poem: " + couplet.getName() + ", Lines: " + couplet.getLines());
        System.out.println("Poem: " + limerick.getName() + ", Lines: " + limerick.getLines());
        System.out.println("Poem: " + haiku.getName() + ", Lines: " + haiku.getLines());
    }
}