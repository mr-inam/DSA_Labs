public class RemoveDupValQ4 {
    public static void main(String[] args) {
        int origArr[] = {21, 9, 17, 43, 9, 15, 21, 6, 38, 6};
        
        System.out.print("Original array is: [");
        for (int i = 0; i < origArr.length; i++) {
            System.out.print(origArr[i]+ " ");
        }
        System.out.println("]");

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
        int newArr[] = new int[copArr.length-count];
        for (int i = 0,j=0; i < copArr.length; i++) {
            if (copArr[i] != 0) {
                newArr[j] = copArr[i];
                j++;
            }
        }

        System.out.print("New array is: [");
        for (int i = 0; i < newArr.length; i++) {
            System.out.print(" "+newArr[i]);
        }
        System.out.println("]");

        System.out.println("The size of original array: "+origArr.length);
        System.out.println("The size of new array: "+newArr.length);
    }
}
