package tbclient.GetBgByCategory;

import com.squareup.wire.Message;
import com.squareup.wire.ProtoField;

/* loaded from: classes4.dex */
public final class GetBgByCategoryReqIdl extends Message {

    @ProtoField(tag = 1)
    public final DataReq data;

    public static final class Builder extends Message.Builder<GetBgByCategoryReqIdl> {
        public DataReq data;

        public Builder() {
        }

        public Builder(GetBgByCategoryReqIdl getBgByCategoryReqIdl) {
            super(getBgByCategoryReqIdl);
            if (getBgByCategoryReqIdl == null) {
                return;
            }
            this.data = getBgByCategoryReqIdl.data;
        }

        @Override // com.squareup.wire.Message.Builder
        public GetBgByCategoryReqIdl build(boolean z) {
            return new GetBgByCategoryReqIdl(this, z);
        }
    }

    public GetBgByCategoryReqIdl(Builder builder, boolean z) {
        super(builder);
        if (z) {
            this.data = builder.data;
        } else {
            this.data = builder.data;
        }
    }
}