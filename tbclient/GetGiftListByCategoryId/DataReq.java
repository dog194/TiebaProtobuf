package tbclient.GetGiftListByCategoryId;

import com.squareup.wire.Message;
import com.squareup.wire.ProtoField;
import tbclient.CommonReq;

/* loaded from: classes4.dex */
public final class DataReq extends Message {
    public static final Integer DEFAULT_CATEGORY_ID = 0;

    @ProtoField(tag = 1, type = Message.Datatype.UINT32)
    public final Integer category_id;

    /* renamed from: common, reason: collision with root package name */
    @ProtoField(tag = 2)
    public final CommonReq f1396common;

    public static final class Builder extends Message.Builder<DataReq> {
        public Integer category_id;

        /* renamed from: common, reason: collision with root package name */
        public CommonReq f1397common;

        public Builder() {
        }

        public Builder(DataReq dataReq) {
            super(dataReq);
            if (dataReq == null) {
                return;
            }
            this.category_id = dataReq.category_id;
            this.f1397common = dataReq.f1396common;
        }

        @Override // com.squareup.wire.Message.Builder
        public DataReq build(boolean z) {
            return new DataReq(this, z);
        }
    }

    public DataReq(Builder builder, boolean z) {
        super(builder);
        if (z) {
            Integer num = builder.category_id;
            if (num == null) {
                this.category_id = DEFAULT_CATEGORY_ID;
            } else {
                this.category_id = num;
            }
            this.f1396common = builder.f1397common;
            return;
        }
        this.category_id = builder.category_id;
        this.f1396common = builder.f1397common;
    }
}