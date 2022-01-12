package myjavaprojects;

public class PalindromNumber {

    public boolean isPalindromeMy(int n) {
        int x = n;
        boolean b = true;
        String s = String.valueOf(n);
        StringBuilder sb = new StringBuilder();
        sb.append(s).reverse();
        int z = Integer.parseInt(sb.toString());
        if (x == z) {
            b = true;
        } else {
            b = false;
        }

        return b;
    }

    public boolean isPalindrome(int n) {
        boolean b = true;
        int r, s = 0;
        int a = n;
        while (n > 0) {
            r = n % 10;
            n = n / 10;
            s = s * 10 + r;
        }
        if (a == s) {
            b = true;
        } else {
            b = false;
        }
        return b;
    }

    public void Palindrome(int n) {
        int b = 0;
        for (int i = 1; i <= n; i++) {
            boolean c = isPalindrome(i);
            if (c == true) {
                System.out.println(i);
                b++;
            }
        }
        System.out.println("Total : " + b);
    }

    public static void main(String[] args) {
        PalindromNumber x = new PalindromNumber();
        int n = 121;

        if (x.isPalindromeMy(n) == true) {
            System.out.println("True");
        } else {
            System.out.println("False!");
        }
        System.out.println(" ");
        x.Palindrome(9999999);

    }
}
