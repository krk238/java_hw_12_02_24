package binary.hw;

public class FirstClass {

    // - Find the largest of 3 numbers.
    public  static void returnLargeNum(int num1, int num2, int num3) {
        if (num1 > num2 && num1 > num3) {
            System.out.println(num1);;
        } else if (num2 > num1 && num2 > num3) {
            System.out.println(num2);
        } else {
            System.out.println(num3);
        }
    }

    // - Write a program to check if a character is a vowel or consonant.
    public static void consonantChecker(char letter) {
        switch (letter) {
            case 'a':
                System.out.println("vowel");
                break;
            case 'e':
                System.out.println("vowel");
                break;
            case 'i':
                System.out.println("vowel");
                break;
            case 'o':
                System.out.println("vowel");
                break;
            case 'u':
                System.out.println("vowel");
                break;
            default:
                System.out.println("consonant");
        }
    }

    // - Calculate the factorial of a number using a while loop.
    public static void factorialNum(int num) {
        int sum = 1;
        while (num > 0) {
            sum *= num;
            num -= 1;
        }
        System.out.println(sum);
    }

    public static void evenSum() {
        int sum = 0;
        for (int i = 1; i<=100; i++) {
            if (i % 2 == 0) {
                sum += i;
            }
        }
        System.out.println(sum);
    }

    public static void main(String[] args) {
        FirstClass.factorialNum(5);
        FirstClass.evenSum();
    }


}
