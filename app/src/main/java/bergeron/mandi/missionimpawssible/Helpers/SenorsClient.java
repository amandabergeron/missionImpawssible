package bergeron.mandi.missionimpawssible.Helpers;

import android.content.Context;
import android.os.Looper;
import android.support.annotation.NonNull;

import com.google.android.gms.auth.api.signin.GoogleSignIn;
import com.google.android.gms.auth.api.signin.GoogleSignInAccount;
import com.google.android.gms.auth.api.signin.GoogleSignInOptionsExtension;
import com.google.android.gms.common.api.Api;
import com.google.android.gms.common.api.GoogleApi;
import com.google.android.gms.fitness.Fitness;
import com.google.android.gms.fitness.FitnessOptions;
import com.google.android.gms.fitness.data.DataType;
import com.google.android.gms.fitness.request.SensorRequest;
import com.google.android.gms.tasks.Task;

import java.util.concurrent.TimeUnit;

public class SenorsClient extends GoogleApi<FitnessOptions> {
    protected SenorsClient(@NonNull Context context, Api<FitnessOptions> api, Looper looper) {
        super(context, api, looper);
    }

    GoogleSignInOptionsExtension fitnessOptions =
            FitnessOptions.builder()
                    .addDataType(DataType.TYPE_STEP_COUNT_DELTA, FitnessOptions.ACCESS_READ)
                    .build();

//    GoogleSignInAccount gsa = GoogleSignIn.getAccountForExtension(this, fitnessOptions);
//
//    Task<Void> response = Fitness.getSensorsClient(this, gsa)
//            .add(new SensorRequest.Builder()
//                            .setDataType(DataType.TYPE_STEP_COUNT_DELTA)
//                            .setSamplingRate(1, TimeUnit.MINUTES)  // sample once per minute
//                            .build(),
//                    myStepCountListener);
}
