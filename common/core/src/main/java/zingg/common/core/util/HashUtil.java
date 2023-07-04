package zingg.common.core.util;

import zingg.common.client.util.ListMap;
import zingg.common.core.hash.HashFunction;


public interface HashUtil<S,D,R,C,T> {
    /**
	 * Use only those functions which are defined in the conf
	 * All functions exist in the registry
	 * but we return only those which are specified in the conf
	 * @param fileName
	 * @return
	 * @throws Exception
	 */
	public ListMap<T, HashFunction<D,R,C,T>> getHashFunctionList(String fileName)
			throws Exception ;
	
	
	public ListMap<T, HashFunction<D,R,C,T>> getHashFunctionList() throws Exception ;
	
	
	
}
