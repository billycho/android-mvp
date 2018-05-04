package com.qwerapps.androidmvp;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;


import com.qwerapps.androidmvp.model.Ads;
import com.qwerapps.androidmvp.model.AdsResponse;
import com.qwerapps.androidmvp.rest.ApiClient;
import com.qwerapps.androidmvp.rest.ApiInterface;

import java.util.List;
import java.util.function.Consumer;

import butterknife.BindView;
import butterknife.ButterKnife;
import butterknife.OnClick;
import io.reactivex.Observable;
import io.reactivex.ObservableEmitter;
import io.reactivex.ObservableOnSubscribe;
import io.reactivex.Observer;
import io.reactivex.disposables.Disposable;
import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;

public class MainActivity extends AppCompatActivity {

    @BindView(R.id.text1)
    TextView title;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        ButterKnife.bind(this);

        ApiInterface apiService = ApiClient.getClient().create(ApiInterface.class);

        Call<AdsResponse> call = apiService.getAds("1");
        call.enqueue(new Callback<AdsResponse>() {
            @Override
            public void onResponse(Call<AdsResponse> call, Response<AdsResponse> response) {
                Log.d("asdaxxx",Integer.toString(response.body().getAds().size()));
                List<Ads> ads = response.body().getAds();

                for(int i = 0;i<ads.size();i++)
                {
                    Log.d("asdaxxx",ads.get(i).getCode());
                }
            }

            @Override
            public void onFailure(Call<AdsResponse> call, Throwable t) {

            }
        });


    }

    @OnClick(R.id.button)
    public void submit()
    {
        Toast.makeText(MainActivity.this, "Hello from Butterknife OnClick annotation", Toast.LENGTH_SHORT).show();

    }
}
