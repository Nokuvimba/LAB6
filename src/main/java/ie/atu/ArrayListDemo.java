package ie.atu;
import java.util.Scanner;
import java.util.ArrayList;
public class ArrayListDemo {
    public static void main(String[] args)

    {
        ArrayList<Integer> indexArray = new ArrayList<Integer>();

        indexArray.add(100);
        indexArray.add(200);
        indexArray.add(300);
        indexArray.add(400);
        indexArray.add(500);
        indexArray.add(600);
        indexArray.add(700);
        indexArray.add(800);
        indexArray.add(900);
        indexArray.add(1000);

        Scanner scanner= new Scanner(System.in);
        System.out.println("Enter new value:");
indexArray.add(scanner.nextInt());
        int indexValue = 0;
        for (int value : indexArray) {
            System.out.println(" Element at index: " + indexValue + " " + value);
            indexValue++;
        }

    }
}
