package CS_Programming;

import java.io.Serializable;
import java.util.HashMap;
import java.util.Map;

public class CompressionInfoFolder implements Serializable {

    private final Map<Short, String> codeToWords1;
    private final byte[] codedText;

    Map<Short, String> codeMap;
    short[] codeToWords;


    public CompressionInfoFolder(Map<Short, String> codeToWords, byte[] codedText) {

        codeToWords1 = codeToWords;
        this.codedText=codedText;
    }

    public Map<Short, String> getCodeToWords1() {
        return codeToWords1;
    }

    public byte[] getCodedText() {
        return codedText;
    }
}
