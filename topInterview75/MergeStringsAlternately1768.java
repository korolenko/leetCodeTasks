package topInterview75;

public class MergeStringsAlternately1768 {
    public static void main(String[] args) {
        String word1 = "abcd";
        String word2 = "pq";
        System.out.println(mergeAlternately(word1,word2));
    }

    public static String mergeAlternately(String word1, String word2) {
        char[] arr_w1 = word1.toCharArray();
        char[] arr_w2 = word2.toCharArray();
        StringBuilder stringBuilder = new StringBuilder();
        int counter = 0;
        for(int i = 0; i < arr_w1.length; i++){
            stringBuilder.append(arr_w1[i]);
            if( i< arr_w2.length){
                stringBuilder.append(arr_w2[i]);
            }
            counter = i;
        }
        for(int j = counter + 1; j < arr_w2.length; j++){
            stringBuilder.append(arr_w2[j]);
        }

        return stringBuilder.toString();
    }
}
