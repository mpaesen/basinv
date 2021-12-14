/**
 * 
 */
package persistency;

/**
 * @author Mathy
 */
public enum ArgIO {
    IN("Input", 0), OUT("Output", 1);
    private final String argTitle;
    private final int argValue;

    ArgIO(String argTitle, int argValue) {
        this.argTitle = argTitle;
        this.argValue = argValue;
    }

    public String getArgTitle() {
        return argTitle;
    }

    public int getArgValue() {
        return argValue;
    }

}
