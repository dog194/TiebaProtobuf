package tbclient.GetRepostRecommendForum;

import com.squareup.wire.Message;
import com.squareup.wire.ProtoField;
import tbclient.CommonReq;

/* loaded from: classes4.dex */
public final class DataReq extends Message {
    public static final String DEFAULT_CONTENT = "";
    public static final Long DEFAULT_FORUM_ID = 0L;
    public static final String DEFAULT_TITLE = "";

    /* renamed from: common, reason: collision with root package name */
    @ProtoField(tag = 1)
    public final CommonReq f1439common;

    @ProtoField(tag = 3, type = Message.Datatype.STRING)
    public final String content;

    @ProtoField(tag = 4, type = Message.Datatype.INT64)
    public final Long forum_id;

    @ProtoField(tag = 2, type = Message.Datatype.STRING)
    public final String title;

    public static final class Builder extends Message.Builder<DataReq> {

        /* renamed from: common, reason: collision with root package name */
        public CommonReq f1440common;
        public String content;
        public Long forum_id;
        public String title;

        public Builder() {
        }

        public Builder(DataReq dataReq) {
            super(dataReq);
            if (dataReq == null) {
                return;
            }
            this.f1440common = dataReq.f1439common;
            this.title = dataReq.title;
            this.content = dataReq.content;
            this.forum_id = dataReq.forum_id;
        }

        @Override // com.squareup.wire.Message.Builder
        public DataReq build(boolean z) {
            return new DataReq(this, z);
        }
    }

    public DataReq(Builder builder, boolean z) {
        super(builder);
        if (z) {
            this.f1439common = builder.f1440common;
            String str = builder.title;
            if (str == null) {
                this.title = "";
            } else {
                this.title = str;
            }
            String str2 = builder.content;
            if (str2 == null) {
                this.content = "";
            } else {
                this.content = str2;
            }
            Long l = builder.forum_id;
            if (l == null) {
                this.forum_id = DEFAULT_FORUM_ID;
                return;
            } else {
                this.forum_id = l;
                return;
            }
        }
        this.f1439common = builder.f1440common;
        this.title = builder.title;
        this.content = builder.content;
        this.forum_id = builder.forum_id;
    }
}