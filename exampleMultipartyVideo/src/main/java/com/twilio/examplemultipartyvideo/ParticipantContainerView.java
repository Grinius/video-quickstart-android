package com.twilio.examplemultipartyvideo;

import android.content.Context;
import android.util.AttributeSet;
import android.widget.ImageView;
import android.widget.RelativeLayout;

import com.twilio.video.VideoView;

/**
 * TODO: document your custom view class.
 */
public class ParticipantContainerView extends RelativeLayout {
    private VideoView videoView;
    private ImageView dominantSpeakerImg;

    public ParticipantContainerView(Context context) {
        super(context);
    }

    public ParticipantContainerView(Context context, AttributeSet attrs) {
        super(context, attrs);
    }

    public ParticipantContainerView(Context context, AttributeSet attrs, int defStyle) {
        super(context, attrs, defStyle);
    }

    private void init() {
        videoView = findViewById(R.id.video_view);
        dominantSpeakerImg = findViewById(R.id.dominant_speaker_img);
    }

    public VideoView getVideoView() {
        return videoView;
    }

    public ImageView getDominantSpeakerImg() {
        return dominantSpeakerImg;
    }

    @Override
    protected void onFinishInflate() {
        super.onFinishInflate();
        init();
    }
}
