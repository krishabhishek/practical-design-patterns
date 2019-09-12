package in.ashwanik.pdp.factory;

import okhttp3.OkHttpClient;

public class SlackClient extends MessageClient {
    public SlackClient(OkHttpClient httpClient,
                       AuthenticationConfig authenticationConfig) {
        super(httpClient, authenticationConfig);
    }

    @Override
    public void send(Message message) {

    }
}
