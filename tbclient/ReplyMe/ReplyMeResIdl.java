package tbclient.ReplyMe;

import com.squareup.wire.Message;
import com.squareup.wire.ProtoField;
import tbclient.Error;

/* loaded from: classes4.dex */
public final class ReplyMeResIdl extends Message {

    @ProtoField(tag = 2)
    public final DataRes data;

    @ProtoField(tag = 1)
    public final Error error;

    public static final class Builder extends Message.Builder<ReplyMeResIdl> {
        public DataRes data;
        public Error error;

        public Builder() {
        }

        public Builder(ReplyMeResIdl replyMeResIdl) {
            super(replyMeResIdl);
            if (replyMeResIdl == null) {
                return;
            }
            this.error = replyMeResIdl.error;
            this.data = replyMeResIdl.data;
        }

        @Override // com.squareup.wire.Message.Builder
        public ReplyMeResIdl build(boolean z) {
            return new ReplyMeResIdl(this, z);
        }
    }

    public ReplyMeResIdl(Builder builder, boolean z) {
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