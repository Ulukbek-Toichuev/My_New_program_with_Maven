import java.util.Scanner;

public class Main {
        public static void main(String[] args) {
            getAmperage();
            }

        static double getAmperage(){
            double voltage; double resistance;
            Scanner scanner = new Scanner(System.in);
            System.out.println("Введите значение напряжения:");
            voltage = scanner.nextDouble();

            Scanner scanner1 = new Scanner(System.in);
            System.out.println("Введите значение сопротивления:");
            resistance = scanner1.nextDouble();

            double result = voltage / resistance;
            System.out.println("Сила тока равна: " + result + "A");
            return result;
        }
    }
