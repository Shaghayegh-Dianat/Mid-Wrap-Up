public class Lecture4Exercises {
    public long factorial ( int n){
        if(n==1||n==0)
            return  1;
        else
            return n*factorial(n-1);

    }

    /*
     *   implement a function that return nth number of fibonacci series
     *   the series -> 1, 1, 2, 3, 5, 8, ...
     *   lecture 4 page 19
     */
    public long fibonacci ( int n){
        if(n==1||n==2)
            return 1;
        else
            return fibonacci(n-1)+fibonacci(n-2);

    }

    /*
     *   implement a function that return reverse of a given word
     *   lecture 4 page 19
     */
    public String reverse (String word){
        int n=word.length();
        String result="";
        for(int i=n-1;i>=0;i--) {
            result+=word.charAt(i);
        }
        return result;
    }

    /*
     *   implement a function that returns true if the given line is
     *   palindrome and false if it is not palindrome.
     *   palindrome is like 'wow', 'never odd or even', 'Wow'
     *   lecture 4 page 19
     */
    public boolean isPalindrome (String line){
        String mainLine=line.toLowerCase().replaceAll("\\s","");

        if(mainLine.equals(reverse(mainLine)))
            return true;
        else
            return false;

    }

    /*
     *   implement a function which computes the dot plot of 2 given
     *   string. dot plot of hello and ali is:
     *       h e l l o
     *   h   *
     *   e     *
     *   l       * *
     *   l       * *
     *   o           *
     *   lecture 4 page 26
     */
    public char[][] dotPlot (String str1, String str2){
        int n=str1.length();
        int m=str2.length();
        char [][] result=new char[n][m];
        for(int i=0;i<n;i++){
            for (int j=0;j<m;j++){
                if (str1.charAt(i)==str2.charAt((j)))
                    result[i][j]='*';
                else
                    result[i][j]=' ';
            }
        }
        return result;
    }


}



