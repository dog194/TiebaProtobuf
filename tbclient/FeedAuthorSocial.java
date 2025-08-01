package tbclient;

import com.squareup.wire.Message;
import com.squareup.wire.ProtoField;
import java.util.Collections;
import java.util.List;

/* loaded from: classes4.dex */
public final class FeedAuthorSocial extends Message {

    @ProtoField(tag = 3)
    public final Agree agree;

    @ProtoField(tag = 4, type = Message.Datatype.INT32)
    public final Integer comment_num;

    @ProtoField(tag = 7, type = Message.Datatype.UINT64)
    public final Long fid;

    @ProtoField(tag = 1)
    public final FeedHeadImg image_data;

    @ProtoField(label = Message.Label.REPEATED, tag = 2)
    public final List<FeedHeadSymbol> main_data;

    @ProtoField(label = Message.Label.REPEATED, tag = 8)
    public final List<LayoutManageInfo> manage_list;

    @ProtoField(tag = 5, type = Message.Datatype.INT32)
    public final Integer share_num;

    @ProtoField(tag = 6, type = Message.Datatype.UINT64)
    public final Long tid;
    public static final List<FeedHeadSymbol> DEFAULT_MAIN_DATA = Collections.emptyList();
    public static final Integer DEFAULT_COMMENT_NUM = 0;
    public static final Integer DEFAULT_SHARE_NUM = 0;
    public static final Long DEFAULT_TID = 0L;
    public static final Long DEFAULT_FID = 0L;
    public static final List<LayoutManageInfo> DEFAULT_MANAGE_LIST = Collections.emptyList();

    public static final class Builder extends Message.Builder<FeedAuthorSocial> {
        public Agree agree;
        public Integer comment_num;
        public Long fid;
        public FeedHeadImg image_data;
        public List<FeedHeadSymbol> main_data;
        public List<LayoutManageInfo> manage_list;
        public Integer share_num;
        public Long tid;

        public Builder() {
        }

        public Builder(FeedAuthorSocial feedAuthorSocial) {
            super(feedAuthorSocial);
            if (feedAuthorSocial == null) {
                return;
            }
            this.image_data = feedAuthorSocial.image_data;
            this.main_data = Message.copyOf(feedAuthorSocial.main_data);
            this.agree = feedAuthorSocial.agree;
            this.comment_num = feedAuthorSocial.comment_num;
            this.share_num = feedAuthorSocial.share_num;
            this.tid = feedAuthorSocial.tid;
            this.fid = feedAuthorSocial.fid;
            this.manage_list = Message.copyOf(feedAuthorSocial.manage_list);
        }

        @Override // com.squareup.wire.Message.Builder
        public FeedAuthorSocial build(boolean z) {
            return new FeedAuthorSocial(this, z);
        }
    }

    public FeedAuthorSocial(Builder builder, boolean z) {
        super(builder);
        if (z) {
            this.image_data = builder.image_data;
            List<FeedHeadSymbol> list = builder.main_data;
            if (list == null) {
                this.main_data = DEFAULT_MAIN_DATA;
            } else {
                this.main_data = Message.immutableCopyOf(list);
            }
            this.agree = builder.agree;
            Integer num = builder.comment_num;
            if (num == null) {
                this.comment_num = DEFAULT_COMMENT_NUM;
            } else {
                this.comment_num = num;
            }
            Integer num2 = builder.share_num;
            if (num2 == null) {
                this.share_num = DEFAULT_SHARE_NUM;
            } else {
                this.share_num = num2;
            }
            Long l = builder.tid;
            if (l == null) {
                this.tid = DEFAULT_TID;
            } else {
                this.tid = l;
            }
            Long l2 = builder.fid;
            if (l2 == null) {
                this.fid = DEFAULT_FID;
            } else {
                this.fid = l2;
            }
            List<LayoutManageInfo> list2 = builder.manage_list;
            if (list2 == null) {
                this.manage_list = DEFAULT_MANAGE_LIST;
                return;
            } else {
                this.manage_list = Message.immutableCopyOf(list2);
                return;
            }
        }
        this.image_data = builder.image_data;
        this.main_data = Message.immutableCopyOf(builder.main_data);
        this.agree = builder.agree;
        this.comment_num = builder.comment_num;
        this.share_num = builder.share_num;
        this.tid = builder.tid;
        this.fid = builder.fid;
        this.manage_list = Message.immutableCopyOf(builder.manage_list);
    }
}