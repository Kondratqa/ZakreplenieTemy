package Denis;

import java.util.Scanner;

public class ColmanLiawIndex {
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

        double L = (double) letterCount / (double) wordCount * 100; // Вычисление L: Вычисляем среднее количество букв на 100 слов. Используем приведение к типу double, чтобы получить точное значение.
        double S = (double) sentenceCount / (double) wordCount * 100; // Вычисление S: Вычисляем среднее количество предложений на 100 слов аналогично предыдущему шагу.
        int index = (int) Math.round (0.0588 * L - 0.296 * S - 15.8); // Вычисление индекса Колмана — Лиау: Применяем формулу для вычисления индекса, используя ранее вычисленные значения L и S.

        //Если индекс больше 16, выводим "Grade 16+".
        //Если индекс находится в диапазоне от 1 до 16, округляем его и выводим соответствующий класс.
        //Если индекс меньше 1, выводим "Grade before 1".
        if (index >= 16) {
            System.out.println("Grade 16+");
        } else if (index <= 1){
            System.out.println("Before 1 ");
        } else {
            System.out.println("Grade " + index);
        }
    }
    public static int countLetters(String text){
        int countLetters = 0;
        for (int i = 0; i < text.length(); i++){
            if (text.charAt(i) >= 97 && text.charAt(i) <= 122 || text.charAt(i) >= 65 && text.charAt(i) <= 90){
                countLetters = countLetters + 1;
            }
        }
        return countLetters;
    }
    public static int countWords (String text){
        int countWords = 0;
        int i = 0;
        while (i < text.length()){
            if (text.charAt(i) == 32){
                countWords++;
            }
            i++;
        }
        return countWords + 1;
    }
    public static int countSentences (String text){
        int countSentences = 0;
        for (int i = 0, len = text.length(); i < len; i++){
            if (text.charAt(i) == 33 || text.charAt(i) == 46 || text.charAt(i) == 63){
                countSentences++;

            }
        }
        return countSentences;
    }
}