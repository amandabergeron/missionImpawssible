package bergeron.mandi.missionimpawssible.Activites;

import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.ImageButton;

import bergeron.mandi.missionimpawssible.R;

public class ChooseDonationActivity extends AppCompatActivity {

    @Override
    public void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.donation_method);

        ImageButton cardBtn = (ImageButton) findViewById(R.id.cardBtn);
        cardBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new Intent(ChooseDonationActivity.this, CardInfoActivity.class);
                startActivity(i);
            }
        });
    }

    public void onClickSkip(View view) {
        Intent i = new Intent(this, ChooseDonationActivity.class);
        startActivity(i);
    }
}
