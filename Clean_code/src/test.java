
public class Clean_code {
    static class Find_smallest_and_greatest_number{

        int smallest_number;
        int greatest_number;
    }

    static Find_smallest_and_greatest_number find_min_max(int arr[], int sizeofArray) {
        Find_smallest_and_greatest_number small_greater_Obj = new Find_smallest_and_greatest_number();
        int i;

        if (sizeofArray == 1) {
            small_greater_Obj.greatest_number = arr[0];
            small_greater_Obj.smallest_number= arr[0];
            return small_greater_Obj;
        }

        if (arr[0] > arr[1]) {
            small_greater_Obj.greatest_number  = arr[0];
            small_greater_Obj.smallest_number = arr[1];
        } else {
            small_greater_Obj.greatest_number = arr[1];
            small_greater_Obj.smallest_number = arr[0];
        }

        for (i = 2; i < sizeofArray; i++) {
            if (arr[i] > small_greater_Obj.greatest_number) {
                small_greater_Obj.greatest_number = arr[i];
            } else if (arr[i] < small_greater_Obj.smallest_number) {
                small_greater_Obj.smallest_number = arr[i];
            }
        }

        return small_greater_Obj;
    }

    public static void main(String args[]) {
        int arr[] = {1000, 11, 445, 1, 330, 3000};
        int lengthofArray = 6;
        Find_smallest_and_greatest_number Obj= find_min_max(arr, lengthofArray);
        System.out.printf("\nsmallest number is %d", Obj.smallest_number );
        System.out.printf("\ngreatest number is %d", Obj.greatest_number);
    }
}
