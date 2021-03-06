import java.io.BufferedReader;
import java.io.InputStreamReader;

/**
 * Created by Ajit.Kshirsagar on 9/12/2015.
 * This program is to check the string is palindrome,it covers any type of string.
 */
public class PalindromeCheck {

    public static void main(String args[]) {

        String str;
        System.out.println("Type to Check");
        try {

            BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
            str = br.readLine();
            int i,j = 0;
            int len = str.length();
            char[] charStr;
            charStr = str.toCharArray();
            /* Odd length String Check */
            if(len%2==1) {

                for(i=0;i<=len/2;i++){
                    j=len-i-1;
                    if(charStr[i]!=charStr[j]){
                        break;
                    }
                }

                if(i-j==1)
                    System.out.println(str +" is an odd palindrome!");
                else
                    System.out.println("Not Palindrome!");
            }else{  /* Even length String Check */

                for(i=0;i<=len/2;i++){
                    j=len-i-1;
                    if(charStr[i]!=charStr[j]){
                        break;
                    }
                }

                if(i-j==2)
                    System.out.println(str +" is an even palindrome!");
                else
                    System.out.println("Not Palindrome!");

            }

        } catch (Exception e) {
            e.printStackTrace();
        }
    }

}