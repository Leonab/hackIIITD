package piedpiper.org.sceptre.async;

import android.app.Activity;
import android.os.AsyncTask;
import android.widget.TextView;

import java.util.List;

import piedpiper.org.sceptre.CourtServiceProvider;
import piedpiper.org.sceptre.R;
import piedpiper.org.sceptre.api.model.Case;

/**
 * Created by OPSKMC on 8/22/2015.
 */
public class CourtServiceGetAllCases extends AsyncTask<String,Void,List<Case>> {
    private Activity activity;

    public CourtServiceGetAllCases(Activity activity) {
        this.activity = activity;
    }

    @Override
    protected List<Case> doInBackground(String... strings) {
        CourtServiceProvider courtServiceProvider = new CourtServiceProvider();
        List<Case> cases = courtServiceProvider.getAllCasesOfCourt();
        return cases;

    }

    @Override
    protected void onPostExecute(List<Case> cases) {
//        super.onPostExecute(result);
        TextView textView = (TextView)activity.findViewById(R.id.textView);
        String allCases = "";
        for(Case currentCase:cases){
            allCases +=currentCase.getDescription() + ",";
        }
        textView.setText(allCases);
    }
}
