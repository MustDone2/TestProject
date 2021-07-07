import com.sun.source.tree.BinaryTree;

import java.security.PublicKey;
import java.util.Random;
import java.util.Scanner;
import java.util.SimpleTimeZone;

public class Main {
    public static char[][] map;
    public static final int SIZE = 3;
    public static final int DOTS_TO_WIN = 3;

    public static final char DOT_X = 'X';
    public static final char DOT_0 = 'O';
    public static final char DOT_EMPTY = '.';

    public static void main(String[] args){
        initMap();
        printMap();

        while (true)
        {
            humanTurn();
            printMap();

            if (isWinner(DOT_X)) {
                System.out.println("Человек победил!");
                break;
            }
            if (isMapFull())
            {
                System.out.println("Ничья!");
                break;
            }

            aiTurn();
            printMap();

            if (isWinner(DOT_0))
            {
                System.out.println("Компьютер победил!");
                break;
            }
            if (isMapFull())
            {
                System.out.println("Ничья!");
                break;
            }
        }


    }

    public static void initMap()
    {
        map = new char[SIZE][SIZE];
        for (int row = 0; row < SIZE; row++)
        {
            for (int columns = 0; columns < SIZE; columns++)
            {
                map[row][columns] = DOT_EMPTY;
            }
        }
    }

    public static void printMap()
    {
        for (int i = 0; i <= SIZE; i++)
        {
            System.out.print(i + " ");
        }

        System.out.println();

        for (int row = 0; row < SIZE; row++)
        {
            System.out.print((row + 1) + " ");
            for (int columns = 0; columns < SIZE; columns++)
            {
                System.out.print(map[row][columns] + " ");
            }
            System.out.println();
        }
    }

    public static void humanTurn()
    {
        Scanner scanner = new Scanner(System.in);

        int x;
        int y;

        do
        {
            System.out.println("Введите координаты в стиле X Y");
            x = scanner.nextInt() - 1;
            y = scanner.nextInt() - 1;

        } while (isCallValid(x, y));

        map[y][x] = DOT_X;
    }

    public static void aiTurn()
    {
        Random random = new Random();

        int x;
        int y;

        do
        {
            System.out.println("Введите координаты в формате X Y");
            x = random.nextInt(SIZE);
            y = random.nextInt(SIZE);

        } while (!isCallValid(x, y));

        System.out.println("Компьютер сходил в точку" + (x + 1)+ "" +(y + 1));

        map[y][x] = DOT_0;
    }

    public static boolean isCallValid (int x, int y)
    {
        if (x < 0 || x >= SIZE || y < 0 || y >= SIZE)
        {
            return false;
        }
        if (map[x][y] == DOT_EMPTY)
        {
            return false;
        }
        return false;
    }

    public static boolean isWinner(char symb)
    {
        int endOfOffset = map.length - DOTS_TO_WIN;

        for (int rowOffset = 0; rowOffset <= endOfOffset; rowOffset++)
        {
            if (isDiagonalsFilledWith(symb, rowOffset))
            {
                return true;
            }

            for (int columnOffset = 0; columnOffset <= endOfOffset; columnOffset++)
            {
                boolean hasWin =
                        isLinesFilledWith(symb, rowOffset, columnOffset);

                if (hasWin)
                {
                    return true;
                }
            }
        }
        return false;
    }

        static boolean isLinesFilledWith(char symb, int rowOffset, int columnOffset)
        {
            for (int row = rowOffset; row < (DOTS_TO_WIN + rowOffset); row++)
        {
            int horizontalWinCounter = 0;
            int verticalWinCounter = 0;

            for (int column = columnOffset; column < (DOTS_TO_WIN + columnOffset); column++)
            {
               if (map[row][column] == symb)
               {
                   horizontalWinCounter++;
               }
               else
               {
                   horizontalWinCounter = 0;
               }


               if(map[column][row] == symb)
               {
                   verticalWinCounter++;
               }
               else
               {
                   verticalWinCounter = 0;
               }
            }

            if ((horizontalWinCounter == DOTS_TO_WIN) || (verticalWinCounter == DOTS_TO_WIN))
            {
                return true;
            }
        }
        return false;
    }

    static boolean isDiagonalsFilledWith(char symb, int rowOffset)
    {
        int mainDiagonalCounter = 0;
        int sideDiagonalCounter = 0;

        final int subSquareLength = (DOTS_TO_WIN + rowOffset);

        for (int row = rowOffset; row < subSquareLength; row++)
        {
            if (map[row][row] == symb)
            {
                mainDiagonalCounter++;
            }
            else
            {
                mainDiagonalCounter = 0;
            }


            if (map[row][map.length - 1 - row] == symb)
            {
                sideDiagonalCounter++;
            }
            else
            {
                sideDiagonalCounter = 0;
            }
        }

        return (mainDiagonalCounter == DOTS_TO_WIN) || (sideDiagonalCounter == DOTS_TO_WIN);
    }

    public static boolean isMapFull()
    {
      for(int row = 0; row < SIZE; row++)
      {
          for(int column = 0; column < SIZE; column++)
          {
              if (map[row][column] == DOT_EMPTY)
              {
                  return false;
              }
          }
      }
      return true;
    }
}
