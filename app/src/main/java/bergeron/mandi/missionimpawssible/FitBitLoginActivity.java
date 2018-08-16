package bergeron.mandi.missionimpawssible;

import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;

public class FitBitLoginActivity extends AppCompatActivity {
    @Override
    public void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.fitbit_login);

        Button logInWithFitBitAccountButton = (Button) findViewById(R.id.login_using_fitbit_account);
        logInWithFitBitAccountButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new Intent(FitBitLoginActivity.this, ChooseYourChallengeActivity.class);
                startActivity(i);
            }
        });

        Button logStepsManuallyButton = (Button) findViewById(R.id.skip_enter_steps_manually_fitbit_button);
        logStepsManuallyButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new Intent(FitBitLoginActivity.this, AccountCreationActivity.class);
                startActivity(i);
            }
        });
    }
}
