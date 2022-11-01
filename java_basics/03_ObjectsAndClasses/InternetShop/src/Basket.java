import java.util.WeakHashMap;

public class Basket {
    private String items = "";
    private int totalPrice = 0;
    private int limit;
    private int totalweight = 0; //Переменную которая будет содержать общую массу всех товаров, добавленных в корзину.
    private static int weight = 0;
    private int totalcount = 0; // Переменная которая возвращает количество позиций в каризне
    public Basket(int totalPricelimit){
        limit = totalPricelimit;
    }

    public void add(String name, int price,int weight) {
        add(name,price,weight,1);}


        public void add(String name,int price){ add(name,price,weight,1); }



    public void add(String name, int price,int weight, int count){
        if (contains(name)) {
            return;
        }
        if (totalPrice + count * price>= limit){
            return;
        }

        items = items + "\n" + name + " - " + price + " руб." + " - "+ weight +" г./мл."+  " - " + count + " шт.";
        totalPrice = totalPrice + count * price;
        totalweight = totalweight + weight * count;
        totalcount = totalcount + count;

    }

    public int getTotalweight(){  //Метод, который будет возвращать значение веса всех товаров в корзине.
        return totalweight;
    }
    public int getTotalcount() // возращает количество(шт.) всех товаров в корзине

    {
        return totalcount;
    }


    public void clear() {
        items = "";
        totalPrice = 0;
        totalweight=0;
        totalcount=0;
    }
    public int getTotalPrice(){
        return totalPrice;// return - операция возврата. завершает программу.
    }

    public boolean contains(String  name) {
        return items.contains(name);
    }

    public void print(String  title){
        System.out.println(title);
        if(items.isEmpty()){
            System.out.println("Корзмина пуста");
        }
        else {
            System.out.println(items);
        }
    }
}


