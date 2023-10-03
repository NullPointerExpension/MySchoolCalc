import java.util.*;

class Dcoder {
    public static void main(String args[]) {
        int O1 = 0;
        int K = 0;
        int O2 = 0;
        Scanner sc = new Scanner(System.in);
        System.out.println("Напиши время начала урока в Минутах (12:30 = 30)");
        int N2 = sc.nextInt();
        System.out.println("Теперь так же с часами");
        int N1 = sc.nextInt();
        System.out.println("Сколько минут у тебя идёт урок? 40м = 40");
        int H = sc.nextInt();
        System.out.println("Сколько идёт перемена?");
        int C = sc.nextInt();
        System.out.println("Сколько у тебя уроков?");
        int G = sc.nextInt();
        int J = (C * G) + (H * G);
        while (J >= 60) {
            // Код, который будет выполняться, пока условие истинно
            K = K + 1;
            J = J - 60;
            if (J < 60) {
                O1 = N1 + K;
                O2 = J;
                System.out.println(O1 + ":" + O2);
                break; // Для выхода из цикла, после выполнения кода внутри if
            }
        }
    }
}