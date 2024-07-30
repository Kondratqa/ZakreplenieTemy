Для реализации вычисления индекса Колмана — Лиау на Java, мы можем создать программу, которая будет принимать текст, подсчитывать количество букв, слов и предложений, а затем вычислять индекс и выводить соответствующий класс.



- **Импортируем класс Scanner:** Этот класс позволяет считывать ввод пользователя с консоли. Мы используем его для получения текста, который нужно анализировать.



- **Объявляем класс:** Это начало определения класса ColemanLiauIndex, который содержит основной код программы.

    

- **Основной метод:** Это точка входа в программу. Метод main выполняется при запуске программы.

        

- **Создаем объект Scanner:** Мы создаем экземпляр Scanner, который будет использоваться для считывания ввода с консоли.

      

- **Выводим сообщение:** Программа просит пользователя ввести текст, который будет анализироваться.

       

- **Считываем ввод:** С помощью метода nextLine() мы считываем строку текста, введенную пользователем, и сохраняем ее в переменной text.

       

- **Подсчет букв:** Вызываем метод countLetters, передавая ему текст, и сохраняем результат (количество букв) в переменной letterCount.

        

- **Подсчет слов:** Вызываем метод countWords, передавая ему текст, и сохраняем результат (количество слов) в переменной wordCount.

       

- **Подсчет предложений:** Вызываем метод countSentences, передавая ему текст, и сохраняем результат (количество предложений) в переменной sentenceCount.

     

- **Проверка на количество слов:** Если количество слов равно нулю, программа выводит сообщение и завершает выполнение, чтобы избежать деления на ноль.

        

- **Вычисление L:** Вычисляем среднее количество букв на 100 слов. Используем приведение к типу double, чтобы получить точное значение.

        

- **Вычисление S:** Вычисляем среднее количество предложений на 100 слов аналогично предыдущему шагу.

        

- **Вычисление индекса Колмана — Лиау:** Применяем формулу для вычисления индекса, используя ранее вычисленные значения L и S.

    
- **Вывод результата:** В зависимости от значения индекса:
  - Если индекс больше 16, выводим "Grade 16+".
  - Если индекс находится в диапазоне от 1 до 16, округляем его и выводим соответствующий класс.
  - Если индекс меньше 1, выводим "Grade before 1".

### Методы подсчета:



- **Метод countLetters:**
  - Создаем переменную count для подсчета букв.
  - Перебираем каждый символ текста. Если символ является буквой (проверяем с помощью Character.isLetter), увеличиваем счетчик count.
  - Возвращаем общее количество букв.

 

- **Метод countWords:**
  - Убираем лишние пробелы в начале и конце текста с помощью trim(),


затем разбиваем текст на слова по пробелам ```(split("\\s+")).```
  - Если массив слов содержит только одну пустую строку, возвращаем 0. В противном случае возвращаем количество слов.



- **Метод countSentences:**
  - Разбиваем текст на предложения по символам конца предложения (точка, вопросительный и восклицательный знаки).
  - Проверяем, если массив содержит только одну пустую строку, возвращаем 0. В противном случае возвращаем количество предложений.

Таким образом, программа последовательно выполняет все шаги для подсчета необходимых параметров текста и вычисления индекса Колмана — Лиау.


### Ёлочка Ёлочка Ёлочка Ёлочка Ёлочка Ёлочка Ёлочка



public class StarTriangle {

- ```public class StarTriangle```: Здесь мы объявляем класс с именем ```StarTriangle.``` В Java каждый код должен быть частью класса.

    ```public static void main(String[] args) {```

- ```public static void main(String[] args):``` Это метод main, который является точкой входа в программу. Когда вы запускаете программу, выполнение начинается с этого метода.

        int height = 4; // Высота треугольника

- `````int height = 4;:````` Мы объявляем целочисленную переменную height и присваиваем ей значение 4. Это будет высота нашего треугольника, то есть количество строк, которые мы хотим напечатать.

        for (int i = 1; i <= height; i++) {

- ```for (int i = 1; i <= height; i++):``` Это внешний цикл, который будет выполняться от 1 до значения height (в данном случае от 1 до 4). Переменная i будет использоваться для отслеживания текущей строки, которую мы печатаем.

            for (int j = height; j > i; j--) {

- ```for (int j = height; j > i; j--):``` Это внутренний цикл, который отвечает за печать пробелов перед звездочками. Он начинается с height и продолжается, пока j больше i. Таким образом, с каждой новой строкой количество пробелов уменьшается.

                System.out.print(" ");

- ```System.out.print(" ");:``` Эта строка печатает пробел. Мы используем print, чтобы не переходить на новую строку после вывода пробела. Каждый раз, когда внутренний цикл выполняется, он добавляет пробелы перед звездочками.

            for (int k = 1; k <= (2 * i - 1); k++) {

- ```for (int k = 1; k <= (2 * i - 1); k++):``` Это второй внутренний цикл, который отвечает за печать звездочек. Количество звездочек в каждой строке рассчитывается по формуле (2 * i - 1). Например, для первой строки (i = 1) будет 1 звезда, для второй (i = 2) — 3 звезды и так далее.

                System.out.print("*");

- ```System.out.print("*");:``` Эта строка печатает одну звездочку. Как и в случае с пробелами, мы используем print, чтобы оставаться на той же строке.

            System.out.println();

- ```System.out.println();:``` После того как все пробелы и звездочки для текущей строки напечатаны, эта строка переходит на новую строку. Теперь мы готовы к печати следующей строки треугольника.

             }
           }
        }

- Эти строки закрывают все открытые блоки: внешний цикл, метод main и класс StarTriangle.