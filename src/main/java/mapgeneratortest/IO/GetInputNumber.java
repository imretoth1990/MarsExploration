package mapgeneratortest.IO;
import java.util.Scanner;

public class GetInputNumber implements InputScanner{
    @Override
    public int scanUserInt(String message) {
        Scanner scanner = new Scanner(System.in);
        System.out.println(message);
        return scanner.nextInt();
    }
}
