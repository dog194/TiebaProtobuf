package tbclient.GetUserBfbInfo;

import com.squareup.wire.Message;
import com.squareup.wire.ProtoField;
import tbclient.UserBfbInfo;

/* loaded from: classes4.dex */
public final class DataRes extends Message {

    @ProtoField(tag = 1)
    public final UserBfbInfo bfb;

    public static final class Builder extends Message.Builder<DataRes> {
        public UserBfbInfo bfb;

        public Builder() {
        }

        public Builder(DataRes dataRes) {
            super(dataRes);
            if (dataRes == null) {
                return;
            }
            this.bfb = dataRes.bfb;
        }

        @Override // com.squareup.wire.Message.Builder
        public DataRes build(boolean z) {
            return new DataRes(this, z);
        }
    }

    public DataRes(Builder builder, boolean z) {
        super(builder);
        if (z) {
            this.bfb = builder.bfb;
        } else {
            this.bfb = builder.bfb;
        }
    }
}