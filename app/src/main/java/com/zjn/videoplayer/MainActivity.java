package com.zjn.videoplayer;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;

import com.zjn.easyplayer.NiceVideoPlayer;
import com.zjn.easyplayer.NiceVideoPlayerManager;
import com.zjn.easyplayer.TxVideoPlayerController;

public class MainActivity extends AppCompatActivity {
    private NiceVideoPlayer nvp_ykvideo_player;
    private TxVideoPlayerController videoState;
//    private VideoState videoState;

    String oline_url = "http://tanzi27niu.cdsb.mobi/wps/wp-content/uploads/2017/05/2017-05-17_17-33-30.mp4";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        nvp_ykvideo_player = (NiceVideoPlayer) findViewById(R.id.nvp_ykvideo_player);
        nvp_ykvideo_player.setPlayerType(NiceVideoPlayer.TYPE_NATIVE);

        videoState = new TxVideoPlayerController(this);
        nvp_ykvideo_player.setUp(oline_url, null);
        videoState.setLenght(0);
        videoState.setTitle("12154645456543");
        nvp_ykvideo_player.setController(videoState);
    }

    @Override
    protected void onStop() {
        super.onStop();
        NiceVideoPlayerManager.instance().releaseNiceVideoPlayer();
    }

    @Override
    public void onBackPressed() {
        if (NiceVideoPlayerManager.instance().onBackPressd()) return;
        super.onBackPressed();
    }

}
