
public class Loader
{
    public static void main(String[] args)
    {
        System.out.println("===========================================");
        Cat putin = new Cat();
        System.out.println("Putin weight:" +putin.getWeight());
        //putin.meow();
        while (putin.getWeight() <9000)
        {
            putin.feed((double)100.0);
            //if(putin.getWeight()>9000)
               // break;
        }
        Cat abama = new Cat();
        Cat merkel = new Cat();
        Cat erdogan = new Cat();
        Cat makron = new Cat();
        System.out.println("Putin weight после приёма пищи:" +putin.getWeight());
        System.out.println("Что с Путиным? : "+ putin.getStatus());
        System.out.println("Что с Путиным? : "+ putin.getStatus());
        System.out.println("Что с Путиным? : "+ putin.getStatus());
        System.out.println("Что с Путиным? : "+ putin.getStatus());
        System.out.println("Что с Путиным? : "+ putin.getStatus());
        System.out.println("Что с Путиным? : "+ putin.getStatus());
        putin.meow();  //Проверка задание со *
        putin.feed(100.0); //Проверка задание со *
        putin.pee(); //Проверка задание со *
        System.out.println("Putin weight:" +putin.getWeight());
        System.out.println("Сколько кошек? " + Cat.getCount());
        System.out.println("===========================================");

//Проверка задания 3 урока добавляем кота, в цонце меняется значение - Сколько кошек:
       // Cat medvedev = new Cat();


        Cat gitler = new Cat();
        System.out.println("Gitler weight : "+ gitler.getWeight());
        //System.out.println("Вес кота : "+ gitler.getWeight());
        while (gitler.getWeight()<9000)
        {
            gitler.drink((double)1000.0);
        }
        System.out.println("Gitler weight вес кота после питья: "+ gitler.getWeight());
        System.out.println("что с fашиком: " +gitler.getStatus());
        gitler.pee();
        gitler.pee();
        gitler.pee();
        gitler.pee(); gitler.pee(); gitler.pee();
        gitler.pee();


        System.out.println("Что с Гитлером?  : "+ gitler.getStatus());

        //System.out.println("Status: "+ gitler.getStatus());
        //System.out.println("Gitler weight:" );
        System.out.println("===========================================");

         Cat napoleon = new Cat();
        System.out.println("Napoleon weight:" +napoleon.getWeight());
        napoleon.meow();
        napoleon.feed((double)100+150);
        napoleon.pee();
        napoleon.pee();
        System.out.println("Napoleon weight:" +napoleon.getWeight());
        System.out.println("Сколько съел этот французский кот?  = " + napoleon.getReturnFeed());
        System.out.println("Что с Наполеном? :" +napoleon.getStatus());
        System.out.println("===========================================");

        Cat petr1 = new Cat();
        System.out.println("Petr1 weight: " + petr1.getWeight());
        System.out.println("Что с Петром 1? :" + petr1.getStatus());
        System.out.println("===========================================");

        Cat stalin = new Cat();
        System.out.println("Stalin weight:" +stalin.getWeight());
        System.out.println("Что со Сталином? " + stalin.getStatus());
        System.out.println("===========================================");

        Cat churchill = new Cat();
        System.out.println("Churchill weight:"  +churchill.getWeight());
        System.out.println("Что с котом? : "+ churchill.getStatus());
        churchill.FOOD(500.0);
        System.out.println("Churchill weight:"  +churchill.getWeight());
        System.out.println("Churchill weight:"  +churchill.getWeight());
        churchill.feed((double)1000);
        System.out.println("Churchill weight: "  + churchill.getWeight());
        //while(churchill.getWeight()>1000)
        {
            churchill.meow();
        }
        churchill.pee();
        System.out.println("Вес кота :" + churchill.getWeight());
        System.out.println("Что с Черчелем ? : "+ churchill.getStatus());
        System.out.println("Что с Черчелем ? : "+ churchill.getStatus());
        System.out.println("Сколько кошек? " + Cat.getCount());
        System.out.println("Что со мной? : " + churchill.isAlive());
        //System.out.println("Статус Черчеля "+churchill.getCatAlive());
        System.out.println(Cat.getCount());
        System.out.println("4er4el: " + churchill.isWeightNormal());
        System.out.println("4er4el: " + churchill.isAlive());
        System.out.println("AAAAa "+  Cat.getCount());
        churchill.FOOD(10000.0);
        System.out.println(churchill.getStatus());
        System.out.println(churchill.isAlive());
        // System.out.println(putin.getStatus());
        System.out.println(churchill.isWeightNormal());
        System.out.println(churchill.getWeight());
        churchill.feed((double)1000);
        System.out.println(churchill.getWeight());
        churchill.FOOD(100000.0);
        System.out.println("Что с Черчелем ? : "+ churchill.getStatus());
        System.out.println("Что с Петром 1? :" + petr1.getStatus());
        System.out.println("Что с Наполеном? :" +napoleon.getStatus());
        napoleon.FOOD(1000.0);
        System.out.println("Что с Наполеном? :" +napoleon.getStatus());
        System.out.println("что с Гитлером?: " +gitler.getStatus());
        System.out.println("Что с Путиным? : "+ putin.getStatus());
        System.out.println("Что с Путиным? : "+ putin.getStatus());
        System.out.println("Количество оставшихся котов:  "+  Cat.getCount() + " кота;");
        System.out.println("Количество оставшихся котов:  "+  Cat.getCount()+ " кота;");
        churchill.FOOD(100000.0);
        churchill.feed((double)1000);
        System.out.println("Возвращаем количество съеденной еды Черчелем: "+ churchill.getReturnFeed());
        System.out.println(churchill.getWeight());


    }
}