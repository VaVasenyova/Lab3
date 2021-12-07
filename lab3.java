import java.util.Scanner;
import java.util.regex.*;

public class lab3 {
    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);
        System.out.println("Введите дату в формате dd/mm/yyyy");
        String line = console.next();

        String pattern = "(0[1-9]|1[0-9]|2[0-9]|3[01])/(0[1-9]|1[012])/(19|[2-9]\\d)\\d{2}$";
        Pattern p = Pattern.compile(pattern);
        Matcher m = p.matcher(line);
        if (m.find()) {
            System.out.print(line.substring(m.start(), m.end()) + " - дата в формате dd/mm/yyyy");
        }
        else {
            System.out.print("Строка " + line + " не является датой в формате dd/mm/yyyy");
        }
    }
}
