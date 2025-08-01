package tbclient.UrlParser;

import com.squareup.wire.Message;
import com.squareup.wire.ProtoField;
import tbclient.CommonReq;

/* loaded from: classes4.dex */
public final class DataReq extends Message {
    public static final Long DEFAULT_FORUM_ID = 0L;
    public static final Integer DEFAULT_LINK_NUM = 0;
    public static final String DEFAULT_URL = "";

    /* renamed from: common, reason: collision with root package name */
    @ProtoField(tag = 1)
    public final CommonReq f1555common;

    @ProtoField(tag = 2, type = Message.Datatype.INT64)
    public final Long forum_id;

    @ProtoField(tag = 3, type = Message.Datatype.INT32)
    public final Integer link_num;

    @ProtoField(tag = 4, type = Message.Datatype.STRING)
    public final String url;

    public static final class Builder extends Message.Builder<DataReq> {

        /* renamed from: common, reason: collision with root package name */
        public CommonReq f1556common;
        public Long forum_id;
        public Integer link_num;
        public String url;

        public Builder() {
        }

        public Builder(DataReq dataReq) {
            super(dataReq);
            if (dataReq == null) {
                return;
            }
            this.f1556common = dataReq.f1555common;
            this.forum_id = dataReq.forum_id;
            this.link_num = dataReq.link_num;
            this.url = dataReq.url;
        }

        @Override // com.squareup.wire.Message.Builder
        public DataReq build(boolean z) {
            return new DataReq(this, z);
        }
    }

    public DataReq(Builder builder, boolean z) {
        super(builder);
        if (z) {
            this.f1555common = builder.f1556common;
            Long l = builder.forum_id;
            if (l == null) {
                this.forum_id = DEFAULT_FORUM_ID;
            } else {
                this.forum_id = l;
            }
            Integer num = builder.link_num;
            if (num == null) {
                this.link_num = DEFAULT_LINK_NUM;
            } else {
                this.link_num = num;
            }
            String str = builder.url;
            if (str == null) {
                this.url = "";
                return;
            } else {
                this.url = str;
                return;
            }
        }
        this.f1555common = builder.f1556common;
        this.forum_id = builder.forum_id;
        this.link_num = builder.link_num;
        this.url = builder.url;
    }
}