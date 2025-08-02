                                                    // to remove the consecutive repeating elemeents from the aray

public class DeleteConsecutiveDuplicates {
    public static void main(String[] args) {
        int a[] = {1,2,20,30,20,40,40,60,2};
        int len = a.length;
        len = removeDuplicates(a, len);
        for(int i = 0; i < len; i++){
            System.out.print(a[i] + " ");
        }

    }

    static int removeDuplicates(int[] a, int len) {
        if(len ==0 || len ==1) return len;
        int j =0;
        int[] temp = new int[len];
        for(int i = 0; i < len-1; i++){
            if(a[i] != a[i+1]){
                temp[j++] = a[i];
            }
        }
        temp[j++] = a[len-1];
        for(int i = 0; i < j; i++){
            a[i] = temp[i];
        }

        return j;
    }
            
}