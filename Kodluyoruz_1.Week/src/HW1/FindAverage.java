package HW1;

public class FindAverage {
    public static void main(String[] args) {

        int sum,i;
        sum = 0;
        double counter= 0;
        double average;

        for (i = 0; i <= 2000; i++) {
            if (i % 3 == 0 && i % 5 == 0 && i % 7 == 0 && i%53==0) {
                System.out.println("Common dividing numbers: " + i);
                sum = sum + i;
                counter++;
            }
        }
        System.out.println("Sum of divisible numbers: " + sum);
        System.out.println("Count of divisible numbers: " + counter);
        average = sum / counter;
        System.out.println("Avarage of divisible numbers: " + average);

        if (sum == 0) {
            System.out.println("Result: Just zero exists that divided common at between 0 and 2000");
        } else {
            throw new RuntimeException("Incorrectly account. ");
        }
    }

}
