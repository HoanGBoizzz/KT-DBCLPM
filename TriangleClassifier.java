import java.util.Scanner;

public class TriangleClassifier {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Nhập cạnh a: ");
        int a = scanner.nextInt();
        System.out.print("Nhập cạnh b: ");
        int b = scanner.nextInt();
        System.out.print("Nhập cạnh c: ");
        int c = scanner.nextInt();
        
        String result = classifyTriangle(a, b, c);
        System.out.println("Loại tam giác: " + result);
        
        scanner.close();
    }
    
    public static String classifyTriangle(int a, int b, int c) {
        if (a + b <= c || a + c <= b || b + c <= a) {
            return "NotATriangle";
        }
        
        if (a == b && b == c) {
            return "Equilateral";
        }
        
        if (a == b || a == c || b == c) {
            return "Isosceles";
        }
        
        if (a * a + b * b == c * c || a * a + c * c == b * b || b * b + c * c == a * a) {
            return "RightTriangle";
        }
        
        return "Scalene";
    }
}