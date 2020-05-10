package com.example.myfirstapp;

        import androidx.appcompat.app.AppCompatActivity;

        import android.os.Bundle;
        import android.webkit.WebSettings;
        import android.webkit.WebView;

public class MainActivity extends AppCompatActivity {
    private WebView myWebView;
    private WebSettings myWebSettings;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        myWebView = (WebView)findViewById(R.id.webView); //자바코드 연결
        myWebSettings = myWebView.getSettings(); //세팅 등록
        myWebSettings.setJavaScriptEnabled(true); //자바스크립트 허용 여부
        myWebSettings.setJavaScriptCanOpenWindowsAutomatically(false); //자바스크립트멀티뷰 허용여부
        myWebView.loadUrl("https://nadasansu.github.io/");
    }
}
