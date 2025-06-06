package tbclient;

import com.squareup.wire.Message;
import com.squareup.wire.ProtoField;
import java.util.Collections;
import java.util.List;

/* loaded from: classes4.dex */
public final class ShopGoodsRecommendInfo extends Message {
    public static final String DEFAULT_SUB_TITLE = "";

    @ProtoField(tag = 1, type = Message.Datatype.UINT32)
    public final Integer count;

    @ProtoField(tag = 2, type = Message.Datatype.UINT32)
    public final Integer recommend_status;

    @ProtoField(tag = 4, type = Message.Datatype.STRING)
    public final String sub_title;

    @ProtoField(label = Message.Label.REPEATED, tag = 3)
    public final List<ShopGoodsRecommendUserInfo> user_info;
    public static final Integer DEFAULT_COUNT = 0;
    public static final Integer DEFAULT_RECOMMEND_STATUS = 0;
    public static final List<ShopGoodsRecommendUserInfo> DEFAULT_USER_INFO = Collections.emptyList();

    public static final class Builder extends Message.Builder<ShopGoodsRecommendInfo> {
        public Integer count;
        public Integer recommend_status;
        public String sub_title;
        public List<ShopGoodsRecommendUserInfo> user_info;

        public Builder() {
        }

        public Builder(ShopGoodsRecommendInfo shopGoodsRecommendInfo) {
            super(shopGoodsRecommendInfo);
            if (shopGoodsRecommendInfo == null) {
                return;
            }
            this.count = shopGoodsRecommendInfo.count;
            this.recommend_status = shopGoodsRecommendInfo.recommend_status;
            this.user_info = Message.copyOf(shopGoodsRecommendInfo.user_info);
            this.sub_title = shopGoodsRecommendInfo.sub_title;
        }

        @Override // com.squareup.wire.Message.Builder
        public ShopGoodsRecommendInfo build(boolean z) {
            return new ShopGoodsRecommendInfo(this, z);
        }
    }

    public ShopGoodsRecommendInfo(Builder builder, boolean z) {
        super(builder);
        if (z) {
            Integer num = builder.count;
            if (num == null) {
                this.count = DEFAULT_COUNT;
            } else {
                this.count = num;
            }
            Integer num2 = builder.recommend_status;
            if (num2 == null) {
                this.recommend_status = DEFAULT_RECOMMEND_STATUS;
            } else {
                this.recommend_status = num2;
            }
            List<ShopGoodsRecommendUserInfo> list = builder.user_info;
            if (list == null) {
                this.user_info = DEFAULT_USER_INFO;
            } else {
                this.user_info = Message.immutableCopyOf(list);
            }
            String str = builder.sub_title;
            if (str == null) {
                this.sub_title = "";
                return;
            } else {
                this.sub_title = str;
                return;
            }
        }
        this.count = builder.count;
        this.recommend_status = builder.recommend_status;
        this.user_info = Message.immutableCopyOf(builder.user_info);
        this.sub_title = builder.sub_title;
    }
}