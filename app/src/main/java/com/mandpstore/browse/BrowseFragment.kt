package com.mandpstore.browse

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.lifecycle.ViewModelProviders
import androidx.recyclerview.widget.LinearLayoutManager
import com.mandpstore.R
import com.mandpstore.common.inflate
import kotlinx.android.synthetic.main.browse_fragment.*


class BrowseFragment : Fragment() {

    companion object {
        fun newInstance() = BrowseFragment()
    }

    private lateinit var viewModel: BrowseViewModel

    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?): View? {
        return container?.inflate(R.layout.browse_fragment)
    }

    override fun onActivityCreated(savedInstanceState: Bundle?) {
        super.onActivityCreated(savedInstanceState)
        rv_browse.setHasFixedSize(true)
        rv_browse.layoutManager = LinearLayoutManager(context)
        viewModel = ViewModelProviders.of(this).get(BrowseViewModel::class.java)
        // TODO: Use the ViewModel
    }

}
