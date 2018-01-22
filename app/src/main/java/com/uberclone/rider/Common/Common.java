package com.uberclone.rider.Common;

import com.uberclone.rider.Remote.FCMClient;
import com.uberclone.rider.Remote.IFCMService;

/**
 * Created by Umair Ali on 1/20/2018.
 */

public class Common {
    //firebase tables
    public static final String driver_tbl="Drivers";// store all the information of Drivers locations
    public static final String user_driver_tbl="DriverInformation";//store all the info of drivers who registered
    public static final String user_rider_tbl="RiderInformation";//store all the info of riders who registered
    public static final String pickup_request_tbl="PickupRequest";//store information about pickup Request of user
    public static final String token_table="Tokens";
    public static final String fcmURL="https://fcm.googleapis.com/";


    public static IFCMService getFcmService(){
        return FCMClient.getClent(fcmURL).create(IFCMService.class);
    }
}
