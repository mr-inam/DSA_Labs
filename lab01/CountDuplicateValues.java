public class CountDuplicateValues {
    public static void main(String[] args) {
        int origArr[] = {21,21,21,21,21, 9, 17, 43, 9, 15, 21, 6, 38, 6};
        int copArr[] = origArr;
        int count = 0;
        for (int i = 0; i < copArr.length; i++) {
            boolean found = false;
            for (int j = i+1; j < copArr.length; j++) {
                if(copArr[i] == copArr[j] && found == false && copArr[j] != 0) {
                    count++;
                    found = true;
                }
                if (found && copArr[j] == copArr[i]) {
                    copArr[j] = 0;
                }
            }
        }
        System.out.println("Original array is:");
        for (int i = 0; i < copArr.length; i++) {
            System.out.print(" "+origArr[i]);
        }
        System.out.println("number of duplicate itoms are: "+count);
    }
}
