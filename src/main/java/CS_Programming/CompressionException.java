package CS_Programming;

public class CompressionException extends Exception {

    public CompressionException (String s){
        super(s);

    }

    public  CompressionException(Exception e){
        super(e);
    }

    public CompressionException() {
        super();
    }
}
