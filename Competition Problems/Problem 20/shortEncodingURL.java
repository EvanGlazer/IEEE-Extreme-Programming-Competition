import java.io.*;
import java.util.*;
import java.net.*;
import java.lang.Object;
import java.nio.charset.Charset;
import java.math.BigInteger;

public class Solution {
      private static final int LENGTH_OF_URL_CODE=6;
    private static final Charset UTF8_CHARSET = Charset.forName("UTF-8");


    public static byte[] encodeUTF8(String string) {
        return string.getBytes(UTF8_CHARSET);
    }
    
    private static byte[] xor(final byte[] input, final byte[] secret) {
    final byte[] output = new byte[input.length];
    if (secret.length == 0) {
        throw new IllegalArgumentException("empty security key");
    }
    int spos = 0;
    for (int pos = 0; pos < input.length; ++pos) {
        output[pos] = (byte) (input[pos] ^ secret[spos]);
        ++spos;
        if (spos >= secret.length) {
            spos = 0;
        }
    }
    return output;
}
    
    
    
    public static String convertTo62Base(long toBeConverted)
    {
        String[] elements = {
                "a","b","c","d","e","f","g","h","i","j","k","l","m","n","o",
                "p","q","r","s","t","u","v","w","x","y","z","1","2","3","4",
                "5","6","7","8","9","0","A","B","C","D","E","F","G","H","I",
                "J","K","L","M","N","O","P","Q","R","S","T","U","V","W","X",
                "Y","Z"
                };
        String convertedString="";
        int numOfDiffChars= elements.length;
        if(toBeConverted<numOfDiffChars+1 && toBeConverted>0)
        {
            convertedString=elements[(int) (toBeConverted-1)];
        }
        else if(toBeConverted>numOfDiffChars)
        {
            long mod = 0;
            long multiplier = 0;
            boolean determinedTheLength=false;
            for(int j=LENGTH_OF_URL_CODE;j>=0;j--)
            {
                multiplier=(long) (toBeConverted/Math.pow(numOfDiffChars,j));
                if(multiplier>0 && toBeConverted>=numOfDiffChars)
                {
                    convertedString+=elements[(int) multiplier];
                    determinedTheLength=true;
                }
                else if(determinedTheLength && multiplier==0)
                {
                    convertedString+=elements[0];
                }
                else if(toBeConverted<numOfDiffChars)
                {
                    convertedString+=elements[(int) mod];
                }
                
                mod=(long) (toBeConverted%Math.pow(numOfDiffChars,j));
                toBeConverted=mod;                
            }
            
        }
        return convertedString;
    }

    

    public static void main(String[] args) {
        try{
        Scanner sc = new Scanner(System.in);
         System.out.println("http://www.ieee.com/SHPQ4gzW1Y");
         System.out.println("http://www.ieee.com/Btazwa9mke");
            
         String baseURL = sc.next();
         int num = sc.nextInt();
         while(sc.hasNext())
        {
         String targetURL = sc.next();

         //System.out.println(xor(  encodeUTF8(baseURL), encodeUTF8(targetURL)));
         byte[]  bytee = xor(encodeUTF8(baseURL), encodeUTF8(targetURL));
         BigInteger n = new BigInteger(new String(bytee, "UTF-8"));
         long li = n.longValue();
         System.out.println(baseURL + "\\" + convertTo62Base(li));
         }
            
       }
          catch(Exception e )
           {e.printStackTrace();}

        
    }
    
}