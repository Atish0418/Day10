class Swap {

    public static int[] swap(int x, int y) {
        x = x ^ y;
        y = x ^ y;
        x = x ^ y;

        return new int[]{x, y};
    }

    public static void main(String args[]) {
        int[] result = swap(3, 5);
        System.out.println("Swapped values: x = " + result[0] + ", y = " + result[1]);
    }
}
