package tbclient;

import com.squareup.wire.Message;
import com.squareup.wire.ProtoField;
import java.util.Collections;
import java.util.List;

/* loaded from: classes4.dex */
public final class ShopGoodsCommentInfo extends Message {
    public static final Integer DEFAULT_COUNT = 0;
    public static final List<String> DEFAULT_PORTRAIT = Collections.emptyList();

    @ProtoField(tag = 1, type = Message.Datatype.UINT32)
    public final Integer count;

    @ProtoField(label = Message.Label.REPEATED, tag = 2, type = Message.Datatype.STRING)
    public final List<String> portrait;

    public static final class Builder extends Message.Builder<ShopGoodsCommentInfo> {
        public Integer count;
        public List<String> portrait;

        public Builder() {
        }

        public Builder(ShopGoodsCommentInfo shopGoodsCommentInfo) {
            super(shopGoodsCommentInfo);
            if (shopGoodsCommentInfo == null) {
                return;
            }
            this.count = shopGoodsCommentInfo.count;
            this.portrait = Message.copyOf(shopGoodsCommentInfo.portrait);
        }

        @Override // com.squareup.wire.Message.Builder
        public ShopGoodsCommentInfo build(boolean z) {
            return new ShopGoodsCommentInfo(this, z);
        }
    }

    public ShopGoodsCommentInfo(Builder builder, boolean z) {
        super(builder);
        if (z) {
            Integer num = builder.count;
            if (num == null) {
                this.count = DEFAULT_COUNT;
            } else {
                this.count = num;
            }
            List<String> list = builder.portrait;
            if (list == null) {
                this.portrait = DEFAULT_PORTRAIT;
                return;
            } else {
                this.portrait = Message.immutableCopyOf(list);
                return;
            }
        }
        this.count = builder.count;
        this.portrait = Message.immutableCopyOf(builder.portrait);
    }
}