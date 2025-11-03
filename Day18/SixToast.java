public class SixToast {
    public static int sixToast(int num) {
        return Math.abs(num - 6);
    }
}

// Example usage:
public class Main {
    public static void main(String[] args) {
        System.out.println(SixToast.sixToast(4));  // Output: 2
        System.out.println(SixToast.sixToast(10)); // Output: 4
    }
}