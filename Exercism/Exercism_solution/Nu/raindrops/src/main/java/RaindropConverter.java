class RaindropConverter {

    String convert(int number) {
        String string1 ="";
        if (number%3 == 0){
            string1 = "Pling";
            if (number%5 == 0){
                string1 = string1 + "Plang";
            }
            if (number%7 == 0){
                string1 = string1 + "Plong";
            }
            return string1;
        }
        else if (number%5 == 0){
            string1 = string1 + "Plang";
            if (number%7 == 0){
                string1 = string1 + "Plong";
            }
            return string1;
        }
        else if(number%7 == 0){
            string1 = string1 + "Plong";
            return string1;
        }
        else{
            string1 = string1 + number;
            return string1;
        }
    }

}
