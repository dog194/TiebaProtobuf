package tbclient;

import com.squareup.wire.Message;
import com.squareup.wire.ProtoField;

/* loaded from: classes4.dex */
public final class ShopGoodsRecommendUserInfo extends Message {
    public static final Integer DEFAULT_FORUM_LEVEL = 0;
    public static final String DEFAULT_PORTRAIT = "";
    public static final String DEFAULT_USER_NAME = "";

    @ProtoField(tag = 2, type = Message.Datatype.UINT32)
    public final Integer forum_level;

    @ProtoField(tag = 3, type = Message.Datatype.STRING)
    public final String portrait;

    @ProtoField(tag = 1, type = Message.Datatype.STRING)
    public final String user_name;

    public static final class Builder extends Message.Builder<ShopGoodsRecommendUserInfo> {
        public Integer forum_level;
        public String portrait;
        public String user_name;

        public Builder() {
        }

        public Builder(ShopGoodsRecommendUserInfo shopGoodsRecommendUserInfo) {
            super(shopGoodsRecommendUserInfo);
            if (shopGoodsRecommendUserInfo == null) {
                return;
            }
            this.user_name = shopGoodsRecommendUserInfo.user_name;
            this.forum_level = shopGoodsRecommendUserInfo.forum_level;
            this.portrait = shopGoodsRecommendUserInfo.portrait;
        }

        @Override // com.squareup.wire.Message.Builder
        public ShopGoodsRecommendUserInfo build(boolean z) {
            return new ShopGoodsRecommendUserInfo(this, z);
        }
    }

    public ShopGoodsRecommendUserInfo(Builder builder, boolean z) {
        super(builder);
        if (z) {
            String str = builder.user_name;
            if (str == null) {
                this.user_name = "";
            } else {
                this.user_name = str;
            }
            Integer num = builder.forum_level;
            if (num == null) {
                this.forum_level = DEFAULT_FORUM_LEVEL;
            } else {
                this.forum_level = num;
            }
            String str2 = builder.portrait;
            if (str2 == null) {
                this.portrait = "";
                return;
            } else {
                this.portrait = str2;
                return;
            }
        }
        this.user_name = builder.user_name;
        this.forum_level = builder.forum_level;
        this.portrait = builder.portrait;
    }
}