package jul25;

public class Main {

    public static void main(String[] args) {
        int[][] arr = new int[5][3]; // 5 is the row, 3 is the col
        int [][]  marks = {
                {1,2,3},
                {4,5,6},
                {7,8,9},
        };

        arr[0][0] = 100;
        arr[0][1] = 200;
        arr[0][2] = 300;
        arr[1][0] = 400;
        arr[1][1] = 400;
        arr[1][2] = 400;
        arr[2][0] = 400;
        arr[2][1] = 400;
        arr[2][2] = 400;

        for(int i = 0; i <=marks.length-1 ; i++){ // marks.length = row
            for (int j = 0; j < marks[i].length; j++) { // marks[i].length = cols
               System.out.print(marks[i][j] + " ");
            }
            System.out.println();
        }

        for (int[] mark: marks){
            for(int ele : mark){
                System.out.println(ele);
            }
        }
    }
}


