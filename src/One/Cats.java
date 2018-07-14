package One;

/* Подсчитать количество котов
Написать код, чтобы правильно считалось количество созданных котов (count) и на экран выдавалось правильно их количество.
*/

public class Cats
{
    public static void main(String[] args)
    {
        Cat cat1 = new Cat();
        //напишите тут ваш код
        Cat.count++;
        Cat cat2 = new Cat();
        //напишите тут ваш код
        Cat.count++;
        System.out.println("Cats count is " + Cat.count);
    }
    public static class Cat
    {
        public static int count = 0;
    }
}