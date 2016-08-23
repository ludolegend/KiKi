package com.example.ludo.kiki;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
}

// genre search screen: check footer view, inflate new empty layout

// gson:
/**
 * String aba = ((Test1) ((Test) mNewsfeedList.get(1).getKetket()).getContest1()).getConket1();
 *
 * public class Test {
@SerializedName("test1")
Test1 contest1;

public Test1 getContest1() {
return contest1;
}
}

 public class Test1 {
@SerializedName("ket1")
String conket1;

public String getConket1() {
return conket1;
}
}
 */

//android get request param:
/**
 * String uri = String.format("http://ave.bolyartech.com/params.php?param1=%1$s¶m2=%2$s",
 num1,
 num2);
 StringRequest myReq = new StringRequest(Method.GET,
 uri,
 createMyReqSuccessListener(),
 createMyReqErrorListener());
 queue.add(myReq);  
 */
