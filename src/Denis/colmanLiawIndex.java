package Denis;

import java.util.Scanner;

public class colmanLiawIndex {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in); //Создаем объект Scanner: Мы создаем экземпляр Scanner, который будет использоваться для считывания ввода с консоли.
        System.out.println("Введите текст: "); //Выводим сообщение: Программа просит пользователя ввести текст, который будет анализироваться.

        String text = scanner.nextLine(); //Считываем ввод: С помощью метода nextLine() мы считываем строку текста, введенную пользователем, и сохраняем ее в переменной text.
        int letterCount = countLetters(text); //Подсчет букв: Вызываем метод countLetters, передавая ему текст, и сохраняем результат (количество букв) в переменной letterCount.
        int wordCount = countWords(text); //Подсчет слов: Вызываем метод countWords, передавая ему текст, и сохраняем результат (количество слов) в переменной wordCount.
        int sentenceCount = countSentences(text); // Подсчет предложений: Вызываем метод countSentences, передавая ему текст, и сохраняем результат (количество предложений) в переменной sentenceCount.

        if (wordCount == 0){ // Проверка на количество слов: Если количество слов равно нулю, программа выводит сообщение и завершает выполнение, чтобы избежать деления на ноль.
            System.out.println("Текст не содержит слов");
            return;
        }

        double L = (double) letterCount / wordCount * 100; // Вычисление L: Вычисляем среднее количество букв на 100 слов. Используем приведение к типу double, чтобы получить точное значение.
        double S = (double) sentenceCount / wordCount * 100; // Вычисление S: Вычисляем среднее количество предложений на 100 слов аналогично предыдущему шагу.
        double index = 0.0588 * L - 0.296 * S - 15.8; // Вычисление индекса Колмана — Лиау: Применяем формулу для вычисления индекса, используя ранее вычисленные значения L и S.

        //Если индекс больше 16, выводим "Grade 16+".
        //Если индекс находится в диапазоне от 1 до 16, округляем его и выводим соответствующий класс.
        //Если индекс меньше 1, выводим "Grade before 1".
        if (index > 16) {
            System.out.println("Grade 16+");
        } else if (index >= 1 && index <= 16) {
            System.out.printf("Grade %.0f%n", Math.round(index));
        } else if (index < 1){
            System.out.println("Grade before 1");
        }
    }
    // **Метод countLetters:**
    //  - Создаем переменную count для подсчета букв.
    //  - Перебираем каждый символ текста. Если символ является буквой (проверяем с помощью Character.isLetter), увеличиваем счетчик count.
    //  - Возвращаем общее количество букв.
    private static int countLetters(String text) {
        int count;
        for (count = 0; count < text.length(); count++){
            char c = text.charAt(count);
            if (Character.isLetter(c)) {
                count++;
            }
        }
        return count;
    }
    //  **Метод countWords:**
    //  - Убираем лишние пробелы в начале и конце текста с помощью trim(),
    private static int countWords(String text) {
        String[] words = text.trim().split("\\s+");
        return words.length == 1 && words[0].isEmpty() ? 0 : words.length;
    }
    // затем разбиваем текст на слова по пробелам (split("\\s+")).
    //  - Если массив слов содержит только одну пустую строку, возвращаем 0. В противном случае возвращаем количество слов.
    // Метод countSentences:**
    //  - Разбиваем текст на предложения по символам конца предложения (точка, вопросительный и восклицательный знаки).
    //  - Проверяем, если массив содержит только одну пустую строку, возвращаем 0. В противном случае возвращаем количество предложений.
    private static int countSentences(String text) {
        String[] sentences = text.split("[.!?]");
        return sentences.length == 1 && sentences[0].isEmpty() ? 0 : sentences.length; // Обработка пустого ввода
    }

}



