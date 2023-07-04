package zingg.common.core.executor;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import zingg.common.client.ZFrame;
import zingg.common.client.ZinggClientException;
import zingg.common.client.ZinggOptions;
import zingg.common.client.util.ColName;
import zingg.common.client.util.ColValues;



public abstract class Linker<S,D,R,C,T> extends Matcher<S,D,R,C,T> {

	protected static String name = "zingg.Linker";
	public static final Log LOG = LogFactory.getLog(Linker.class);

	public Linker() {
		setZinggOptions(ZinggOptions.LINK);
	}

	protected ZFrame<D,R,C> getBlocks(ZFrame<D,R,C> blocked, ZFrame<D,R,C> bAll) throws Exception{
		return getDSUtil().joinWithItselfSourceSensitive(blocked, ColName.HASH_COL, args).cache();
	}

	protected ZFrame<D,R,C> selectColsFromBlocked(ZFrame<D,R,C> blocked) {
		return blocked;
	}

	public void writeOutput(ZFrame<D,R,C> sampleOrginal, ZFrame<D,R,C> dupes) throws ZinggClientException {
		try {
			// input dupes are pairs
			/// pick ones according to the threshold by user
			ZFrame<D,R,C> dupesActual = getDupesActualForGraph(dupes);

			// all clusters consolidated in one place
			if (args.getOutput() != null) {

				// input dupes are pairs
				//dupesActual = DFUtil.addClusterRowNumber(dupesActual, spark);
				dupesActual = dupesActual.withColumn(ColName.CLUSTER_COLUMN, dupesActual.col(ColName.ID_COL));
				dupesActual = getDSUtil().addUniqueCol(dupesActual, ColName.CLUSTER_COLUMN);
				ZFrame<D,R,C>dupes2 =  getDSUtil().alignLinked(dupesActual, args);
				dupes2 =  getDSUtil().postprocessLinked(dupes2, sampleOrginal);
				LOG.debug("uncertain output schema is " + dupes2.showSchema());
				getPipeUtil().write(dupes2, args, args.getOutput());
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	protected ZFrame<D,R,C> getDupesActualForGraph(ZFrame<D,R,C> dupes) {
		ZFrame<D,R,C> dupesActual = dupes
				.filter(dupes.equalTo(ColName.PREDICTION_COL, ColValues.IS_MATCH_PREDICTION));
		return dupesActual;
	}

	

}
