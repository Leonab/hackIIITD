package piedpiper.org.sceptre;

import retrofit.RestAdapter;

/**
 * Created by OPSKMC on 8/22/2015.
 */
public class Config {
    public static final String WEB_SERVICES_HOST = "http://manrajsingh.in/hackathon/v1";

    public static RestAdapter getRestAdapter() {
        return  new RestAdapter.Builder()
                .setEndpoint(WEB_SERVICES_HOST)
                .build();
    }
}
