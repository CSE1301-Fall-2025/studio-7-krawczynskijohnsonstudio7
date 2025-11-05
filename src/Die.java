import java.util.Scanner;

public class Die {
    private int sides;

    public Die (int numSides) {
        this.sides = numSides;
    }
    public int getSides() {
        return this.sides;
    }
    public int throwDie() {
        return (int) (Math.random()*this.getSides() + 1);
    }
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int sidees =  in.nextInt();
        Die d1 = new Die(sidees);
        System.out.println(d1.throwDie());
        in.close();
    }
}
