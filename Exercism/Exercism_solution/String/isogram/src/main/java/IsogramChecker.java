class IsogramChecker {

    boolean isIsogram(String phrase) {
        // make all letters in the string are lower
        phrase = phrase.toLowerCase();
        // remove all space and -
        phrase = phrase.replaceAll(" ", "");
        phrase = phrase.replaceAll("-", "");
        int length = phrase.length();

        // two traversal to compare the character in the string
        for (int i = 0; i <length; i++){
            char cp = phrase.charAt(i);
            for (int j= i+1; j<length; j++){
                char ct = phrase.charAt(j);
                if (cp == ct){
                    return false;
                }
            }
        }
        return true;
    }
}
