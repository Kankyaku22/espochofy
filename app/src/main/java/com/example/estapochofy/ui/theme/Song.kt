package com.example.estapochofy.ui.theme

import android.media.MediaPlayer

data class Song(val name: String, val album: String,val artist: String, val coverImage: Int, val audioFile: Int)

object MusicPlayer {
    private var mediaPlayer: MediaPlayer? = null

    fun playSong(song: Song) {
        mediaPlayer?.release()
        mediaPlayer = MediaPlayer.create(ContextProvider.getContext(), song.audioFile)
        mediaPlayer?.start()
    }

    fun pauseSong() {
        mediaPlayer?.pause()
    }

    fun stopSong() {
        mediaPlayer?.stop()
    }
}
