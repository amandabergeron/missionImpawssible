package bergeron.mandi.missionimpawssible.Activites;

import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.view.View;

import bergeron.mandi.missionimpawssible.R;

public class CardInfoActivity extends AppCompatActivity {

    @Override
    public void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.card_info);
    }

    public void onClickSkip(View view) {
        Intent i = new Intent(this, DonationMethodActivity.class);
        startActivity(i);
    }
}
