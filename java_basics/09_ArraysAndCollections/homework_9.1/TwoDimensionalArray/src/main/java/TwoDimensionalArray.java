public class TwoDimensionalArray {
    public static char symbol = 'X';

    public static char[][] getTwoDimensionalArray(int size) {
        char[][] massiv = new char[size][size];

        for (int i =0; i < size; i++){
            for (int j =0; j < size; j ++) {
                if (j == (size-i) -1 || j ==i){
                    massiv[i][j] = symbol;
                }
                else {
                    massiv[i][j] = ' ';
                }
            }
        }
        for (int i =0; i < size; i++){
            for (int j = 0; j < size ; j ++) {
                System.out.print(massiv[i][j]);
            }
            System.out.println();
        }

        //TODO: Написать метод, который создаст двумерный массив char заданного размера.
        // массив должен содержать символ symbol по диагоналям, пример для size = 3
        // [X,  , X]
        // [ , X,  ]
        // [X,  , X]

        return massiv;
    }
}
