public class ArrayCRUD{

    public static void insertionAtStart(int[] arr, int x) {
        for(int i = arr.length-1; i>0; i--) {
            arr[i] = arr[i-1];
        }
        arr[0] = x;
    }
    public static void insertionAtEnd(int[] arr, int x) {
        arr[arr.length-1] = x;
    }

    public static boolean insertionAtGivenIndex(int[] arr, int x, int index) {
        if(index> arr.length-1 || index < 0) {
            return false;
        } 

        for(int i = arr.length-1; i>index;i--) {
            arr[i] = arr[i-1];
        }
        arr[index] = x;

        return true;
    }

    public static void insertionInSortedArray(int[]arr,int x) {
        for(int i=arr.length-1; i > 0;i--){
            if(arr[i-1] >x) {
                arr[i] = arr[i-1];
            } else {
                arr[i] = x;
                return;
            }
        } 
        arr[0] = x;
    }

    public static void deleteAtStart(int[]arr) {
        for(int i = 0; i < arr.length-1; i++) {
            arr[i] = arr[i+1];
        }
        arr[arr.length-1] = -1;
    }

    public static void deleteAtEnd(int[] arr) {
        arr[arr.length-1] = -1;
    }

    public static boolean deleteAtGivenPosition(int[] arr,int index) {
        if( index > arr.length -1 || index < 0 ) {
            return false;
        }
        for(int i = index; i < arr.length-1;i++) {
            arr[i] = arr[i+1];
        }
        arr[arr.length -1 ] = -1;
        return true;
    }

    public static boolean deleteAGivenNumber(int[] arr, int x) {
        int pos = -1;
        for(int i=0; i < arr.length; i++ ){
            if(arr[i] == x) {
                pos = i;
                break;
            }
        }
        if(pos == -1) {
            return false;
        } 

        for(int i = pos; i< arr.length -1; i++) {
            arr[i]= arr[i+1];
        }

        arr[arr.length-1] = -1;

        return true;
    }

    public static void deleteDuplicatesInSortedArray(int[] arr) {
        if(arr.length == 0 || arr.length == 1) {
            return ;
        }
        
        int pos = 0;
        for(int i =0; i< arr.length;i++ ){
            if(arr[pos] != arr[i]) {
                pos++;
                arr[pos] = arr[i];
            }
        }
        for(int i = pos + 1; i < arr.length;i++) {
            arr[i] = -1;
        }

    }

    public static void printAllELements(int[] arr) {
        for(int i=0; i < arr.length;i++) {
                System.out.println(arr[i]);
        }
    }

    public static void ReverseAnArray(int[] arr) {
        int low = 0;
        int high = arr.length-1;

        while(low < high) {
            int temp = arr[low];
            arr[low] = arr[high];
            arr[high] = temp;
            low++;
            high--;
        }
    }


    public static int[] minMaxInArray(int[] arr) {
        int min = arr[0];
        int max = arr[0];
        for(int i=0; i< arr.length;i++ ){
            if(arr[i] < min) {
                min = arr[i];
            }

            if(arr[i] > max) {
                max = arr[i];
            }
        }
        int[] res = {min , max};
        return res;
    }
    
    public static int sumOfAllElements(int[] arr) {
        int sum = 0;
        for(int i =0; i < arr.length;i++){
            sum = sum + arr[i];
        }

        return sum;
    }
    public static void main( String [] args) {
        int[] arr = {1,2,3,4,5};
        int sum = sumOfAllElements(arr);
        System.out.println(sum);
        
    }
        

}