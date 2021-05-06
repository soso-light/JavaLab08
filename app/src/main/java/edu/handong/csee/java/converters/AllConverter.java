package edu.handong.csee.java.hw2.converters;

public class AllConverter{
/**change km to m
* 1Km = 1000m;
*/
    private double value;
    /**value that have to convert */
    private String measure;
    /**string that know original measure of value */ 
    private double convertTo1;
    /**value that already converted */
    private double convertTo2;
    /**value that already converted */
    
    public AllConverter setFromValue(double fromValue){
        /**function for set value from IntergratedConvertor,*/
        value = fromValue;
        return this;
    }
    
    public AllConverter setOriginalMeasure(String originalMeasure){
        /**function for set Original Measure which has to convert.*/
        measure = originalMeasure;
        return this;
    }

    public void convertAndPrintOut(){
        /**function for convert and print out the result.
        * if measure is KM, convert km to m and mile
        * if measure is TON, convert ton to g and kg
        * if measure is mile, convert mile to km
        * if measure has no converter to convert, printout "AllConverter cannot support the measure!"
        */
        if(measure.equals("KM")){
            KMToMConverter MConverter = new KMToMConverter();
            KMToMILEConverter MILEConverter = new KMToMILEConverter();
            MConverter.setFromValue(value);
            MILEConverter.setFromValue(value);
            MConverter.convert();
            MILEConverter.convert();
            convertTo1 = MConverter.getConvertedValue();
            convertTo2 = MILEConverter.getConvertedValue();
            System.out.println(value +" " + measure + " to " + convertTo1 + " M");
            System.out.println(value +" " + measure + " to " + convertTo2 + " MILE");
        }else if(measure.equals("TON")){
            TONToGConverter GConverter = new TONToGConverter();
            TONToKGConverter KGConverter = new TONToKGConverter();
            GConverter.setFromValue(value);
            KGConverter.setFromValue(value);
            GConverter.convert();
            KGConverter.convert();
            System.out.println(value +" " + measure + " to " + KGConverter.getConvertedValue() + " KG");
            System.out.println(value +" " + measure + " to " + GConverter.getConvertedValue() + " G");
        }else if(measure.equals("MILE")){
            MILEToKMConverter KMConverter = new MILEToKMConverter();
            KMConverter.setFromValue(value);
            KMConverter.convert();
            System.out.println(value +" " + measure + " is " + KMConverter.getConvertedValue() + " KM");
        }else{
            System.out.println("AllConverter cannot support the measure!");
        }
        
    }
}