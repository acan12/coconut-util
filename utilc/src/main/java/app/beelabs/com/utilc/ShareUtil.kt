package app.beelabs.com.utilc

import android.content.Context
import android.content.Intent
import android.graphics.Bitmap
import android.net.Uri
import android.provider.MediaStore
import android.widget.ImageView
import java.io.ByteArrayOutputStream

class ShareUtil {

    companion object {

        fun shareImageOrText(view: ImageView?, title: String, body: String, context: Context) {
            val share = Intent(Intent.ACTION_SEND)
            share.flags = Intent.FLAG_ACTIVITY_NEW_TASK

            if (view != null) {
                view.buildDrawingCache()
                val b = view.drawingCache
                val bytes = ByteArrayOutputStream()
                b.compress(Bitmap.CompressFormat.JPEG, 100, bytes)
                val path = MediaStore.Images.Media.insertImage(context.contentResolver, b, title, null)
                val imageUri = Uri.parse(path)
                share.putExtra(Intent.EXTRA_STREAM, imageUri)
                share.type = "image/*"
                view.destroyDrawingCache()
            } else {
                share.type = "text/plain"
            }


            share.putExtra(Intent.EXTRA_SUBJECT, title)
            share.putExtra(Intent.EXTRA_TEXT, body)

            context.startActivity(share)


        }
    }
}