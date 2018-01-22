package com.uberclone.rider.Remote;

import com.uberclone.rider.Model.FCMResponse;
import com.uberclone.rider.Model.Sender;

import retrofit2.Call;
import retrofit2.http.Body;
import retrofit2.http.Headers;
import retrofit2.http.POST;

/**
 * Created by Umair Ali on 1/20/2018.
 */

public interface IFCMService {
    @Headers({
            "Content-Type:application/json",
            "Authorization:key=AAAA3YDCuwE:APA91bGho9GN3ia1r5oRwaK4zeLjH4AESTm0Frtfk6M3s6FNriDV0EWm5jvdsSNm-J-SF4H1ncioaJfL82SqBGliN5UBUzcXNInayKygIOD6Dnuic-l3HRK2hmTOMbcforkU6w2haXnl"
    })
    @POST("fcm/send")
    Call<FCMResponse> sendMessage(@Body Sender body);
}
