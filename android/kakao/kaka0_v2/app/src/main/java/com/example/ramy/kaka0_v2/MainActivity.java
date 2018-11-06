package com.example.ramy.kaka0_v2;

import android.app.AlertDialog;
import android.content.Context;
import android.content.DialogInterface;
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

import com.kakao.network.ErrorResult;
import com.kakao.usermgmt.UserManagement;
import com.kakao.usermgmt.callback.LogoutResponseCallback;
import com.kakao.usermgmt.callback.UnLinkResponseCallback;
import com.kakao.util.helper.log.Logger;

import java.security.MessageDigest;

public class MainActivity extends AppCompatActivity {
    private Context mContext;
    private Button logout;
    private Button withdrawal;

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

        withdrawal = (Button) findViewById(R.id.btn_withdrawal);
        withdrawal.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) { //withdrawal
                final String appendMessage = getString(R.string.com_kakao_confirm_unlink);
                new AlertDialog.Builder(MainActivity.this) //내부 클래스로 오면 외부 클래스를 지정해줘야됨 (?)
                        .setMessage(appendMessage)
                        .setPositiveButton(getString(R.string.com_kakao_ok_button),
                                new DialogInterface.OnClickListener() {
                                    @Override
                                    public void onClick(DialogInterface dialog, int which) {
                                        UserManagement.getInstance().requestUnlink(new UnLinkResponseCallback() {
                                            @Override
                                            public void onFailure(ErrorResult errorResult) {
                                                Logger.e(errorResult.toString());
                                            }

                                            @Override
                                            public void onSessionClosed(ErrorResult errorResult) {
                                                redirectLoginActivity();
                                            }

                                            @Override
                                            public void onNotSignedUp() {
                                                redirectSignupActivity();
                                            }

                                            @Override
                                            public void onSuccess(Long userId) {
                                                redirectLoginActivity();
                                            }
                                        });
                                        dialog.dismiss();
                                    }
                                })
                        .setNegativeButton(getString(R.string.com_kakao_cancel_button),
                                new DialogInterface.OnClickListener() {
                                    @Override
                                    public void onClick(DialogInterface dialog, int which) {
                                        dialog.dismiss();
                                    }
                                }).show();
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

    protected void redirectSignupActivity() {       //세션 연결 성공 시 SignupActivity로 넘김
        final Intent intent = new Intent(this, KakaoSignupActivity.class);
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
