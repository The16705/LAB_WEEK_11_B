package com.example.lab_week_11_b

class FileHelper(private val context: Context) {
    // Generate a URI to access the file
// The URI will be temporary to limit access from other apps
    fun getUriFromFile(file: File): Uri {
        return FileProvider.getUriForFile(
            context, "com.example.lab_week_11_b.camera", file
        )
    }
    // Get the folder name for pictures
// The name is defined in file_provider_paths.xml
    fun getPicturesFolder(): String =
        Environment.DIRECTORY_PICTURES
    // Get the folder name for videos
// The name is defined in file_provider_paths.xml
    fun getVideosFolder(): String =
        Environment.DIRECTORY_MOVIES
}
