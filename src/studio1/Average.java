package studio1;

import support.cse131.ArgsProcessor;

public class Average {
    public static void main(String[] args){
        ArgsProcessor ag = new ArgsProcessor(args);
        int n1 = ag.nextInt("First integer to be averaged:");
        int n2=  ag.nextInt("Second integer to be averaged:");
        double d1 = ((double) (n1+n2)/2);
        System.out.println("Average of "+ n1 + " and " + n2 + " is "  + d1 + ".");
    }
}
