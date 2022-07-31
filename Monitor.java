public class Monitor {
    private String model;
    private String manufacturer;
    private int size;
    // importing a class called resolution 
    private Resolution nativeResolution;

    // constructor
    public Monitor(String model, String manufacturer, int size , Resolution nativeResolution){
        this.model = model;
        this.manufacturer = manufacturer;
        this.size = size;
        this.nativeResolution = nativeResolution;
    }

    // method
    public void drawPixelAt(int x , int y , String color){
        System.out.println("Drawing pixel at " + x + " , " + y + " in color " + color);
    }

    // getters method
    public String getModel() {
        return model;
    }
    public String getManufacturer() {
        return manufacturer;
    }
    public int getSize() {
        return size;
    }
    public Resolution getNativeResolution() {
        return nativeResolution;
    }
}
