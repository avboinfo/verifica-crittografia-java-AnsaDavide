public class Cryto {

    static protected String Cesar(String data, int shift) {
        StringBuilder output = new StringBuilder(data.length());
        for (char singleChar : data.toCharArray()) {
            int shiftedChar = (int) (singleChar + shift) % 256;
            output.append((char) shiftedChar);
        }
        return output.toString();
    }

    static protected String xorAlgo(String data, String key) {

        String acc = "";

        for (int i = 0; i < data.length(); i++) {
            char d = data.charAt(i);
                char k = key.charAt(i%key.length());

                char xorChar = (char) (d ^ k);
                acc = acc + xorChar;
        }

        return acc;
    }
}