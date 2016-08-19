package com.edwincobos.subscribersapp.subscriberslist;

import com.edwincobos.subscribersapp.commons.models.ItemUserList;
import com.edwincobos.subscribersapp.commons.utils.ApiClientGithub;
import com.edwincobos.subscribersapp.commons.utils.Utils;

import java.util.List;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;

/**
 * Created by edwin.cobos on 19/08/2016.
 */
public class SubscribersListInteractorImp implements SubscribersListInteractor {
    @Override
    public void getSubscribersDataList(final OnFinishedListener listener) {
        Call<List<ItemUserList>> call = ApiClientGithub.getApiService().getSubscribers();
        call.enqueue(new Callback<List<ItemUserList>>() {
            @Override
            public void onResponse(Call<List<ItemUserList>> call, Response<List<ItemUserList>> response) {
                int statusCode = response.code();
                List<ItemUserList> userList = response.body();
                Utils.debugLog(userList.toString());
                listener.onFinished(userList);
            }

            @Override
            public void onFailure(Call<List<ItemUserList>> call, Throwable t) {

            }
        });
    }
}
