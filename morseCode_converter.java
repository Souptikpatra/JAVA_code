class MorseConv{
    private String[] table = {".-","-...","-.-.","-..",".","..-.","--.","....","..",".---","-.-",".-..","--","-.","---",".--.","--.-",".-.","...","-","..-","...-",".--","-..-","-.--","--.."};

    public void engToMorse(String s){
        for(int i = 0; i < s.length(); i++){
            char ch = s.charAt(i);
            int inteValOfch = (int)ch; // it will work as an index to find the associated morse code

            // index conversion from character
            if('a' <= ch && ch <= 'z')  inteValOfch = inteValOfch - 97;
            else inteValOfch = inteValOfch - 65;

            System.out.print(table[inteValOfch]+" ");
        }
    }


    }




class test_code {
    public static void main(String[] args) {
        MorseConv m = new MorseConv();
        m.engToMorse("Souptik");
        System.out.println("souptik");
    }
}
