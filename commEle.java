//wac to find common elements in an array
import java.util.Scanner;
class commEle {
public static void main(String[] args)
    {
        Scanner scn = new Scanner(System.in);
        int size1 = scn.nextInt();
        int[] arr1=new int[size1];
        System.out.print("Enter arr 1 ele: ");
        for(int i =0;i<size1;i++)
            arr1[i] = scn.nextInt();
        System.out.print("Enter arr 2 size: ");
        int size2 = scn.nextInt();
        int[] arr2=new int[size2];
        System.out.print("Enter arr 2 ele: ");
        for(int i =0;i<size2;i++)
            arr2[i] = scn.nextInt();

        for(int i = 0;i <size1;i++){
            for(int j=0;j<size2;j++){
                if (arr1[i] == arr2[j]) {
                    System.out.print(arr1[i] + " ");
                    break;
                }
            }
        }
        scn.close();
    }
}
        
