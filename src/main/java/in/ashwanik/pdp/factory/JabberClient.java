package in.ashwanik.pdp.factory;

import okhttp3.OkHttpClient;

public class JabberClient extends MessageClient {
    public JabberClient(OkHttpClient httpClient,
                        AuthenticationConfig authenticationConfig) {
        super(httpClient, authenticationConfig);
    }

    @Override
    public void send(Message message) {

    }
}
