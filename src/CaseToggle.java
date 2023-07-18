import java.util.Scanner;

public class CaseToggle {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String  str = scanner.next();
        char[] ch = new char[str.length()];
        for(int i=0;i<str.length();i++)
        {
            char c = str.charAt(i);
            ch[i] = (char) (c^(1<<5));
            System.out.println(ch[i]);
        }
    }
}
