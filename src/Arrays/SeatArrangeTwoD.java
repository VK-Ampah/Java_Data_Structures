package Arrays;

public class SeatArrangeTwoD {
    char twoDim[][] = null;


    public SeatArrangeTwoD(int rowLength, int colLength) {
        this.twoDim = new char[rowLength][colLength];
        // set min values to fill the matrix
        for (int row = 0; row < twoDim.length; row++) {
            for (int col = 0; col < twoDim[0].length; col++) {
                twoDim[row][col] = '0';
            }
        }
    }

    public char[][] getArray() {
        return this.twoDim;
    }

    public void insertValueInTheArray(int row, int col, char value) {
        try {
            if (twoDim[row][col] == '0') {
                twoDim[row][col] = value;
                System.out.println("The value is successfully inserted");
            } else {
                System.out.println("This cell is already occupiend");
            }
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Invalid Index for 2D array");
        }
    }

    public void traverse() {
        for (int row = 0; row < twoDim.length; row++) {
            for (int col = 0; col < twoDim[0].length; col++) {
                System.out.print(twoDim[row][col] + " ");
            }
            System.out.println();
        }
    }

    public void checkAvailableSeat(int rowpos, int colpos, char value) {

                if (twoDim[rowpos][colpos] == '0') {
                    System.out.println("seat is available");
                    twoDim[rowpos][colpos] = value;
                    System.out.println("Seat booked successfully");
                }
                else if (twoDim[rowpos][colpos] == 'X') {
                    System.out.println("seat is unavailable");
                }
    }

    public static void main(String[] args) {
        //initialize 2d array with 4 rows and 2 columns
        SeatArrangeTwoD new2DArray = new SeatArrangeTwoD(4, 3);
        new2DArray.insertValueInTheArray(0, 0, '0');
        new2DArray.insertValueInTheArray(0, 1, 'X');
        new2DArray.insertValueInTheArray(0, 2, '0');
        new2DArray.insertValueInTheArray(1, 0, 'X');
        new2DArray.insertValueInTheArray(1, 1, '0');
        new2DArray.insertValueInTheArray(1, 2, 'X');
        new2DArray.insertValueInTheArray(2, 0, '0');
        new2DArray.insertValueInTheArray(2, 1, 'X');
        new2DArray.insertValueInTheArray(2, 2, '0');
        new2DArray.insertValueInTheArray(3, 0, 'X');
        new2DArray.insertValueInTheArray(3, 1, '0');
        new2DArray.insertValueInTheArray(3, 2, 'X');

// display seating
        new2DArray.traverse();
        new2DArray.checkAvailableSeat(3, 1, 'X');
//        System.out.println(Arrays.toString(new2DArray.twoDim));

        new2DArray.traverse();
    }
}



