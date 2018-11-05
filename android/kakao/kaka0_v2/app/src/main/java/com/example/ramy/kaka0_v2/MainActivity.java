package com.example.ramy.kaka0_v2;

import android.content.Context;
import android.content.Intent;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.content.pm.Signature;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Base64;
import android.util.Log;
import android.view.View;
import android.widget.Button;

import com.kakao.usermgmt.UserManagement;
import com.kakao.usermgmt.callback.LogoutResponseCallback;

import java.security.MessageDigest;

public class MainActivity extends AppCompatActivity {
    private Context mContext;
    private Button logout;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        logout = (Button) findViewById(R.id.btn_logout);
        logout.setOnClickListener(new Button.OnClickListener() {
            @Override
            public void onClick(View v) { //logout
                    UserManagement.getInstance().requestLogout(new LogoutResponseCallback() {
                        @Override
                        public void onCompleteLogout() {
                            redirectLoginActivity();
                        }
                    });
            }
        });

//        mContext = getApplicationContext();
//        getHashKey(mContext);
    }

    protected void redirectLoginActivity() {
        final Intent intent = new Intent(this, LoginActivity.class);
        intent.setFlags(Intent.FLAG_ACTIVITY_NO_ANIMATION);
        startActivity(intent);
        finish();
    }

    // 프로젝트의 해시키를 반환
//    @Nullable
//    public static String getHashKey(Context context) {
//        final String TAG = "KeyHash";
//        String keyHash = null;
//        try {
//            PackageInfo info =
//                    context.getPackageManager().getPackageInfo(context.getPackageName(), PackageManager.GET_SIGNATURES);
//
//            for (Signature signature : info.signatures) {
//                MessageDigest md;
//                md = MessageDigest.getInstance("SHA");
//                md.update(signature.toByteArray());
//                keyHash = new String(Base64.encode(md.digest(), 0));
//                Log.d(TAG, keyHash);
//            }
//
//        } catch (Exception e) {
//            Log.e("name not found", e.toString());
//        }
//
//        if (keyHash != null) {
//            return keyHash;
//        } else {
//            return null;
//        }
//    }
}
