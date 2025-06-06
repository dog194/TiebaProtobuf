package tbclient.GetVipInfo;

import com.squareup.wire.Message;
import com.squareup.wire.ProtoField;
import tbclient.Error;

/* loaded from: classes4.dex */
public final class GetVipInfoResIdl extends Message {

    @ProtoField(tag = 1)
    public final DataRes data;

    @ProtoField(tag = 2)
    public final Error error;

    public static final class Builder extends Message.Builder<GetVipInfoResIdl> {
        public DataRes data;
        public Error error;

        public Builder() {
        }

        public Builder(GetVipInfoResIdl getVipInfoResIdl) {
            super(getVipInfoResIdl);
            if (getVipInfoResIdl == null) {
                return;
            }
            this.data = getVipInfoResIdl.data;
            this.error = getVipInfoResIdl.error;
        }

        @Override // com.squareup.wire.Message.Builder
        public GetVipInfoResIdl build(boolean z) {
            return new GetVipInfoResIdl(this, z);
        }
    }

    public GetVipInfoResIdl(Builder builder, boolean z) {
        super(builder);
        if (z) {
            this.data = builder.data;
            this.error = builder.error;
        } else {
            this.data = builder.data;
            this.error = builder.error;
        }
    }
}