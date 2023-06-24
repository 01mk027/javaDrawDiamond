import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        System.out.println("Enter the number of lines: ");
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        int iterator1 = 0;
        int iterator2 = 0;
        int numberOfSpaces1;
        //Part 1 - Start
        while(iterator1 <= n - 1)
        {
            int numberOfSpacesIterator1 = 0;
            numberOfSpaces1 = n - iterator1;
            while(numberOfSpacesIterator1 < numberOfSpaces1){
                System.out.print(" ");
                numberOfSpacesIterator1++;
            }
            //System.out.print((2 * iterator1) + 1);//Buradan yola çıkacağız
            int numberOfStarsIterator = 1;
            while(numberOfStarsIterator <= (2 * iterator1) + 1)
            {
                System.out.print("*");
                numberOfStarsIterator++;
            }
            iterator1++;
            System.out.println();
        }
        //Part 1 - End
        //Part 2 - Start
        while(iterator2 <= n - 1)
        {
            int numberOfSpacesIterator2 = 0;
            while(numberOfSpacesIterator2 <= iterator2)
            {
                System.out.print(" ");
                numberOfSpacesIterator2++;
            }
            int numberOfStarsIterator2 = 0;
            while(numberOfStarsIterator2 <= (2 * (n - iterator2)) - 2)
            {
                System.out.print("*");
                numberOfStarsIterator2++;
            }
            iterator2++;
            System.out.println();
        }
        
    }
}
