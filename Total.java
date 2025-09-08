public class Total {
    public static void main(String[] args) {
        int[] numbers = { 10, 20, 30, 40, 50 };
        int result = getSum(numbers);
        System.out.println("Total: " + result);
    }

    public static int getSum(int[] arr) {
        int sum = 0;
        for (int num : arr) {
            sum += num;
        }
        return sum;      
    }
}
