package com.oem.framework.core.googlesheetUtils;

import com.google.api.client.auth.oauth2.Credential;
import com.google.api.client.googleapis.auth.oauth2.GoogleCredential;
import com.google.api.services.sheets.v4.SheetsScopes;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.security.GeneralSecurityException;
import java.util.Collections;

public class GoogleAuthorizeUtil {

    public static Credential authorize() throws IOException, GeneralSecurityException {

        InputStream in = GoogleAuthorizeUtil.class.getResourceAsStream("/service-account.json");
        if (in == null) {
            throw new FileNotFoundException("Resource not found: /service-account.json");
        }
       /* GoogleClientSecrets clientSecrets = GoogleClientSecrets.load(JacksonFactory.getDefaultInstance(), new InputStreamReader(in));

        List<String> scopes = Arrays.asList(SheetsScopes.SPREADSHEETS);

        GoogleAuthorizationCodeFlow flow = new GoogleAuthorizationCodeFlow.Builder(GoogleNetHttpTransport.newTrustedTransport(), JacksonFactory.getDefaultInstance(), clientSecrets, scopes).setDataStoreFactory(new MemoryDataStoreFactory())
                .setAccessType("offline").build();
        Credential credential = new AuthorizationCodeInstalledApp(flow, new LocalServerReceiver()).authorize("user");*/
        Credential credential = GoogleCredential.fromStream(in)
                .createScoped(Collections.singleton(SheetsScopes.SPREADSHEETS));
        return credential;
    }
}