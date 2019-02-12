package com.eric.adapter.listener;

import android.view.View;

/**
 * Author: Eric
 * Date: Created in 2019/2/12 11:15 AM
 * Description： 列表中item长按回调
 */
public interface OnItemLongClickListener {
    void onLongClick(View v, int position);
}
