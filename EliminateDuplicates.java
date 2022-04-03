//Sunny Jin, 114452827

import java.util.Scanner;
class EliminateDuplicates{
    public static String eliminateDuplicates(String str){
        String NoDuplicates = "";
        for(int i = 0; i < str.length(); i++){
            if(NoDuplicates.indexOf(str.substring(i,i+1)) == -1){
                NoDuplicates = NoDuplicates + str.substring(i, i+1);
            }
        }
        return NoDuplicates;

    }
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a string: ");
        String str = input.nextLine();
        System.out.println(eliminateDuplicates(str));
        input.close();
    }

}

/*
1. (3 points) EliminateDuplicates.java: Write a method 
public static String eliminateDuplicates(String str) 
that returns a copy of the argument str after eliminating all duplicate characters. The first occurrence of each character must be kept and the characters must stay in order relative to the other letter sin the string. For example, if str is “bzzaaf” then the return value should be “bzaf” and not something else like “abfz” or “zfba”. The str parameter can contain any printable ASCII characters or spaces, but not tabs or newlines.Include in your program the test cases listed below and add at least 2 more. Example test cases:
eliminateDuplicates("abracadabra") returns abrcd
eliminateDuplicates("Stony Brook University") returns Stony BrkUives
eliminateDuplicates("This is a test sentence.") returns This atenc.
*/