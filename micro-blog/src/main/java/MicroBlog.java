class MicroBlog {
    public String truncate(String input) {
//        get  the length of the string(the length of emoji is not fixed)
        int length = input.length();

//        create a new string to store the result
        String string1 ="";

//        calculate the real length of the string(one emoji will be calculated as a character)
        int result = input.codePointCount(0,length);

//       record the times of we get the character(in this problem, we need get 5 characters)
        int n = 0;

//       need only keep 5 characters
        if (result > 5){
            for (int i = 0; i<=length;){

//                get the codepoint of each element of the string
                int countpoint = input.codePointAt(i);

//                get the length of the element
                int index = Character.charCount(countpoint);

//                get the correct index of each element of the string
                i = i + index;
                string1 = input.substring(0,i);
                n++;
                if (n>=5){
                    return string1;
                }
            }
        }

//        the number of characters in the string is less than 5, just return the string
        else{
            return input;
        }
    }
}
