import java.util.Scanner;

public class Main {

  public static void main(String[] args) {
    int container = 1;
    int truck = 1;
    final int MAX_BOX_IN_CONTAINER = 27;
    final int MAX_CONTAINER_IN_TRUCK = 12;
    Scanner scanner = new Scanner(System.in);
    String boxes = scanner.nextLine();
    int box1 = Integer.parseInt(boxes);
    if (box1 > 0) {
      System.out.println("Грузовик: " + truck);
      System.out.println("\tКонтейнер: " + container);
      for (int i = 1; i <= box1; i++) {
        System.out.println("\t\tЯщик: " + i);
        if (box1 == MAX_BOX_IN_CONTAINER) {
          continue;
        }
        if (container < MAX_CONTAINER_IN_TRUCK && i % MAX_BOX_IN_CONTAINER == 0) {
          container += 1;
          System.out.println("\tКонтейнер: " + container);
        }
        if (truck > 0 && i % (MAX_BOX_IN_CONTAINER * MAX_CONTAINER_IN_TRUCK)
            == 0) {
          truck += 1;
          container += 1;
          System.out.println("Грузовик: " + truck);
          System.out.println("\tКонтейнер: " + container);
        }
      }
      System.out.println(
          "Необходимо:\nгрузовиков - " + truck + " шт." + "\nконтейнеров - " + container + " шт.");
    } else {
      System.out.println("Необходимо:\nгрузовиков - 0 шт." + "\nконтейнеров - 0 шт.");
    }

    // TODO: вывести в консоль коробки разложенные по грузовикам и контейнерам
    // пример вывода при вводе 2
    // для отступа используйте табуляцию - \t

        /*
        Грузовик: 1
            Контейнер: 1
                Ящик: 1
                Ящик: 2
        Необходимо:
        грузовиков - 1 шт.
        контейнеров - 1 шт.
        */
  }
}
