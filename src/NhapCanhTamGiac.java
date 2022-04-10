import java.util.InputMismatchException;
import java.util.Scanner;

public class NhapCanhTamGiac {

    public static void nhapCanhTamGiac() throws IllegalTriangleException {

        int canhA = 0;
        int canhB = 0;
        int canhC = 0;


        Scanner sc = new Scanner(System.in);
        System.out.println("Nhập vào độ dài 3 cạnh tam giác:");
        try {
            System.out.print("Cạnh a = ");
            canhA = sc.nextInt();
            sc.nextLine();
            System.out.print("Cạnh b = ");
            canhB = sc.nextInt();
            sc.nextInt();
            System.out.print("Cạnh c = ");
            canhC = sc.nextInt();
            sc.nextLine();
            if (canhA <= 0 || canhB <= 0 || canhC <= 0) {
                throw new IllegalTriangleException("Cạnh tam giác không được nhỏ hơn 0");
            }
            if (canhA + canhB <= canhC || canhB + canhC <= canhA || canhA + canhC <= canhB) {
                throw new IllegalTriangleException("Tổng 2 cạnh phải lớn hơn cạnh còn lại");
            }
        } catch (InputMismatchException e) {
            throw new IllegalTriangleException("Cạnh tam giác phải là một số");
        }
    }
}
