class SqueakyClean {
    static String clean(String identifier) {
        // replace space and control characters and greek letters
        String string1 = identifier.replaceAll(" ","_").replaceAll("\\p{Cntrl}","CTRL").replaceAll("[α-ω]", "");
        int length = string1.length();
        String string2 = "";

        // traverse the string
        for(int i=0; i<length; i++){
            char ch = string1.charAt(i);

            // transfer kebab to camelCase
            // uppercase the letter after the -
            if (ch == '-'){
                char ch1 = string1.charAt(i+1);
                string2 = string2 + Character.toUpperCase(ch1);
            }
            // kelp only letter and if the former character is -, skip this element
            else if(Character.isLetter(ch)){
                if (i-1>=0)
                {
                    if (string1.charAt(i-1) == '-'){
                        continue;
                    }
                }
                string2 = string2 + ch;
            }
            // keep the _
            else if(ch == '_')
            {
                string2 = string2 + ch;
            }
        }
        return string2;
    }
}
