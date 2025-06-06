package tbclient;

import com.squareup.wire.Message;
import com.squareup.wire.ProtoField;

/* loaded from: classes4.dex */
public final class ForumShopGoodsInfo extends Message {

    @ProtoField(tag = 1)
    public final ShopGoodsInfo goods_info;

    @ProtoField(tag = 2)
    public final ForumShopRoleInfo role_info;

    public static final class Builder extends Message.Builder<ForumShopGoodsInfo> {
        public ShopGoodsInfo goods_info;
        public ForumShopRoleInfo role_info;

        public Builder() {
        }

        public Builder(ForumShopGoodsInfo forumShopGoodsInfo) {
            super(forumShopGoodsInfo);
            if (forumShopGoodsInfo == null) {
                return;
            }
            this.goods_info = forumShopGoodsInfo.goods_info;
            this.role_info = forumShopGoodsInfo.role_info;
        }

        @Override // com.squareup.wire.Message.Builder
        public ForumShopGoodsInfo build(boolean z) {
            return new ForumShopGoodsInfo(this, z);
        }
    }

    public ForumShopGoodsInfo(Builder builder, boolean z) {
        super(builder);
        if (z) {
            this.goods_info = builder.goods_info;
            this.role_info = builder.role_info;
        } else {
            this.goods_info = builder.goods_info;
            this.role_info = builder.role_info;
        }
    }
}