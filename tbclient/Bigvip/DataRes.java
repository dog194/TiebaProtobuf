package tbclient.Bigvip;

import com.squareup.wire.Message;
import com.squareup.wire.ProtoField;

/* loaded from: classes4.dex */
public final class DataRes extends Message {

    @ProtoField(tag = 1)
    public final UserInfoBigVip user_info;

    public static final class Builder extends Message.Builder<DataRes> {
        public UserInfoBigVip user_info;

        public Builder() {
        }

        public Builder(DataRes dataRes) {
            super(dataRes);
            if (dataRes == null) {
                return;
            }
            this.user_info = dataRes.user_info;
        }

        @Override // com.squareup.wire.Message.Builder
        public DataRes build(boolean z) {
            return new DataRes(this, z);
        }
    }

    public DataRes(Builder builder, boolean z) {
        super(builder);
        if (z) {
            this.user_info = builder.user_info;
        } else {
            this.user_info = builder.user_info;
        }
    }
}