package toolsPackage;

import classPackage.Canva;

public abstract class DrawingTool implements Canva {
    private String color;
    private String thickness;
    protected String drawingToolName;

    protected DrawingTool() {};
    
    protected DrawingTool(String color, String thickness) {
        this.color = color;
        this.thickness = thickness;
    };

    public void setBackgroundColor() {
        System.out.println("Overriding canva interface method.");
    }

    public void setBackgroundSize() {
        System.out.println("Overriding window interface method.");
    }

    public abstract void setWindowSize();

    public abstract void draw();

    public void toolInformation() {
        System.out.println("Color: " + this.color + ", Thickness: " + this.thickness + ", Tool name: " + drawingToolName);
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getThickness() {
        return thickness;
    }

    public void setThickness(String thickness) {
        this.thickness = thickness;
    }
}
