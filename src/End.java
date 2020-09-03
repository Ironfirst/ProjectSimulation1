public class End {
    String name="end";
    double endValue;
    double inputValue;
    public End(double endvalue){
        this.endValue=endvalue;
    }

    @Override
    public String toString() {
        return "End{" +
                "endValue=" + endValue +
                '}';
    }

    public double getEndValue() {
        return endValue;
    }

    public void setEndValue(double endValue) {
        this.endValue = endValue;
    }
}
