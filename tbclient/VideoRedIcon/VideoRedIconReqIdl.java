package tbclient.VideoRedIcon;

import com.squareup.wire.Message;
import com.squareup.wire.ProtoField;

/* loaded from: classes4.dex */
public final class VideoRedIconReqIdl extends Message {

    @ProtoField(tag = 1)
    public final DataReq data;

    public static final class Builder extends Message.Builder<VideoRedIconReqIdl> {
        public DataReq data;

        public Builder() {
        }

        public Builder(VideoRedIconReqIdl videoRedIconReqIdl) {
            super(videoRedIconReqIdl);
            if (videoRedIconReqIdl == null) {
                return;
            }
            this.data = videoRedIconReqIdl.data;
        }

        @Override // com.squareup.wire.Message.Builder
        public VideoRedIconReqIdl build(boolean z) {
            return new VideoRedIconReqIdl(this, z);
        }
    }

    public VideoRedIconReqIdl(Builder builder, boolean z) {
        super(builder);
        if (z) {
            this.data = builder.data;
        } else {
            this.data = builder.data;
        }
    }
}