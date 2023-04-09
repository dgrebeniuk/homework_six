package com.nelfek;

public class Main {

   public static void main(String[] args) {
      int a = 100;
      int b = 7;

      int sum = a + b;
      System.out.println("Сложение: " + sum);
      int sub = a - b;
      System.out.println("Вычитание: " + sub);
      int division = a / b;
      System.out.println("Деление: " + division);
      int multi = a * b;
      System.out.println("Умножение: " + multi);
      int remainder = a % b;
      System.out.println("Остаток: " + remainder);

      int s = 10;
      s += 5;
      System.out.println("Присвоение: " + s);
      s /= 5;
      System.out.println("Присвоение: " + s);

      byte x = 17;
      byte y = 17;
      boolean isEqual = x == y;
      System.out.println("Равно: " + isEqual);
      boolean isNotEqual = x != y;
      System.out.println("Не равно: " + isNotEqual);
      boolean isMore = x > y;
      System.out.println("Больше: " + isMore);
      boolean isLess = x <= y;
      System.out.println("Меньше или равно: " + isLess);

      boolean truth = true;
      boolean lie = false;
      boolean and = truth && lie;
      System.out.println("И: " + and);
      boolean or = truth || lie;
      System.out.println("Или: " + or);
      boolean otr = !truth;
      System.out.println("Отрицание: " + otr);

      //Переполнение
      int over = Integer.MAX_VALUE;
      int one = 1;
      int overflow = over + one;
      System.out.println("Переполнение: " + overflow);
      System.out.println("Переполнение: " + over);

      //Разные типы данных
      Integer Am = 10;
      Double Db = 2.0;
      System.out.println("Разные типы: " + (Am / Db));
   }
}
