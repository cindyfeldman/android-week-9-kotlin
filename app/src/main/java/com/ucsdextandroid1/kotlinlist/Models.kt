package com.ucsdextandroid1.kotlinlist

import android.os.Parcel
import android.os.Parcelable
import com.google.gson.annotations.SerializedName

class Models {
    data public class SearchResults(@SerializedName("results") val songs: List<SongItem> = emptyList()
    )

    data class SongItem(@SerializedName("trackId") var trackID: Long = 0,
                        @SerializedName("trackName") var trackName: String? = null,
                        @SerializedName("artistName") var artistName: String? = null,
                        @SerializedName("collectionName") var albumName: String? = null,
                        @SerializedName("artworkUrl100") var artworkUrl: String? = null,
                        @SerializedName("previewURL") var previewUrl: String? = null,
                        @SerializedName("trackTimeMilis") var trackTimeMillis: Long = 0
    )

}
