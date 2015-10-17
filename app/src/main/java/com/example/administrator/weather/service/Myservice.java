package com.example.administrator.weather.service;


import android.app.NotificationManager;
import android.app.PendingIntent;
import android.app.Service;
import android.app.TaskStackBuilder;
import android.content.Context;
import android.content.Intent;
import android.os.IBinder;
import android.support.annotation.Nullable;
import android.support.v4.app.NotificationCompat;

import com.example.administrator.weather.R;
import com.example.administrator.weather.activity.ChooseAreaActivity;

/**
 * Created by Administrator on 2015/10/16.
 */
public class Myservice extends Service {


    @Nullable
    @Override
    public IBinder onBind(Intent intent) {
        return null;
    }

    @Override
    public void onCreate() {
        super.onCreate();

//        Notification notification = new Notification(R.drawable.logo,"123",System.currentTimeMillis());
//        Intent notificationIntent = new Intent(this, ChooseAreaActivity.class);
//        PendingIntent pendingIntent = PendingIntent.getActivity(this,0,notificationIntent,0);
//        notification.setLatestEventInfo(this,"title","content",pendingIntent);
//        startForeground(1,notification);

        //google文档这么写
        NotificationCompat.Builder mBuilder =  new NotificationCompat.Builder(this)
                .setSmallIcon(R.drawable.logo)
                .setContentTitle("推送信息")
                .setContentText("欢迎你");
        Intent resultIntent = new Intent(this, ChooseAreaActivity.class);
        TaskStackBuilder stackBuilder = TaskStackBuilder.create(this);
        stackBuilder.addParentStack(ChooseAreaActivity.class);
        stackBuilder.addNextIntent(resultIntent);
        PendingIntent resultPendingIntent =stackBuilder.getPendingIntent( 0,
                PendingIntent.FLAG_UPDATE_CURRENT);
        mBuilder.setContentIntent(resultPendingIntent);
        NotificationManager mNotificationManager = (NotificationManager)
                getSystemService(Context.NOTIFICATION_SERVICE);
        mNotificationManager.notify(1, mBuilder.build());

//        NotificationManager mNotificationManager = (NotificationManager) getSystemService(NOTIFICATION_SERVICE);
//        NotificationCompat.Builder mBuilder = new NotificationCompat.Builder(this);
//            mBuilder = new NotificationCompat.Builder(this);
//        mBuilder.setContentTitle("测试标题")
//                .setContentText("测试内容")
//                .setTicker("测试通知来啦")
//                .setWhen(System.currentTimeMillis())//通知产生的时间，会在通知信息里显示，一般是系统获取到的时间
//                .setAutoCancel(true)//设置这个标志当用户单击面板就可以让通知将自动取消
//                .setSmallIcon(R.drawable.ic_launcher);//设置通知小ICON
//              .setContentIntent(getDefalutIntent(Notification.FLAG_AUTO_CANCEL));//设置通知栏点击意图
//        Intent resultIntent = new Intent(this, ChooseAreaActivity.class);
//
//        Notification notification = mBuilder.build();
//        notification.flags = Notification.FLAG_AUTO_CANCEL;
//        NotificationManager.notify(1, mBuilder.build());
//        public PendingIntent getDefalutIntent(int flags) {
//        PendingIntent pendingIntent = PendingIntent.getActivity(this, 1, new Intent(), flags);
//        return pendingIntent;
//    }


//    @Override
//    public int onStartCommand(Intent intent, int flags, int startId) {
//        return super.onStartCommand(intent, flags, startId);
//    }
//
//    @Override
//    public void onDestroy() {
//        super.onDestroy();
    }
}

