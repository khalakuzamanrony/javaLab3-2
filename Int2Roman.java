package myjavaprojects;

public class Int2Roman {

    public void Method1(int num) {

        StringBuilder sb = new StringBuilder();
        while (num >= 1000) {
            if (num >= 1000) {
                sb.append("M");
                num = num - 1000;

            }
        }
        while (num >= 500) {
            if (num >= 500) {
                sb.append("D");
                num = num - 500;

            }
        }
        while (num >= 100) {
            sb.append("C");
            num = - 100;

        }
        while (num >= 50) {
            sb.append("L");
            num = num - 50;

        }
        while (num >= 10) {
            sb.append("X");
            num = num - 10;

        }
        while (num >= 5) {
            sb.append("V");
            num = num - 5;

        }
        while (num >= 1) {
            sb.append("I");
            num = num - 1;

        }
        System.out.println(sb);
        //return sb.toString();
    }
    

    public static void main(String args[]) {
        int num = 550;
        Int2Roman ir = new Int2Roman();
        ir.Method1(num);

    }
}
