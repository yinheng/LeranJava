package cap3;

/**
 * Learning
 */
public class TestEquals {
    public static void main(String[] args) {
        Sheep s1 = new Sheep(1, 2, 3);
        Sheep s2 = new Sheep(1, 2, 3);
        System.out.println(s1 == s2);
        System.out.println(s1.equals(s2));

        String n1 = "Hello";
        String n2 = "Hello";
        System.out.println(n1.equals(n2));
    }
}

class Sheep {

    int color;
    int height, weight;

    Sheep(int color, int height, int weight) {
        this.color = color;
        this.height = height;
        this.weight = weight;
    }

    public boolean equals(Object obj) {
        if (obj == null) {
            return false;
        } else {
            if (obj instanceof Sheep) {
                Sheep c = (Sheep) obj;
                if (c.color == this.color && c.height == this.height && c.weight == this.weight) {
                    return true;
                }
            }
        }
        return false;
    }

}
