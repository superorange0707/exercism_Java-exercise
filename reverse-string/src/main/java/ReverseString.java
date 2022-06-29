class ReverseString {
    String reverse(String inputString) {
        int length = inputString.length();
        char[] try1 = inputString.toCharArray();
        String string1 = "";
        for (int i = length -1; i>=0; i--){
            string1 =  string1 + try1[i];
        }
        return string1;
    }
}
