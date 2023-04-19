import java.util.Random;
public class Lecture5Exercises {

    /*
     *   implement a function to create a random password with
     *   given length using lower case letters
     *   lecture 5 page 14
     */
    public String weakPassword(int length) {
        String letters = "abcdefghiklmnopqestuvxxyz";
        StringBuilder password = new StringBuilder();
        Random random = new Random();
        for (int i = 0; i < length; i++) {
            int index = random.nextInt(letters.length());
            password.append(letters.charAt(index));
        }
        return password.toString();
    }



    /*
     *   implement a function to create a random password with
     *   given length and at least 1 digit and 1 special character
     *   lecture 5 page 14
     */
    public String strongPassword(int length) throws Exception {
        if (length < 3)
            throw new Exception("THE length of the password must be greater than 2");
        else {
            String letters = "abcdefghiklmnopqrstuvxyzABCDEFGHIJKLMNOPQRSTUVWXYZ";
            String digit = "013456789";
            String specialChar = "!@#$%^&*()_+~`|}{[]:;?><,./-=";
            StringBuilder password = new StringBuilder();
            Random random = new Random();
            int i = 0;
            while (i < length) {
                int index1 = random.nextInt(letters.length());
                password.append(letters.charAt(index1));
                i++;
                if (password.length() == length) break;

                int index2 = random.nextInt(digit.length());
                password.append(digit.charAt(index2));
                i++;
                if (password.length() == length) break;
                int index3 = random.nextInt(specialChar.length());
                password.append(specialChar.charAt(index3));
                i++;
            }
            return password.toString();

        }
    }

    /*
     *   implement a function that checks if a integer is a fibobin number
     *   integer n is fibobin is there exist an i where:
     *       n = fib(i) + bin(fib(i))
     *   where fib(i) is the ith fibonacci number and bin(i) is the number
     *   of ones in binary format
     *   lecture 5 page 17
     */

    public static int count_ones(long number) {
        int count = 0;
        while (number > 0) {
            if (number % 2 == 1) {
                count++;
            }
            number = number / 2;
        }
        return count;
    }
    public boolean isFiboBin(int n) {
        Lecture4Exercises fib=new Lecture4Exercises();
        int i=1;
        while(fib.fibonacci(i)<=n){
            if(n== fib.fibonacci(i)+count_ones(fib.fibonacci(i)))
                return true;
            else
                i++;
        }

        return false;
    }
}