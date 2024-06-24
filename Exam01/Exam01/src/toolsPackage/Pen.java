package toolsPackage;

public class Pen extends DrawingTool {


    public Pen(String color, String thickness) {
        super(color, thickness);

        // If drawingToolName property is 'protected' i could modify this property while Pen class is in the same Package.
        super.drawingToolName = "Pen";

        // This line of code could not change private property.
        // super.color = "Hello";

        super.toolInformation();
    }

    @Override
    public void draw() {
        System.out.println("Drawing drawing like chicken with his claw.");    
    }

    public void draw(String text) {
        System.out.println("Drawing an text:" + text);
    }

    @Override
    public void setWindowSize() {
        System.out.println("Setting window size");
    }

    public int setWIndowSize(int x, int y) {
        return x + y;
    }

    // We could ovveride default method of interface.
    @Override
    public void getOS() {
        System.out.println("XD");
    }

}
