package com.qwerapps.androidmvp;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.widget.TextView;
import android.widget.Toast;


import java.util.function.Consumer;

import butterknife.BindView;
import butterknife.ButterKnife;
import butterknife.OnClick;
import io.reactivex.Observable;
import io.reactivex.ObservableEmitter;
import io.reactivex.ObservableOnSubscribe;
import io.reactivex.Observer;
import io.reactivex.disposables.Disposable;

public class MainActivity extends AppCompatActivity {

    @BindView(R.id.text1)
    TextView title;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

//        BattleOfBastards a = new BattleOfBastards();
//        a.startWar();

//        ButterKnife.bind(this);
//        title.setText("Hello from Butterknife");

        Observable<Integer> observable = Observable.create(new ObservableOnSubscribe<Integer>() {
            @Override
            public void subscribe(ObservableEmitter<Integer> e) throws Exception {
                e.onNext(1);
                e.onNext(2);
                e.onNext(3);
                e.onNext(4);

                e.onComplete();;
            }
        });



        Observer<Integer> observer = new Observer<Integer>(){
            @Override
            public void onSubscribe(Disposable d)
            {
                Log.e("asda", "onSubscribe: ");
            }

            @Override
            public void onNext(Integer value)
            {
                Log.e("asda", "onNext: " + value);
            }

            @Override
            public void onError(Throwable e)
            {
                Log.e("asda","onError: " );
            }

            @Override
            public void onComplete()
            {
                Log.e("asda","onComplete: All Done!");
            }
        };

        observable.subscribe(observer);


    }

    @OnClick(R.id.button)
    public void submit()
    {
        Toast.makeText(MainActivity.this, "Hello from Butterknife OnClick annotation", Toast.LENGTH_SHORT).show();

    }
}
