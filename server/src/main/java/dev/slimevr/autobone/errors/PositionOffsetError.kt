package dev.slimevr.autobone.errors

import com.jme3.math.FastMath
import dev.slimevr.autobone.AutoBoneStep
import dev.slimevr.poseframeformat.trackerdata.TrackerFrames
import dev.slimevr.tracking.processor.skeleton.HumanSkeleton

// The difference between offset of absolute position and the corresponding point over time
class PositionOffsetError : IAutoBoneError {
	@Throws(AutoBoneException::class)
	override fun getStepError(trainingStep: AutoBoneStep): Float {
		val trackers = trainingStep.frames.frameHolders
		return getPositionOffsetError(
			trackers,
			trainingStep.cursor1,
			trainingStep.cursor2,
			trainingStep.skeleton1.skeleton,
			trainingStep.skeleton2.skeleton
		)
	}

	fun getPositionOffsetError(
		trackers: List<TrackerFrames>,
		cursor1: Int,
		cursor2: Int,
		skeleton1: HumanSkeleton,
		skeleton2: HumanSkeleton,
	): Float {
		var offset = 0f
		var offsetCount = 0
		for (tracker in trackers) {
			val trackerFrame1 = tracker.tryGetFrame(cursor1) ?: continue
			val position1 = trackerFrame1.tryGetPosition() ?: continue
			val trackerRole1 = trackerFrame1.tryGetTrackerPosition()?.trackerRole ?: continue

			val trackerFrame2 = tracker.tryGetFrame(cursor2) ?: continue
			val position2 = trackerFrame2.tryGetPosition() ?: continue
			val trackerRole2 = trackerFrame2.tryGetTrackerPosition()?.trackerRole ?: continue

			val computedTracker1 = skeleton1.getComputedTracker(trackerRole1) ?: continue
			val computedTracker2 = skeleton2.getComputedTracker(trackerRole2) ?: continue

			val dist1 = (position1 - computedTracker1.position).len()
			val dist2 = (position2 - computedTracker2.position).len()
			offset += FastMath.abs(dist2 - dist1)
			offsetCount++
		}
		return if (offsetCount > 0) offset / offsetCount else 0f
	}
}
