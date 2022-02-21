package Shopping;

public class EmptyCollectionException extends Exception {
    /**
     *
     */
    private static final long serialVersionUID = 1L;

    public EmptyCollectionException(String message) {
        super(message);
    }

    EmptyCollectionException() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
}
