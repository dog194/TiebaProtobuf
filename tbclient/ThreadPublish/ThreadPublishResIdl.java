package tbclient.ThreadPublish;

import com.squareup.wire.Message;
import com.squareup.wire.ProtoField;
import tbclient.Error;

/* loaded from: classes4.dex */
public final class ThreadPublishResIdl extends Message {

    @ProtoField(tag = 2)
    public final DataRes data;

    @ProtoField(tag = 1)
    public final Error error;

    public static final class Builder extends Message.Builder<ThreadPublishResIdl> {
        public DataRes data;
        public Error error;

        public Builder() {
        }

        public Builder(ThreadPublishResIdl threadPublishResIdl) {
            super(threadPublishResIdl);
            if (threadPublishResIdl == null) {
                return;
            }
            this.error = threadPublishResIdl.error;
            this.data = threadPublishResIdl.data;
        }

        @Override // com.squareup.wire.Message.Builder
        public ThreadPublishResIdl build(boolean z) {
            return new ThreadPublishResIdl(this, z);
        }
    }

    public ThreadPublishResIdl(Builder builder, boolean z) {
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