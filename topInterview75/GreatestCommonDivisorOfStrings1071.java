package topInterview75;

public class GreatestCommonDivisorOfStrings1071 {
    public static void main(String[] args) {
       String str1 = "ABABAB";
       String str2 = "ABAB";

       /* String str1 = "CCDCCD";
        String str2 = "CCD";

        String str1 = "ababab";
        String str2 = "abba";*/

        System.out.println(gcdOfStrings(str1,str2));

    }

    public static String gcdOfStrings(String str1, String str2) {
        String res = "";
        if(str1.equalsIgnoreCase(str2)) {
            return str1;
        }
        char[] str1_char = str1.toCharArray();
        char[] str2_char = str2.toCharArray();

        if(str1_char[0] != str2_char[0]){
            return res;
        }

        StringBuilder sb_pattern = new StringBuilder();
        for(int i = 0; i< str1.length(); i++){
            char toCheck = str1_char[i];
            if(i < str2_char.length){
                if(toCheck == str2_char[i]){
                    sb_pattern.append(toCheck);
                } else {
                    return res;
                }
            }
        }

        //check if pattern has patterns

        return res;
    }
}
