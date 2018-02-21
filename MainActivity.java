import com.youappi.ai.sdk.YAErrorCode;
import com.youappi.ai.sdk.YouAPPi;
import com.youappi.ai.sdk.ads.YAInterstitialAd;

public class MainActivity extends AppCompatActivity {
    private static final String TOKEN = "paste_your_token_here";
    
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        YouAPPi.init(MainActivity.this, TOKEN);
        Button button = (Button) findViewById(R.id.button);

        // Capture button clicks
        button.setOnClickListener(new View.OnClickListener() {
            public void onClick(View Args0) {
                final TextView myText = findViewById(R.id.mytext);
                final YAInterstitialAd interstitialAd = YouAPPi.getInstance().interstitialAd("test_interstitial_ad");
                interstitialAd.load();
                interstitialAd.setInterstitialAdListener(new YAInterstitialAd.InterstitialAdListener() {
                    @Override
                    public void onCardShow(String s) {
                    }

                    @Override
                    public void onCardClose(String s) {
                    }

                    @Override
                    public void onCardClick(String s) {
                    }

                    @Override
                    public void onLoadSuccess(String s) {
                        interstitialAd.show();
                    }

                    @Override
                    public void onLoadFailure(String s, YAErrorCode yaErrorCode, Exception e) {
                    }

                    @Override
                    public void onShowFailure(String s, YAErrorCode yaErrorCode, Exception e) {
                    }

                    @Override
                    public void onAdStarted(String s) {
                    }

                    @Override
                    public void onAdEnded(String s) {
                    }
                });
            }
        });
    }
}