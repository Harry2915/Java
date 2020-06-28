package harish.hibare.javaday;

public class PrimeNo {
    static int  prime = 0,sum=0;
    public static void main(String[] args) {
        for (int i=1; i <= 100; i++) {
            System.out.println("Checking number:: "+i);
            for (int j = 1; j <= i; j++) {
                if (i % j == 0)
                    prime++;
            }
            if (prime == 2){
                System.out.println(+i+" ::is prime number");
                System.out.println("Old Count:: "+sum);
                sum=sum+i;
                System.out.println("New Count::" +sum);
            }
            else System.out.println(+i+" ::is not prime number");
            prime = 0;
        }
        System.out.println("\n\nSUM OF PRIME NUMBER BETWEEN 1-100:: "+sum+"\n");
    }
}