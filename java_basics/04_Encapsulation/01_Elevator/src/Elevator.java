public class Elevator {
    /**
     *  -3 - minFloor
     *   26 - maxFloor
     */

    private int currentFloor = 1;  //текущий этаж
    private int maxFloor = 26;
    private int minFloor = -3;
    //private int floor = 0;

    public Elevator(int minFloor,int maxFloor){
    }

    public int getCurrenFloor(){
        return currentFloor;
    }

    public void moveUp(){
        currentFloor = currentFloor <  maxFloor? currentFloor +1 : currentFloor; System.out.println(" Номер этажа  "+ currentFloor); }
    public void moveDown (){
        currentFloor =  currentFloor > minFloor? currentFloor -1: currentFloor; System.out.println( " Номер этажа  "+ currentFloor); }
    public void move (int floor) {
        if (floor > maxFloor) { System.out.println("false , попробуйте снова ");   return;  }

        if (floor < minFloor) {  System.out.println("false , попробуйте снова ");   return;  }

        if (currentFloor == floor) { System.out.println("ничего" );  return;  }


        if (currentFloor < floor) {  while (currentFloor != floor)  moveUp(); }

        if (currentFloor > floor) { while (currentFloor!=floor) moveDown();  }


    }

}
