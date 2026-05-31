package A3MonthsPlan.Section6;

public class ForLoopToFindDuplicatedNumber {

    public static void main(String[] args) {
        int myArr[] = {1, 2, 3, 4, 5, 3, 6, 7, 8, 9, 10, 1, 2, 9};

        for (int i =0; i < myArr.length; i++){
            for (int j =i+1; j < myArr.length; j++){
                if (myArr[i] == myArr[j]){
                    System.out.println(myArr[i] + " " + myArr[j]);
                }
            }

        }
    }

}
