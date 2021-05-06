package edu.handong.csee.java.hw2.converters;

public class KMToMConverter implements Convertible {
/**change km to m
* 1km = 1000m;
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
        /**function for convert km value to m */
        convertVal = value * 1000;
    }

}
