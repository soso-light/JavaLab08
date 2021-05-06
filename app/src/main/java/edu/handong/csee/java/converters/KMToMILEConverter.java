package edu.handong.csee.java.converters;

public class KMToMILEConverter implements Convertible{
/**change km to mile
* 1.6km = 1mile;
*/
    private double value;
    /**value that have to convert */
    private double convertVal;
    /**value that already converted */
    public void setFromValue(double fromValue){
        /**function for set value from IntergratedConvertor */
        value = fromValue;
    }
    
    public double getConvertedValue(){
        /**function for print converted value in IntergratedConvertor*/
        return convertVal;
    }

    public void convert(){
        /**function for convert km value to mile */
        convertVal = value / 1.6;
    }
}