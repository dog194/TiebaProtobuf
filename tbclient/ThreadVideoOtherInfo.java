package tbclient;

import com.squareup.wire.Message;
import com.squareup.wire.ProtoField;

/* loaded from: classes4.dex */
public final class ThreadVideoOtherInfo extends Message {

    @ProtoField(tag = 1)
    public final Post hot_post;

    public static final class Builder extends Message.Builder<ThreadVideoOtherInfo> {
        public Post hot_post;

        public Builder() {
        }

        public Builder(ThreadVideoOtherInfo threadVideoOtherInfo) {
            super(threadVideoOtherInfo);
            if (threadVideoOtherInfo == null) {
                return;
            }
            this.hot_post = threadVideoOtherInfo.hot_post;
        }

        @Override // com.squareup.wire.Message.Builder
        public ThreadVideoOtherInfo build(boolean z) {
            return new ThreadVideoOtherInfo(this, z);
        }
    }

    public ThreadVideoOtherInfo(Builder builder, boolean z) {
        super(builder);
        if (z) {
            this.hot_post = builder.hot_post;
        } else {
            this.hot_post = builder.hot_post;
        }
    }
}