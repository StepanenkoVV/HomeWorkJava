
public class Cat {
    private double originWeight;
    private double weight;

    private double minWeight;
    private double maxWeight;
    private double massFood; //Количество съеденной еды
    private static int count = 0;


    public Cat() {
        weight = 1500.0 + 3000.0 * Math.random();
        originWeight = weight;
        minWeight = 1000.0;
        maxWeight = 9000.0;
        count++;

    }

    public static int getCount() {

        return count;
    }

    public void meow() {
        if (isAlive()) {
            weight = weight - 1;
            System.out.println("Meow");
        } else if (getWeight() > maxWeight) {

            System.out.println(isAlive());
        } else if (getWeight() < minWeight) {

            System.out.println(isAlive());
        }

    }

    public void pee() {
        if (isAlive()) {
            weight = weight - 75;
            System.out.println("Pee Pee:  Теперь можно и попить");
        } else if (getWeight() > maxWeight) {

            System.out.println(isAlive());
        } else if (getWeight() < minWeight) {

            System.out.println(isAlive());
        }
    }


    public void feed(Double amount) {
        if (isAlive()) {
            weight = weight + amount;
            massFood = amount;
            if (weight < minWeight || weight > maxWeight)
                count--;
        } else if (getWeight() > maxWeight) {

            System.out.println(isAlive());
        } else if (getWeight() < minWeight) {

            System.out.println(isAlive());
        }


        //Количество съеденной еды равно сумме которую мы указываем когда кладем кошке(коту) покушать.
    }

    public void drink(Double amount) {
        if (isAlive())
            weight = weight + amount;
        if (weight < minWeight || weight > maxWeight)
            count--;
        else if (getWeight() > maxWeight) {

            System.out.println(isAlive());
        } else if (getWeight() < minWeight) {

            System.out.println(isAlive());
        }
    }


    public Double getWeight() {
        if (weight < minWeight && weight > maxWeight)
            count--;
        return weight;
    }


    public boolean isWeightNormal() {
        return (weight > minWeight && weight < maxWeight);
    }  //Контроль жизни кота


    public Double getReturnFeed() {
        return massFood; /***как и в случаю с командой показать getWeight,
         мы просто выводим на экран сумму которую указали в Feed, не зависимо какой вес у кошки текущий **/

    }

    public String getStatus() {
        if (weight < minWeight) {
            return "Dead";
        } else if (weight > maxWeight) {
            return "Exploded";
        } else if (weight > originWeight) {
            return "Sleeping";
        } else {
            return "Playing";
        }
    }

    // public boolean isAlive() //переменная которая свидетельствует о том что кот жив.
    //  {
    //      return getWeight() >= minWeight && getWeight() <= maxWeight;
    // }

    public void FOOD (Double amount)
    {
        if (isAlive()) {
            weight = weight + amount;
            massFood = amount;
            if (weight < minWeight || weight > maxWeight)
                count--;
        }
        if(isWeightNormal()) {

            //System.out.println(""+ isAlive());
        } else if(!isWeightNormal()) {

            System.out.println("" + isAlive());
        }
    }

    //(weight < minWeight || weight > maxWeight)
    //count--;

    public boolean isAlive() //переменная которая свидетельствует о том что кот жив.
     {
         if (!isWeightNormal()) return false;
         if (isWeightNormal()) return true;
         return isWeightNormal();
     }

}
