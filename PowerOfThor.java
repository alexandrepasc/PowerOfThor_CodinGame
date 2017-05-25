import java.util.*;
import java.io.*;
import java.math.*;

/**
 * Solve this puzzle by writing the shortest code.
 * Whitespaces (spaces, new lines, tabs...) are counted in the total amount of chars.
 * These comments should be burnt after reading!
 **/
class Player {

    public static void main(String args[]) {
        Scanner in = new Scanner(System.in);
        int LX = in.nextInt(); // the X position of the light of power
        int LY = in.nextInt(); // the Y position of the light of power
        int TX = in.nextInt(); // Thor's starting X position
        int TY = in.nextInt(); // Thor's starting Y position
        
        int thorX = TX;
        int thorY = TY;
                
        String go = null;

        // game loop
        while (true) {
            int remainingTurns = in.nextInt(); // The level of Thor's remaining energy, representing the number of moves he can still make.

            System.err.println("ty: " + TY);
            System.err.println("ly: " + LY);

            if (thorX == LX) {
                if (thorY > LY) {
                    go = "N";
                    thorY = thorY - 1;
                }
                else {
                    go = "S";
                    thorY = thorY + 1;
                }
            }
            
            else if(thorX > LX) {
                if (thorY > LY) {
                    go = "NW";
                    thorY = thorY - 1;
                    thorX = thorX - 1;
                }
                else if (thorY < LY) {
                    go = "SW";
                    thorY = thorY + 1;
                    thorX = thorX - 1;
                }
                else {
                    go = "W";
                    thorX = thorX - 1;
                }
            }
            
            else if (thorX < LX) {
                if (thorY > LY) {
                    go = "NE";
                    thorY = thorY - 1;
                    thorX = thorX + 1;
                }
                else if (thorY < LY) {
                    go = "SE";
                    thorY = thorY + 1;
                    thorX = thorX + 1;
                }
                else if (thorY == LY) {
                    go = "E";
                    thorX = thorX + 1;
                }
            }
            // Write an action using System.out.println()
            // To debug: System.err.println("Debug messages...");


            // A single line providing the move to be made: N NE E SE S SW W or NW
            System.out.println(go);
        }
    }
}
