import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        task1();
    }

    public static void task1() {
        String firstName = "Ivan";
        String middleName = "Ivanovich";
        String lastName = "Ivanov";
        String fullName = lastName + " " + firstName + " " + middleName;

        System.out.println("ФИО сотрудника — " + fullName);
    }

    public static void task2() {
        String fullName = "Ivanov Ivan Ivanovich";
        System.out.println("Данные ФИО сотрудника для заполнения отчета — " + fullName.toUpperCase());
    }

    public static void task3() {
        String fullName = "Иванов Семён Семёнович";
        fullName = fullName.replace('ё', 'е');
        System.out.println("Данные ФИО сотрудника — " + fullName);
    }

    public static void task4() {
        String fullName = "Ivanov Ivan Ivanovich";
        int firstIndex = fullName.indexOf(" ") + 1;
        int lastIndex = fullName.lastIndexOf(" ") + 1;

        String firstName = fullName.substring(firstIndex, lastIndex);
        String middleName = fullName.substring(lastIndex, fullName.length() - 1);
        String lastName = fullName.substring(0, firstIndex);

        System.out.println("Имя сотрудника — " + firstName);
        System.out.println("Отчество сотрудника — " + middleName);
        System.out.println("Фамилия сотрудника — " + lastName);
    }

    public static void task5() {
        String fullName = "ivanov ivan ivanovich";
        String newFullName = "";
        newFullName = fullName.substring(0, 1).toUpperCase();

        for (int i = 1; i < fullName.length(); i++) {
            if (" ".equals(fullName.substring(i - 1, i))) {
                newFullName = newFullName + fullName.substring(i, i + 1).toUpperCase();
            } else {
                newFullName = newFullName + fullName.substring(i, i + 1);
            }
        }
        System.out.println("Верное написание Ф. И. О. сотрудника с заглавных букв — " + newFullName);
    }

    public static void task6() {
        String str1 = "135";
        String str2 = "246";

        StringBuilder sb = new StringBuilder(str1 + str2);

        for (int i = 0; i < sb.length(); i++) {
            for (int b = i; b < sb.length(); b++) {
                if (sb.charAt(i) > sb.charAt(b)) {
                    int oldElement = sb.charAt(i);
                    sb.setCharAt(i, sb.charAt(b));
                    sb.setCharAt(b, (char) oldElement);
                }
            }
        }
        System.out.println("Данные строки — " + sb);

    }

    public static void task7() {
        String str = "aabccddefgghiijjkk";
        String newStr = "";

        for (int i = 0; i < str.length() - 1; i++) {
            if (str.charAt(i) == str.charAt(i + 1)) {
                newStr = newStr + str.charAt(i);
            }
        }
        System.out.println(newStr);
    }
}
