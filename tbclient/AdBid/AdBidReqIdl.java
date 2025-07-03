package tbclient.AdBid;

import com.squareup.wire.Message;
import com.squareup.wire.ProtoField;

/* loaded from: classes4.dex */
public final class AdBidReqIdl extends Message {

    @ProtoField(tag = 1)
    public final DataReq data;

    public static final class Builder extends Message.Builder<AdBidReqIdl> {
        public DataReq data;

        public Builder() {
        }

        public Builder(AdBidReqIdl adBidReqIdl) {
            super(adBidReqIdl);
            if (adBidReqIdl == null) {
                return;
            }
            this.data = adBidReqIdl.data;
        }

        @Override // com.squareup.wire.Message.Builder
        public AdBidReqIdl build(boolean z) {
            return new AdBidReqIdl(this, z);
        }
    }

    public AdBidReqIdl(Builder builder, boolean z) {
        super(builder);
        if (z) {
            this.data = builder.data;
        } else {
            this.data = builder.data;
        }
    }
}