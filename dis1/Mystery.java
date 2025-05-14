/*
 * class Mystery 
 * function mystery return the index of minmum after the index of k 
 * function mystery2 sort the num in asc
 */
public class Mystery{

    public static int mystery(int[] inputArray, int k) {
        int x = inputArray[k];
        int answer = k;
        int index = k + 1;
        while (index < inputArray.length) {
            if (inputArray[index] < x) {
            x = inputArray[index];
            answer = index;
                    }
            index = index + 1;
                }
        return answer;
            } 

    public static void mystery2(int[] inputArray){
        int index = 0;
        while(index < inputArray.length){
            int targetIndex = mystery(inputArray, index);
            int temp = inputArray[targetIndex];
            inputArray[targetIndex] = inputArray[index];
            inputArray[index] = temp;
            index = index + 1;
        }

    }
    public static void main(String[] args){
        int[] arr = {3,0,4,6,3};
        System.out.println(mystery(arr,2));
        mystery2(arr);
                int index_temp = 0;
        while (index_temp < arr.length) {
            System.out.println(arr[index_temp]);
            index_temp = index_temp + 1;
        }
    }
}

