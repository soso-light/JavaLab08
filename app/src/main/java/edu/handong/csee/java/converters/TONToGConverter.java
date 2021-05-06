package edu.handong.csee.java.hw2.converters;

public class TONToGConverter implements Convertible{
/**change ton to g
* 1 ton = 1,000,000 g;
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
        /**function for convert km ton to g */
        convertVal = value * 1000000;
    }
}