import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Введите оценку 1:");
        int grade1 = scanner.nextInt();

        System.out.println("Введите оценку 2:");
        int grade2 = scanner.nextInt();

        System.out.println("Введите оценку 3:");
        int grade3 = scanner.nextInt();

        System.out.println("Введите оценку 4:");
        int grade4 = scanner.nextInt();

        int totalGrade = (grade1 + grade2 + grade3 + grade4) / 4;

        System.out.println("Общая оценка: " + totalGrade);
    
    }
}
