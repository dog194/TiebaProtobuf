package tbclient.Hottopic;

import com.squareup.wire.Message;
import com.squareup.wire.ProtoField;

/* loaded from: classes4.dex */
public final class GoodThread extends Message {
    public static final String DEFAULT_ABSTRACT = "";
    public static final String DEFAULT_FNAME = "";
    public static final String DEFAULT_HEAD_PIC = "";
    public static final String DEFAULT_TITLE = "";

    @ProtoField(tag = 4, type = Message.Datatype.STRING)
    public final String _abstract;

    @ProtoField(tag = 7, type = Message.Datatype.UINT64)
    public final Long fid;

    @ProtoField(tag = 6, type = Message.Datatype.STRING)
    public final String fname;

    @ProtoField(tag = 9, type = Message.Datatype.STRING)
    public final String head_pic;

    @ProtoField(tag = 8, type = Message.Datatype.UINT64)
    public final Long post_id;

    @ProtoField(tag = 3, type = Message.Datatype.UINT64)
    public final Long reply_num;

    @ProtoField(tag = 1, type = Message.Datatype.UINT64)
    public final Long tid;

    @ProtoField(tag = 2, type = Message.Datatype.STRING)
    public final String title;

    @ProtoField(tag = 5, type = Message.Datatype.UINT64)
    public final Long zan_num;
    public static final Long DEFAULT_TID = 0L;
    public static final Long DEFAULT_REPLY_NUM = 0L;
    public static final Long DEFAULT_ZAN_NUM = 0L;
    public static final Long DEFAULT_FID = 0L;
    public static final Long DEFAULT_POST_ID = 0L;

    public static final class Builder extends Message.Builder<GoodThread> {
        public String _abstract;
        public Long fid;
        public String fname;
        public String head_pic;
        public Long post_id;
        public Long reply_num;
        public Long tid;
        public String title;
        public Long zan_num;

        public Builder() {
        }

        public Builder(GoodThread goodThread) {
            super(goodThread);
            if (goodThread == null) {
                return;
            }
            this.tid = goodThread.tid;
            this.title = goodThread.title;
            this.reply_num = goodThread.reply_num;
            this._abstract = goodThread._abstract;
            this.zan_num = goodThread.zan_num;
            this.fname = goodThread.fname;
            this.fid = goodThread.fid;
            this.post_id = goodThread.post_id;
            this.head_pic = goodThread.head_pic;
        }

        @Override // com.squareup.wire.Message.Builder
        public GoodThread build(boolean z) {
            return new GoodThread(this, z);
        }
    }

    public GoodThread(Builder builder, boolean z) {
        super(builder);
        if (z) {
            Long l = builder.tid;
            if (l == null) {
                this.tid = DEFAULT_TID;
            } else {
                this.tid = l;
            }
            String str = builder.title;
            if (str == null) {
                this.title = "";
            } else {
                this.title = str;
            }
            Long l2 = builder.reply_num;
            if (l2 == null) {
                this.reply_num = DEFAULT_REPLY_NUM;
            } else {
                this.reply_num = l2;
            }
            String str2 = builder._abstract;
            if (str2 == null) {
                this._abstract = "";
            } else {
                this._abstract = str2;
            }
            Long l3 = builder.zan_num;
            if (l3 == null) {
                this.zan_num = DEFAULT_ZAN_NUM;
            } else {
                this.zan_num = l3;
            }
            String str3 = builder.fname;
            if (str3 == null) {
                this.fname = "";
            } else {
                this.fname = str3;
            }
            Long l4 = builder.fid;
            if (l4 == null) {
                this.fid = DEFAULT_FID;
            } else {
                this.fid = l4;
            }
            Long l5 = builder.post_id;
            if (l5 == null) {
                this.post_id = DEFAULT_POST_ID;
            } else {
                this.post_id = l5;
            }
            String str4 = builder.head_pic;
            if (str4 == null) {
                this.head_pic = "";
                return;
            } else {
                this.head_pic = str4;
                return;
            }
        }
        this.tid = builder.tid;
        this.title = builder.title;
        this.reply_num = builder.reply_num;
        this._abstract = builder._abstract;
        this.zan_num = builder.zan_num;
        this.fname = builder.fname;
        this.fid = builder.fid;
        this.post_id = builder.post_id;
        this.head_pic = builder.head_pic;
    }
}