package Array;

public class multidimArr {
    public static void main(String[] args) {
        int nums[][]= new int[3][4];
        
        for(int i=0;i<3;i++) //outer loop
        {
            for(int j=0;j<4;j++) //Iner loop
            {
                System.out.print(nums[i][j] + " ");
            }
            System.out.println();
        }

    }
}
