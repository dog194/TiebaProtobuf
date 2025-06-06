package tbclient.GetGiftList;

import com.squareup.wire.Message;
import com.squareup.wire.ProtoField;
import tbclient.CommonReq;

/* loaded from: classes4.dex */
public final class DataReq extends Message {
    public static final Long DEFAULT_BENEFIT_USERID = 0L;
    public static final String DEFAULT_SCENE_FROM = "";

    @ProtoField(tag = 3, type = Message.Datatype.UINT64)
    public final Long benefit_userid;

    /* renamed from: common, reason: collision with root package name */
    @ProtoField(tag = 2)
    public final CommonReq f1394common;

    @ProtoField(tag = 1, type = Message.Datatype.STRING)
    public final String scene_from;

    public static final class Builder extends Message.Builder<DataReq> {
        public Long benefit_userid;

        /* renamed from: common, reason: collision with root package name */
        public CommonReq f1395common;
        public String scene_from;

        public Builder() {
        }

        public Builder(DataReq dataReq) {
            super(dataReq);
            if (dataReq == null) {
                return;
            }
            this.scene_from = dataReq.scene_from;
            this.f1395common = dataReq.f1394common;
            this.benefit_userid = dataReq.benefit_userid;
        }

        @Override // com.squareup.wire.Message.Builder
        public DataReq build(boolean z) {
            return new DataReq(this, z);
        }
    }

    public DataReq(Builder builder, boolean z) {
        super(builder);
        if (z) {
            String str = builder.scene_from;
            if (str == null) {
                this.scene_from = "";
            } else {
                this.scene_from = str;
            }
            this.f1394common = builder.f1395common;
            Long l = builder.benefit_userid;
            if (l == null) {
                this.benefit_userid = DEFAULT_BENEFIT_USERID;
                return;
            } else {
                this.benefit_userid = l;
                return;
            }
        }
        this.scene_from = builder.scene_from;
        this.f1394common = builder.f1395common;
        this.benefit_userid = builder.benefit_userid;
    }
}