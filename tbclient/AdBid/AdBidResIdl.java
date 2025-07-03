package tbclient.AdBid;

import com.squareup.wire.Message;
import com.squareup.wire.ProtoField;
import tbclient.Error;

/* loaded from: classes4.dex */
public final class AdBidResIdl extends Message {

    @ProtoField(tag = 2)
    public final DataRes data;

    @ProtoField(tag = 1)
    public final Error error;

    public static final class Builder extends Message.Builder<AdBidResIdl> {
        public DataRes data;
        public Error error;

        public Builder() {
        }

        public Builder(AdBidResIdl adBidResIdl) {
            super(adBidResIdl);
            if (adBidResIdl == null) {
                return;
            }
            this.error = adBidResIdl.error;
            this.data = adBidResIdl.data;
        }

        @Override // com.squareup.wire.Message.Builder
        public AdBidResIdl build(boolean z) {
            return new AdBidResIdl(this, z);
        }
    }

    public AdBidResIdl(Builder builder, boolean z) {
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