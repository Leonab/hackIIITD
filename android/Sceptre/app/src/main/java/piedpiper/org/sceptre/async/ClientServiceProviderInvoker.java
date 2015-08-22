package piedpiper.org.sceptre.async;

import android.app.Activity;
import android.os.AsyncTask;
import android.widget.TextView;

import java.util.List;

import piedpiper.org.sceptre.CourtServiceProvider;
import piedpiper.org.sceptre.R;
import piedpiper.org.sceptre.api.model.Lawyer;
import piedpiper.org.sceptre.service.CourtService;

/**
 * Created by OPSKMC on 8/22/2015.
 */
public class ClientServiceProviderInvoker extends AsyncTask<String,Void,String>{
    Activity activity;
    public ClientServiceProviderInvoker(Activity activity){
        this.activity = activity;
    }
    @Override
    protected String doInBackground(String... strings) {
        CourtServiceProvider courtServiceProvider = new CourtServiceProvider();
        System.out.println("********************************");
        List<Lawyer> lawyers = courtServiceProvider.getAllLawyersOfCourt();
        System.out.println(lawyers.size());
        String allNames = "";
        for(Lawyer lawyer:lawyers)
            allNames +=lawyer.getName();
        return allNames;
    }

    @Override
    protected void onPostExecute(String allNames) {
        TextView textView = (TextView)activity.findViewById(R.id.textView);
        textView.setText(allNames);
    }
}
