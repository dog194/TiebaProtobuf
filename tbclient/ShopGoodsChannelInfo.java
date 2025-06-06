package tbclient;

import com.squareup.wire.Message;
import com.squareup.wire.ProtoField;

/* loaded from: classes4.dex */
public final class ShopGoodsChannelInfo extends Message {
    public static final String DEFAULT_ICON = "";
    public static final Integer DEFAULT_ID = 0;
    public static final String DEFAULT_NAME = "";

    @ProtoField(tag = 2, type = Message.Datatype.STRING)
    public final String icon;

    @ProtoField(tag = 1, type = Message.Datatype.UINT32)
    public final Integer id;

    @ProtoField(tag = 3, type = Message.Datatype.STRING)
    public final String name;

    public static final class Builder extends Message.Builder<ShopGoodsChannelInfo> {
        public String icon;
        public Integer id;
        public String name;

        public Builder() {
        }

        public Builder(ShopGoodsChannelInfo shopGoodsChannelInfo) {
            super(shopGoodsChannelInfo);
            if (shopGoodsChannelInfo == null) {
                return;
            }
            this.id = shopGoodsChannelInfo.id;
            this.icon = shopGoodsChannelInfo.icon;
            this.name = shopGoodsChannelInfo.name;
        }

        @Override // com.squareup.wire.Message.Builder
        public ShopGoodsChannelInfo build(boolean z) {
            return new ShopGoodsChannelInfo(this, z);
        }
    }

    public ShopGoodsChannelInfo(Builder builder, boolean z) {
        super(builder);
        if (z) {
            Integer num = builder.id;
            if (num == null) {
                this.id = DEFAULT_ID;
            } else {
                this.id = num;
            }
            String str = builder.icon;
            if (str == null) {
                this.icon = "";
            } else {
                this.icon = str;
            }
            String str2 = builder.name;
            if (str2 == null) {
                this.name = "";
                return;
            } else {
                this.name = str2;
                return;
            }
        }
        this.id = builder.id;
        this.icon = builder.icon;
        this.name = builder.name;
    }
}