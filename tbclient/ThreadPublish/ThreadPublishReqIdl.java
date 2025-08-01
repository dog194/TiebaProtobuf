package tbclient.ThreadPublish;

import com.squareup.wire.Message;
import com.squareup.wire.ProtoField;

/* loaded from: classes4.dex */
public final class ThreadPublishReqIdl extends Message {

    @ProtoField(tag = 1)
    public final DataReq data;

    public static final class Builder extends Message.Builder<ThreadPublishReqIdl> {
        public DataReq data;

        public Builder() {
        }

        public Builder(ThreadPublishReqIdl threadPublishReqIdl) {
            super(threadPublishReqIdl);
            if (threadPublishReqIdl == null) {
                return;
            }
            this.data = threadPublishReqIdl.data;
        }

        @Override // com.squareup.wire.Message.Builder
        public ThreadPublishReqIdl build(boolean z) {
            return new ThreadPublishReqIdl(this, z);
        }
    }

    public ThreadPublishReqIdl(Builder builder, boolean z) {
        super(builder);
        if (z) {
            this.data = builder.data;
        } else {
            this.data = builder.data;
        }
    }
}