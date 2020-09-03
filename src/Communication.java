public class Communication {
    String name="communication";
    int timeFrame=1;
    double input;
    double output;

    public Communication(int timeFrame,double input){
        this.timeFrame=timeFrame;
        this.input=input;
        this.output=input;
    }

    public void StartInput(double StartInput){
        setInput(StartInput);
    }

    private static void setInput(double startInput) {
        Communication.setInput(startInput);
    }



    @Override
    public String toString() {
        return "Communication{" +
                "name='" + name + '\'' +
                ", timeFrame=" + timeFrame +
                ", input=" + input;
    }


    public void setTimeFrame(int timeFrame) {
        this.timeFrame = timeFrame;
    }

    public double getInput() {
        return input;
    }


    public double getOutput() {
        return output;
    }
}
