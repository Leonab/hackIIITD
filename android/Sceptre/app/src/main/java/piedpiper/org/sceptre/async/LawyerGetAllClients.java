package piedpiper.org.sceptre.async;

import android.app.Activity;
import android.os.AsyncTask;
import android.widget.TextView;

import java.util.List;

import piedpiper.org.sceptre.LawyerServiceProvider;
import piedpiper.org.sceptre.R;
import piedpiper.org.sceptre.api.model.Case;
import retrofit.Callback;
import retrofit.RetrofitError;
import retrofit.client.Response;

/**
 * Created by OPSKMC on 8/22/2015.
 */
public class LawyerGetAllClients extends AsyncTask<Integer,Void,List<Case>> {
    Activity activity;

    public LawyerGetAllClients(Activity activity) {
        this.activity = activity;
    }

    @Override
    protected List<Case> doInBackground(Integer... ints) {
        LawyerServiceProvider lawyerServiceProvider = new LawyerServiceProvider();
        System.out.println("** Fetching cases for Lawyer_id : " + ints[0]);
        List<Case> cases =  lawyerServiceProvider.getAllCasesForLawyer(ints[0]);

        System.out.println("** sizes of cases returned : " + cases.size());
        return cases;
    }

    @Override
    protected void onPostExecute(List<Case> cases) {
        TextView textView = (TextView)activity.findViewById(R.id.textView);
        if(cases==null)
            System.out.println("**** No cases found");
        for(Case thisCase:cases){
            textView.setText(textView.getText() + " " + thisCase.getId());
        }

    }
}
