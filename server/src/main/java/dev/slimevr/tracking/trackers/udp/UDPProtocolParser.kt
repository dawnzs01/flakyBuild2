package dev.slimevr.tracking.trackers.udp

import java.io.IOException
import java.nio.ByteBuffer
import java.nio.charset.StandardCharsets

class UDPProtocolParser {
	@Throws(IOException::class)
	fun parse(buf: ByteBuffer, connection: UDPDevice?): UDPPacket? {
		val packetId = buf.int
		val packetNumber = buf.long
		if (connection != null) {
			if (!connection.isNextPacket(packetNumber)) {
				// Skip packet because it's not next
				throw IOException(
					"Out of order packet received: id $packetId, number $packetNumber, last ${connection.lastPacketNumber}, from $connection"
				)
			}
			connection.lastPacket = System.currentTimeMillis()
		}
		val newPacket = getNewPacket(packetId)
		if (newPacket != null) {
			newPacket.readData(buf)
		} else {
// 			LogManager.log.debug(
// 				"[UDPProtocolParser] Skipped packet id " +
// 					packetId + " from " + connection
// 			)
		}
		return newPacket
	}

	@Throws(IOException::class)
	fun write(buf: ByteBuffer, connection: UDPDevice?, packet: UDPPacket) {
		buf.putInt(packet.packetId)
		buf.putLong(0) // Packet number is always 0 when sending data to trackers
		packet.writeData(buf)
	}

	@Throws(IOException::class)
	fun writeHandshakeResponse(buf: ByteBuffer, connection: UDPDevice?) {
		buf.put(HANDSHAKE_BUFFER)
	}

	@Throws(IOException::class)
	fun writeSensorInfoResponse(
		buf: ByteBuffer,
		connection: UDPDevice?,
		packet: UDPPacket15SensorInfo,
	) {
		buf.putInt(packet.packetId)
		buf.put(packet.sensorId.toByte())
		buf.put(packet.sensorStatus.toByte())
	}

	protected fun getNewPacket(packetId: Int): UDPPacket? {
		return when (packetId) {
			PACKET_HEARTBEAT -> UDPPacket0Heartbeat
			PACKET_ROTATION -> UDPPacket1Rotation()
			PACKET_HANDSHAKE -> UDPPacket3Handshake()
			PACKET_PING_PONG -> UDPPacket10PingPong()
			PACKET_ACCEL -> UDPPacket4Acceleration()
			PACKET_SERIAL -> UDPPacket11Serial()
			PACKET_BATTERY_LEVEL -> UDPPacket12BatteryLevel()
			PACKET_TAP -> UDPPacket13Tap()
			PACKET_ERROR -> UDPPacket14Error()
			PACKET_SENSOR_INFO -> UDPPacket15SensorInfo()
			PACKET_ROTATION_2 -> UDPPacket16Rotation2()
			PACKET_ROTATION_DATA -> UDPPacket17RotationData()
			PACKET_MAGNETOMETER_ACCURACY -> UDPPacket18MagnetometerAccuracy()
			PACKET_SIGNAL_STRENGTH -> UDPPacket19SignalStrength()
			PACKET_TEMPERATURE -> UDPPacket20Temperature()
			PACKET_USER_ACTION -> UDPPacket21UserAction()
			PACKET_PROTOCOL_CHANGE -> UDPPacket200ProtocolChange()
			else -> null
		}
	}

	companion object {
		const val PACKET_HEARTBEAT = 0
		const val PACKET_ROTATION = 1 // Deprecated

		// public static final int PACKET_GYRO = 2; // Deprecated
		const val PACKET_HANDSHAKE = 3
		const val PACKET_ACCEL = 4

		// public static final int PACKET_MAG = 5; // Deprecated
		// public static final int PACKET_RAW_CALIBRATION_DATA = 6; // Not parsed by
		// server
		// public static final int PACKET_CALIBRATION_FINISHED = 7; // Not parsed by
		// server
		// public static final int PACKET_CONFIG = 8; // Not parsed by server
		// public static final int PACKET_RAW_MAGNETOMETER = 9 // Deprecated
		const val PACKET_PING_PONG = 10
		const val PACKET_SERIAL = 11
		const val PACKET_BATTERY_LEVEL = 12
		const val PACKET_TAP = 13
		const val PACKET_ERROR = 14
		const val PACKET_SENSOR_INFO = 15
		const val PACKET_ROTATION_2 = 16 // Deprecated
		const val PACKET_ROTATION_DATA = 17
		const val PACKET_MAGNETOMETER_ACCURACY = 18
		const val PACKET_SIGNAL_STRENGTH = 19
		const val PACKET_TEMPERATURE = 20
		const val PACKET_USER_ACTION = 21
		const val PACKET_PROTOCOL_CHANGE = 200
		private val HANDSHAKE_BUFFER = ByteArray(64)

		init {
			HANDSHAKE_BUFFER[0] = 3
			val str = "Hey OVR =D 5".toByteArray(StandardCharsets.US_ASCII)
			System.arraycopy(str, 0, HANDSHAKE_BUFFER, 1, str.size)
		}
	}
}
