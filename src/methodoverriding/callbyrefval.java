package methodoverriding;

public class callbyrefval {
    static int i = 10;
    int        j = 20;

    public static void main(String[] args) {
        // TODO Auto-generated method stub

        callbyrefval obj = new callbyrefval();
        int x = 10;
        int y = 20;
        int z = obj.add(x, y);
        int z1 = subtract(obj.j, i);
        System.out.println("the sum" + z);
        System.out.println("the deduct" + z1);

        // System.out.println("i value" + i);
        // System.out.println("j value" + obj.j);

    }

    public int add(int a, int b) {
        int c = a + b;
        return c;
    }

    public static int subtract(int a, int b) {
        int c = b - a;
        return c;
    }

}
