 /* Пусть дан произвольный список целых чисел.

1) Нужно удалить из него чётные числа
2) Найти минимальное значение
3) Найти максимальное значение
4) Найти среднее значение
  */

  public class HW-JAVA-3 {
  public static void main(String[] args) {

 ArrayList<Integer> list1 = new ArrayList<Integer>();
 for (int i = 0; i < 10; i++) {
 int val = rand.nextInt(-100, 100);
 list1.add(val);
        }
 System.out.printf("Spisok 1", list1);
 int i = 0;
 while (i < list1.size()) {
 if (list1.get(i) % 2 == 0) {
 list1.remove(i);
            }
 else {
 i++;
            }
        }
 System.out.printf("Spisok 2", list1);
    }
  }