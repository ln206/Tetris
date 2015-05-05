package view;

/**
 * Main class.
 * 
 * @author Long Nguyen
 * @version 5.31.14
 */
public final class GameMain {

    /** 
     * Constructor. 
     */
    private GameMain() {
    }
    
    /**
     * Main method.
     * 
     * @param theArgs the command line arguments
     */
    public static void main(final String[] theArgs) {
        new TetrisGUI();
    }

}
