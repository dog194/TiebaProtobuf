package tbclient.ThreadList;

import com.squareup.wire.Message;
import com.squareup.wire.ProtoField;
import tbclient.Error;

/* loaded from: classes4.dex */
public final class ThreadListResIdl extends Message {

    @ProtoField(tag = 2)
    public final DataRes data;

    @ProtoField(tag = 1)
    public final Error error;

    public static final class Builder extends Message.Builder<ThreadListResIdl> {
        public DataRes data;
        public Error error;

        public Builder() {
        }

        public Builder(ThreadListResIdl threadListResIdl) {
            super(threadListResIdl);
            if (threadListResIdl == null) {
                return;
            }
            this.error = threadListResIdl.error;
            this.data = threadListResIdl.data;
        }

        @Override // com.squareup.wire.Message.Builder
        public ThreadListResIdl build(boolean z) {
            return new ThreadListResIdl(this, z);
        }
    }

    public ThreadListResIdl(Builder builder, boolean z) {
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