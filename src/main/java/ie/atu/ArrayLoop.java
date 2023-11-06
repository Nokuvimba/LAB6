package ie.atu;

public class ArrayLoop {
    public static void main(String[] args) {
        int[] indexArray;

        indexArray = new int[10];
        indexArray[0] = 100;
        indexArray[1] = 200;
        indexArray[2] = 300;
        indexArray[3] = 400;
        indexArray[4] = 500;
        indexArray[5] = 600;
        indexArray[6] = 700;
        indexArray[7] = 800;
        indexArray[8] = 900;
        indexArray[9] = 1000;

        int indexValue = 0;
        for (int value : indexArray) {
            System.out.println(" Element at index: " + indexValue + " " + value);
            indexValue++;
        }
    }
}