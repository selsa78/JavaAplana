import java.util.Scanner;

public class Calc {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    float fn, sn, result;
    System.out.println("Введите первое число: ");
    fn = scanner.nextInt();

    System.out.println("Введите второе число: ");
    sn = scanner.nextInt();
    result = fn + sn;
    System.out.println("Сумма двух введенных Вами чисел равна: " + result);


  }
}
