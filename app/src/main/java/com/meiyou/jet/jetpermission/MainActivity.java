package com.meiyou.jet.jetpermission;

import android.Manifest;
import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;

import com.meiyou.jet.grant.PermissionsManager;
import com.meiyou.jet.grant.PermissionsResultAction;


public class MainActivity extends AppCompatActivity {
    private static final String TAG = "MainActivity";

    @Override
    protected void onCreate(Bundle savedInstanceState) {

        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        PermissionsManager permissionsManager = PermissionsManager.getInstance();
        String[] permission = {Manifest.permission.CAMERA, Manifest.permission.WRITE_EXTERNAL_STORAGE, Manifest.permission.READ_CONTACTS};
        permissionsManager.requestPermissionsIfNecessaryForResult(this, permission, new PermissionsResultAction() {
            @Override
            public void onGranted() {
                Log.d(TAG, "onGranted: ");
            }

            @Override
            public void onDenied(String permission) {
                Log.d(TAG, "onDenied: ");
            }
        });
    }

    @Override
    public void onRequestPermissionsResult(int requestCode, @NonNull String[] permissions, @NonNull int[] grantResults) {
        super.onRequestPermissionsResult(requestCode, permissions, grantResults);
        PermissionsManager.getInstance().notifyPermissionsChange(permissions, grantResults);
    }


}
