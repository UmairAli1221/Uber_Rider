package com.uberclone.rider.Services;

import com.google.firebase.auth.FirebaseAuth;
import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;
import com.google.firebase.iid.FirebaseInstanceId;
import com.google.firebase.iid.FirebaseInstanceIdService;
import com.uberclone.rider.Common.Common;
import com.uberclone.rider.Model.Token;

/**
 * Created by Umair Ali on 1/20/2018.
 */

public class MyFirebaseIdService extends FirebaseInstanceIdService {
    @Override
    public void onTokenRefresh() {
        super.onTokenRefresh();
        String refereshToken = FirebaseInstanceId.getInstance().getToken();
        updateTokenToServer(refereshToken);// when we need update to token in db while refresh token
    }

    private void updateTokenToServer(String refereshToken) {
        FirebaseDatabase db = FirebaseDatabase.getInstance();
        DatabaseReference tokens = db.getReference(Common.token_table);

        Token token = new Token(refereshToken);
        if (FirebaseAuth.getInstance().getCurrentUser() != null)//if already login, must update token
            tokens.child(FirebaseAuth.getInstance().getCurrentUser().getUid()).setValue(token);
        {

        }
    }
}
