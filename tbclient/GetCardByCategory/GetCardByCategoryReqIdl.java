package tbclient.GetCardByCategory;

import com.squareup.wire.Message;
import com.squareup.wire.ProtoField;

/* loaded from: classes4.dex */
public final class GetCardByCategoryReqIdl extends Message {

    @ProtoField(tag = 1)
    public final DataReq data;

    public static final class Builder extends Message.Builder<GetCardByCategoryReqIdl> {
        public DataReq data;

        public Builder() {
        }

        public Builder(GetCardByCategoryReqIdl getCardByCategoryReqIdl) {
            super(getCardByCategoryReqIdl);
            if (getCardByCategoryReqIdl == null) {
                return;
            }
            this.data = getCardByCategoryReqIdl.data;
        }

        @Override // com.squareup.wire.Message.Builder
        public GetCardByCategoryReqIdl build(boolean z) {
            return new GetCardByCategoryReqIdl(this, z);
        }
    }

    public GetCardByCategoryReqIdl(Builder builder, boolean z) {
        super(builder);
        if (z) {
            this.data = builder.data;
        } else {
            this.data = builder.data;
        }
    }
}