package com.yotharit.ittp_mobile.ui.landing.dialog

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.annotation.StringRes
import androidx.fragment.app.DialogFragment
import com.yotharit.ittp_mobile.R
import kotlinx.android.synthetic.main.help_dialog.*

class HelpDialogFragment : DialogFragment() {

    var text = ""


    companion object {

        val TEXT_KEY: String? = "text"

        fun newInstance(text : String) : HelpDialogFragment {
            val fragment = HelpDialogFragment()
            val bundle = Bundle()
            bundle.putString(TEXT_KEY, text)
            fragment.arguments = bundle
            return fragment
        }

    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        if (savedInstanceState == null) {
            restoreArguments(arguments!!);
        } else {
            restoreInstanceState(savedInstanceState);
        }
    }

    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?): View? {
        return inflater.inflate(R.layout.help_dialog,container,false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        setUp()
    }

    fun setUp(){
        dialogText.text = text
        closeBtn.setOnClickListener {
            dismiss()
        }
    }

    override fun onSaveInstanceState(outState: Bundle) {
        super.onSaveInstanceState(outState)
        outState.putString(TEXT_KEY,text)
    }

    private fun restoreInstanceState(bundle: Bundle) {
        text = bundle.getString(TEXT_KEY)
    }

    private fun restoreArguments(bundle: Bundle) {
        text = bundle.getString(TEXT_KEY)
    }

    class Builder {
        private var text : String = ""

        fun setText(setText: String) {
            this.text = setText
        }

        fun build(): HelpDialogFragment {
            return HelpDialogFragment.newInstance(text)
        }
    }
}