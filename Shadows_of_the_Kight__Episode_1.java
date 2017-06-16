import java.util.*;
import java.io.*;
import java.math.*;

/**
 * Auto-generated code below aims at helping you parse
 * the standard input according to the problem statement.
 **/
class Player {
    private static int L = 0;
    private static int R = 0;
    private static int U = 0;
    private static int D = 0;
    static int X0 = 0;
    static int Y0 = 0;
    public static void main(String args[]) {
        Scanner in = new Scanner(System.in);
        R = in.nextInt(); // width of the building.
        D = in.nextInt(); // height of the building.
        int N = in.nextInt(); // maximum number of turns before game over.
        X0 = in.nextInt();
        Y0 = in.nextInt();

        // game loop
        while (true) {
            String bombDir = in.next(); // the direction of the bombs from batman's current location (U, UR, R, DR, D, DL, L or UL)

            switch(bombDir){
                case "U":  //UP
                    binarySearch(X0, X0, U, (Y0-1));
                    break;
                case "UR": //UP-RIGHT
                    binarySearch((X0+1), R, U, (Y0-1));
                    break;
                case "R":  //RIGHT
                    binarySearch((X0+1), R, Y0, Y0);
                    break;
                case "DR": //DOWN-RIGHT
                    binarySearch((X0+1), R, (Y0+1), D);
                    break;
                case "D":  //DOWN
                    binarySearch(X0, X0, (Y0+1), D);
                    break;
                case "DL": //DOWN-LEFT
                    binarySearch(L, (X0-1), (Y0+1), D);
                    break;
                case "L":  //LEFT
                    binarySearch(L, (X0-1), Y0, Y0);
                    break;
                case "UL": //UP-LEFT
                    binarySearch(L, (X0-1), U, (Y0-1));
                    break;
            }
        }
    }
    
    private static void binarySearch(int l, int r, int u, int d){
        L = l;
        R = r;
        U = u;
        D = d;
        setBatCoords(((R+L)/2), ((D+U)/2));
        
        System.out.println(X0+" "+Y0);
    }
    
    public static void setBatCoords(int x, int y){
        Y0 = y;
        X0 = x;
    }
}
