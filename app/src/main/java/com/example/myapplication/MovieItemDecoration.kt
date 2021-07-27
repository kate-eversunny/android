package com.example.myapplication

import android.graphics.Rect
import android.view.View
import androidx.recyclerview.widget.RecyclerView

class MovieItemDecoration constructor(
	private var leftOffset: Int,
	private var topOffset: Int,
	private var rightOffset: Int,
	private var bottomOffset: Int
	): RecyclerView.ItemDecoration() {

	override fun getItemOffsets(
		outRect: Rect, view: View, parent: RecyclerView,
		state: RecyclerView.State
	) {
		super.getItemOffsets(outRect, view, parent, state)
		outRect.set(leftOffset, topOffset, rightOffset, bottomOffset)
	}
}