package tbclient.GetDislikeList;

import com.squareup.wire.Message;
import com.squareup.wire.ProtoField;

/* loaded from: classes4.dex */
public final class GetDislikeListReqIdl extends Message {

    @ProtoField(tag = 1)
    public final DataReq data;

    public static final class Builder extends Message.Builder<GetDislikeListReqIdl> {
        public DataReq data;

        public Builder() {
        }

        public Builder(GetDislikeListReqIdl getDislikeListReqIdl) {
            super(getDislikeListReqIdl);
            if (getDislikeListReqIdl == null) {
                return;
            }
            this.data = getDislikeListReqIdl.data;
        }

        @Override // com.squareup.wire.Message.Builder
        public GetDislikeListReqIdl build(boolean z) {
            return new GetDislikeListReqIdl(this, z);
        }
    }

    public GetDislikeListReqIdl(Builder builder, boolean z) {
        super(builder);
        if (z) {
            this.data = builder.data;
        } else {
            this.data = builder.data;
        }
    }
}