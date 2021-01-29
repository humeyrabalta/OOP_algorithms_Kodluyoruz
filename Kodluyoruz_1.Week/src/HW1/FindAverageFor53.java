package HW1;

public class FindAverageFor53 {
    public static void main(String[] args) {
        double sum,average;
        sum = 0;
        int counter = 0;

        for (int i =0; i <= 2000; i++){
            if (i%53== 0 ){
                System.out.println((counter+1) + ".Number: "  + i);
                sum = sum + i ;
                counter++;
            }
        }
        System.out.println("Sum of divisible numbers for 53: " + sum);
        System.out.println("Count of divisible numbers for 53: " + counter);
        average = sum / counter;
        System.out.println("Avarage of divisible numbers for 53 (0 included): " + average);

    }
}
