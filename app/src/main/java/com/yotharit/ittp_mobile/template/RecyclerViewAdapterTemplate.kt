//package com.yotharit.foodstorystock.template
//
//import android.view.LayoutInflater
//import android.view.View
//import android.view.ViewGroup
//import android.widget.TextView
//import androidx.recyclerview.widget.RecyclerView
//import com.yotharit.foodstorystock.R
//import com.yotharit.foodstorystock.model.ReceiveItem
//
//
////TEMPLATE
//class RecyclerViewAdapterTemplate(var receiveList: ArrayList<ReceiveItem>) : RecyclerView.Adapter<RecyclerViewAdapterTemplate.MyViewHolder>() {
//
//    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): MyViewHolder {
//        val itemView: View = LayoutInflater.from(parent.context)
//                .inflate(R.layout.product_add_list, parent, false)
//        return MyViewHolder(itemView)
//    }
//
//
//    override fun onBindViewHolder(holder: MyViewHolder, position: Int) {
//        val receiveItem = receiveList.get(position)
//        holder.productId.text = receiveItem.name
//        holder.productDistributor.text = receiveItem.distributor
//        holder.productQuantity.text = ("Quantity : " + receiveItem.quantity)
//    }
//
//    override fun getItemCount(): Int {
//        return receiveList.size
//    }
//
//    inner class MyViewHolder(view: View) : RecyclerView.ViewHolder(view) {
//        var productId: TextView = view.findViewById(R.id.tvProductName)
//        var productDistributor: TextView = view.findViewById(R.id.tvDistributor)
//        var productQuantity: TextView = view.findViewById(R.id.tvQuantity)
//    }
//
//}