package dev.slimevr.tracking.trackers

import dev.slimevr.config.FiltersConfig
import dev.slimevr.filtering.QuaternionMovingAverage
import dev.slimevr.filtering.TrackerFilters
import io.github.axisangles.ktmath.Quaternion

/**
 * Class taking care of filtering logic
 * (smoothing and prediction)
 */
class TrackerFilteringHandler() {

	private var movingAverage: QuaternionMovingAverage? = null
	var enabled = false

	/**
	 * Reads/loads filtering settings from given config
	 */
	fun readFilteringConfig(config: FiltersConfig, currentRawRotation: Quaternion) {
		val type = TrackerFilters.getByConfigkey(config.type)
		if (type == TrackerFilters.SMOOTHING || type == TrackerFilters.PREDICTION) {
			movingAverage = QuaternionMovingAverage(
				type,
				config.amount,
				currentRawRotation
			)
			enabled = true
		} else {
			movingAverage = null
			enabled = false
		}
	}

	/**
	 * Update the moving average to make it smooth~
	 */
	fun tick() {
		movingAverage?.update()
	}

	/**
	 * Updates the latest rotation
	 */
	fun dataTick(currentRawRotation: Quaternion) {
		movingAverage?.addQuaternion(currentRawRotation)
	}

	/**
	 * Get the filtered rotation from the moving average
	 */
	fun getFilteredRotation(): Quaternion {
		return movingAverage?.filteredQuaternion ?: Quaternion.IDENTITY
	}
}
