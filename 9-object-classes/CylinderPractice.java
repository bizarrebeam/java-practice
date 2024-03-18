public class CylinderPractice {
    private double radius;
    private double height;

    public double getRadius() {
        return radius;
    }

    public double getHeight() {
        return height;
    }

    public void setRadius(double r) {
        radius = r;
    }

    public void setHeight(double h) {
        height = h;
    }

    public void setDimensions(double r, double h) {
        setRadius(r);
        setHeight(h);
    }

    // constructor: inget constructor gapunya return type apa apa 
    public CylinderPractice() {
        radius = 0;
        height = 0;
    }
    
    public CylinderPractice(double r, double h) {
        radius = r;
        height = 1;
    }
}
