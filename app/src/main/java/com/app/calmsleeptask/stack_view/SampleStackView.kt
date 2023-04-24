package com.app.calmsleeptask.stack_view

import android.view.View

class SampleStackView(private val view: View) : StackView {
    private var isViewExpanded: Boolean = false

    override fun expandView() {
        isViewExpanded = true
        view.visibility = View.VISIBLE
    }

    override fun collapseView() {
        isViewExpanded = false
        view.visibility = View.GONE
    }

    override fun isViewExpanded(): Boolean {
        return isViewExpanded
    }
}
