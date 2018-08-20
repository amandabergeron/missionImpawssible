package bergeron.mandi.missionimpawssible.Activites;

import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.view.View;

import bergeron.mandi.missionimpawssible.R;

public class InviteSponsorActivity extends AppCompatActivity {

    @Override
    public void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.invite_sponsors);
    }

    public void onClickSkip(View view) {
        Intent i = new Intent(this, InviteSponsorActivity.class);
        startActivity(i);
    }
}
