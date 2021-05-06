package edu.handong.csee.java.hw2.converters;

public class MILEToKMConverter implements Convertible{
/**change mile to km
* 1mile = 1.6km;
*/
    private double value;
    /*value that have to convert */
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
        /**function for convert mile value to km */
        convertVal = value * 1.6;
    }

}