package tbclient.CommitCardInfo;

import com.squareup.wire.Message;
import com.squareup.wire.ProtoField;
import tbclient.CommonReq;

/* loaded from: classes4.dex */
public final class DataReq extends Message {
    public static final Integer DEFAULT_CARD_TYPE = 0;
    public static final String DEFAULT_IMAGE_INFO = "";

    @ProtoField(tag = 3, type = Message.Datatype.INT32)
    public final Integer card_type;

    /* renamed from: common, reason: collision with root package name */
    @ProtoField(tag = 1)
    public final CommonReq f1341common;

    @ProtoField(tag = 4, type = Message.Datatype.STRING)
    public final String image_info;

    public static final class Builder extends Message.Builder<DataReq> {
        public Integer card_type;

        /* renamed from: common, reason: collision with root package name */
        public CommonReq f1342common;
        public String image_info;

        public Builder() {
        }

        public Builder(DataReq dataReq) {
            super(dataReq);
            if (dataReq == null) {
                return;
            }
            this.f1342common = dataReq.f1341common;
            this.card_type = dataReq.card_type;
            this.image_info = dataReq.image_info;
        }

        @Override // com.squareup.wire.Message.Builder
        public DataReq build(boolean z) {
            return new DataReq(this, z);
        }
    }

    public DataReq(Builder builder, boolean z) {
        super(builder);
        if (z) {
            this.f1341common = builder.f1342common;
            Integer num = builder.card_type;
            if (num == null) {
                this.card_type = DEFAULT_CARD_TYPE;
            } else {
                this.card_type = num;
            }
            String str = builder.image_info;
            if (str == null) {
                this.image_info = "";
                return;
            } else {
                this.image_info = str;
                return;
            }
        }
        this.f1341common = builder.f1342common;
        this.card_type = builder.card_type;
        this.image_info = builder.image_info;
    }
}