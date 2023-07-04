package zingg.common.core.similarity.function;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

public class CheckBlankOrNullFunction extends SimFunction<String> {

	public static final Log LOG = LogFactory
			.getLog(CheckBlankOrNullFunction.class);

	public CheckBlankOrNullFunction() {
		super("CheckBlankOrNullFunction");
		// TODO Auto-generated constructor stub
	}

	public CheckBlankOrNullFunction(String name) {
		super(name);
	}

	

	@Override
	public Double call(String first, String second) {
		if (first != null && first.trim().length() !=0 && second != null && second.trim().length() !=0) {
			return 1d;
		}
		return 0d;		
	}

	

}
