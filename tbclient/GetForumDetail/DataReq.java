package tbclient.GetForumDetail;

import com.squareup.wire.Message;
import com.squareup.wire.ProtoField;
import tbclient.CommonReq;

/* loaded from: classes4.dex */
public final class DataReq extends Message {
    public static final Long DEFAULT_FORUM_ID = 0L;
    public static final Integer DEFAULT_IS_NEWFRS = 0;

    /* renamed from: common, reason: collision with root package name */
    @ProtoField(tag = 2)
    public final CommonReq f1390common;

    @ProtoField(tag = 1, type = Message.Datatype.INT64)
    public final Long forum_id;

    @ProtoField(tag = 4, type = Message.Datatype.INT32)
    public final Integer is_newfrs;

    public static final class Builder extends Message.Builder<DataReq> {

        /* renamed from: common, reason: collision with root package name */
        public CommonReq f1391common;
        public Long forum_id;
        public Integer is_newfrs;

        public Builder() {
        }

        public Builder(DataReq dataReq) {
            super(dataReq);
            if (dataReq == null) {
                return;
            }
            this.forum_id = dataReq.forum_id;
            this.f1391common = dataReq.f1390common;
            this.is_newfrs = dataReq.is_newfrs;
        }

        @Override // com.squareup.wire.Message.Builder
        public DataReq build(boolean z) {
            return new DataReq(this, z);
        }
    }

    public DataReq(Builder builder, boolean z) {
        super(builder);
        if (z) {
            Long l = builder.forum_id;
            if (l == null) {
                this.forum_id = DEFAULT_FORUM_ID;
            } else {
                this.forum_id = l;
            }
            this.f1390common = builder.f1391common;
            Integer num = builder.is_newfrs;
            if (num == null) {
                this.is_newfrs = DEFAULT_IS_NEWFRS;
                return;
            } else {
                this.is_newfrs = num;
                return;
            }
        }
        this.forum_id = builder.forum_id;
        this.f1390common = builder.f1391common;
        this.is_newfrs = builder.is_newfrs;
    }
}