package com.edwincobos.subscribersapp.subscriberslist;

import com.edwincobos.subscribersapp.commons.models.ItemUserList;
import com.edwincobos.subscribersapp.commons.utils.Utils;

import java.util.Arrays;
import java.util.List;

/**
 * Presenter class that connect the Activity class(view) and Interactor class(Model).
 * This class implements SubscribersListPresenter interface.
 * @author edwin.cobos
 * @since 18/08/2016
 */
public class SubscribersListPresenterImp implements SubscribersListPresenter, SubscribersListInteractor.OnFinishedListener {

    private SubscribersListView view;
    private SubscribersListInteractor interactor;

    public SubscribersListPresenterImp(SubscribersListView view){
        this.view = view;
        this.interactor = new SubscribersListInteractorImp();
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
