package edu.handong.csee.java.converters;

public class TONToKGConverter implements Convertible{
/**change ton to kg
* 1 ton = 1000 kg;
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
        /**function for convert ton value to kg */
        convertVal = value * 1000;
    }
}