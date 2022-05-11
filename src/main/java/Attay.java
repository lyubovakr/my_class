public class Attay {
    public static void main(String[] args) {
     int[][] arr = new int[][]{
             {2, 7, 6, 8},
             {23, 78, 65, 78},
             {11, 15, 20, 25}
     };
    for (int i = 0; i < 3; i++) {
        for (int j=0; j<4; j++){
            System.out.print(arr[i][j] + "  ");
        }
        System.out.println("");
    }


    }
}