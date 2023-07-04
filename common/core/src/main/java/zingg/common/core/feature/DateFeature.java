package zingg.common.core.feature;

import java.util.Date;

import zingg.common.client.FieldDefinition;
import zingg.common.client.MatchType;
import zingg.common.core.similarity.function.DateSimilarityFunction;

public class DateFeature extends BaseFeature<Date> {

	public DateFeature() {

	}

	public void init(FieldDefinition f) {
		setFieldDefinition(f);
		// based on stat, evaluate which function(s) to use
		// if long string, cosine
		// if short string, affine gap
		// if short string but inverted, like fname lname where ordering is not
		// important
		// then do cosine or something
		/*if (f == FieldType.WORD) {
			addSimFunction(new AffineGapSimilarityFunction());
			addSimFunction(new JaroWinklerFunction());			
		}
		else*/ 
		if (f.getMatchType().contains(MatchType.FUZZY)) {
			addSimFunction(new DateSimilarityFunction());
		} 
	}

}
