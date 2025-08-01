package tbclient.CloseAd;

import com.squareup.wire.Message;
import com.squareup.wire.ProtoField;
import tbclient.Error;

/* loaded from: classes4.dex */
public final class CloseAdResIdl extends Message {

    @ProtoField(tag = 2)
    public final DataRes data;

    @ProtoField(tag = 1)
    public final Error error;

    public static final class Builder extends Message.Builder<CloseAdResIdl> {
        public DataRes data;
        public Error error;

        public Builder() {
        }

        public Builder(CloseAdResIdl closeAdResIdl) {
            super(closeAdResIdl);
            if (closeAdResIdl == null) {
                return;
            }
            this.error = closeAdResIdl.error;
            this.data = closeAdResIdl.data;
        }

        @Override // com.squareup.wire.Message.Builder
        public CloseAdResIdl build(boolean z) {
            return new CloseAdResIdl(this, z);
        }
    }

    public CloseAdResIdl(Builder builder, boolean z) {
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