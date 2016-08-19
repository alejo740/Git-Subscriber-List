package com.edwincobos.subscribersapp.subscriberslist;

import com.edwincobos.subscribersapp.commons.models.ItemUserList;

import java.util.List;

/**
 * Created by edwin.cobos on 19/08/2016.
 */
public interface SubscribersListInteractor {
    interface OnFinishedListener {
        void onFinished(List<ItemUserList> listItems);
    }

    void getSubscribersDataList(OnFinishedListener listener);

}
