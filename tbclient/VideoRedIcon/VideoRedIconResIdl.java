package tbclient.VideoRedIcon;

import com.squareup.wire.Message;
import com.squareup.wire.ProtoField;
import tbclient.Error;

/* loaded from: classes4.dex */
public final class VideoRedIconResIdl extends Message {

    @ProtoField(tag = 2)
    public final DataRes data;

    @ProtoField(tag = 1)
    public final Error error;

    public static final class Builder extends Message.Builder<VideoRedIconResIdl> {
        public DataRes data;
        public Error error;

        public Builder() {
        }

        public Builder(VideoRedIconResIdl videoRedIconResIdl) {
            super(videoRedIconResIdl);
            if (videoRedIconResIdl == null) {
                return;
            }
            this.error = videoRedIconResIdl.error;
            this.data = videoRedIconResIdl.data;
        }

        @Override // com.squareup.wire.Message.Builder
        public VideoRedIconResIdl build(boolean z) {
            return new VideoRedIconResIdl(this, z);
        }
    }

    public VideoRedIconResIdl(Builder builder, boolean z) {
        super(builder);
        if (z) {
            this.error = builder.error;
            this.data = builder.data;
        } else {
            this.error = builder.error;
            this.data = builder.data;
        }
    }
}