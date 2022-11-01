public class Main {
    public static void main(String[] args) {
        Basket vasyaBasket = new Basket(100000);
        System.out.println("<<<=====================================>>>");
        vasyaBasket.add("Грибы",120,1200);
        vasyaBasket.add("Помидоры",80,350,4);
        vasyaBasket.add("Пармезан",250,400);
        vasyaBasket.print("Корзина Васи:");
        System.out.println("Итог - " + vasyaBasket.getTotalPrice() + " руб.");
        System.out.println("Общий вес товаров в корзине - " + vasyaBasket.getTotalweight() + " г.");
        System.out.println("Общее количество товаров в корзине - " + vasyaBasket.getTotalcount() + " шт.");
        System.out.println("\n");


        Basket petyaBasket = new Basket(50000);
        System.out.println("<<<=====================================>>>");
        petyaBasket.add("Pepsi",55,1000,4);
        petyaBasket.add("Sprite",55,1000,4);
        petyaBasket.add("Fanta",55,1000,4);
        petyaBasket.add("RedBull",55,1000,1);
        petyaBasket.print("Корзина Пети:");
        System.out.println("Итог - " + petyaBasket.getTotalPrice() + " руб.");
        System.out.println("Общий вес товаров в корзине - " + petyaBasket.getTotalweight() + " мл.");
        System.out.println("Общее количество товаров в корзине - " + petyaBasket.getTotalcount() + " шт.");
        System.out.println("\n");
        vasyaBasket.print("");
        System.out.println("++++++++++++++++++++++++++++++++++++++++++++");
        vasyaBasket.print("");

    }
}


