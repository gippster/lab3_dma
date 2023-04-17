package com.example.lab3

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import butterknife.BindView
import butterknife.OnClick

class ImageViewerFragment : BaseFragment() {
    @BindView(R.id.image)
    lateinit var imageView: ImageView

    private var currentImage = 0

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        return inflater.inflate(R.layout.fragment_3, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        imageView.setImageResource(IMAGES[currentImage])
    }

    @OnClick(R.id.next)
    fun onNextClicked() {
        currentImage++
        if (currentImage >= IMAGES.size) {
            currentImage = 0
        }

        imageView.setImageResource(IMAGES[currentImage])
    }

    companion object {
        const val TAG = "IMAGEVIEWERFRAGMENT"

        val IMAGES = arrayOf(
            R.drawable.image_1,
            R.drawable.image_2,
            R.drawable.image_3,
            R.drawable.image_4,
        )

        @JvmStatic
        fun newInstance() =
            ImageViewerFragment()
    }
}