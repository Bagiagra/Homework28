package by.overone.lesson28homework;
import com.sun.xml.internal.ws.api.model.wsdl.WSDLOutput;

import java.util.HashMap;
import java.util.Random;

public class Producer implements Runnable {

    public void run() {
    }

    Random r = new Random();

    public HashMap<String, Integer> dump() {


        //first day, 20 parts are put in a dump
        HashMap<String, Integer> dumpPartsAndQty = new HashMap<>();
        dumpPartsAndQty.put("Head", 0);
        dumpPartsAndQty.put("Body", 0);
        dumpPartsAndQty.put("LeftHand", 0);
        dumpPartsAndQty.put("RightHand", 0);
        dumpPartsAndQty.put("LeftFoot", 0);
        dumpPartsAndQty.put("RightFoot", 0);
        dumpPartsAndQty.put("CPU", 0);
        dumpPartsAndQty.put("RAM", 0);
        dumpPartsAndQty.put("HDD", 0);

        for (int i = 0; i < 20; i++) {
            switch (r.nextInt(9)) {
                case 0:
                    dumpPartsAndQty.computeIfPresent("Head", (k, v) -> v + 1);
                    break;
                case 1:
                    dumpPartsAndQty.computeIfPresent("Body", (k, v) -> v + 1);
                    break;
                case 2:
                    dumpPartsAndQty.computeIfPresent("LeftHand", (k, v) -> v + 1);
                    break;
                case 3:
                    dumpPartsAndQty.computeIfPresent("RightHand", (k, v) -> v + 1);
                    break;
                case 4:
                    dumpPartsAndQty.computeIfPresent("LeftFoot", (k, v) -> v + 1);
                    break;
                case 5:
                    dumpPartsAndQty.computeIfPresent("RightFoot", (k, v) -> v + 1);
                    break;
                case 6:
                    dumpPartsAndQty.computeIfPresent("CPU", (k, v) -> v + 1);
                    break;
                case 7:
                    dumpPartsAndQty.computeIfPresent("RAM", (k, v) -> v + 1);
                    break;
                case 8:
                    dumpPartsAndQty.computeIfPresent("HDD", (k, v) -> v + 1);
                    break;
                default:
            }
        }

        return dumpPartsAndQty;
    }


    //next days, up to 4 parts put in a dump
    public HashMap<String, Integer> dumpNext(HashMap<String, Integer> dumpPartsAndQtyNext) {

        for (int i = 0; i < r.nextInt(4); i++) {
            switch (r.nextInt(9)) {
                case 0:
                    dumpPartsAndQtyNext.computeIfPresent("Head", (k, v) -> v + 1);
                    break;
                case 1:
                    dumpPartsAndQtyNext.computeIfPresent("Body", (k, v) -> v + 1);
                    break;
                case 2:
                    dumpPartsAndQtyNext.computeIfPresent("LeftHand", (k, v) -> v + 1);
                    break;
                case 3:
                    dumpPartsAndQtyNext.computeIfPresent("RightHand", (k, v) -> v + 1);
                    break;
                case 4:
                    dumpPartsAndQtyNext.computeIfPresent("LeftFoot", (k, v) -> v + 1);
                    break;
                case 5:
                    dumpPartsAndQtyNext.computeIfPresent("RightFoot", (k, v) -> v + 1);
                    break;
                case 6:
                    dumpPartsAndQtyNext.computeIfPresent("CPU", (k, v) -> v + 1);
                    break;
                case 7:
                    dumpPartsAndQtyNext.computeIfPresent("RAM", (k, v) -> v + 1);
                    break;
                case 8:
                    dumpPartsAndQtyNext.computeIfPresent("HDD", (k, v) -> v + 1);
                    break;
                default:
                    return dumpPartsAndQtyNext;
            }
        }
        return dumpPartsAndQtyNext;
    }
}








