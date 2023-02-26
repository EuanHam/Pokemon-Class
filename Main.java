public class Main{
    public static void main(String [] args) {
        Pokemon poke25 = new Pokemon("Pikachu", "Electric", 25, 75);
        System.out.println(poke25.getName() + " is fast: " + poke25.isFast());
        System.out.println(poke25.getName() + " is powerful: " + poke25.isPowerful());
        System.out.println(poke25.getName() + " is too strong: " + poke25.isTooStrong());
        System.out.println(poke25.speedRatio());
        poke25.setAtk(150);
    }
}