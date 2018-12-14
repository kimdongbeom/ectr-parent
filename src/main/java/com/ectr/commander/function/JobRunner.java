package com.ectr.commander.function;

public class JobRunner {

    public void runEctrLearning() {
        String log = readKafka();
        String[] ectrInputArray = makeEctrInputData(log);

        //Call Ectr-Leaner learn(String[] arr)
        System.out.println("ectr end");
    }

    private String[] makeEctrInputData(String log) {
        String[] parseData = {"ai=i", "uci=01", "type=TUC02"};
        return parseData;
    }

    private String readKafka() {
//        EctrDataTransfer ectrDataTransfer = new EctrDataTransfer();
//        ectrDataTransfer.loadData();
        return "this is log";
    }
}
