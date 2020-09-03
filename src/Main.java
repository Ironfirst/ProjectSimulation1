import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {

    public static void main(String[]args){


        Communication communication = new Communication(1,1.000);
        Planning planning = new Planning(2, communication.output, communication.getOutput(), communication.output );
        End end = new End(0);

        ArrayList<Double> list = new ArrayList<>();
        int iterationsVærdi=0;
        while(end.endValue<0.95){

            list.add(iterationsVærdi,communication.input);
            planning.setInput(communication.input);
            iterationsVærdi++;

            list.add(iterationsVærdi,planning.input);
            iterationsVærdi++;

            list.add(iterationsVærdi,planning.input);
            iterationsVærdi++;


            end.setEndValue(planning.endOutput=end.endValue+= planning.endOutput);

            communication.input= planning.iterationOutput;


        }
        System.out.println(list);

///////////////// forsøg 3
//        Communication communication = new Communication(1,1.000);
//        Planning planning = new Planning(2, communication.output, communication.getOutput()*0.80, communication.output*0.20 );
//        End end = new End(0);
//
//        ArrayList<Integer> list = new ArrayList<>();
//        int iterationsVærdi=0;
//        while(end.endValue<0.95){
//
//            for(int i=0;i<communication.timeFrame;i++){
//                list.add(iterationsVærdi, iterationsVærdi);
//                iterationsVærdi++;
//
//            }
//
//            for(int j=0;j<planning.timeframe;j++){
//
//                list.add(iterationsVærdi, iterationsVærdi);
//                iterationsVærdi++;
//            }
//                communication.input= planning.iterationOutput;
////            for(int h=0;h< end.endValue;h++){
//                end.setEndValue(end.endValue+=planning.endOutput);
////            }
//        }
//
//        System.out.println(list.toString());

        /////////////////// forsøg 2
//        Communication communication1 = new Communication(1,1.00);
//        System.out.println(communication1);
//        Planning planning = new Planning(2, communication1.getInput(), communication1.output*0.80, communication1.output*0.20);
//        System.out.println(planning);
//        End end1 = new End(planning.getEndOutput());
//        System.out.println(end1);
//        Communication communication2 = new Communication(1,planning.getIterationOutput());
//        System.out.println(communication2);
//
//        List<Planning> simulationList = new ArrayList<>();
//
//        simulationList.add(planning);
//        System.out.println(simulationList);

        //////////////forsøg 1
//        int iterationNr = 0;
//        for(int i=0;i<=10;i++){
//            Communication communication = new Communication(1,1.00);
//
//            communication.setTimeFrame(iterationNr);
//            iterationNr++;
//            System.out.println(communication);
//        }
    }
}
