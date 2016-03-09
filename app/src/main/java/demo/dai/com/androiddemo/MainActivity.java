package demo.dai.com.androiddemo;

import android.app.Activity;
import android.app.FragmentManager;
import android.app.FragmentTransaction;
import android.os.Bundle;
import android.util.Log;

import demo.dai.com.androiddemo.frament.FirstFrament;

/**
 * Created by 代金戈 on 2016/3/8.
 */
public class MainActivity extends Activity{

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.main_layout);
        /**
         * 代码添加frament.........
         */
        FragmentManager fragmentManager = getFragmentManager();
        FragmentTransaction fragmentTransaction = fragmentManager.beginTransaction();
        FirstFrament firstFrament = new FirstFrament();
        fragmentTransaction.add(R.id.main,firstFrament);
        Log.i("dai","DDDDD");
        fragmentTransaction.commit();
    }
}
