package tudelft.caesarshift;

public class CaesarShiftCipher {

    public String CaesarShiftCipher(String message, int shift){
        StringBuilder sb = new StringBuilder();
        int normalizedShift = ((shift % 26) + 26) % 26;

        for (int i = 0; i < message.length(); i++) {
            char currentChar = message.charAt(i);
            if (currentChar == ' ') {
                sb.append(' ');
                continue;
            }
            if (currentChar < 'a' || currentChar > 'z') {
                return "invalid";
            }
            int shifted = ((currentChar - 'a' + normalizedShift) % 26) + 'a';
            sb.append((char) shifted);
        }

        return sb.toString();
    }
}
