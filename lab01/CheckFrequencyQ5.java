public class CheckFrequencyQ5 {

    static boolean notChecked(int arr[][], int n){
        for (int i = 0; i < arr.length; i++) 
            if (arr[i][0] == n) return false;
        return true;
    }
    public static void main(String[] args) {
        int origArr[] = {21,21,21,21,21, 9, 17, 43, 9, 15, 21, 6, 38, 6};
        int arrFreq[][] = new int[origArr.length][2];
        for (int i = 0; i < origArr.length; i++) {
            for (int j = i+1; j < origArr.length; j++) {
                if (origArr[i] == origArr[j] && notChecked(arrFreq, origArr[j])) {
                    arrFreq[i][0] = origArr[j];
                    arrFreq[i][1]++;
                }
                if (origArr[i] == origArr[j] && !notChecked(arrFreq, origArr[j])) {
                    origArr[j] = 0;
                    arrFreq[i][1]++;
                }
            }
        }
        for (int i = 0; i < arrFreq.length; i++) {
            if (arrFreq[i][0] != 0) {
                System.out.println(arrFreq[i][0]+" occurs " + arrFreq[i][1]+" times");
            }
        }
    }
}
