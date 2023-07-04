package zingg.spark.core.hash.unused;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import zingg.spark.core.hash.SparkTrimLastDigitsInt;

/**
 * Spark specific trim function for integer last 1 digit
 * 
 * 
 *
 */
public class SparkTrimLast1DigitInt extends SparkTrimLastDigitsInt {
	
	public static final Log LOG = LogFactory.getLog(SparkTrimLast1DigitInt.class);

	public SparkTrimLast1DigitInt(){
	    super(1);
	}
	
}
