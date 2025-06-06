package tbclient.GetLevelInfo;

import com.squareup.wire.Message;
import com.squareup.wire.ProtoField;

/* loaded from: classes4.dex */
public final class GetLevelInfoReqIdl extends Message {

    @ProtoField(tag = 1)
    public final DataReq data;

    public static final class Builder extends Message.Builder<GetLevelInfoReqIdl> {
        public DataReq data;

        public Builder() {
        }

        public Builder(GetLevelInfoReqIdl getLevelInfoReqIdl) {
            super(getLevelInfoReqIdl);
            if (getLevelInfoReqIdl == null) {
                return;
            }
            this.data = getLevelInfoReqIdl.data;
        }

        @Override // com.squareup.wire.Message.Builder
        public GetLevelInfoReqIdl build(boolean z) {
            return new GetLevelInfoReqIdl(this, z);
        }
    }

    public GetLevelInfoReqIdl(Builder builder, boolean z) {
        super(builder);
        if (z) {
            this.data = builder.data;
        } else {
            this.data = builder.data;
        }
    }
}