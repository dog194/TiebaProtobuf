package tbclient.GetFeedAd;

import com.squareup.wire.Message;
import com.squareup.wire.ProtoField;

/* loaded from: classes4.dex */
public final class GetFeedAdReqIdl extends Message {

    @ProtoField(tag = 1)
    public final DataReq data;

    public static final class Builder extends Message.Builder<GetFeedAdReqIdl> {
        public DataReq data;

        public Builder() {
        }

        public Builder(GetFeedAdReqIdl getFeedAdReqIdl) {
            super(getFeedAdReqIdl);
            if (getFeedAdReqIdl == null) {
                return;
            }
            this.data = getFeedAdReqIdl.data;
        }

        @Override // com.squareup.wire.Message.Builder
        public GetFeedAdReqIdl build(boolean z) {
            return new GetFeedAdReqIdl(this, z);
        }
    }

    public GetFeedAdReqIdl(Builder builder, boolean z) {
        super(builder);
        if (z) {
            this.data = builder.data;
        } else {
            this.data = builder.data;
        }
    }
}