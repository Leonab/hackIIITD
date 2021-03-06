package piedpiper.org.sceptre;

import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.TextView;

import piedpiper.org.sceptre.async.CourtServiceAddCase;
import piedpiper.org.sceptre.async.CourtServiceGetAllCases;
import piedpiper.org.sceptre.async.CourtServiceProviderInvoker;
import piedpiper.org.sceptre.async.LawyerGetAllClients;


public class Login extends ActionBarActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);
        TextView textView = (TextView)findViewById(R.id.textView);
        CourtServiceProvider courtServiceProvider=null;
        try {
            Runnable runnable = new Runnable() {
                @Override
                public void run() {
//                    CourtServiceGetAllCases courtServiceGetAllCases = new CourtServiceGetAllCases(Login.this);
//                    courtServiceGetAllCases.execute();
                }
            };
            new Thread(runnable).start();
            //LawyerGetAllClients lawyerGetAllClients = new LawyerGetAllClients(this);
//            lawyerGetAllClients.execute(1);
//            CourtServiceAddCase addCase = new CourtServiceAddCase(this);
//            addCase.execute("This case needs review","The latest status of the case","1","1","0");

//            CourtServiceProviderInvoker courtServiceProviderInvoker = new CourtServiceProviderInvoker(this);
//            courtServiceProviderInvoker.execute();
            /*courtServiceProvider = new CourtServiceProvider();
            System.out.println("********************************");
            List<Lawyer> lawyers = courtServiceProvider.getAllLawyersOfCourt();
            String allNames = "";
            for(Lawyer lawyer:lawyers)
                allNames +=lawyer.getName();
            textView.setText(allNames);*/
        } catch(Exception ex){
            ex.printStackTrace();
;
        }


    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_login, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.action_settings) {
            return true;
        }

        return super.onOptionsItemSelected(item);
    }
}
