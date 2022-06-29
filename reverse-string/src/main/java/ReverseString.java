class ReverseString {
    String reverse(String inputString) {
        int length = inputString.length();
        char[] try1 = inputString.toCharArray();
        String string1 = "";
        for (int i = length -1; i>=0; i--){
            string1 =  string1 + try1[i];
        }
        // for (int i=0; i<length; i++){
        //     string1 = inputString.charAt(i) + string1;
        // }
        return string1;
        
    }
}
