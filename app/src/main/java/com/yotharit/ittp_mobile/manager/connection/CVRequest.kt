package com.yotharit.ittp_mobile.manager.connection

class CVRequest(internal var requests: List<Request>) {
    enum class FeatureType {
        TYPE_UNSPECIFIED, FACE_DETECTION, LANDMARK_DETECTION, LOGO_DETECTION, LABEL_DETECTION, TEXT_DETECTION, SAFE_SEARCH_DETECTION, IMAGE_PROPERTIES
    }

    class Request(internal var image: Image, internal var features: List<Feature>) {
        internal var imageContext: ImageContext? = null
    }

    class Image {
        internal lateinit var content: String
        internal lateinit var source: ImageSource

        constructor(content: String) {
            this.content = content
        }

        constructor(source: ImageSource) {
            this.source = source
        }

        class ImageSource(internal var gcsImageUri: String)
    }

    class Feature(internal var type: FeatureType, internal var maxResults: Int)

    class ImageContext(languageHints: List<String>, latLongRect: LatLongRect) {
        var languageHints: List<String>
            internal set
        var latLongRect: LatLongRect
            internal set

        init {
            this.languageHints = languageHints
            this.latLongRect = latLongRect
        }

        class LatLongRect(minLatLng: LatLng, maxLatLng: LatLng) {
            var minLatLng: LatLng
                internal set
            var maxLatLng: LatLng
                internal set

            init {
                this.minLatLng = minLatLng
                this.maxLatLng = maxLatLng
            }
        }
    }

    class LatLng(latitude: Double, longitude: Double) {
        var latitude: Double = 0.toDouble()
            internal set
        var longitude: Double = 0.toDouble()
            internal set

        init {
            this.latitude = latitude
            this.longitude = longitude
        }
    }
}
