public class Elevator {


    private int currentFloor = 1;
    private int maxFloor = 26;
    private int minFloor = -3;


    public Elevator(int minFloor,int maxFloor){
    }

    public int getCurrenFloor(){
        return currentFloor;
    }

    public void moveUp(){
        currentFloor = currentFloor <  maxFloor? currentFloor +1 : currentFloor; System.out.println("Вы на этаже № - "+ currentFloor); }
    public void moveDown (){
        currentFloor =  currentFloor > minFloor? currentFloor -1: currentFloor; System.out.println( "Вы на этаже № - "+ currentFloor); }
    public void move (int floor) {
        if (floor > maxFloor) { System.out.println("Введён неверный этаж  ");  return;  }

        if (floor < minFloor) {  System.out.println("Введён неверный этаж "); return;  }

        if (currentFloor == floor) { System.out.println("   " );  }


        if (currentFloor < floor) {  while (currentFloor != floor)  moveUp(); }

        if (currentFloor > floor) { while (currentFloor!=floor) moveDown();  }


    }

}
