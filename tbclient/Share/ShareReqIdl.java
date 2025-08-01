package tbclient.Share;

import com.squareup.wire.Message;
import com.squareup.wire.ProtoField;

/* loaded from: classes4.dex */
public final class ShareReqIdl extends Message {

    @ProtoField(tag = 1)
    public final DataReq data;

    public static final class Builder extends Message.Builder<ShareReqIdl> {
        public DataReq data;

        public Builder() {
        }

        public Builder(ShareReqIdl shareReqIdl) {
            super(shareReqIdl);
            if (shareReqIdl == null) {
                return;
            }
            this.data = shareReqIdl.data;
        }

        @Override // com.squareup.wire.Message.Builder
        public ShareReqIdl build(boolean z) {
            return new ShareReqIdl(this, z);
        }
    }

    public ShareReqIdl(Builder builder, boolean z) {
        super(builder);
        if (z) {
            this.data = builder.data;
        } else {
            this.data = builder.data;
        }
    }
}