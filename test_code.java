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
    public void morseToEng(String s){
        String sub;
//        switch (sub){
//            case ".-": System.out.println("A");
//                        break;
//            case "-...": System.out.println("B");
//                break;
//            case "-.-.": System.out.println("C");
//                break;
//            case "-..": System.out.println("D");
//                break;
//            case ".": System.out.println("E");
//                break;
//            case "..-.": System.out.println("F");
//                break;
//            case "--.": System.out.println("G");
//                break;
//            case "....": System.out.println("H");
//                break;
//            case "..": System.out.println("I");
//                break;
//            case ".---": System.out.println("J");
//                break;
//            case "-.-": System.out.println("K");
//                break;
//            case ".-..": System.out.println("L");
//                break;
//            case "--": System.out.println("M");
//                break;
//            case ".-": System.out.println("A");
//                break;
//        }

    }
}



class test_code {
    public static void main(String[] args) {
        MorseConv m = new MorseConv();
        m.engToMorse("Souptik");
        System.out.println("souptik");
    }
}
