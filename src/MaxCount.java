public class MaxCount {
    public static void main(String[] args) {
        int one=46;
        int two=373;
        int free=2408765;
        boolean oneMax = one > two && one > free;
        boolean twoMax = two > one && two > free;
        boolean freeMax = free > one && free > one;
        if (oneMax) {
            System.out.println(one);
        } else if (twoMax) {
            System.out.println(two);
        } else {
            System.out.println(free);
        }
    }
}
