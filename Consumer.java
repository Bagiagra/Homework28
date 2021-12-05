package by.overone.lesson28homework;

import java.util.HashMap;
import java.util.Random;

public class Consumer {

    Random r = new Random();
    public HashMap<String, Integer> stock (HashMap<String,Integer> dumpPartsAndQtyResult) {

        HashMap<String, Integer> stockPartsAndQty = new HashMap<>();
        stockPartsAndQty.put("Head", 0);
        stockPartsAndQty.put("Body", 0);
        stockPartsAndQty.put("LeftHand", 0);
        stockPartsAndQty.put("RightHand", 0);
        stockPartsAndQty.put("LeftFoot", 0);
        stockPartsAndQty.put("RightFoot", 0);
        stockPartsAndQty.put("CPU", 0);
        stockPartsAndQty.put("RAM", 0);
        stockPartsAndQty.put("HDD", 0);
//the daily process of moving parts from a dump to a scientist's stock
        for (int i = 0; i < 4; i++) {
            switch (r.nextInt(9)) {
                case 0:
                    Integer headQty = dumpPartsAndQtyResult.get("Head");
                    if (headQty != 0) {
                            stockPartsAndQty.computeIfPresent("Head", (k, v) -> v + 1);
                            dumpPartsAndQtyResult.computeIfPresent("Head", (k, v) -> v - 1);
                    }
                    break;
                case 1:
                    Integer bodyQty = dumpPartsAndQtyResult.get("Body");
                    if (bodyQty !=0) {
                        stockPartsAndQty.computeIfPresent("Body", (k, v) -> v + 1);
                        dumpPartsAndQtyResult.computeIfPresent("Body", (k, v) -> v - 1);}
                    break;
                case 2:
                    Integer leftHandQty = dumpPartsAndQtyResult.get("LeftHand");
                    if (leftHandQty !=0) {
                        stockPartsAndQty.computeIfPresent("LeftHand", (k, v) -> v + 1);
                        dumpPartsAndQtyResult.computeIfPresent("LeftHand", (k, v) -> v - 1);}
                    break;
                case 3:
                    Integer rightHandQty = dumpPartsAndQtyResult.get("RightHand");
                    if (rightHandQty !=0) {
                        stockPartsAndQty.computeIfPresent("RightHand", (k, v) -> v + 1);
                        dumpPartsAndQtyResult.computeIfPresent("RightHand", (k, v) -> v - 1);}
                    break;
                case 4:
                    Integer leftFootQty = dumpPartsAndQtyResult.get("LeftFoot");
                    if (leftFootQty !=0) {
                    stockPartsAndQty.computeIfPresent("LeftFoot", (k, v) -> v + 1);
                    dumpPartsAndQtyResult.computeIfPresent("LeftFoot", (k, v) -> v - 1);}
                    break;
                case 5:
                    Integer rightFootQty = dumpPartsAndQtyResult.get("RightFoot");
                    if (rightFootQty !=0) {
                    stockPartsAndQty.computeIfPresent("RightFoot", (k, v) -> v + 1);
                    dumpPartsAndQtyResult.computeIfPresent("RightFoot", (k, v) -> v - 1);}
                    break;
                case 6:
                    Integer cpuQty = dumpPartsAndQtyResult.get("CPU");
                    if (cpuQty !=0) {
                    stockPartsAndQty.computeIfPresent("CPU", (k, v) -> v + 1);
                    dumpPartsAndQtyResult.computeIfPresent("CPU", (k, v) -> v - 1);}
                    break;
                case 7:
                    Integer ramQty = dumpPartsAndQtyResult.get("RAM");
                    if (ramQty !=0) {
                        stockPartsAndQty.computeIfPresent("RAM", (k, v) -> v + 1);
                        dumpPartsAndQtyResult.computeIfPresent("RAM", (k, v) -> v - 1);}
                    break;
                case 8:
                    Integer hddQty = dumpPartsAndQtyResult.get("HDD");
                    if (hddQty !=0) {
                    stockPartsAndQty.computeIfPresent("HDD", (k, v) -> v + 1);
                        dumpPartsAndQtyResult.computeIfPresent("HDD", (k, v) -> v - 1);}
                    break;
                default:
                    //throw new IllegalStateException("Unexpected value: " + r.nextInt(9));
                    return stockPartsAndQty;
            }
        }
        return stockPartsAndQty;
    }

    //robots creation process
    public int robotsCreate(HashMap<String, Integer>stockPartsAndQty) {

        int count = 0;//qty of robots

        Integer headQty = stockPartsAndQty.get("Head");
        Integer bodyQty = stockPartsAndQty.get("Body");
        Integer leftHandQty = stockPartsAndQty.get("LeftHand");
        Integer rightHandQty = stockPartsAndQty.get("RightHand");
        Integer leftFootQty = stockPartsAndQty.get("LeftFoot");
        Integer rightFootQty = stockPartsAndQty.get("RightFoot");
        Integer cpuQty = stockPartsAndQty.get("CPU");
        Integer ramQty = stockPartsAndQty.get("RAM");
        Integer hddQty = stockPartsAndQty.get("HDD");

        if (headQty != 0 && bodyQty != 0 && leftHandQty != 0 && rightHandQty != 0 && leftFootQty != 0 && rightFootQty != 0 && cpuQty != 0 && ramQty != 0 && hddQty != 0) {
            count++;
            stockPartsAndQty.computeIfPresent("Head", (k, v) -> v - 1);
            stockPartsAndQty.computeIfPresent("Body", (k, v) -> v - 1);
            stockPartsAndQty.computeIfPresent("LeftHand", (k, v) -> v - 1);
            stockPartsAndQty.computeIfPresent("RightHand", (k, v) -> v - 1);
            stockPartsAndQty.computeIfPresent("LeftFoot", (k, v) -> v - 1);
            stockPartsAndQty.computeIfPresent("RightFoot", (k, v) -> v - 1);
            stockPartsAndQty.computeIfPresent("CPU", (k, v) -> v - 1);
            stockPartsAndQty.computeIfPresent("RAM", (k, v) -> v - 1);
            stockPartsAndQty.computeIfPresent("HDD", (k, v) -> v - 1);

        }
        return count;

    }


}
