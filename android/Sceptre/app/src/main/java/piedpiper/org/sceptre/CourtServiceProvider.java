package piedpiper.org.sceptre;

import org.apache.http.HttpResponse;
import org.apache.http.NameValuePair;
import org.apache.http.client.ClientProtocolException;
import org.apache.http.client.HttpClient;
import org.apache.http.client.entity.UrlEncodedFormEntity;
import org.apache.http.client.methods.HttpPost;
import org.apache.http.impl.client.DefaultHttpClient;
import org.apache.http.message.BasicNameValuePair;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import piedpiper.org.sceptre.api.model.Case;
import piedpiper.org.sceptre.api.model.Lawyer;
import piedpiper.org.sceptre.service.CourtService;
import retrofit.Callback;
import retrofit.RestAdapter;

/**
 * Created by OPSKMC on 8/22/2015.
 */
public class CourtServiceProvider {

    public List<Lawyer> getAllLawyersOfCourt(){
       CourtService courtService = getCourtService();
        return courtService.getAllLawyersOfCourt();
    }
    public List<Case> getAllCasesOfCourt(){
        CourtService courtService = getCourtService();
        return courtService.getAllCasesOfCourt();
    }
    public void postCase(String description, String lastStatus,int department_id, int lawyer_id, int status,Callback<String> callback){
        CourtService courtService = getCourtService();
        System.out.println("**** from post service : " + description);
        Case newCase = new Case();

/*        newCase.setDescription(description);
        newCase.setLastStatus(lastStatus);
        newCase.setDepartment_id(department_id);
        newCase.setLawyer_id(lawyer_id);
        newCase.setStatus(status);*/
//        courtService.postCase(newCase,callback);
        courtService.postCase(description,lastStatus,department_id,lawyer_id,status,callback);
//        postData(description,lastStatus,department_id,lawyer_id,status);
    }
    private CourtService getCourtService(){
        RestAdapter restAdapter = Config.getRestAdapter();
        CourtService courtService = restAdapter.create(CourtService.class);
        return courtService;
    }

    public void postData(String description, String lastStatus,int department_id, int lawyer_id, int status) {

        HttpClient httpclient = new DefaultHttpClient();
        HttpPost httppost = new HttpPost(Config.WEB_SERVICES_HOST + "/court/add");

        try {
            // Add your data
            List<NameValuePair> nameValuePairs = new ArrayList<NameValuePair>(2);
            nameValuePairs.add(new BasicNameValuePair("description", "blablabla"));
            nameValuePairs.add(new BasicNameValuePair("laststatus", "demostatus"));
            nameValuePairs.add(new BasicNameValuePair("department_id", "1"));
            nameValuePairs.add(new BasicNameValuePair("LawyerId", "1"));
            nameValuePairs.add(new BasicNameValuePair("status", "0"));
            httppost.setEntity(new UrlEncodedFormEntity(nameValuePairs));

            HttpResponse response = httpclient.execute(httppost);

        } catch (ClientProtocolException e) {
            e.printStackTrace();
            // TODO Auto-generated catch block
        } catch (IOException e) {
            // TODO Auto-generated catch block
        }
    }
}
