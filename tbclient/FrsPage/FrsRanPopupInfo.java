package tbclient.FrsPage;

import com.squareup.wire.Message;
import com.squareup.wire.ProtoField;
import java.util.Collections;
import java.util.List;

/* loaded from: classes4.dex */
public final class FrsRanPopupInfo extends Message {
    public static final String DEFAULT_BUSINESS_ID = "";
    public static final String DEFAULT_PIC_URL = "";

    @ProtoField(tag = 5, type = Message.Datatype.STRING)
    public final String business_id;

    @ProtoField(tag = 2, type = Message.Datatype.DOUBLE)
    public final Double item_score;

    @ProtoField(tag = 1, type = Message.Datatype.STRING)
    public final String pic_url;

    @ProtoField(label = Message.Label.REPEATED, tag = 3)
    public final List<PopupPostInfo> post_list;

    @ProtoField(tag = 4, type = Message.Datatype.INT64)
    public final Long tid;
    public static final Double DEFAULT_ITEM_SCORE = Double.valueOf(0.0d);
    public static final List<PopupPostInfo> DEFAULT_POST_LIST = Collections.emptyList();
    public static final Long DEFAULT_TID = 0L;

    public static final class Builder extends Message.Builder<FrsRanPopupInfo> {
        public String business_id;
        public Double item_score;
        public String pic_url;
        public List<PopupPostInfo> post_list;
        public Long tid;

        public Builder() {
        }

        public Builder(FrsRanPopupInfo frsRanPopupInfo) {
            super(frsRanPopupInfo);
            if (frsRanPopupInfo == null) {
                return;
            }
            this.pic_url = frsRanPopupInfo.pic_url;
            this.item_score = frsRanPopupInfo.item_score;
            this.post_list = Message.copyOf(frsRanPopupInfo.post_list);
            this.tid = frsRanPopupInfo.tid;
            this.business_id = frsRanPopupInfo.business_id;
        }

        @Override // com.squareup.wire.Message.Builder
        public FrsRanPopupInfo build(boolean z) {
            return new FrsRanPopupInfo(this, z);
        }
    }

    public FrsRanPopupInfo(Builder builder, boolean z) {
        super(builder);
        if (z) {
            String str = builder.pic_url;
            if (str == null) {
                this.pic_url = "";
            } else {
                this.pic_url = str;
            }
            Double d = builder.item_score;
            if (d == null) {
                this.item_score = DEFAULT_ITEM_SCORE;
            } else {
                this.item_score = d;
            }
            List<PopupPostInfo> list = builder.post_list;
            if (list == null) {
                this.post_list = DEFAULT_POST_LIST;
            } else {
                this.post_list = Message.immutableCopyOf(list);
            }
            Long l = builder.tid;
            if (l == null) {
                this.tid = DEFAULT_TID;
            } else {
                this.tid = l;
            }
            String str2 = builder.business_id;
            if (str2 == null) {
                this.business_id = "";
                return;
            } else {
                this.business_id = str2;
                return;
            }
        }
        this.pic_url = builder.pic_url;
        this.item_score = builder.item_score;
        this.post_list = Message.immutableCopyOf(builder.post_list);
        this.tid = builder.tid;
        this.business_id = builder.business_id;
    }
}