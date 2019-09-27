import java.time.OffsetDateTime;
import java.time.ZoneOffset;
import java.util.Collections;

import com.azure.storage.common.credentials.SASTokenCredential;
import com.azure.storage.file.ShareClient;
import com.azure.storage.file.ShareClientBuilder;
import com.azure.storage.file.models.AccessPolicy;
import com.azure.storage.file.models.SignedIdentifier;

public class repo {

    public static void main(String[] args){

            SASTokenCredential sascredential = SASTokenCredential.fromSASTokenString("<sasToken>");

            String accountName = "<accountName>";
            String shareName = "<shareName>";

            // Share Client
            String shareURL = String.format("https://%s.file.core.windows.net", accountName);
            ShareClient shareClient = new ShareClientBuilder().endpoint(shareURL).credential(sascredential)
                            .shareName(shareName).buildClient();

            // Set a share access policy           
            AccessPolicy accessPolicy = new AccessPolicy()
            .permission("r")
            .start(OffsetDateTime.now(ZoneOffset.UTC))
            .expiry(OffsetDateTime.now(ZoneOffset.UTC).plusDays(10));
            SignedIdentifier permission = new SignedIdentifier().id("mypolicy").accessPolicy(accessPolicy);
            shareClient.setAccessPolicy(Collections.singletonList(permission));
    }
}
