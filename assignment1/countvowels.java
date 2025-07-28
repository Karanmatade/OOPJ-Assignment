package assignment1;
public class countvowels {
    public static void main(String[] args) {
        String str = "sanjivani";
        int vowels = 0 , consonants = 0 ;
        for(char c:str.toCharArray()){
            if("aeiouAEIOU".indexOf(str)!=-1){
                vowels++;
            } else if(Character.isLetter(c)){
                consonants++;
            }
        }
        System.out.println("vowels"+vowls+"Consonats"+consonants);
    }
}
