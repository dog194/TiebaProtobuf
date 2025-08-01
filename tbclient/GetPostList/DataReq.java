package tbclient.GetPostList;

import com.squareup.wire.Message;
import com.squareup.wire.ProtoField;
import java.util.Collections;
import java.util.List;
import tbclient.CommonReq;

/* loaded from: classes4.dex */
public final class DataReq extends Message {

    /* renamed from: common, reason: collision with root package name */
    @ProtoField(tag = 1)
    public final CommonReq f1433common;

    @ProtoField(tag = 9, type = Message.Datatype.INT32)
    public final Integer floor_rn;

    @ProtoField(tag = 8, type = Message.Datatype.INT32)
    public final Integer is_comm_reverse;

    @ProtoField(tag = 2, type = Message.Datatype.INT64)
    public final Long kz;

    @ProtoField(label = Message.Label.REPEATED, tag = 4, type = Message.Datatype.INT64)
    public final List<Long> post_id;

    @ProtoField(tag = 6, type = Message.Datatype.INT32)
    public final Integer scr_h;

    @ProtoField(tag = 5, type = Message.Datatype.INT32)
    public final Integer scr_w;

    @ProtoField(tag = 7, type = Message.Datatype.INT32)
    public final Integer st_type;

    @ProtoField(tag = 3, type = Message.Datatype.INT32)
    public final Integer with_floor;
    public static final Long DEFAULT_KZ = 0L;
    public static final Integer DEFAULT_WITH_FLOOR = 0;
    public static final List<Long> DEFAULT_POST_ID = Collections.emptyList();
    public static final Integer DEFAULT_SCR_W = 0;
    public static final Integer DEFAULT_SCR_H = 0;
    public static final Integer DEFAULT_ST_TYPE = 0;
    public static final Integer DEFAULT_IS_COMM_REVERSE = 0;
    public static final Integer DEFAULT_FLOOR_RN = 0;

    public static final class Builder extends Message.Builder<DataReq> {

        /* renamed from: common, reason: collision with root package name */
        public CommonReq f1434common;
        public Integer floor_rn;
        public Integer is_comm_reverse;
        public Long kz;
        public List<Long> post_id;
        public Integer scr_h;
        public Integer scr_w;
        public Integer st_type;
        public Integer with_floor;

        public Builder() {
        }

        public Builder(DataReq dataReq) {
            super(dataReq);
            if (dataReq == null) {
                return;
            }
            this.f1434common = dataReq.f1433common;
            this.kz = dataReq.kz;
            this.with_floor = dataReq.with_floor;
            this.post_id = Message.copyOf(dataReq.post_id);
            this.scr_w = dataReq.scr_w;
            this.scr_h = dataReq.scr_h;
            this.st_type = dataReq.st_type;
            this.is_comm_reverse = dataReq.is_comm_reverse;
            this.floor_rn = dataReq.floor_rn;
        }

        @Override // com.squareup.wire.Message.Builder
        public DataReq build(boolean z) {
            return new DataReq(this, z);
        }
    }

    public DataReq(Builder builder, boolean z) {
        super(builder);
        if (z) {
            this.f1433common = builder.f1434common;
            Long l = builder.kz;
            if (l == null) {
                this.kz = DEFAULT_KZ;
            } else {
                this.kz = l;
            }
            Integer num = builder.with_floor;
            if (num == null) {
                this.with_floor = DEFAULT_WITH_FLOOR;
            } else {
                this.with_floor = num;
            }
            List<Long> list = builder.post_id;
            if (list == null) {
                this.post_id = DEFAULT_POST_ID;
            } else {
                this.post_id = Message.immutableCopyOf(list);
            }
            Integer num2 = builder.scr_w;
            if (num2 == null) {
                this.scr_w = DEFAULT_SCR_W;
            } else {
                this.scr_w = num2;
            }
            Integer num3 = builder.scr_h;
            if (num3 == null) {
                this.scr_h = DEFAULT_SCR_H;
            } else {
                this.scr_h = num3;
            }
            Integer num4 = builder.st_type;
            if (num4 == null) {
                this.st_type = DEFAULT_ST_TYPE;
            } else {
                this.st_type = num4;
            }
            Integer num5 = builder.is_comm_reverse;
            if (num5 == null) {
                this.is_comm_reverse = DEFAULT_IS_COMM_REVERSE;
            } else {
                this.is_comm_reverse = num5;
            }
            Integer num6 = builder.floor_rn;
            if (num6 == null) {
                this.floor_rn = DEFAULT_FLOOR_RN;
                return;
            } else {
                this.floor_rn = num6;
                return;
            }
        }
        this.f1433common = builder.f1434common;
        this.kz = builder.kz;
        this.with_floor = builder.with_floor;
        this.post_id = Message.immutableCopyOf(builder.post_id);
        this.scr_w = builder.scr_w;
        this.scr_h = builder.scr_h;
        this.st_type = builder.st_type;
        this.is_comm_reverse = builder.is_comm_reverse;
        this.floor_rn = builder.floor_rn;
    }
}