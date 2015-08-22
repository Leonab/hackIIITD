package piedpiper.org.sceptre.async;

import android.app.Activity;
import android.os.AsyncTask;
import android.widget.TextView;

import piedpiper.org.sceptre.CourtServiceProvider;
import piedpiper.org.sceptre.R;
import piedpiper.org.sceptre.service.CourtService;
import retrofit.Callback;
import retrofit.RetrofitError;
import retrofit.client.Response;

/**
 * Created by OPSKMC on 8/22/2015.
 */
public class CourtServiceAddCase extends AsyncTask<String,Void,Void> {
    private Activity activity;

    public CourtServiceAddCase(Activity activity) {
        this.activity = activity;
    }

    Integer id;
    @Override
    protected Void doInBackground(String... strings) {
        CourtServiceProvider courtServiceProvider = new CourtServiceProvider();
        String description = strings[0];
        System.out.println("**** description : " + description);
        String lastStatus = strings[1];
        int department_id = Integer.parseInt(strings[2]);
        System.out.println("**** department_id : " +department_id );
        int lawyer_id = Integer.parseInt(strings[3]);
        int status= Integer.parseInt(strings[4]);

        Callback<String> callback = new Callback<String>() {

            @Override
            public void success(String callback, Response response) {
                System.out.println("SUCCESSS ****************");
//
// id=integer;
            }

            @Override
            public void failure(RetrofitError error) {
                System.out.println("Failed ****************");
                error.printStackTrace();
//
//  id=-1;
            }
        };
        courtServiceProvider.postCase(description,lastStatus,department_id,lawyer_id,status,callback);
        return null;
    }

    @Override
    protected void onPostExecute(Void var) {
        System.out.println("");
        TextView textView = (TextView)activity.findViewById(R.id.textView);
        textView.setText("success. check database");
    }
}
