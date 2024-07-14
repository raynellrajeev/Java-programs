import java.util.Scanner;
public class freq {
    public static void main(String[] args) {
        String s;
        int frequency=0;
        char c;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a string");
        s = sc.nextLine();
        System.out.println("Enter a char");
        c = sc.nextLine().charAt(0);
        for (int i = 0; i < s.length(); i++) {
                if (c == s.charAt(i)) {
                frequency++;
            }
        }
        System.out.println(frequency);
    }
}


