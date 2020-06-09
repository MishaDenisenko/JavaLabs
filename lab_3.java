import java.util.Scanner;
public class lab_3 {
    public static void main(String[] args) {

        // C3 = 9109 % 3 = 1 => Тип переменных - StringBuffer
        // c17 = 9109 % 17 = 14 => Задние: в каждом слове заданного текста
        //                                 удалить все последующие вхождения первой буквы этого слова

        // принимаем текст, введенный через консоль и передаем его значение переменной text

        Scanner st = new Scanner(System.in);
        System.out.println("Введите свой текст: ");
        String text = st.nextLine();

        // делаем проверку: содержит ли введенный текст какие-нибудь символы
        if (text.length() == 0) {
            System.out.println("Вы не ввели текст!");
        } else {
            String[] new_text = text.split(" ");
            StringBuffer text_a = new StringBuffer();
            for (int i = 0; i < new_text.length; i++) {
                StringBuffer text_b = new StringBuffer(new_text[i]);
                int r = 0;

                // проверка условия того, что первая буква данном слове будет единственной
                for (int j = 1; j < new_text[i].length(); j++) {
                    char c_1 = new_text[i].charAt(0);
                    char c_2 = new_text[i].charAt(j);
                    if (c_1 == c_2) {
                        text_b.deleteCharAt(j - r);
                        r++;
                    }
                }
                String s = text_b + " ";
                text_a.append(s);
            }
            System.out.println("Результат выполнения операции:\n" + text_a);
        }
    }
}
