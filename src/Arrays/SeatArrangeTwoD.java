package Arrays;

import java.util.Scanner;

public class SeatArrangeTwoD {
    char[][] twoDim = null;
    private Scanner colInput;
    private Scanner rowInput;


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
            // check if the cell is empty or not
            if (twoDim[row][col] == '0') {
                twoDim[row][col] = value;
                System.out.println("The value" + value + "is successfully inserted");
            } else {
                System.out.println("This cell is already occupied");
            }
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Invalid Index for 2D array");
        }
    }

public void bookSeat() {
    boolean seatBooked = false;
    while (!seatBooked) {
        // get the users favourable seating position
        System.out.println("Enter the row number");
        rowInput = new Scanner(System.in);
        int row = rowInput.nextInt();
        System.out.println("Enter the column number");
        colInput = new Scanner(System.in);
        int col = colInput.nextInt();
        System.out.println("Enter the value to insert");
        char value = colInput.next().toUpperCase().charAt(0);

        // Add 1 to row and col to display the correct row and col number
        int rowconvert =  row + 1;
        int colconvert =  col + 1;

        try {
            if (twoDim[row][col] == '0') {
                System.out.println("Booking seat...");
                twoDim[row][col] = value;
                System.out.println("Row " + rowconvert + " seat " + colconvert + " is booked successfully");
                seatBooked = true;
            } else {
                System.out.println("Row " + rowconvert + " seat " + colconvert + " is already booked");
                System.out.println("Please select another seat");
            }
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Invalid Index for 2D array");
        }
    }
}

    public void traverse() {
        for (char[] chars : twoDim) {
            for (int col = 0; col < twoDim[0].length; col++) {
                System.out.print(chars[col] + " ");
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        //initialize 2d array with 4 rows and 2 columns
        SeatArrangeTwoD new2DArray = new SeatArrangeTwoD(4, 3);
        // insert default seating arrangements
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
        // book a seat
        new2DArray.bookSeat();
        // display seating
        new2DArray.traverse();

    }
}



