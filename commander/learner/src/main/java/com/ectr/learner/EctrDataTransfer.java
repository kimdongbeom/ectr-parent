package com.ectr.learner;

public class EctrDataTransfer {

    //called by ectr-commander
    public Object transferBackupData() {
        System.out.println("double array convert to object");
        return new Object();
    }

    public void loadData() {
        System.out.println("load data");
    }
}
