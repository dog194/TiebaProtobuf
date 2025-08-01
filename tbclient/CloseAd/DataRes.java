package tbclient.CloseAd;

import com.squareup.wire.Message;
import com.squareup.wire.ProtoField;
import tbclient.VipCloseAd;

/* loaded from: classes4.dex */
public final class DataRes extends Message {

    @ProtoField(tag = 1)
    public final VipCloseAd vip_close_ad;

    public static final class Builder extends Message.Builder<DataRes> {
        public VipCloseAd vip_close_ad;

        public Builder() {
        }

        public Builder(DataRes dataRes) {
            super(dataRes);
            if (dataRes == null) {
                return;
            }
            this.vip_close_ad = dataRes.vip_close_ad;
        }

        @Override // com.squareup.wire.Message.Builder
        public DataRes build(boolean z) {
            return new DataRes(this, z);
        }
    }

    public DataRes(Builder builder, boolean z) {
        super(builder);
        if (z) {
            this.vip_close_ad = builder.vip_close_ad;
        } else {
            this.vip_close_ad = builder.vip_close_ad;
        }
    }
}