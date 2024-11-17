package Array;

public class Demo {
    public static void main(String[] args) {
        // int nums[] = {6,5,2,6};
        // nums[0] = 8;// modified the array 
        // System.out.println(nums[0]);

        int boxs[] = new int[4];
        boxs[0] =7;
        boxs[1] =5;
        boxs[2] =9;
        boxs[3] =3;

        boxs[0] =8;

        for(int i=0;i<4;i++)
        {
            System.out.println(boxs[i]);
        }
    }
}
