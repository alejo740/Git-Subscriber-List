package com.edwincobos.subscribersapp.subscriberslist;

import com.edwincobos.subscribersapp.commons.models.ItemUserList;
import com.edwincobos.subscribersapp.commons.utils.Utils;

import java.util.Arrays;
import java.util.List;

/**
 * Created by edwin.cobos on 18/08/2016.
 */
public class SubscribersListPresenterImp implements SubscribersListPresenter, SubscribersListInteractor.OnFinishedListener {

    private SubscribersListView view;
    private SubscribersListInteractor interactor;

    public SubscribersListPresenterImp(SubscribersListView view){
        this.view = view;
        this.interactor = new SubscribersListInteractorImp();

        //interactor.getSubscribersDataList(this);
    }

    @Override
    public void onResume() {

    }

    @Override
    public void onDestroy() {
        view = null;
    }

    @Override
    public void onFinished(List<ItemUserList> listItems) {
        Utils.debugLog(Arrays.deepToString(listItems.toArray()));
    }
}
