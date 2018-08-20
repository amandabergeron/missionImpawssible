package bergeron.mandi.missionimpawssible.Activites;

import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;

import bergeron.mandi.missionimpawssible.R;

public class ChooseYourChallengeActivity extends AppCompatActivity {

    @Override
    public void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.choose_your_challenge);

        Button teamChallengeButton = (Button) findViewById(R.id.team_challenge_button);
        teamChallengeButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new Intent(ChooseYourChallengeActivity.this, InviteSponsorActivity.class);
                startActivity(i);
            }
        });

        Button soloChallengeButton = (Button) findViewById(R.id.solo_challenge_button);
        soloChallengeButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new Intent(ChooseYourChallengeActivity.this, ChooseDonationActivity.class);
                startActivity(i);
            }
        });
    }

    public void onClickSkip(View view) {
        Intent i = new Intent(this, ChooseDeviceActivity.class);
        startActivity(i);
    }
}
