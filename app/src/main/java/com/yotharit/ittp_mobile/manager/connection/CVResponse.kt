package com.yotharit.ittp_mobile.manager.connection

class CVResponse {

    var responses: List<Response>? = null
        internal set

    val isResponsesAvailable: Boolean
        get() = responses != null && responses!!.size > 0

    val requestCount: Int
        get() = if (isResponsesAvailable) responses!!.size else 0

    fun getResponse(index: Int): Response {
        return responses!![index]
    }

    class Response {
        var faces: List<FaceAnnotation>? = null
            internal set
        var landmarks: List<EntityAnnotation>? = null
            internal set
        var logos: List<EntityAnnotation>? = null
            internal set
        var labels: List<EntityAnnotation>? = null
            internal set
        var texts: List<EntityAnnotation>? = null
            internal set
        var safeSearch: SafeSearchAnnotation? = null
            internal set
        var error: Error? = null
            internal set

        val faceCount: Int
            get() = if (faces != null) faces!!.size else 0

        val landmarkCount: Int
            get() = if (landmarks != null) landmarks!!.size else 0

        val labelCount: Int
            get() = if (labels != null) labels!!.size else 0

        val textCount: Int
            get() = if (texts != null) texts!!.size else 0

        val logoCount: Int
            get() = if (logos != null) logos!!.size else 0

        val isFaceAvailable: Boolean
            get() = faces != null

        val isLandmarkAvailable: Boolean
            get() = landmarks != null

        val isLogoAvailable: Boolean
            get() = logos != null

        val isLabelAvailable: Boolean
            get() = labels != null

        val isTextAvailable: Boolean
            get() = texts != null

        val isSafeSearchAvailable: Boolean
            get() = safeSearch != null

        val isError: Boolean
            get() = error != null

        fun getFace(index: Int): FaceAnnotation {
            return faces!![index]
        }

        fun getLandmark(index: Int): EntityAnnotation {
            return landmarks!![index]
        }

        fun getLabelCount(index: Int): EntityAnnotation {
            return labels!![index]
        }

        fun getTextCount(index: Int): EntityAnnotation {
            return texts!![index]
        }

        fun getLogoCount(index: Int): EntityAnnotation {
            return logos!![index]
        }
    }

    class FaceAnnotation {
        var boundingPoly: BoundingPoly? = null
            internal set
        var fdBoundingPoly: BoundingPoly? = null
            internal set
        var landmarks: List<Landmark>? = null
            internal set
        var rollAngle: Float = 0.toFloat()
            internal set
        var panAngle: Float = 0.toFloat()
            internal set
        var tiltAngle: Float = 0.toFloat()
            internal set
        var detectionConfidence: Float = 0.toFloat()
            internal set
        var landmarkingConfidence: Float = 0.toFloat()
            internal set
        var joyLikelihood: String? = null
            internal set
        var sorrowLikelihood: String? = null
            internal set
        var angerLikelihood: String? = null
            internal set
        var surpriseLikelihood: String? = null
            internal set
        var underExposedLikelihood: String? = null
            internal set
        var blurredLikelihood: String? = null
            internal set
        var headwearLikelihood: String? = null
            internal set
    }

    class EntityAnnotation {
        var mid: String? = null
            internal set
        var locale: String? = null
            internal set
        var description: String? = null
            internal set
        var score: Float = 0.toFloat()
            internal set
        var confidence: Float = 0.toFloat()
            internal set
        var topicality: Float = 0.toFloat()
            internal set
        var boundingPoly: BoundingPoly? = null
            internal set
        var locations: List<LocationInfo>? = null
            internal set
        var properties: List<Property>? = null
            internal set
    }

    class SafeSearchAnnotation {
        var adult: String? = null
            internal set
        var spoof: String? = null
            internal set
        var medical: String? = null
            internal set
        var violence: String? = null
            internal set
    }

    class BoundingPoly {
        var vertices: List<Vertex>? = null
            internal set

        class Vertex {
            var x: Float = 0.toFloat()
                internal set
            var y: Float = 0.toFloat()
                internal set
        }
    }

    class Landmark {
        var type: String? = null
            internal set
        var position: Position? = null
            internal set

        class Position {
            var x: Float = 0.toFloat()
                internal set
            var y: Float = 0.toFloat()
                internal set
            var z: Float = 0.toFloat()
                internal set
        }
    }

    class LocationInfo {
        var latLng: LatLng? = null
            internal set

        class LatLng {
            var latitude: Double = 0.toDouble()
                internal set
            var longitude: Double = 0.toDouble()
                internal set
        }
    }

    class Property {
        var name: String? = null
            internal set
        var value: String? = null
            internal set
    }

    class Error {
        var code: Int = 0
            internal set
        var message: String? = null
            internal set
    }
}
