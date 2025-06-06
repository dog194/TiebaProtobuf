package tbclient.PbList;

import com.squareup.wire.Message;
import com.squareup.wire.ProtoField;
import tbclient.CommonReq;

/* loaded from: classes4.dex */
public final class DataReq extends Message {

    @ProtoField(tag = 6, type = Message.Datatype.INT32)
    public final Integer back;

    /* renamed from: common, reason: collision with root package name */
    @ProtoField(tag = 1)
    public final CommonReq f1490common;

    @ProtoField(tag = 2, type = Message.Datatype.INT64)
    public final Long kz;

    @ProtoField(tag = 4, type = Message.Datatype.INT64)
    public final Long last_pid;

    @ProtoField(tag = 7, type = Message.Datatype.INT32)
    public final Integer lz;

    @ProtoField(tag = 8, type = Message.Datatype.INT32)
    public final Integer mark_type;

    @ProtoField(tag = 3, type = Message.Datatype.INT32)
    public final Integer pn;

    @ProtoField(tag = 5, type = Message.Datatype.INT32)
    public final Integer r;
    public static final Long DEFAULT_KZ = 0L;
    public static final Integer DEFAULT_PN = 0;
    public static final Long DEFAULT_LAST_PID = 0L;
    public static final Integer DEFAULT_R = 0;
    public static final Integer DEFAULT_BACK = 0;
    public static final Integer DEFAULT_LZ = 0;
    public static final Integer DEFAULT_MARK_TYPE = 0;

    public static final class Builder extends Message.Builder<DataReq> {
        public Integer back;

        /* renamed from: common, reason: collision with root package name */
        public CommonReq f1491common;
        public Long kz;
        public Long last_pid;
        public Integer lz;
        public Integer mark_type;
        public Integer pn;
        public Integer r;

        public Builder() {
        }

        public Builder(DataReq dataReq) {
            super(dataReq);
            if (dataReq == null) {
                return;
            }
            this.f1491common = dataReq.f1490common;
            this.kz = dataReq.kz;
            this.pn = dataReq.pn;
            this.last_pid = dataReq.last_pid;
            this.r = dataReq.r;
            this.back = dataReq.back;
            this.lz = dataReq.lz;
            this.mark_type = dataReq.mark_type;
        }

        @Override // com.squareup.wire.Message.Builder
        public DataReq build(boolean z) {
            return new DataReq(this, z);
        }
    }

    public DataReq(Builder builder, boolean z) {
        super(builder);
        if (z) {
            this.f1490common = builder.f1491common;
            Long l = builder.kz;
            if (l == null) {
                this.kz = DEFAULT_KZ;
            } else {
                this.kz = l;
            }
            Integer num = builder.pn;
            if (num == null) {
                this.pn = DEFAULT_PN;
            } else {
                this.pn = num;
            }
            Long l2 = builder.last_pid;
            if (l2 == null) {
                this.last_pid = DEFAULT_LAST_PID;
            } else {
                this.last_pid = l2;
            }
            Integer num2 = builder.r;
            if (num2 == null) {
                this.r = DEFAULT_R;
            } else {
                this.r = num2;
            }
            Integer num3 = builder.back;
            if (num3 == null) {
                this.back = DEFAULT_BACK;
            } else {
                this.back = num3;
            }
            Integer num4 = builder.lz;
            if (num4 == null) {
                this.lz = DEFAULT_LZ;
            } else {
                this.lz = num4;
            }
            Integer num5 = builder.mark_type;
            if (num5 == null) {
                this.mark_type = DEFAULT_MARK_TYPE;
                return;
            } else {
                this.mark_type = num5;
                return;
            }
        }
        this.f1490common = builder.f1491common;
        this.kz = builder.kz;
        this.pn = builder.pn;
        this.last_pid = builder.last_pid;
        this.r = builder.r;
        this.back = builder.back;
        this.lz = builder.lz;
        this.mark_type = builder.mark_type;
    }
}