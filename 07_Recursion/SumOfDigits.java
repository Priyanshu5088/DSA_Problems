import javax.swing.plaf.synth.SynthScrollBarUI;
import javax.xml.crypto.dsig.keyinfo.RetrievalMethod;

public class SumOfDigits {
    public static int SOD(int n){
        // BASE CASE
        if(n>=0 && n<=9){
            return n;
        }

        // RECURSIVE WORK --> SUB PROBLEM
        int firstDigits = SOD(n/10);   // 1234

        // SELF WORK
        return firstDigits + n%10;     // 1234 + 5

        //    ----- OR -----
        //  return SOD(n/10) + n%10;
    }

    public static void main(String[] args) {
        System.out.println(SOD(12345));
    }
    
}
