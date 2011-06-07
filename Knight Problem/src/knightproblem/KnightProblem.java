/*
 * It takes 63 turns to visit each square, if we take into consideration
 * that the starting position square is already visited before the first turn.
 */

package knightproblem;

import org.jfree.chart.ChartFactory;
import org.jfree.chart.ChartFrame;
import org.jfree.chart.JFreeChart;
import org.jfree.chart.plot.PlotOrientation;
import org.jfree.data.xy.XYDataset;
import org.jfree.data.xy.XYSeries;
import org.jfree.data.xy.XYSeriesCollection;

/**
 * @author Julio Mejia
 */
public class KnightProblem {

    /**
     * @param It takes 63 turns to visit each square, if we take into consideration
     * the
     */
    public static void main(String[] args) {
        int [][] chessboard;
        int y;
        int x;
        int z1;
        int z2;
        int z3;
        int z4;
        int z5;
        int z6;
        int z7;
        int z8;
        int min;
        int count;
        int move1x;
        int move1y;
        int move2x;
        int move2y;
        int move3x;
        int move3y;
        int move4x;
        int move4y;
        int move5x;
        int move5y;
        int move6x;
        int move6y;
        int move7x;
        int move7y;
        int move8x;
        int move8y;
        int nextmove1x;
        int nextmove1y;
        int nextmove2x;
        int nextmove2y;
        int nextmove3x;
        int nextmove3y;
        int nextmove4x;
        int nextmove4y;
        int nextmove5x;
        int nextmove5y;
        int nextmove6x;
        int nextmove6y;
        int nextmove7x;
        int nextmove7y;
        int nextmove8x;
        int nextmove8y;
        int posmove1;
        int posmove2;
        int posmove3;
        int posmove4;
        int posmove5;
        int posmove6;
        int posmove7;
        int posmove8;
        int totposmove1;
        int totposmove2;
        int totposmove3;
        int totposmove4;
        int totposmove5;
        int totposmove6;
        int totposmove7;
        int totposmove8;
        int i;
        int j;
        int sum;
        char squarex = 'a';
        int squarey = 1;
        chessboard = new int[8][8];
        int turn = 1;
        /**I used JFreeChart to create the graph*/
        XYSeries series = new XYSeries("Moves");
        /**Initializing all squares to 0
         *number 0 will represent non-visited squares
         *number 1 will represent already visited squares*/
        for(y = 0; y < 8; y++) {
            for(x = 0; x < 8; x++) {
                chessboard[y][x] = 0;
            }
        }
        /**This is the starting position on the lower-right hand corner, square h1*/
        y = 7;
        x = 7;
        chessboard[y][x] = 1;
        sum = 1; /**The sum variable will be adding the value of each square to keep track of all visited squares */
        System.out.println("Knight starts from square h1");
        do { /**do-while will be executed until all squares have been visited*/
            /**This part evaluates the first knight movement, 2 squares up and 1 square right*/
            move1x = x + 1;
            move1y = y - 2;
            /**This part will evaluate all 8 next possible moves after the first move to determine how much of them are valid*/
            nextmove1x = move1x + 1;
            nextmove1y = move1y - 2;
            nextmove2x = move1x - 1;
            nextmove2y = move1y - 2;
            nextmove3x = move1x - 2;
            nextmove3y = move1y - 1;
            nextmove4x = move1x - 2;
            nextmove4y = move1y + 1;
            nextmove5x = move1x - 1;
            nextmove5y = move1y + 2;
            nextmove6x = move1x + 1;
            nextmove6y = move1y + 2;
            nextmove7x = move1x + 2;
            nextmove7y = move1y + 1;
            nextmove8x = move1x + 2;
            nextmove8y = move1y - 1;
            posmove1 = 0;
            posmove2 = 0;
            posmove3 = 0;
            posmove4 = 0;
            posmove5 = 0;
            posmove6 = 0;
            posmove7 = 0;
            posmove8 = 0;
            z1 = 0;
            z2 = 0;
            z3 = 0;
            z4 = 0;
            z5 = 0;
            z6 = 0;
            z7 = 0;
            z8 = 0;
            /**First "if" is to determine wether the first movement is possible or not,
             * by checking it isn't out of bounds and confirming the square has not been visited yet
             * The variable z1 will be 1 if the first move is possible
             */
            if(move1x <= 7 && move1x >= 0 && move1y <= 7 && move1y >= 0 && chessboard[move1y][move1x] == 0) {
                z1 = 1;
                /**Next 8 "ifs" will evaluate all 8 next possible moves after the first move*/
                if(nextmove1x <= 7 && nextmove1x >= 0 && nextmove1y <= 7 && nextmove1y >= 0 && chessboard[move1y][move1x]  == 0) {
                    posmove1 = 1;
                }
                if(nextmove2x <= 7 && nextmove2x >= 0 && nextmove2y <= 7 && nextmove2y >= 0 && chessboard[move1y][move1x]  == 0) {
                    posmove2 = 1;
                }
                if(nextmove3x <= 7 && nextmove3x >= 0 && nextmove3y <= 7 && nextmove3y >= 0 && chessboard[move1y][move1x]  == 0) {
                    posmove3 = 1;
                }
                if(nextmove4x <= 7 && nextmove4x >= 0 && nextmove4y <= 7 && nextmove4y >= 0 && chessboard[move1y][move1x]  == 0) {
                    posmove4 = 1;
                }
                if(nextmove5x <= 7 && nextmove5x >= 0 && nextmove5y <= 7 && nextmove5y >= 0 && chessboard[move1y][move1x]  == 0) {
                    posmove5 = 1;
                }
                if(nextmove6x <= 7 && nextmove6x >= 0 && nextmove6y <= 7 && nextmove6y >= 0 && chessboard[move1y][move1x]  == 0) {
                    posmove6 = 1;
                }
                if(nextmove7x <= 7 && nextmove7x >= 0 && nextmove7y <= 7 && nextmove7y >= 0 && chessboard[move1y][move1x]  == 0) {
                    posmove7 = 1;
                }
                if(nextmove8x <= 7 && nextmove8x >= 0 && nextmove8y <= 7 && nextmove8y >= 0 && chessboard[move1y][move1x]  == 0) {
                    posmove8 = 1;
                }
            }
            /**Just initializing a minimum value in order to compare to the sum of all
             * next possible valid moves after the first move for all 8 initial possible moves*/
            if(z1 == 1) {
                totposmove1 = posmove1 + posmove2 + posmove3 + posmove4 + posmove5 + posmove6 + posmove7 + posmove8;
            }else {
                totposmove1 = 9;
            }
            min = totposmove1;
            /**The count  variable will be used to select the actual next move based on which one has the least
             * amount of next possible moves
             */
            count = 1;
            /**Now evaluating second move, 2 squares up, 1 square left*/
            move2x = x - 1;
            move2y = y - 2;
            nextmove1x = move2x + 1;
            nextmove1y = move2y - 2;
            nextmove2x = move2x - 1;
            nextmove2y = move2y - 2;
            nextmove3x = move2x - 2;
            nextmove3y = move2y - 1;
            nextmove4x = move2x - 2;
            nextmove4y = move2y + 1;
            nextmove5x = move2x - 1;
            nextmove5y = move2y + 2;
            nextmove6x = move2x + 1;
            nextmove6y = move2y + 2;
            nextmove7x = move2x + 2;
            nextmove7y = move2y + 1;
            nextmove8x = move2x + 2;
            nextmove8y = move2y - 1;
            posmove1 = 0;
            posmove2 = 0;
            posmove3 = 0;
            posmove4 = 0;
            posmove5 = 0;
            posmove6 = 0;
            posmove7 = 0;
            posmove8 = 0;
            if(move2x <= 7 && move2x >= 0 && move2y <= 7 && move2y >= 0 && chessboard[move2y][move2x] == 0) {
                z2 = 1;
                if(nextmove1x <= 7 && nextmove1x >= 0 && nextmove1y <= 7 && nextmove1y >= 0 && chessboard[move2y][move2x]  == 0) {
                    posmove1 = 1;
                }
                if(nextmove2x <= 7 && nextmove2x >= 0 && nextmove2y <= 7 && nextmove2y >= 0 && chessboard[move2y][move2x]  == 0) {
                    posmove2 = 1;
                }
                if(nextmove3x <= 7 && nextmove3x >= 0 && nextmove3y <= 7 && nextmove3y >= 0 && chessboard[move2y][move2x]  == 0) {
                    posmove3 = 1;
                }
                if(nextmove4x <= 7 && nextmove4x >= 0 && nextmove4y <= 7 && nextmove4y >= 0 && chessboard[move2y][move2x]  == 0) {
                    posmove4 = 1;
                }
                if(nextmove5x <= 7 && nextmove5x >= 0 && nextmove5y <= 7 && nextmove5y >= 0 && chessboard[move2y][move2x]  == 0) {
                    posmove5 = 1;
                }
                if(nextmove6x <= 7 && nextmove6x >= 0 && nextmove6y <= 7 && nextmove6y >= 0 && chessboard[move2y][move2x]  == 0) {
                    posmove6 = 1;
                }
                if(nextmove7x <= 7 && nextmove7x >= 0 && nextmove7y <= 7 && nextmove7y >= 0 && chessboard[move2y][move2x]  == 0) {
                    posmove7 = 1;
                }
                if(nextmove8x <= 7 && nextmove8x >= 0 && nextmove8y <= 7 && nextmove8y >= 0 && chessboard[move2y][move2x]  == 0) {
                    posmove8 = 1;
                }
            }
            if(z2 == 1) {
                totposmove2 = posmove1 + posmove2 + posmove3 + posmove4 + posmove5 + posmove6 + posmove7 + posmove8;
            } else{
                totposmove2 = 9;
            }
            if(totposmove2 <= min) {
                min = totposmove2;
                count = 2;
            }
            /**Third move, 2 squares left, 1 square up*/
            move3x = x - 2;
            move3y = y - 1;
            nextmove1x = move3x + 1;
            nextmove1y = move3y - 2;
            nextmove2x = move3x - 1;
            nextmove2y = move3y - 2;
            nextmove3x = move3x - 2;
            nextmove3y = move3y - 1;
            nextmove4x = move3x - 2;
            nextmove4y = move3y + 1;
            nextmove5x = move3x - 1;
            nextmove5y = move3y + 2;
            nextmove6x = move3x + 1;
            nextmove6y = move3y + 2;
            nextmove7x = move3x + 2;
            nextmove7y = move3y + 1;
            nextmove8x = move3x + 2;
            nextmove8y = move3y - 1;
            posmove1 = 0;
            posmove2 = 0;
            posmove3 = 0;
            posmove4 = 0;
            posmove5 = 0;
            posmove6 = 0;
            posmove7 = 0;
            posmove8 = 0;
            if(move3x <= 7 && move3x >= 0 && move3y <= 7 && move3y >= 0 && chessboard[move3y][move3x] == 0) {
                z3 = 1;
                if(nextmove1x <= 7 && nextmove1x >= 0 && nextmove1y <= 7 && nextmove1y >= 0 && chessboard[move3y][move3x]  == 0) {
                    posmove1 = 1;
                }
                if(nextmove2x <= 7 && nextmove2x >= 0 && nextmove2y <= 7 && nextmove2y >= 0 && chessboard[move3y][move3x]  == 0) {
                    posmove2 = 1;
                }
                if(nextmove3x <= 7 && nextmove3x >= 0 && nextmove3y <= 7 && nextmove3y >= 0 && chessboard[move3y][move3x]  == 0) {
                    posmove3 = 1;
                }
                if(nextmove4x <= 7 && nextmove4x >= 0 && nextmove4y <= 7 && nextmove4y >= 0 && chessboard[move3y][move3x]  == 0) {
                    posmove4 = 1;
                }
                if(nextmove5x <= 7 && nextmove5x >= 0 && nextmove5y <= 7 && nextmove5y >= 0 && chessboard[move3y][move3x]  == 0) {
                    posmove5 = 1;
                }
                if(nextmove6x <= 7 && nextmove6x >= 0 && nextmove6y <= 7 && nextmove6y >= 0 && chessboard[move3y][move3x]  == 0) {
                    posmove6 = 1;
                }
                if(nextmove7x <= 7 && nextmove7x >= 0 && nextmove7y <= 7 && nextmove7y >= 0 && chessboard[move3y][move3x]  == 0) {
                    posmove7 = 1;
                }
                if(nextmove8x <= 7 && nextmove8x >= 0 && nextmove8y <= 7 && nextmove8y >= 0 && chessboard[move3y][move3x]  == 0) {
                    posmove8 = 1;
                }
            }
            if(z3 == 1) {
                totposmove3 = posmove1 + posmove2 + posmove3 + posmove4 + posmove5 + posmove6 + posmove7 + posmove8;
            } else {
                totposmove3 = 9;
            }
            if(totposmove3 <= min) {
                min = totposmove3;
                count = 3;
            }
            /**Move 4, 2 squares left, 1 square down*/
            move4x = x - 2;
            move4y = y + 1;
            nextmove1x = move4x + 1;
            nextmove1y = move4y - 2;
            nextmove2x = move4x - 1;
            nextmove2y = move4y - 2;
            nextmove3x = move4x - 2;
            nextmove3y = move4y - 1;
            nextmove4x = move4x - 2;
            nextmove4y = move4y + 1;
            nextmove5x = move4x - 1;
            nextmove5y = move4y + 2;
            nextmove6x = move4x + 1;
            nextmove6y = move4y + 2;
            nextmove7x = move4x + 2;
            nextmove7y = move4y + 1;
            nextmove8x = move4x + 2;
            nextmove8y = move4y - 1;
            posmove1 = 0;
            posmove2 = 0;
            posmove3 = 0;
            posmove4 = 0;
            posmove5 = 0;
            posmove6 = 0;
            posmove7 = 0;
            posmove8 = 0;
            if(move4x <= 7 && move4x >= 0 && move4y <= 7 && move4y >= 0 && chessboard[move4y][move4x] == 0) {
                z4 = 1;
                if(nextmove1x <= 7 && nextmove1x >= 0 && nextmove1y <= 7 && nextmove1y >= 0 && chessboard[move4y][move4x] == 0) {
                    posmove1 = 1;
                }
                if(nextmove2x <= 7 && nextmove2x >= 0 && nextmove2y <= 7 && nextmove2y >= 0 && chessboard[move4y][move4x] == 0) {
                    posmove2 = 1;
                }
                if(nextmove3x <= 7 && nextmove3x >= 0 && nextmove3y <= 7 && nextmove3y >= 0 && chessboard[move4y][move4x] == 0) {
                    posmove3 = 1;
                }
                if(nextmove4x <= 7 && nextmove4x >= 0 && nextmove4y <= 7 && nextmove4y >= 0 && chessboard[move4y][move4x] == 0) {
                    posmove4 = 1;
                }
                if(nextmove5x <= 7 && nextmove5x >= 0 && nextmove5y <= 7 && nextmove5y >= 0 && chessboard[move4y][move4x] == 0) {
                    posmove5 = 1;
                }
                if(nextmove6x <= 7 && nextmove6x >= 0 && nextmove6y <= 7 && nextmove6y >= 0 && chessboard[move4y][move4x] == 0) {
                    posmove6 = 1;
                }
                if(nextmove7x <= 7 && nextmove7x >= 0 && nextmove7y <= 7 && nextmove7y >= 0 && chessboard[move4y][move4x] == 0) {
                    posmove7 = 1;
                }
                if(nextmove8x <= 7 && nextmove8x >= 0 && nextmove8y <= 7 && nextmove8y >= 0 && chessboard[move4y][move4x] == 0) {
                    posmove8 = 1;
                }
            }
            if(z4 == 1) {
                totposmove4 = posmove1 + posmove2 + posmove3 + posmove4 + posmove5 + posmove6 + posmove7 + posmove8;
            } else{
                totposmove4 = 9;
            }
            if(totposmove4 <= min) {
                min = totposmove4;
                count = 4;
            }
            /**2 squares down, 1 square left*/
            move5x = x - 1;
            move5y = y + 2;
            nextmove1x = move5x + 1;
            nextmove1y = move5y - 2;
            nextmove2x = move5x - 1;
            nextmove2y = move5y - 2;
            nextmove3x = move5x - 2;
            nextmove3y = move5y - 1;
            nextmove4x = move5x - 2;
            nextmove4y = move5y + 1;
            nextmove5x = move5x - 1;
            nextmove5y = move5y + 2;
            nextmove6x = move5x + 1;
            nextmove6y = move5y + 2;
            nextmove7x = move5x + 2;
            nextmove7y = move5y + 1;
            nextmove8x = move5x + 2;
            nextmove8y = move5y - 1;
            posmove1 = 0;
            posmove2 = 0;
            posmove3 = 0;
            posmove4 = 0;
            posmove5 = 0;
            posmove6 = 0;
            posmove7 = 0;
            posmove8 = 0;
            if(move5x <= 7 && move5x >= 0 && move5y <= 7 && move5y >= 0 && chessboard[move5y][move5x] == 0) {
                z5 =1;
                if(nextmove1x <= 7 && nextmove1x >= 0 && nextmove1y <= 7 && nextmove1y >= 0 && chessboard[move5y][move5x] == 0) {
                    posmove1 = 1;
                }
                if(nextmove2x <= 7 && nextmove2x >= 0 && nextmove2y <= 7 && nextmove2y >= 0 && chessboard[move5y][move5x] == 0) {
                    posmove2 = 1;
                }
                if(nextmove3x <= 7 && nextmove3x >= 0 && nextmove3y <= 7 && nextmove3y >= 0 && chessboard[move5y][move5x] == 0) {
                    posmove3 = 1;
                }
                if(nextmove4x <= 7 && nextmove4x >= 0 && nextmove4y <= 7 && nextmove4y >= 0 && chessboard[move5y][move5x] == 0) {
                    posmove4 = 1;
                }
                if(nextmove5x <= 7 && nextmove5x >= 0 && nextmove5y <= 7 && nextmove5y >= 0 && chessboard[move5y][move5x] == 0) {
                    posmove5 = 1;
                }
                if(nextmove6x <= 7 && nextmove6x >= 0 && nextmove6y <= 7 && nextmove6y >= 0 && chessboard[move5y][move5x] == 0) {
                    posmove6 = 1;
                }
                if(nextmove7x <= 7 && nextmove7x >= 0 && nextmove7y <= 7 && nextmove7y >= 0 && chessboard[move5y][move5x] == 0) {
                    posmove7 = 1;
                }
                if(nextmove8x <= 7 && nextmove8x >= 0 && nextmove8y <= 7 && nextmove8y >= 0 && chessboard[move5y][move5x] == 0) {
                    posmove8 = 1;
                }
            }
            if(z5 == 1) {
                totposmove5 = posmove1 + posmove2 + posmove3 + posmove4 + posmove5 + posmove6 + posmove7 + posmove8;
            } else{
                totposmove5 = 9;
            }
            if(totposmove5 < min) {
                min = totposmove5;
                count = 5;
            }
            /**2 squares down, 1 square right*/
            move6x = x + 1;
            move6y = y + 2;
            nextmove1x = move6x + 1;
            nextmove1y = move6y - 2;
            nextmove2x = move6x - 1;
            nextmove2y = move6y - 2;
            nextmove3x = move6x - 2;
            nextmove3y = move6y - 1;
            nextmove4x = move6x - 2;
            nextmove4y = move6y + 1;
            nextmove5x = move6x - 1;
            nextmove5y = move6y + 2;
            nextmove6x = move6x + 1;
            nextmove6y = move6y + 2;
            nextmove7x = move6x + 2;
            nextmove7y = move6y + 1;
            nextmove8x = move6x + 2;
            nextmove8y = move6y - 1;
            posmove1 = 0;
            posmove2 = 0;
            posmove3 = 0;
            posmove4 = 0;
            posmove5 = 0;
            posmove6 = 0;
            posmove7 = 0;
            posmove8 = 0;
            if(move6x <= 7 && move6x >= 0 && move6y <= 7 && move6y >= 0 && chessboard[move6y][move6x] == 0) {
                z6 = 1;
                if(nextmove1x <= 7 && nextmove1x >= 0 && nextmove1y <= 7 && nextmove1y >= 0 && chessboard[move6y][move6x] == 0) {
                    posmove1 = 1;
                }
                if(nextmove2x <= 7 && nextmove2x >= 0 && nextmove2y <= 7 && nextmove2y >= 0 && chessboard[move6y][move6x] == 0) {
                    posmove2 = 1;
                }
                if(nextmove3x <= 7 && nextmove3x >= 0 && nextmove3y <= 7 && nextmove3y >= 0 && chessboard[move6y][move6x] == 0) {
                    posmove3 = 1;
                }
                if(nextmove4x <= 7 && nextmove4x >= 0 && nextmove4y <= 7 && nextmove4y >= 0 && chessboard[move6y][move6x] == 0) {
                    posmove4 = 1;
                }
                if(nextmove5x <= 7 && nextmove5x >= 0 && nextmove5y <= 7 && nextmove5y >= 0 && chessboard[move6y][move6x] == 0) {
                    posmove5 = 1;
                }
                if(nextmove6x <= 7 && nextmove6x >= 0 && nextmove6y <= 7 && nextmove6y >= 0 && chessboard[move6y][move6x] == 0) {
                    posmove6 = 1;
                }
                if(nextmove7x <= 7 && nextmove7x >= 0 && nextmove7y <= 7 && nextmove7y >= 0 && chessboard[move6y][move6x] == 0) {
                    posmove7 = 1;
                }
                if(nextmove8x <= 7 && nextmove8x >= 0 && nextmove8y <= 7 && nextmove8y >= 0 && chessboard[move6y][move6x] == 0) {
                    posmove8 = 1;
                }
            }
            if(z6 == 1) {
                totposmove6 = posmove1 + posmove2 + posmove3 + posmove4 + posmove5 + posmove6 + posmove7 + posmove8;
            } else{
                totposmove6 = 9;
            }
            if(totposmove6 < min) {
                min = totposmove6;
                count = 6;
            }
            /**2 squares right, 1 square down*/
            move7x = x + 2;
            move7y = y + 1;
            nextmove1x = move7x + 1;
            nextmove1y = move7y - 2;
            nextmove2x = move7x - 1;
            nextmove2y = move7y - 2;
            nextmove3x = move7x - 2;
            nextmove3y = move7y - 1;
            nextmove4x = move7x - 2;
            nextmove4y = move7y + 1;
            nextmove5x = move7x - 1;
            nextmove5y = move7y + 2;
            nextmove6x = move7x + 1;
            nextmove6y = move7y + 2;
            nextmove7x = move7x + 2;
            nextmove7y = move7y + 1;
            nextmove8x = move7x + 2;
            nextmove8y = move7y - 1;
            posmove1 = 0;
            posmove2 = 0;
            posmove3 = 0;
            posmove4 = 0;
            posmove5 = 0;
            posmove6 = 0;
            posmove7 = 0;
            posmove8 = 0;
            if(move7x < 7 && move7x >= 0 && move7y <= 7 && move7y >= 0 && chessboard[move7y][move7x] == 0) {
                z7 = 1;
                if(nextmove1x <= 7 && nextmove1x >= 0 && nextmove1y <= 7 && nextmove1y >= 0 && chessboard[move7y][move7x] == 0) {
                    posmove1 = 1;
                }
                if(nextmove2x <= 7 && nextmove2x >= 0 && nextmove2y <= 7 && nextmove2y >= 0 && chessboard[move7y][move7x] == 0) {
                    posmove2 = 1;
                }
                if(nextmove3x <= 7 && nextmove3x >= 0 && nextmove3y <= 7 && nextmove3y >= 0 && chessboard[move7y][move7x] == 0) {
                    posmove3 = 1;
                }
                if(nextmove4x <= 7 && nextmove4x >= 0 && nextmove4y <= 7 && nextmove4y >= 0 && chessboard[move7y][move7x] == 0) {
                    posmove4 = 1;
                }
                if(nextmove5x <= 7 && nextmove5x >= 0 && nextmove5y <= 7 && nextmove5y >= 0 && chessboard[move7y][move7x] == 0) {
                    posmove5 = 1;
                }
                if(nextmove6x <= 7 && nextmove6x >= 0 && nextmove6y <= 7 && nextmove6y >= 0 && chessboard[move7y][move7x] == 0) {
                    posmove6 = 1;
                }
                if(nextmove7x <= 7 && nextmove7x >= 0 && nextmove7y <= 7 && nextmove7y >= 0 && chessboard[move7y][move7x] == 0) {
                    posmove7 = 1;
                }
                if(nextmove8x <= 7 && nextmove8x >= 0 && nextmove8y <= 7 && nextmove8y >= 0 && chessboard[move7y][move7x] == 0) {
                    posmove8 = 1;
                }
            }
            if(z7 == 1) {
                totposmove7 = posmove1 + posmove2 + posmove3 + posmove4 + posmove5 + posmove6 + posmove7 + posmove8;
            } else{
                totposmove7 = 9;
            }
            if(totposmove7 <= min) {
                min = totposmove7;
                count = 7;
            }
            /**2 squares right, 1 square up*/
            move8x = x + 2;
            move8y = y - 1;
            nextmove1x = move8x + 1;
            nextmove1y = move8y - 2;
            nextmove2x = move8x - 1;
            nextmove2y = move8y - 2;
            nextmove3x = move8x - 2;
            nextmove3y = move8y - 1;
            nextmove4x = move8x - 2;
            nextmove4y = move8y + 1;
            nextmove5x = move8x - 1;
            nextmove5y = move8y + 2;
            nextmove6x = move8x + 1;
            nextmove6y = move8y + 2;
            nextmove7x = move8x + 2;
            nextmove7y = move8y + 1;
            nextmove8x = move8x + 2;
            nextmove8y = move8y - 1;
            posmove1 = 0;
            posmove2 = 0;
            posmove3 = 0;
            posmove4 = 0;
            posmove5 = 0;
            posmove6 = 0;
            posmove7 = 0;
            posmove8 = 0;
            if(move8x < 7 && move8x >= 0 && move8y <= 7 && move8y >= 0 && chessboard[move8y][move8x] == 0) {
                z8 = 1;
                if(nextmove1x <= 7 && nextmove1x >= 0 && nextmove1y <= 7 && nextmove1y >= 0 && chessboard[move8y][move8x] == 0) {
                    posmove1 = 1;
                }
                if(nextmove2x <= 7 && nextmove2x >= 0 && nextmove2y <= 7 && nextmove2y >= 0 && chessboard[move8y][move8x] == 0) {
                    posmove2 = 1;
                }
                if(nextmove3x <= 7 && nextmove3x >= 0 && nextmove3y <= 7 && nextmove3y >= 0 && chessboard[move8y][move8x] == 0) {
                    posmove3 = 1;
                }
                if(nextmove4x <= 7 && nextmove4x >= 0 && nextmove4y <= 7 && nextmove4y >= 0 && chessboard[move8y][move8x] == 0) {
                    posmove4 = 1;
                }
                if(nextmove5x <= 7 && nextmove5x >= 0 && nextmove5y <= 7 && nextmove5y >= 0 && chessboard[move8y][move8x] == 0) {
                    posmove5 = 1;
                }
                if(nextmove6x <= 7 && nextmove6x >= 0 && nextmove6y <= 7 && nextmove6y >= 0 && chessboard[move8y][move8x] == 0) {
                    posmove6 = 1;
                }
                if(nextmove7x <= 7 && nextmove7x >= 0 && nextmove7y <= 7 && nextmove7y >= 0 && chessboard[move8y][move8x] == 0) {
                    posmove7 = 1;
                }
                if(nextmove8x <= 7 && nextmove8x >= 0 && nextmove8y <= 7 && nextmove8y >= 0 && chessboard[move8y][move8x] == 0) {
                posmove8 = 1;
                }
            }
            if(z8 == 1) {
                totposmove8 = posmove1 + posmove2 + posmove3 + posmove4 + posmove5 + posmove6 + posmove7 + posmove8;
            } else{
                totposmove8 = 9;
            }
            if(totposmove8 < min) {
                min = totposmove8;
                count = 8;
            }
            /**The switch will select the next move,
             * switching the postition to the next square
             * and changing the value of the square to 1
             */
            switch(count) {
                case 1: x = move1x;
                        y = move1y;
                        chessboard[y][x] = 1;
                        break;
                case 2: x = move2x;
                        y = move2y;
                        chessboard[y][x] = 1;
                        break;
                case 3: x = move3x;
                        y = move3y;
                        chessboard[y][x] = 1;
                        break;
                case 4: x = move4x;
                        y = move4y;
                        chessboard[y][x] = 1;
                        break;
                case 5: x = move5x;
                        y = move5y;
                        chessboard[y][x] = 1;
                        break;
                case 6: x = move6x;
                        y = move6y;
                        chessboard[y][x] = 1;
                        break;
                case 7: x = move7x;
                        y = move7y;
                        chessboard[y][x] = 1;
                        break;
                case 8: x = move8x;
                        y = move8y;
                        chessboard[y][x] = 1;
                        break;
            }
            switch(x) {
                case 0: squarex = 'a'; break;
                case 1: squarex = 'b'; break;
                case 2: squarex = 'c'; break;
                case 3: squarex = 'd'; break;
                case 4: squarex = 'e'; break;
                case 5: squarex = 'f'; break;
                case 6: squarex = 'g'; break;
                case 7: squarex = 'h'; break;
            }
            switch(y) {
                case 0: squarey = 8; break;
                case 1: squarey = 7; break;
                case 2: squarey = 6; break;
                case 3: squarey = 5; break;
                case 4: squarey = 4; break;
                case 5: squarey = 3; break;
                case 6: squarey = 2; break;
                case 7: squarey = 1; break;
            }
            System.out.println("Turn: " + turn + " Square: "+ squarex +""+ squarey);
            series.add(turn, sum);
            turn++;
            /**Just adding up the value of each square to determine how many of them have been
             * already visited
             */
            sum = 0;
            for(i = 0; i < 8; i++) {
                for(j = 0; j < 8; j++) {
                    sum = chessboard[i][j] + sum;
                }
            }
        } while (sum < 64);
        XYDataset xyDataset = new XYSeriesCollection(series);
	JFreeChart chart = ChartFactory.createXYLineChart
		      ("Moves required to cover entire chessboard", "Move Number", "Squares Covered", xyDataset, PlotOrientation.VERTICAL, false, true, false);
	ChartFrame frame1=new ChartFrame("IGN Code-Foo Challenge",chart);
	frame1.setVisible(true);
	frame1.setSize(300,300);
    }
}
