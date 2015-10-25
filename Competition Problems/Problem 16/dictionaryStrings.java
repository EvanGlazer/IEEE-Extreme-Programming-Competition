import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int numTestCases = sc.nextInt();
        
        for(int i = 0; i < numTestCases; i++)
        {
            int numWords = sc.nextInt();
            String dictionary[] = new String[numWords];
            int numDicStrings = sc.nextInt();
            String dictionaryStrings[] = new String[numDicStrings];
            int alphabetDic[][] = new int[numWords][26];
            int alphabetDicString[][] = new int[numDicStrings][26];
            
            sc.nextLine();
            
            //Fill in dictionary with words
            for(int j = 0; j < numWords; j++)
            {
                dictionary[j] = sc.nextLine();
            }
            //Fill in possible dictionary strings
            for(int k = 0; k < numDicStrings; k++)
            {
                dictionaryStrings[k] = sc.nextLine();
            }
            //Adding up the letters from each word to compare to a given dictionary string's total alphabet.
            for(int m = 0; m < numWords; m++)
            {
                for(int n = 0; n < dictionary[m].length(); n++)
                {
                    int index = (int)(dictionary[m].charAt(n))-97;
                    alphabetDic[m][index]++;
                }
            }
            
            
            
            //Adding up the letters from each dictionary string to compare to each word.
            for(int p = 0; p < numDicStrings; p++)
            {
                for(int q = 0; q < dictionaryStrings[p].length(); q++)
                {
                    int index = (int)(dictionaryStrings[p].charAt(q))-97;
                    alphabetDicString[p][index]++;
                }
            }
            
            
            //Comparing all words to each individual dictionary string
            for(int s = 0; s < numDicStrings; s++)
            {
                boolean isDistionaryString = true;
                boolean isPerfectDictionaryString = true;
                
                int ads[][] = new int[numDicStrings][26];
                ads = alphabetDicString;
                
                //Going through each word, also determining if the dictinary string has too many letters for the words.
                for(int t = 0; t < numWords; t++)
                {
                    int ads[][] = new int[numDicStrings][26];
                    ads = alphabetDicString;
                    //If dictionary string doesn't have enough letter for word, it's not a dictionary word.
                    for(int v = 0; v < 26; v++)
                    {
                        if(alphabetDic[t][v] > alphabetDicString[s][v])
                        {
                            isDistionaryString = false;
                        }
                        //***
                        if(alphabetDic[t][v] > ads[s][v])
                        {
                            ads[s][v] = alphabetDic[t][v];
                        }
                    }
                    if(!isDistionaryString)
                    {
                        break;
                    }
                }
                //***
                for(int w = 0; w < 26; w++)
                {
                    if(ads[s][v] > alphabetDic[t][v])
                    {
                        isPerfectDictionaryString = false;
                        break;
                    }
                }
                //Produce print-out based on the flags
                if(isDistionaryString)
                {
                    if(isPerfectDictionaryString)
                    {
                        System.out.println("Yes Yes");
                    }
                    else
                    {
                        System.out.println("Yes No");
                    }
                }
                else
                {
                    System.out.println("No " + "1");
                }
            }
        }
    }
}