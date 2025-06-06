package tbclient.Share;

import com.squareup.wire.Message;
import com.squareup.wire.ProtoField;
import tbclient.Error;

/* loaded from: classes4.dex */
public final class ShareResIdl extends Message {

    @ProtoField(tag = 2)
    public final DataRes data;

    @ProtoField(tag = 1)
    public final Error error;

    public static final class Builder extends Message.Builder<ShareResIdl> {
        public DataRes data;
        public Error error;

        public Builder() {
        }

        public Builder(ShareResIdl shareResIdl) {
            super(shareResIdl);
            if (shareResIdl == null) {
                return;
            }
            this.error = shareResIdl.error;
            this.data = shareResIdl.data;
        }

        @Override // com.squareup.wire.Message.Builder
        public ShareResIdl build(boolean z) {
            return new ShareResIdl(this, z);
        }
    }

    public ShareResIdl(Builder builder, boolean z) {
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