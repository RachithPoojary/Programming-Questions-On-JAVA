//WAP TO COUNT THE TOTAL NUMBER OF VOWELS IN THE STRING

class vowelsInString {
    public static void main(String[] args) {
        String str = "Education";
        int count = 0;
        str = str.toLowerCase();
        for(int i = 0;i<str.length();i++){
            char Char = str.charAt(i);
            if(Char == 'a' || Char == 'e'|| Char == 'i' || Char == 'o' || Char == 'u' ){
                count++;
            }
        }
        System.out.println("total number of vowels in the string is "+count);
    }
}
