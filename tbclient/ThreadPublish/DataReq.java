package tbclient.ThreadPublish;

import com.squareup.wire.Message;
import com.squareup.wire.ProtoField;
import tbclient.CommonReq;

/* loaded from: classes4.dex */
public final class DataReq extends Message {
    public static final Long DEFAULT_FORUM_ID = 0L;
    public static final Long DEFAULT_THREAD_ID = 0L;

    /* renamed from: common, reason: collision with root package name */
    @ProtoField(tag = 1)
    public final CommonReq f1549common;

    @ProtoField(tag = 2, type = Message.Datatype.INT64)
    public final Long forum_id;

    @ProtoField(tag = 3, type = Message.Datatype.INT64)
    public final Long thread_id;

    public static final class Builder extends Message.Builder<DataReq> {

        /* renamed from: common, reason: collision with root package name */
        public CommonReq f1550common;
        public Long forum_id;
        public Long thread_id;

        public Builder() {
        }

        public Builder(DataReq dataReq) {
            super(dataReq);
            if (dataReq == null) {
                return;
            }
            this.f1550common = dataReq.f1549common;
            this.forum_id = dataReq.forum_id;
            this.thread_id = dataReq.thread_id;
        }

        @Override // com.squareup.wire.Message.Builder
        public DataReq build(boolean z) {
            return new DataReq(this, z);
        }
    }

    public DataReq(Builder builder, boolean z) {
        super(builder);
        if (z) {
            this.f1549common = builder.f1550common;
            Long l = builder.forum_id;
            if (l == null) {
                this.forum_id = DEFAULT_FORUM_ID;
            } else {
                this.forum_id = l;
            }
            Long l2 = builder.thread_id;
            if (l2 == null) {
                this.thread_id = DEFAULT_THREAD_ID;
                return;
            } else {
                this.thread_id = l2;
                return;
            }
        }
        this.f1549common = builder.f1550common;
        this.forum_id = builder.forum_id;
        this.thread_id = builder.thread_id;
    }
}