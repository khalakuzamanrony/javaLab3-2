package myjavaprojects;

public class PronicNumber {

    int nums[] = new int[12];

    public void TraversePronicNumber(int v) {

        for (int i = 1; i < nums.length; i++) {
            nums[i] = i * (i + 1);
        }
        for (int j = 1; j < nums.length; j++) {
            if(nums[j]>100)
            {
                break;
            }
            System.out.println(nums[j]);
        }

        System.out.println("Is "+v+" Pronic : "+isPronic(v));

    }

    public boolean isPronic(int num) {
        boolean x = true;
        for (int i = 1; i < nums.length; i++) {
            if (num == nums[i]) {

                return x = true;

            } else {

                return x = false;
            }
        }

       return x;
    }

    public static void main(String[] args) {
        PronicNumber x = new PronicNumber();
        x.TraversePronicNumber(3);
        System.out.println(" ");
    }
}
