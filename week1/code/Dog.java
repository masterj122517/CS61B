public class Dog {

    public int weight;
    public String name;

    public Dog(int w, String name) {
        weight = w;
        this.name = name;

    }

    public void bark() {
        if (weight < 10)
            System.out.println("bark");
        else if (weight < 20)
            System.err.println("woffffff");
        else
            System.err.println("fuck");
    }

    // public static void maxDog(Dog d1, Dog d2) {
    // if (d1.weight > d2.weight)
    // System.out.println(d1.name);
    // else
    // System.out.println(d2.name);
    // }
    // public void maxDog(Dog d2) {
    // if (weight > d2.weight)
    // System.out.println(name);
    // else
    // System.out.println(d2.name);
    // }

}
