package com.jamespfluger.alexadevicefinder.notifications;

import android.util.Log;

import com.google.firebase.messaging.FirebaseMessagingService;
import com.google.firebase.messaging.RemoteMessage;


public class FirebaseService extends FirebaseMessagingService {
    @Override
    public void onNewToken(String s)
    {
        super.onNewToken(s);
    }

    @Override
    public void onMessageReceived(RemoteMessage remoteMessage) {
        super.onMessageReceived(remoteMessage);

        NotificationService notificationService = new NotificationService(getApplicationContext());

        //String title = remoteMessage.getNotification().getTitle();
        //String body = remoteMessage.getNotification().getBody();
        String title = remoteMessage.getData().get("body");
        String body = remoteMessage.getData().get("body");

        notificationService.issueNotification(title, body);
    }

}