public class Planning {
    String name="planning";
    int timeframe;
    double input;
    double endOutput;
    double iterationOutput;

    public Planning(int timeframe,double input,double endOutput,double iterationOutput){
        this.timeframe=timeframe;
        this.input = endOutput*0.80;
        this.iterationOutput=input*0.20;
    }

    @Override
    public String toString() {
        return "Planning{" +
                "name='" + name + '\'' +
                ", timeframe=" + timeframe +
                ", input=" + input +
                ", endOutput=" + endOutput +
                ", iterationOutput=" + iterationOutput +
                '}';
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getTimeframe() {
        return timeframe;
    }

    public void setTimeframe(int timeframe) {
        this.timeframe = timeframe;
    }

    public double getInput() {
        return input;
    }

    public void setInput(double input) {
        this.input = input;
    }

    public double getEndOutput() {
        return endOutput;
    }

    public void setEndOutput(double endOutput) {
        this.endOutput = endOutput;
    }

    public double getIterationOutput() {
        return iterationOutput;
    }

    public void setIterationOutput(double iterationOutput) {
        this.iterationOutput = iterationOutput;
    }
}
