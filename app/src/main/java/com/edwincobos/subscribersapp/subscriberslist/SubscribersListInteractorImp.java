package com.edwincobos.subscribersapp.subscriberslist;

import com.edwincobos.subscribersapp.commons.models.Subscriber;
import com.edwincobos.subscribersapp.commons.utils.ApiClientGithub;

import java.util.List;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;

/**
 * Interactor class that manage the connection with external sources to get Data.
 * This class implements SubscribersListInteractor interface.
 * @author edwin.cobos
 * @since 19/08/2016
 */
public class SubscribersListInteractorImp implements SubscribersListInteractor {
    @Override
    public void getSubscribersDataList(final OnFinishedListener listener) {
        Call<List<Subscriber>> call = ApiClientGithub.getApiService().getSubscribers();
        call.enqueue(new Callback<List<Subscriber>>() {
            @Override
            public void onResponse(Call<List<Subscriber>> call, Response<List<Subscriber>> response) {
                int statusCode = response.code();
                List<Subscriber> userList = response.body();
                listener.onFinished(userList);
            }

            @Override
            public void onFailure(Call<List<Subscriber>> call, Throwable t) {

            }
        });
    }
}
