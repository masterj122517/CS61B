public class HelloWorld {
    // public static void drawTriangle(int n) {
    // for (int i = 1; i <= n; i++) {
    // System.out.print("*");
    // }
    // }

    // public static void main(String[] args) {
    // for (int i = 0; i <= 9; i++) {
    // drawTriangle(i);
    // System.out.println("");
    // }
    // }
    // public static void main(String[] args) {
    // // int[] numbers = new int[3];
    // int[] numbers = new int[] { 4, 7, 10 };
    // System.out.println(numbers.length);
    // }
    //
    // public static int max(int[] m) {
    // int temp = m[0];
    // for (int i = 1; i < m.length; i++) {
    // if (temp < m[i]) {
    // temp = m[i];
    // }
    // }
    // return temp;
    // }
    // public static int max(int[] m) {
    // int temp = m[0];
    // int i = 0;
    // while (i < m.length) {
    // if (temp < m[i]) {
    // temp = m[i];
    // }
    // i++;
    // }
    // return temp;
    // }
    // public static int[] windowPosSum(int[] m, int n) {
    // for (int i = 0; i < m.length; i++) {
    // int sum = m[i];
    // if (m[i] > 0) {
    // for (int j = 1; j <= n && j + i < m.length; j++) {
    // sum += m[i + j];
    // }
    // }
    // m[i] = sum;
    // System.out.println(m[i]);
    // }
    // return m;
    // }

    public static void main(String[] args) {
        String[] a = { "cat", "dog", "laser horse", "ketchup", "horse", "horbse" };

        for (String s : a) {
            for (int j = 0; j < 3; j += 1) {
                System.out.println(s);
                if (s.contains("horse")) {
                    break;
                }
            }
        }

    }
}
