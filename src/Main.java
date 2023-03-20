import java.util.Scanner;
import java.util.Stack;

public class Main {
    public static void main(String[] args) {
        Stack<String> stack = new Stack<>();
        Scanner sc = new Scanner(System.in);
        do {
            System.out.println("****************JAVA-HACKATHON-05-ADVANCE-1-MENU***************\n" +
                    "1. Nhập URL muốn truy cập\n" +
                    "2. Quay lại\n" +
                    "3. Thoát");
            System.out.print("Vui lòng chọn: ");
            int choise = Integer.parseInt(sc.nextLine());
            switch (choise){
                case 1:
                    getStack(sc,stack);
                    break;
                case 2:
                    comeBack(stack);
                    break;
                case 3:
                    System.exit(0);
                    break;
                default:
                    System.out.println("Vui lòng chọn từ 1->3");
            }
        }while (true);
    }
    public static void getStack(Scanner sc, Stack<String> stack) {
        System.out.println("Nhập URL: ");
        String URL = sc.nextLine();
        stack.push(URL);
        System.out.println(stack);
    }
    public static void comeBack(Stack<String> stack) {
        System.out.print("Mảng ban đầu: ");
        System.out.println(stack);
        stack.pop();
        System.out.print("sau khi xóa phần tử cuối cùng mảng còn lại: ");
        System.out.println(stack);
        System.out.println("Phần tử cuối cùng tiếp theo là: ");
        System.out.println(stack.peek());
    }
}
