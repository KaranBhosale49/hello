public class Question7 {
    public static void main(String[] args) {
        int []arr ={5,12,14,6,78,19,1,23,26,35,37,7,52,86,47};
        int n = arr.length;
        for (int i = 0; i < arr.length; i++)
            for (int j = 0; j < n-i-1; j++)
                if (arr[j] > arr[j+1]) {
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                }
        for(int i=0; i<n; ++i)
            System.out.print(arr[i] + " ");
        System.out.println();
    }
}
