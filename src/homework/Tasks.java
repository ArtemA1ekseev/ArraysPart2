package homework;

public class Tasks {
    public static void main(String[] args) {
        System.out.println("Массивы. Часть 2.");
        System.out.println("Задание 1.");
            java.util.Random random = new java.util.Random();
            int[] arr = new int[30];
            int sum = 0;
            for (int i = 0; i < arr.length; i++) {
                arr[i] = random.nextInt(100_000) + 100_000;
                sum = sum + arr[i];
            }
            System.out.println("Сумма трат за месяц составила " + sum + " рублей.");
        System.out.println(" ");
        System.out.println("Задание 2.");
        int maxArr = -1;
        for (int i = 0; i < arr.length; i++) {
            final int current = arr[i];
            if (current > maxArr) {
                maxArr = current;
            }
        }
        System.out.println("Максимальная сумма трат за день составила " + maxArr + " рублей.");
        int minArr = arr[0];
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] < minArr)
                minArr = arr[i];
        }
        System.out.println("Минимальная сумма трат за день составила " + minArr + " рублей.");
        System.out.println(" ");
        System.out.println("Задание 3.");
        double sum1 = 0;
        for (int x: arr) {
            sum1 += x;
        }
        System.out.printf("Средняя сумма трат за месяц составила %.2f рублей.", sum1/arr.length);
        System.out.println(" ");
        System.out.println(" ");
        System.out.println("Задание 4.");
        char[] reverseFullName = { 'n', 'a', 'v', 'I', ' ', 'v', 'o', 'n', 'a', 'v', 'I'};
        for (int i = reverseFullName.length - 1; i >= 0; i--) {
            System.out.print(reverseFullName[i]);
        }
    }
}
