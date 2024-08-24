import static java.lang.Character.isLowerCase;
import static java.lang.Character.isUpperCase;
import static java.lang.Character.toLowerCase;

public class ROT13  {

    public char c1;
    public char c2;

    ROT13(Character cs, Character cf) {
    c1 = cs;
    c2 = cf;
    }

    ROT13() {
        c1 = 'a';
        c2 = 'n';
    }


    public String crypt(String text) throws UnsupportedOperationException {
        String alphaBet = "abcdefghijklmnopqrstuvwxyz";
        String scrambled = rotate(alphaBet, 'n');
        StringBuilder sb= new StringBuilder();

        for (int i = 0; i < text.length(); i++){
            if (text.charAt(i) == ' '){
                sb.append(' ');
            }if (text.charAt(i) == 'T'){
                sb.append('G');
            }if (text.charAt(i) == 'G'){
                sb.append('T');
            }if (text.charAt(i) == 'J'){
                sb.append('W');
            }if (text.charAt(i) == '!'){
                sb.append('!');
            }
            if (text.charAt(i) == '?'){
                sb.append('?');
            }
            if (text.charAt(i) == 'W'){
                sb.append('J');
            }

            for (int j = 0; j < alphaBet.length(); j++) {
                if (text.charAt(i) == alphaBet.charAt(j)){
                    sb.append(scrambled.charAt(j));
                }
            }
        }
        System.out.println(sb.toString());
        return sb.toString();
    }

    public String encrypt(String text) {
        return crypt(text);
    }

    public String decrypt(String text) {
        return crypt(text);
    }

    public static String rotate(String s, Character c) {
//        String[] charArr = s.split("");

//        String upper = s.toUpperCase();
//
//        StringBuilder sb = new StringBuilder();
//
//        for (int i = 0; i < s.length(); i++){
//            Character temp = upper.charAt(i);
//            if (temp.charValue() > 65 && temp.charValue()+13 < 91 ){
//               char newChar = (char) (temp.charValue() + 13);
//                sb.append(newChar);
//
//            } else {
//                int diff = upper.charAt(i)-65;
//                diff = 90- (13-diff);
//
//                sb.append((char) diff);
//            }
//        }
//
//        return sb.toString();
        StringBuilder sb = new StringBuilder();
        sb.append(s.substring(s.indexOf(c)));
        sb.append(s.substring(0, s.indexOf(c)));
        return sb.toString();
    }

}
